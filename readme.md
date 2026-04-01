# Java bootcamp (dt)

---

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

## Sample Code: Hello World

```java
public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

---

## Explanation (main method)

* `public` → JVM can access the method
* `static` → No object required
* `void` → Returns nothing
* `main` → Program execution starts here
* `String[] args` → Command-line arguments

---

## Variables in Java

```java
int n = 50;
```

* **Variable** → Container that stores data
* `int` → Data type
* `n` → Variable name

---

## Data Types in Java

```java
int age = 20;
double salary = 45000.50;
char grade = 'A';
boolean isActive = true;
```

---

## String in Java

```java
String name = "Diyo";
```

* Stores text values
* Uses double quotes

---

## User Input (Scanner)

```java
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
```

* `nextInt()` → reads integer
* `next()` → reads single word
* `nextLine()` → reads full line

---

## Operators in Java

### Arithmetic Operators

```java
int a = 10, b = 5;
System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

---

### Logical Operators

##### Used to combine conditions.

- Logical AND (&&)
- Logical OR (||)
- Logical NOT (!)

---
#### Logical AND (&&)

```java
if (age > 18 && hasId) {
    System.out.println("Allowed");
}
```

---

## Conditional Statements

### if statement

```java
if (age >= 18) {
    System.out.println("Adult");
}
```

---

### if-else statement

```java
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

---

### if-else ladder

```java
if (marks >= 90) {
    System.out.println("A");
} else if (marks >= 75) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

---

### switch statement

```java
switch(day) {
    case 1:
        System.out.println("Sunday");
        break;
    case 2:
        System.out.println("Monday");
        break;
    default:
        System.out.println("Invalid day");
}
```

---

### Ternary Operator

Short form of if-else in one line.

**Syntax:**

```java
condition ? valueIfTrue : valueIfFalse;
```

**Example:**

```java
int max = (a > b) ? a : b;
```

---

## Looping Statements in Java

- Loops are used to execute a block of code repeatedly as long as a condition is true.
---

## While Loop

The **while loop** checks the condition before executing the loop body.

**Syntax:**
```
while (condition) {
// code to execute
}
```
Example:
```
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

---
## do-while Loop

- The **do-while** loop executes the loop body at least once, then checks the condition.

**Syntax:**
```
do {
// code to execute
} while (condition);
```
Example:
```
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

---
## for Loop

- The **for** loop is used when the number of iterations is known in advance.

Syntax:
```
for (initialization; condition; increment/decrement) {
// code to execute
}
```
Example:
```
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```
---
### Common Loop Mistakes
- Missing or extra semicolon (;) after loop condition
- Infinite loop due to missing increment/decrement
- Using wrong condition (<= vs <)

---
# Day 7:

---
## Enhanced for Loop (for-each)
```
int numbers[] = {1,2,3,4,5};

for(int num : numbers){
System.out.println(num);
}
```
### Example: User Input + Loop
````
import java.util.Scanner;

public class DoWhileUserInput {
public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter count:");
        int count = scanner.nextInt();

        for(int i = 1; i <= count; i++){
            System.out.println("Hello World " + i);
        }
    }
}
````

### Example: ForEach Loop
````
public class ForEachLoop {
static void main(String[] args) {
int numbers [] ={1,2,3,4,5};

        for(int num : numbers){
            System.out.println(num * num);
        }
    }
}

````

### Example: Do-While Loop
````
public class DoWhile {
public static void main (String [] args){
int i = 1;

        do{
            System.out.println("hello world");
            i++;
        } while(i <= 5);
    }
}


````
---
## Break Statement
````
import java.util.Scanner;

public class BreakDemo {
public static void main(String[] args) {

        int numbers[] = {1, 3, 5, 7, 12};
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number to search:");
        int numToSearch = sc.nextInt();

        for(int num : numbers){
            if (num == numToSearch){
                System.out.println("number found");
                break;
            }
        }
    }
}
````
---
## Continue Statement
````
public class ContinueDemo {
public static void main (String [] args){
int numbers []={1,2,3,4,5,6};

        for (int num : numbers){
            if (num % 2 != 0){
                continue;
            }
            System.out.println(num);
        }
    }
}

````
---
### String Creation
````
public class StringIntro2 {
public static void main (String args []){

        // string literal (recommended)
        String programmingLanguage = "Java";

        // using new keyword (creates new memory)
        String pLanguage = new String("Java");
    }
}
````
---
### String Methods
````
public class StringMethods {
public static void main (String args []){
String state = "New Jersey";
String city = "iselin";

        System.out.println(state);
        System.out.println(state.toLowerCase());
        System.out.println(state.toUpperCase());
        System.out.println(state.length());
        System.out.println(state.charAt(2));
        System.out.println(city.concat(" ").concat(state));
        System.out.println(state.startsWith("Ne"));
        System.out.println(state.endsWith("y"));
        System.out.println(state.indexOf("w"));
        System.out.println(state.lastIndexOf("y"));
    }
}
````
---
## EDO

----