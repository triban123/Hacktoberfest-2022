class rotateNumber {
  public static int rotateNumber(int n,int k){
    int len=countDigit(n);
    k %= len;
    if(k <= 0) 
    k = (k + len)%len;
    int mul = 1, div = 1;
    for(int i = 1; i <= len; i++) {
        if(i <= k) div *= 10;
        else mul *= 10;
    }
    return ((n%div)*mul) + (n/div);
   }
}

//Time complexity: O(len of number)
//Space complexity: O(1)
