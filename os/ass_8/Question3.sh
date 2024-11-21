#  Write  a  shell  script  that  periodically  count  the  number  of  users  logged  into  the system. Send the number of minutes at which to check as parameter. 
 

 #!/bin/bash

# Check if the user provided the number of minutes as a parameter
if [ -z "$1" ]; then
  echo "Please provide the number of minutes to wait between each check."
  exit 1
fi

# Get the number of minutes from the parameter
interval=$1

# Infinite loop to check the number of users logged in periodically
while true; do
  # Count the number of users logged into the system
  user_count=$(who | wc -l)
  
  # Display the number of users
  echo "Number of users logged in: $user_count"
  
  # Wait for the specified interval before checking again
  sleep $(($interval * 60))  # Convert minutes to seconds
done
