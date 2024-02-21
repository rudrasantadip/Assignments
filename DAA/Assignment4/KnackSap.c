//Program in c to implement fractional knapsack

#include <stdio.h>
#include <stdlib.h>

// Structure to represent items
struct Item {
    int value;
    int weight;
};

// Function to compare items based on their value per unit weight
int compare(const void *a, const void *b) {
    double ratio1 = (double)((struct Item *)a)->value / ((struct Item *)a)->weight;
    double ratio2 = (double)((struct Item *)b)->value / ((struct Item *)b)->weight;
    return (ratio2 > ratio1) - (ratio2 < ratio1);
}

// Function to solve fractional knapsack
double fractionalKnapsack(int W, struct Item arr[], int n) {
    // Sort items based on value per unit weight
    qsort(arr, n, sizeof(struct Item), compare);

    double totalValue = 0.0; // Total value of items picked

    // Initialize current weight in knapsack
    int currentWeight = 0;

    // Loop through each item
    for (int i = 0; i < n; i++) {
        // If adding the whole item would not exceed the weight limit
        if (currentWeight + arr[i].weight <= W) {
            currentWeight += arr[i].weight; // Add the whole item
            totalValue += arr[i].value;     // Add the value of the whole item
        } else {
            // If adding the whole item would exceed the weight limit, add fractional part
            int remainingWeight = W - currentWeight;
            totalValue += (double)arr[i].value / arr[i].weight * remainingWeight;
            break; // Since knapsack is full
        }
    }

    return totalValue;
}

int main() {
    // Example usage
    struct Item arr[] = {{60, 10}, {100, 20}, {120, 30}}; // {value, weight} pairs
    int n = sizeof(arr) / sizeof(arr[0]); // Number of items
    int W = 50; // Knapsack capacity

    double maxValue = fractionalKnapsack(W, arr, n);

    printf("Maximum value in Knapsack = %.2lf\n", maxValue);

    return 0;
}
