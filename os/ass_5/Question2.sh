#!/bin/bash

# Generate all combinations of 1, 2, and 3


# Single digit combinations
for i in 1 2 3
do
  echo "$i"
done

# Two-digit combinations
for i in 1 2 3
do
  for j in 1 2 3
  do
    echo "$i$j"
  done
done

# Three-digit combinations
for i in 1 2 3
do
  for j in 1 2 3
  do
    for k in 1 2 3
    do
      echo "$i$j$k"
    done
  done
done
