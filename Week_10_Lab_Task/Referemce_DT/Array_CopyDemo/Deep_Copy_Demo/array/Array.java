package Deep_Copy_Demo.array;

import java.lang.Cloneable;
import java.lang.CloneNotSupportedException;
public class Array implements Cloneable{
  private int[] anArray = {1,2,3,4,5,6};

  public void increment(){
    for(int i = 0; i < anArray.length; i++) 
        anArray[i] += 1;  
    }

  private boolean validateIndex(int index){
    return index >= 0 || index < anArray.length;
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
    // Deep Copy
        Array newArray = new Array();
         for(int i = 0; i < this.anArray.length; i++)
            newArray.anArray[i] = this.anArray[i];
        return newArray;
  }


//   public void set(int index, int value){
//     if(validateIndex(index))
//         anArray[index] = value;  
//   }

//   public int get(int index){
//     if(validateIndex(index))
//         return anArray[index];
//     else
//         return -1;
//   }
//   @Override
//   public Object clone() throws CloneNotSupportedException{
//     // Deep Copy
//       Array newArray = new Array();

//       int[] arrElements = newArray.anArray;

//       for(int i = 0; i < this.anArray.length; i++)
//         newArray.set(i, this.get(i));
//       return newArray;
//   }

}