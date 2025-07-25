# 📘 OOP Documentation – Başlıklar ve Anahtar Kavramlar

> In this document i need to touch & repeat all oop concepts

## 1. Introduction to OOP

- What is Object-Oriented Programming?

  > oop is a programming paradigm which is based on concepts of "Objects", which are instances of `classes`, allows you to structure your code like real-world models and i want to mention 4 main principles of oop: Encapsulation, Inheritance, Polymorphism, Abstraction

- Benefits of OOP

  > Modularity, Reusability, Scalability, Maintainability, Encapsulation, RealWorld modeling, Polymorphisim

- Real-life analogy

  > To understand OOP better, let's look at a real-world example — a Car, For example: Imagine a "Car": You can think of Car as a class, Each specific car you see (Toyota, BMW, etc.) is an object created from that class.

## 2. Core Concepts of OOP

- 🔹 Class

  - Blueprint for creating objects

    > Blueprint is just a plan or template

  - Contains fields (variables) and methods (functions)

- 🔹 Object

  - Instance of a class

    > it's just a plan, and object is a something created with class's plan

  - Represents a real-world entity

- 🔹 Encapsulation

  > in simplfy think it is just pharmacy capsul encapsulated from the other things, and like this rule in program some data named like `private` so that they cannot be changed from anywhere

  - Binding data and methods together
  - Access modifiers: private, public, protected

    > private: can only be accessed from within the same class, public: can be accessed from anywhere, protected: can be accessed from the same package and subclasses

  - Getters and Setters

    > in these methods we can read private datas

        ``` Java
        public class Student {
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String newName) {
                name = newName;
            }
        }
        ```

- 🔹 Abstraction

  - Hiding complex implementation details
  - Exposing only essential features
  - Abstract classes and Interfaces

- 🔹 Inheritance

  - Acquiring properties and behaviors from another class
  - `extends` keyword
  - Superclass (parent) & Subclass (child)

- 🔹 Polymorphism

  - Many forms: method overloading & overriding
  - Allows objects to be treated as instances of their parent class

## 3. Advanced OOP Concepts

- Constructor and Overloaded Constructor
- this and super keywords
- Static members
- Final keyword
- Composition vs Inheritance
- Aggregation

## 4. Access Modifiers

- public, private, protected, and default
- How they affect visibility

## 5. Interface vs Abstract Class

- Differences and use cases
- When to use which?

## 6. Real-world OOP Example

- Mini project or code snippet demonstrating OOP in action

## 7. OOP Best Practices

- SOLID Principles (Single Responsibility, Open/Closed, etc.)
- DRY (Don't Repeat Yourself)
- Reusability
- Maintainability
