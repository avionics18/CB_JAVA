#!/bin/bash

if [ $# -ne 1 ]; then
  echo "Usage: $0 <Java file path>"
  echo "Example: $0 code/zzTest/Test.java"
  exit 1
fi

JAVA_FILE="$1"

if [ ! -f "$JAVA_FILE" ]; then
  echo "Error: File not found: $JAVA_FILE"
  exit 1
fi

# Compile the Java file
javac "$JAVA_FILE"
if [ $? -ne 0 ]; then
  echo "Compilation failed."
  exit 1
fi

# Derive fully qualified class name
PACKAGE_PATH=$(dirname "$JAVA_FILE")
PACKAGE_PATH=${PACKAGE_PATH//\//.}  # Convert / to .
CLASS_NAME=$(basename "$JAVA_FILE" .java)
FQCN="${PACKAGE_PATH}.${CLASS_NAME}"

# echo "Running ${FQCN}..."
java "$FQCN"
