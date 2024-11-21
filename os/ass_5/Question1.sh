#   Write  a  shell  script to  find  the  factorial  value  of  any  integer  entered 
# through the keyboard.

#!/bin/bash

# Prompt the user to enter a number
echo "Enter a number to find its factorial: "
read num

# Check if the number is non-negative
if [ $num -lt 0 ]; then
  echo "Factorial is not defined for negative numbers."
  exit 1
fi

# Initialize factorial to 1
factorial=1

# Calculate factorial using a loop
for (( i=1; i<=$num; i++ ))
do
  factorial=$((factorial * i))
done

# Output the result
echo "The factorial of $num is $factorial."
