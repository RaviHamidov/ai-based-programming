# 🧱 Java - Object Oriented Programming (OOP)

This document summarizes the core concepts of Object-Oriented Programming (OOP) in Java with definitions and code examples.

---

## 📌 What is OOP?

**Object-Oriented Programming (OOP)** is a programming paradigm based on the concept of "objects", which contain data (fields) and methods (functions).

---

## 🔑 OOP Principles

### 1. Encapsulation 🔐

> **Encapsulation** is a fundamental principle of Object-Oriented Programming (OOP) that involves hiding the internal structure and data of a class from the outside world, while providing controlled access through public methods.

## Key Concepts

- **Data Hiding**: Making class variables private
- **Controlled Access**: Using public getter and setter methods
- **Data Validation**: Adding validation logic in setter methods

## Implementation

### 1. Make Variables Private
```java
private String name;
private int age;
```

### 2. Create Public Getter/Setter Methods
```java
// Getter method - for reading data
public String getName() {
    return name;
}

// Setter method - for writing data
public void setName(String name) {
    this.name = name;
}
```

## Complete Example

```java
public class Student {
    // Private variables - cannot be accessed directly
    private String name;
    private int age;
    private double grade;
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getGrade() {
        return grade;
    }
    
    // Setter methods with validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
    
    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }
    
    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        }
    }
}
```

## Usage Example

```java
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        
        // Setting values using setter methods
        student.setName("John Doe");
        student.setAge(20);
        student.setGrade(85.5);
        
        // Getting values using getter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());
        
        // Direct access to private variables is not allowed
        // student.name = "Jane"; // This would cause a compile error
    }
}
```

## Benefits of Encapsulation

### 🔒 **Data Security**
- Prevents unauthorized access to class data
- Protects against invalid data assignments

### ✅ **Data Validation**
- Allows validation logic in setter methods
- Ensures data integrity

### 🔄 **Flexibility**
- Internal implementation can be changed without affecting external code
- Easy to modify class behavior

### 🛠️ **Maintainability**
- Easier to debug and maintain code
- Reduces code complexity

### 📊 **Control**
- Full control over how data is accessed and modified
- Can implement read-only or write-only properties

## Best Practices

1. **Always make instance variables private**
2. **Provide public getter/setter methods only when needed**
3. **Add validation logic in setter methods**
4. **Use meaningful names for getter/setter methods**
5. **Consider using builder pattern for complex objects**

## Common Naming Conventions

- **Getter**: `getName()`, `getAge()`, `isActive()` (for boolean)
- **Setter**: `setName(String name)`, `setAge(int age)`

## Conclusion

Encapsulation is a cornerstone of good object-oriented design. It promotes code security, maintainability, and flexibility by controlling how data is accessed and modified within your classes.

<hr>
2. Inheritance 👨‍👧
   Inheritance allows a class (child) to inherit fields and methods from another class (parent).

✔️ Key Concepts:
extends keyword

Code reuse and hierarchy
9
```
public class Animal {
public void makeSound() {
System.out.println("Some sound...");
}
}

public class Dog extends Animal {
@Override
public void makeSound() {
System.out.println("Woof!");
}
}
```

3.  Polymorphism 🎭
    Polymorphism means "many forms". It allows methods to behave differently based on the object that is calling them.

✔️ Key Concepts:
Method Overriding

Method Overloading

```
// Overriding
Animal myDog = new Dog();
myDog.makeSound(); // Outputs: Woof!

// Overloading
public void print(int x) {}
public void print(String x) {}
```

4. Abstraction 🌫️
   Abstraction hides complex implementation details and shows only essential features of an object.

✔️ Key Concepts:
Abstract classes (abstract)

Interfaces

```
abstract class Shape {
abstract void draw();
}

class Circle extends Shape {
void draw() {
System.out.println("Drawing circle");
}
}

```

🧠 Summary Table
Principle Description Java Feature
Encapsulation Data hiding & access control private, get/set
Inheritance Reuse behavior from parent class extends
Polymorphism One interface, many implementations @Override, overloading
Abstraction Hiding internal complexity abstract, interface
