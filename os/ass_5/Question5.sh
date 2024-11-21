#  Rajesh’s basic salary (BASIC) is input through the keyboard. His dearness 
# allowance  (DA)  is  52%  of  BASIC.  House  rent  allowance  (HRA)  is  15%  of 
# BASIC.  Contributory  provident  fund  is  12%  of  (BASIC  +  DA).  Write  a  shell 
# script to calculate his gross salary and take home salary using the following 
# formula:   Gross salary = BASIC + DA + HRA  
# Take home salary = Gross salary - (BASIC + DA) * 0.12 
 

 #!/bin/bash

# Prompt the user to enter Rajesh's basic salary
echo "Enter Rajesh's basic salary: "
read BASIC

# Calculate Dearness Allowance (DA), House Rent Allowance (HRA), and Gross Salary
DA=$(echo "scale=2; $BASIC * 0.52" | bc)
HRA=$(echo "scale=2; $BASIC * 0.15" | bc)
GROSS_SALARY=$(echo "scale=2; $BASIC + $DA + $HRA" | bc)

# Calculate Contributory Provident Fund (CPF) and Take Home Salary
CPF=$(echo "scale=2; ($BASIC + $DA) * 0.12" | bc)
TAKE_HOME_SALARY=$(echo "scale=2; $GROSS_SALARY - $CPF" | bc)

# Output the results
echo "Rajesh's Gross Salary is: $GROSS_SALARY"
echo "Rajesh's Take Home Salary is: $TAKE_HOME_SALARY"
