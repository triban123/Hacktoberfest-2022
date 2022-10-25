public static void saddlePoint(int[][] arr){
   int n = arr.length;
   int m = arr[0].length;
   for(int r = 0; r < n; r++) {
       int col = -1;
       int minEle = (int)1e9;
       for(int c = 0; c < m; c++) {
           if(minEle > arr[r][c]) {
               minEle = arr[r][c];
               col = c;
           }
       }  
       boolean isSaddlePoint = true;
       for(int i = 0; i < n; i++) {
           if(minEle < arr[i][col]) {
               isSaddlePoint = false;
               break;
           }
       }
       if(isSaddlePoint) {
           System.out.print(minEle);
           return;
       }
   }
   System.out.print("Invalid input");
}


//Time Complexity : O(n*m)
//Space Complexity: O(1)
