#  Write  a  shell  script  to  calculate  the  sum  of  digits  of  any  number  entered 
# through keyboard.

#!/bin/bash

# Prompt the user to enter a number
echo "Enter a number: "
read num

# Initialize sum to 0
sum=0

# Loop to extract each digit and add it to sum
while [ $num -gt 0 ]
do
  # Get the last digit of the number
  digit=$((num % 10))
  
  # Add the digit to the sum
  sum=$((sum + digit))
  
  # Remove the last digit from the number
  num=$((num / 10))
done

# Output the sum of digits
echo "The sum of the digits is: $sum"
