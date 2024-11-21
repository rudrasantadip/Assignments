# Write a shell script that periodically count the  number of  users logged  into the 
# system. Send the number of minutes at which to check as parameter.


#!/bin/bash

# Check if the user has provided an argument (number of minutes)
if [ $# -ne 1 ]; then
  echo "Usage: $0 <interval_in_minutes>"
  exit 1
fi

# Interval in minutes, convert to seconds
interval=$(( $1 * 60 ))

# Run the script indefinitely
while true; do
  # Count the number of logged-in users using the 'who' command and print it
  user_count=$(who | wc -l)
  
  # Get the current time for logging purposes
  current_time=$(date "+%Y-%m-%d %H:%M:%S")
  
  # Display the current time and number of logged-in users
  echo "[$current_time] Number of users logged in: $user_count"

  # Wait for the specified interval
  sleep $interval
done
