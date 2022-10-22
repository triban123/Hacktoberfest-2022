//Find kth smallest number in an array.
import java.util.*;
public class KthSmallestElement{
  public static void main(String[] args){
    int[] array = {15,4,6,8,21};
    int length = array.length;
    int k = 4;
    
    Set<Integer> elements = new TreeSet<>();
    k--;
    for(int i =0; i< length; i++){
      elements.add(array[i]);
    }
    
    Iterator<Integer> itr = elements.iterator();
    while(k > 0){
      itr.next();
      k--;
    }
    System.out.println("Number : " + itr.next());
  }
}
