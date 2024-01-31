//Q1 Implement the Min-Max Algorithm

#include <stdio.h>
#include <stdlib.h>

int *min_max(int arr[], int n)
{
    int *result = (int*)malloc(sizeof(int*)*2);
    int min=arr[0],max=arr[0];
    for(int i=0;i<n;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];
        }
        if(arr[i]<min)
        {
            min=arr[i];
        }
    }

    result[0]=min;
    result[1]=max;
    return result;
}


int main()
{
    int arr[] = {96,52,11,54,6};
    int *max_and_min = min_max(arr,sizeof(arr)/sizeof(arr[0]));
    printf("Maximum : %d",max_and_min[1]);
    printf("\nMinimum : %d",max_and_min[0]);
    return 0;
}