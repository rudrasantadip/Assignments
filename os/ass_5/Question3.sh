#  Write a shell script to print all prime numbers in a given range.

#!/bin/bash

# Prompt the user to enter the range
echo "Enter the lower bound of the range: "
read lower
echo "Enter the upper bound of the range: "
read upper

# Function to check if a number is prime
is_prime() {
  local num=$1
  if [ $num -le 1 ]; then
    return 1
  fi
  for (( i=2; i*i<=num; i++ ))
  do
    if [ $(( num % i )) -eq 0 ]; then
      return 1
    fi
  done
  return 0
}

# Loop through the range and print prime numbers
echo "Prime numbers between $lower and $upper are:"
for (( num=$lower; num<=$upper; num++ ))
do
  if is_prime $num; then
    echo $num
  fi
done
