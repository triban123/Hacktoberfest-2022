import java.util.*;
import java.util.Arrays;
class main
{
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the length of array");
        n=sc.nextInt();
        Integer [] arr=new Integer[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        List<Integer> al=Arrays.asList(arr);
        Collections.reverse(al);

        System.out.println("Array After reverse");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}