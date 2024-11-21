# Write a shell script which displays the result of division of one integer by another integer and 
# informs if the user tries to divide an integer by 0

#!/bin/bash

# Prompt the user to enter the first integer (numerator)
echo "Enter the numerator (dividend): "
read num1

# Prompt the user to enter the second integer (denominator)
echo "Enter the denominator (divisor): "
read num2

# Check if the denominator is 0
if [ $num2 -eq 0 ]; then
  echo "Error: Division by 0 is not allowed."
else
  # Perform the division and display the result
  result=$((num1 / num2))
  echo "The result of $num1 divided by $num2 is: $result"
fi
