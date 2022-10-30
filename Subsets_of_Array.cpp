#include <bits/stdc++.h>
using namespace std;

class Solution
{
    public:
    void solve(vector<int> InputArray, int index, vector<int>subset, vector<vector<int>>& outputSubsets)
    {    
        if(index >= InputArray.size())
        {
            outputSubsets.push_back(subset);
            return;
        }
        
        solve(InputArray,index+1,subset,outputSubsets);
        
        int element = InputArray[index];
        subset.push_back(element);
        solve(InputArray,index+1,subset,outputSubsets);
        
    }
    
    vector<vector<int> > subsets(vector<int>& InputArray)
    {
        vector<vector<int>>subsetsOfArray;
        vector<int>oneSubset;
        int intialIndexValue = 0;
        solve(InputArray, intialIndexValue, oneSubset, subsetsOfArray);
        sort(subsetsOfArray.begin(),subsetsOfArray.end());
        return subsetsOfArray;
    }
};

int main()
{
	int testcase;
	cin >> testcase;

	while (testcase--)
	{
		int numberOfElements, number;
		cin >> numberOfElements;

		vector<int> array;
		for (int i = 0; i < numberOfElements; i++)
		{
			cin >> number;
			array.push_back(number);
		}
        
        Solution ob;
		vector<vector<int> > result = ob.subsets(array);

		for (int i = 0; i < result.size(); i++) {
			for (int j = 0; j < result[i].size(); j++)
				cout << result[i][j] << " ";
			cout << endl;
		}
	}
	return 0;
}
