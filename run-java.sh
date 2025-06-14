#!/bin/bash

# This script compiles and runs a Java file given its relative path.
# It can handle Java files in the root folder or in subfolders.
#
# Usage: ./run_java.sh <relative_path_to_java_file>
#
# Example:
#   ./run_java.sh MyProgram.java
#   ./run_java.sh src/com/example/MyClass.java
#   ./run_java.sh build/MyClass.class

# Check if a file path is provided
if [ -z "$1" ]; then
    echo "Usage: $0 <relative_path_to_java_file_or_class>"
    exit 1
fi

FILE_PATH="$1"

# Extract the directory and base name of the file
DIR_NAME=$(dirname "$FILE_PATH")
BASE_NAME=$(basename "$FILE_PATH")
FILE_EXTENSION="${BASE_NAME##*.}"
FILE_NAME_NO_EXT="${BASE_NAME%.*}"

# Determine if it's a .java source file or a .class file
if [ "$FILE_EXTENSION" == "java" ]; then
    echo "Detected Java source file: $FILE_PATH"

    # Compile the Java file
    echo "Compiling $BASE_NAME..."
    # Navigate to the directory containing the Java file for compilation
    # This is important if there are package declarations.
    (cd "$DIR_NAME" && javac "$BASE_NAME")

    if [ $? -ne 0 ]; then
        echo "Error: Java compilation failed for $FILE_PATH"
        exit 1
    fi

    echo "Compilation successful."

    # Set the class path to the directory containing the compiled .class file
    # and the class name to execute.
    JAVA_CLASS_PATH="$DIR_NAME"
    CLASS_TO_RUN="$FILE_NAME_NO_EXT"

elif [ "$FILE_EXTENSION" == "class" ]; then
    echo "Detected Java compiled class file: $FILE_PATH"

    # For .class files, the class path is its directory
    # and the class name is the file name without .class extension.
    JAVA_CLASS_PATH="$DIR_NAME"
    CLASS_TO_RUN="$FILE_NAME_NO_EXT"

else
    echo "Error: Invalid file type. Please provide a .java or .class file."
    exit 1
fi

# Check if the compiled .class file exists (only relevant for .java files)
if [ "$FILE_EXTENSION" == "java" ]; then
    COMPILED_CLASS_FILE="$DIR_NAME/$FILE_NAME_NO_EXT.class"
    if [ ! -f "$COMPILED_CLASS_FILE" ]; then
        echo "Error: Compiled class file not found at $COMPILED_CLASS_FILE after compilation."
        exit 1
    fi
fi

echo "Running Java class: $CLASS_TO_RUN from classpath: $JAVA_CLASS_PATH"
# Run the Java application
# The -cp or -classpath option tells Java where to look for .class files.
java -cp "$JAVA_CLASS_PATH" "$CLASS_TO_RUN"

if [ $? -ne 0 ]; then
    echo "Error: Java execution failed for $CLASS_TO_RUN"
    exit 1
fi

echo "Java program execution completed."

exit 0