# Write  a  shell  script  to  create  an  array  .Total  number  of  elements  20.  Print  the 
# array. Search the 18th element and replace an array element with the element of 10th 
# positio

#!/bin/bash

# Step 1: Create an array with 20 elements
array=(1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20)

# Step 2: Print the original array
echo "Original array:"
echo "${array[@]}"

# Step 3: Replace the 18th element (index 17) with the element at the 10th position (index 9)
array[17]=${array[9]}

# Step 4: Print the array after replacement
echo "Array after replacing the 18th element with the 10th element:"
echo "${array[@]}"
