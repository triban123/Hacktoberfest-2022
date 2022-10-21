#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void MinimumElementIndex(int arr[], int n)
{
    int min = INT_MAX;
    int index = -1;
    for(int i=0; i < n; i++){
        if(arr[i] < min)
        {
            min = arr[i];
            index = i;
        }
    }
    cout <<" Minimum element index is "<< index <<endl;
}

int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    MinimumElementIndex(arr, n);
    
    return 0;
}
