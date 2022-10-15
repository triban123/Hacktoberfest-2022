#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
   vector<int> nextSmallerElement(vector<int> &arr, int n)
{
    stack<int> st;
    vector<int>ans(n);
    st.push(-1);
    for(int i=arr.size()-1; i>=0; i--)
    {
        int cur=arr[i];
        while( st.top()!=-1 && arr[st.top()]>=arr[i]) st.pop();
        ans[i]=st.top();
        st.push(i);
    }
    
    return ans;
}
vector<int> prevSmallerElement(vector<int> &arr, int n)
{
    stack<int> st;
    vector<int>ans(n);
    st.push(-1);
    for(int i=0; i<n; i++)
    {
        int cur=arr[i];
        while( st.top()!=-1 && arr[st.top()]>=arr[i]) st.pop();
        ans[i]=st.top();
        st.push(i);
    }
    
    return ans;
}

 int largestRectangleArea(vector<int>& heights) {
    vector<int>prev=prevSmallerElement(heights,heights.size());
    vector<int>next=nextSmallerElement(heights,heights.size());
    int area=0;
    for(int i=0; i<heights.size(); i++)
    {
        int l=heights[i];
        //hum check kar rhe hote hai right side
        if(next[i]==-1) next[i]=heights.size();
        int b=next[i]-prev[i]-1;
        area=max(area,l*b);

    }
     return area;

 }
};