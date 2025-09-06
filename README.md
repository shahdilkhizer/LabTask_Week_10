**Deep Copy vs Shallow Copy**

This project demonstrates the difference between Shallow Copy and Deep Copy in Java with simple examples.
```
📂** Project Structure**
array/
   └── Array.java
Controller/
   └── App.java
Main.java
```

**⚙️ How to Compile**

Run the following command to compile all files:
```
javac array/Array.java Controller/App.java Main.java
```
▶️ **How to Run**
```
java Main
```

📖** Concept Overview**

**Shallow Copy**

* Copies only the reference of an object.

* Both objects point to the same memory location.

* Changes in one object are reflected in the other.

**Deep Copy**

* Creates a completely new copy of the object.

* Objects are stored in separate memory locations.

* Changes in one object do not affect the other.
