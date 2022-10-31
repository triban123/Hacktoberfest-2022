/*
** Value equal to index value is used to find the element having same value as index value.
*/

#include<bits/stdc++.h>
using namespace std;

class Solution{
public:
	vector<int> valueEqualToIndex(int arr[], int numberOfElements) {
	    vector<int>answer;
	    for(int index=0;index<numberOfElements;index++){
	        if((index+1) == arr[index]){
	            answer.push_back(arr[index]);
	        }
	    }
	    return answer;
	}
};

int main() {
    int testcase;
    cin >> testcase;
    while (testcase--) {
        int numberOfElements, index;
        cin >> numberOfElements;
        int arr[numberOfElements];
        for (index = 0; index < numberOfElements; index++) {
            cin >> arr[index];
        }
        Solution ob;
        auto answer = ob.valueEqualToIndex(arr, numberOfElements);
        if (answer.empty()) {
            cout << "Not Found";
        } else {
            for (int x: answer) {
                cout << x << " ";
            }
        }
        cout << "\n";
    }
    return 0;
}
