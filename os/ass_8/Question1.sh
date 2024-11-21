# 1.  Write  a  shell  script  to  create  an  array.  Total  number  of  elements  in  the  array  is 
# 30.Print  the  array.  Then  delete  the  12th  and  22nd  element  from  the  array.  Again 
# print the array.

#!/bin/bash

# Step 1: Create an array with 30 elements
array=($(seq 1 30))  # Creates an array with values from 1 to 30

# Step 2: Print the original array
echo "Original array:"
echo "${array[@]}"

# Step 3: Delete the 12th and 22nd elements (index starts from 0, so 12th element is at index 11 and 22nd is at index 21)
unset array[11]
unset array[21]

# Step 4: Re-index the array
array=("${array[@]}")  # This re-indexes the array

# Step 5: Print the array after deletion
echo "Array after deleting the 12th and 22nd elements:"
echo "${array[@]}"
