// Second Max Algorithm

#include <stdio.h>
#include <stdlib.h>

int second_max(int arr[], int n)
{
   
    int lar = arr[0];
    int sec = arr[1];

    // Ensure largest and secondLargest are properly initialized
    if (sec > lar)
    {
        int temp = lar;
        lar = sec;
        sec = temp;
    }

    for (int i = 2; i < n; ++i) {
        if (arr[i] > lar) {
            sec = lar;
            lar = arr[i];
        } else if (arr[i] > sec && arr[i] != lar) {
            sec = arr[i];
        }
    }
    return sec;
}


int main()
{
    int arr[] = {96,52,11,54,6};
    int secondLargest  = second_max(arr,sizeof(arr)/sizeof(arr[0]));
    printf("Second Largest: %d",secondLargest);
    return 0;
}