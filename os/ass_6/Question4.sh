# Write a shell script to find out whether any year input through the keyboard is a leap year or 
# not. If no argument is supplied the current year should be assumed 

#!/bin/bash

# Check if the user has provided an argument for the year
if [ -z "$1" ]; then
  # If no argument is supplied, use the current year
  year=$(date +%Y)
else
  # If an argument is supplied, use that as the year
  year=$1
fi

# Function to check if the year is a leap year
is_leap_year() {
  local year=$1
  if (( year % 400 == 0 )); then
    echo "$year is a leap year."
  elif (( year % 100 == 0 )); then
    echo "$year is not a leap year."
  elif (( year % 4 == 0 )); then
    echo "$year is a leap year."
  else
    echo "$year is not a leap year."
  fi
}

# Call the function to check if the year is a leap year
is_leap_year $year
