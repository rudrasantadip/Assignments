# Write  a  shell  script  which  would  receive  a  log  name  during  execution,  obtain 
# information  about  it  from  password  file  and  display  this  information  on  the 
# screen in easily understandable format.

#!/bin/bash

# Check if the username is provided as an argument
if [ -z "$1" ]; then
  echo "Usage: $0 <username>"
  exit 1
fi

# Store the username
username=$1

# Check if the user exists in the /etc/passwd file
user_info=$(grep "^$username:" /etc/passwd)

# If user is not found, print an error message
if [ -z "$user_info" ]; then
  echo "Error: User '$username' not found in the system."
  exit 2
fi

# Extract information from the user data
user_name=$(echo $user_info | cut -d: -f1)      # User's login name
user_id=$(echo $user_info | cut -d: -f3)         # User's UID
group_id=$(echo $user_info | cut -d: -f4)        # User's GID
user_desc=$(echo $user_info | cut -d: -f5)       # User's description (GECOS field)
home_dir=$(echo $user_info | cut -d: -f6)        # User's home directory
shell=$(echo $user_info | cut -d: -f7)           # User's default shell

# Display the information in an understandable format
echo "User Information for '$username':"
echo "-----------------------------------"
echo "Username:        $user_name"
echo "User ID (UID):   $user_id"
echo "Group ID (GID):  $group_id"
echo "Description:     $user_desc"
echo "Home Directory:  $home_dir"
echo "Default Shell:   $shell"
