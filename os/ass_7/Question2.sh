# Write  a  shell  script  which  deletes  all  lines  containing  the  word  UNIX  in  the 
# files supplied as arguments to this shell script.


#!/bin/bash

# Check if at least one file is supplied as an argument
if [ $# -lt 1 ]; then
  echo "Usage: $0 <file1> <file2> ..."
  exit 1
fi

# Loop through each file passed as an argument
for file in "$@"; do
  # Check if the file exists
  if [ ! -f "$file" ]; then
    echo "Error: File '$file' not found."
    continue
  fi

  # Use sed to delete lines containing the word 'UNIX' (case-sensitive)
  sed -i '/UNIX/d' "$file"

  # Inform the user that the file has been processed
  echo "Lines containing 'UNIX' have been deleted from '$file'."
done
