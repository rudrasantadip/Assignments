# A  file  called  list  consists  of  several  words.  Write  a  shell  script  which  will 
# receive  a  list  of  filenames,  the  first  of  which  would  be  list.  The  shell  script 
# should  report  all  occurrences  of  each  word  in  list  in  the  rest  of  the  files 
# supplied as arguments. 

#!/bin/bash

# Check if the first file (list) is supplied as argument
if [ $# -lt 2 ]; then
  echo "Usage: $0 <list_file> <file1> <file2> ..."
  exit 1
fi

# The first argument is the 'list' file
list_file=$1
shift  # Remove the first argument (list file) from the argument list

# Check if the list file exists
if [ ! -f "$list_file" ]; then
  echo "Error: File '$list_file' not found."
  exit 2
fi

# Iterate through each word in the 'list' file
while IFS= read -r word; do
  echo "Occurrences of the word: '$word'"

  # Search for the word in each of the provided files
  for file in "$@"; do
    # Check if the file exists
    if [ ! -f "$file" ]; then
      echo "Error: File '$file' not found."
      continue
    fi
    
    # Use grep to search for the word in the current file
    grep -n -o "\b$word\b" "$file" | while read -r line; do
      echo "$file: $line"
    done
  done
done < "$list_file"
