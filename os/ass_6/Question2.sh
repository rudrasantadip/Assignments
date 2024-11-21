# Write a shell script to show the maximum of three numbers.

#!/bin/bash

# Prompt the user to enter three numbers
echo "Enter the first number: "
read num1
echo "Enter the second number: "
read num2
echo "Enter the third number: "
read num3

# Compare the numbers and find the maximum
if [ $num1 -ge $num2 ] && [ $num1 -ge $num3 ]; then
  max=$num1
elif [ $num2 -ge $num1 ] && [ $num2 -ge $num3 ]; then
  max=$num2
else
  max=$num3
fi

# Output the result
echo "The maximum number is: $max"
