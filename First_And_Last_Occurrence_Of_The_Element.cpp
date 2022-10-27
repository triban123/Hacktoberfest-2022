#include<bits/stdc++.h>
using namespace std;

vector<int> find(int arr[], int n , int x )
{
    vector<int>ans;
    for(int start=0;start<n;start++){
        if(arr[start]==x){
            ans.push_back(start);
            break;
        }
    }
    for(int last=n-1;last>=0;last--){
        if(arr[last]==x){
            ans.push_back(last);
            break;
        }
    }
    if(ans.size()<2){
        ans.push_back(-1);
        ans.push_back(-1);
    }
    
    return ans;
}

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,x;
        cin>>n>>x;
        int arr[n],i;
        for(i=0;i<n;i++)
        cin>>arr[i];
        vector<int> ans;
        ans=find(arr,n,x);
        cout<<ans[0]<<" "<<ans[1]<<endl;
    }
    return 0;
}
