package Deep_Copy_Demo.Controller;

import Deep_Copy_Demo.array.Array;
import java.lang.CloneNotSupportedException;

public class App{

  public void run() throws CloneNotSupportedException{
    // Before Copy
    // @Testing (Deep Copy) 
    System.out.println("--- Before Deep Copy ---");
    Array array1 = new Array();
    System.out.println("array1: " + array1); // array1: 1 2 3 4 5 6

    Array array2 = (Array) array1.clone();
    System.out.println("array2: " + array2); // array2: 1 2 3 4 5 6

    array2.increment();

    // After Copy
    System.out.println("--- After Deep Copy ---");
    System.out.println("array1: " + array1); // array1: 1 2 3 4 5 6
    System.out.println("array2: " + array2); // array2: 2 3 4 5 6 7
  }
}