//find majority element in an array

import java.util.*;

public class MajorityElement{
  public static void main(String[] args){
    int[] arr = {3,3,3,3,7,7,3,5,5};
    int length = arr.length;
    
    HashMap<Integer,Integer> elements = new HashMap<>();
    for(int i =0; i<length; i++){
      if(elements.containsKey(arr[i])){
        int elementCount = elements.get(arr[i]) + 1;
        if(elementCount > length / 2){
          System.out.println("Majority Element: "+ arr[i]);
          return;
        } else
          elements.put(arr[i], count);
      }
      else
        elements.put(arr[i], 1);
    }
    System.out.println(" No Majority element present in the array");
  }
}
