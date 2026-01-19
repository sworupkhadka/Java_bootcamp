# Java bootcamp (dt)

---

##  Project Structure

```
JavaProject/
│── src/
│   ├── FirstProgram.java
│   ├── VariableDemo.java
│   ├── VariableDemo2.java
│   ├── DataType.java
│   ├── StringIntro.java
│   ├── Sum.java
│   └── UserInput.java
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
javac FileName.java
java FileName
```

Example:

```
javac FirstProgram.java
java FirstProgram
```

---

##  Sample Code: Hello World

```java
public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

---

##  Explanation (main method)

* `public` → JVM can access the method
* `static` → No object required
* `void` → Returns nothing
* `main` → Program execution starts here
* `String[] args` → Command-line arguments

---

##  Variables in Java

```java
public class VariableDemo {
    public static void main(String[] args) {
        int n = 50; // variable storing integer value
        System.out.println(n);
    }
}
```

### Explanation

* **Variable** → Container that stores data in memory
* `int` → Integer data type
* `n` → Variable name

---

##  Naming a Variable (camelCase)

Variables should be written in **camelCase**.

**Examples:**
* age
* zipCode
* rollNumber

---

##  Variable Declaration vs Initialization

```java
public class VariableDemo2 {
    static void main(String[] args) {
        int age;              // declaration
        int rollNumber;       // camelCase
        int zipCode;
        int houseNumber;      // declaration

        houseNumber = 10;     // initialization

        int houseNumber2 = 20; // declaration + initialization

        System.out.println(houseNumber);
        System.out.println(houseNumber2);
    }
}
```

* **Declaration** → Creating variable
* **Initialization** → Assigning value

---

##  Data Types in Java

```java
public class DataType {
    public static void main(String[] args) {

        byte age = 127;              // -128 to 127
        short zipCode = 31780;       // -32768 to 32767
        int landLine = 737639;       // whole numbers
        long phoneNumber = 986720107L; // large numbers

        float price = 1200.332f;     // decimal (less precision)
        double salary = 240000.89032445435345; // decimal (more precision)

        char gender = 'M';           // single character
        boolean value = true;        // true or false

        System.out.println(age);
        System.out.println(zipCode);
        System.out.println(landLine);
        System.out.println(phoneNumber);
        System.out.println(price);
        System.out.println(salary);
        System.out.println(gender);
        System.out.println(value);
    }
}
```

---

##  String in Java

```java
public class StringIntro {
    public static void main(String[] args) {
        String name = "diyo";
        System.out.println(name);
    }
}
```

* `String` stores text
* Uses double quotes

---

##  Sum Program

```java
public class Sum {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int sum = a + b;
        System.out.println(sum);
    }
}
```

---

##  User Input Using Scanner

```java
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int firstNumber = input.nextInt();

        System.out.println("Please enter second number:");
        int secondNumber = input.nextInt();

        System.out.println("The sum = " + (firstNumber + secondNumber));
    }
}
```

---
## User Input Using Scanner (String)
```
import java.util.Scanner;

public class UserInput2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        String name;
        System.out.println("Enter your name: ");
        name = sc.nextLine();

        /*
         sc.next() reads only one word (stops at space)
         sc.nextLine() reads full line including spaces
        */

        sc.close(); // closing the scanner
        System.out.println("Your name is: " + name);
    }
}
```
---
## Operators in java
- **have a look at code files named <b><u>Operators.java<u><b>**

---

