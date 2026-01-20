# Java bootcamp (dt)

---

## Project Structure

```
JavaProject/
│── src/
│   ├── FirstProgram.java
│   ├── VariableDemo.java
│   ├── VariableDemo2.java
│   ├── DataType.java
│   ├── StringIntro.java
│   ├── Sum.java
│   ├── UserInput.java
│   ├── Operators.java
│   ├── ConditionalDemo.java
│   └── SwitchDemo.java
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

Used to combine conditions.

| Operator | Meaning     |   |            |
| -------- | ----------- | - | ---------- |
| `&&`     | Logical AND |   |            |
| `        |             | ` | Logical OR |
| `!`      | Logical NOT |   |            |

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
