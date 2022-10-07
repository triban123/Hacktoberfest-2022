class Solution {
    public int reverse(int res) {
        boolean negetive=false;
        if(res<0){
         negetive=true;
            res*=-1;
        }
    long reverse=0;
        while(res>0){
            reverse=reverse*10+res%10;
            res/=10;
        }
        
        if(reverse>Integer.MAX_VALUE){
            return 0;
        }
        return negetive ? (int)(-1*reverse):(int)reverse;
        
}
}
