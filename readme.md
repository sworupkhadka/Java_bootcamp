# Java bootcamp (dt)

---

##  Project Structure

```
JavaProject/
│── src/
│   ├── FirstProgram.java
│   └── VariableDemo.java
│── README.md
```

---

## ▶ How to Run the Program

### Using an IDE

1. Open the project in your IDE (IntelliJ IDEA / Eclipse / VS Code)
2. Open the Java file you want to run
3. Click the **Run ▶️** button

### Using Terminal

```
javac FirstProgram.java
java FirstProgram
```

Or for the variable example:

```
javac VariableDemo.java
java VariableDemo
```

---

##  Sample Code: Hello World

```
public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

---

##  Explanation (main method)

* `public` → JVM can access the method from anywhere
* `static` → No object is required to run the program
* `void` → The method does not return any value
* `main` → Entry point of a Java program
* `String[] args` → Accepts command-line arguments

---

##  Variables in Java

```
// A variable is a container that stores data in memory

public class VariableDemo {
    public static void main(String[] args) {
        int n = 50;  // here n is a variable that stores an integer value
        System.out.println(n);
    }
}
```

###  Explanation

* **Variable** → A named memory location used to store data
* `int` → Data type that stores whole numbers (integers)
* `n` → Variable name
* `=` → Assignment operator (assigns value to variable)
* `50` → Value stored in memory
* `System.out.println(n)` → Prints the value of `n` to the console

 When the program runs:

* Memory is allocated for `n`
* Value `50` is stored in that memory
* The value is printed as output

---

##  Output

```
50
```

---

##  Key Takeaways

* Every Java program starts with the `main` method
* Variables store data that programs can use and modify
* Java is a **strongly typed language** (data type is required)
* `System.out.println()` is used to display output

---


