# Write a shell script to count the number of words of different length present in 
# a given text.    

#!/bin/bash

# Check if a file name is provided as an argument
if [ $# -ne 1 ]; then
  echo "Usage: $0 <filename>"
  exit 1
fi

# Check if the file exists
if [ ! -f "$1" ]; then
  echo "File '$1' not found."
  exit 1
fi

# Initialize an associative array to store word length counts
declare -A word_lengths

# Read the file line by line
while read -r line; do
  # Convert the line to lowercase and split it into words
  for word in $line; do
    # Remove non-alphanumeric characters from the word
    word=$(echo "$word" | tr -cd '[:alnum:]')
    
    # Get the length of the word
    word_length=${#word}
    
    # Increment the count for this word length
    if [ -n "$word" ]; then
      ((word_lengths[$word_length]++))
    fi
  done
done < "$1"

# Display the word length counts
echo "Word length counts:"
for length in "${!word_lengths[@]}"; do
  echo "Length $length: ${word_lengths[$length]} words"
done
