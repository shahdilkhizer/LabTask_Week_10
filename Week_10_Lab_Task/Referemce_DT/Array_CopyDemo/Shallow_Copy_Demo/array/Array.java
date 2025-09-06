package Shallow_Copy_Demo.array;

import java.lang.Cloneable;
import java.lang.CloneNotSupportedException;
public class Array implements Cloneable{
  private int[] anArray = {1,2,3,4,5,6};
  
  public void increment(){
    for(int i = 0; i < anArray.length; i++) 
        anArray[i] += 1;  
    }
  
  @Override
  public String toString(){
    String result = "";
    for(int i = 0; i < anArray.length; i++)
      result += anArray[i] + " ";
    return result;
  }

  @Override
  public Object clone() throws CloneNotSupportedException{
    // Shallow Copy
    return super.clone();
  }
  
}