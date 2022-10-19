public class Pattern{

    // Main Function
    public static void main(String[] args) {
        
        // Using Nested loop
        
        // Outer Loop
        for(int i=0;i<6;i++){
            // Inner Loop
            for(int j=1;j<=6-i;j++){
                // for using print statement
                System.out.print(j);    
            }    
            // for using next line
            System.out.println();    
        }
    }
}



// Output 

// 123456
// 12345
// 1234
// 123
// 12
// 1

