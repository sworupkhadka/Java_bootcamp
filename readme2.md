# Java Programming

This README provides a **detailed and well-structured overview of core Java concepts**, useful for beginners, students, and interview preparation.

---

## Table of Contents

1. Introduction to Java
2. Variables in Java
3. Data Types in Java
4. Operators in Java
5. Control Statements (Loops)
6. Break and Continue Statements
7. Arrays in Java
8. Functions / Methods in Java
9. Exception Handling in Java

---

## 1. Introduction to Java

Java is a **high-level, object-oriented, platform-independent** programming language developed by **Sun Microsystems** (now owned by Oracle).

### Features of Java
- Simple and secure
- Object-oriented
- Platform-independent (Write Once, Run Anywhere)
- Robust and memory efficient
- Multithreaded

---

## 2. Variables in Java

A variable is a container used to store data values.

### Types of Variables

1. **Local Variable** – Declared inside a method
2. **Instance Variable** – Declared inside a class but outside methods
3. **Static Variable** – Declared using the `static` keyword

### Example
```java
int age = 20;
static int count = 10;
```
---
## 3. Data Types in Java
Java data types are divided into **Primitive** and **Non-Primitive.**

---

### 3.1 Primitive Data Types
| Data Type | Size   | Description               |
|----------|--------|---------------------------|
| byte     | 1 byte | Small integers            |
| short    | 2 bytes| Medium integers           |
| int      | 4 bytes| Whole numbers             |
| long     | 8 bytes| Large integers            |
| float    | 4 bytes| Decimal values            |
| double   | 8 bytes| High precision decimals   |
| char     | 2 bytes| Single character          |
| boolean  | 1 bit  | true or false             |


Example
```
int num = 10;
float price = 99.9f;
```

---
## 3.2 Non-Primitive (Reference) Data Types
Used to store complex data and references.

---
### Common Non-Primitive Types
- String
- Arrays
- Classes
- Objects
- Interfaces
- Enums

---
| Data Type  | Description                  |
|-----------|------------------------------|
| String    | Sequence of characters       |
| Array     | Collection of same data type |
| Class     | Blueprint of objects         |
| Object    | Instance of class            |
| Interface | Implements abstraction      |
| Enum      | Group of constants           |


Example
```
String name = "Java";
int[] numbers = {1, 2, 3};
```
---
## 4. Operators in Java
Operators are used to perform operations on variables.

---

## Types of Operators
```
1. Arithmetic Operators
+ - * / %

2. Relational Operators
== != > < >= <=

3. Logical Operators
&& || !

4. Assignment Operators
= += -= *= /=

5. Unary Operators
++ --
```

Example:
```
int a = 10, b = 5;
System.out.println(a + b);
```

---
## 5. Control Statements (Loops)
Loops are used to execute code repeatedly.

---
### Types of Loops
## 5.1 for Loop
- Is a commonly used loop where you already know how many times you want to iterate through the loops.
```
for(int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### 5.2 while Loop
- while loop executes a block of code as long as specified condition is true.
```
int i = 1;
while(i <= 5) {
    System.out.println(i);
    i++;
}
```

### 5.3 do-while Loop
- do-while loop can be used if you need to perform some task at least one time. it checks for the condition after executing the statements of the loop
```
int i = 1;
do {
    System.out.println(i);
    i++;
} while(i <= 5);
```
---

## 6. Break and Continue Statements
- **break**
  Used to terminate a loop.
```
for(int i = 1; i <= 10; i++) {
    if(i == 5) break;
    System.out.println(i);
}
```
- **continue**
  Used to skip current iteration.
```
for(int i = 1; i <= 5; i++) {
    if(i == 3) continue;
    System.out.println(i);
}
```

---

## 7. Arrays in Java
An array stores multiple values of the same data type.
- Declaration
```
int[] numbers = new int[5];
```
- Initialization
```
int[] numbers = {1, 2, 3, 4, 5};
```
- Accessing Elements
```
System.out.println(numbers[0]);
```

---

## 8. Functions / Methods in Java
A method is a block of code that performs a specific task.
#### Syntax
```
returnType methodName(parameters) {
    // code
}
```
Example
```
static int add(int a, int b) {
    return a + b;
}
```

## Method Types
- Predefined Methods (e.g., println())
- User-defined Methods

---

## 9. Exception Handling in Java
Exception handling is used to handle runtime errors.

---
### Keywords
- try
- catch
- finally
- throw
- throws
---

Example
```
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    System.out.println("Execution completed");
}
```
---
## Conclusion
This README covers core Java fundamentals including variables, data types, operators, loops, arrays, methods, and exception handling.
Mastering these concepts is essential before moving to OOP, Collections, and Advanced Java.