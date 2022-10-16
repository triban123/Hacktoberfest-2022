
class Solution{
    //Function to find the leaders in the array.
    public:
    vector<int> leaders(int a[], int n){
        // Code here
                vector<int> res;
        int mx = INT_MIN;
        for(int i = n-1; i >= 0; i--) {
            mx = max(mx, a[i]);
            if(mx <= a[i])
                res.push_back(a[i]);
        }
        reverse(res.begin(), res.end());
        return res;

    }
};
class Solution{
    //Function to find the leaders in the array.
    public:
    vector<int> sta(int a[], int n){
        // Code here
                vector<int> res;
        int mx = INT_MIN;
        for(int i = n-1; i >= 0; i--) {
            mx = max(mx, a[i]);
            if(mx <= a[i])
                res.push_back(a[i]);
        }
        reverse(res.begin(), res.end());
        return res;

    }
};
