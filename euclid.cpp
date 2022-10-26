// finding highest common factor(HCF) ***

#include <bits/stdc++.h>
using namespace std;

int euclid(int a, int b) {
    return b ? euclid(b, a % b) : a; // (b, a%b) swaps if written in wrong order that's why it'll always work
}

int main()
{   

    int a,b;
    cin >> a >> b;

    // cout << __gcd(a, b) << endl; // inbuilt
    cout << euclid(a, b) << endl;

    return 0;
}
