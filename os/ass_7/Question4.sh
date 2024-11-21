# Write a shell script that takes a list of names and displays all information in the 
# password file, where login names are the members of the list.

#!/bin/bash

# Check if at least one username is provided
if [ $# -lt 1 ]; then
  echo "Usage: $0 <username1> <username2> ..."
  exit 1
fi

# Loop through each username provided as arguments
for username in "$@"; do
  # Retrieve user information from /etc/passwd
  user_info=$(grep "^$username:" /etc/passwd)

  # Check if user information was found
  if [ -z "$user_info" ]; then
    echo "Error: User '$username' not found."
    continue
  fi

  # Display the user information
  echo "Information for user '$username':"
  echo "-----------------------------------"
  echo "$user_info" | awk -F: '{ 
      print "Username:        " $1;
      print "User ID (UID):   " $3;
      print "Group ID (GID):  " $4;
      print "Description:     " $5;
      print "Home Directory:  " $6;
      print "Default Shell:   " $7;
      print "";
  }'
done
