# 📘 OOP Documentation

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

    ```Java
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
    > this keyword help us to extend parent class's behaviors
  - Superclass (parent) & Subclass (child)

    ```Java
        class Animal {
            void eat() {
                System.out.println("This animal eats food.");
            }
        }

        class Dog extends Animal {
            void bark() {
                System.out.println("The dog barks.");
            }
        }

        public class Main {
            public static void main(String[] args) {
                Dog myDog = new Dog();
                myDog.eat();  // Inherited from Animal
                myDog.bark(); // Defined in Dog
            }
        }
    ```

- 🔹 Polymorphism

  > It means **"many forms"** — that is, the ability to use the same method in different ways.

  - Many forms: method overloading & overriding

    - Method overloading

      > Defining multiple methods with the same name but different parametrs in the same class and this known as compile time polymorphism

      ```Java
      class Math {
            int add(int a, int b) {
            return a + b;
            }

            int add(int a, int b, int c) {
            return a + b + c;
            }
        }

      ```

    - Method overriding

      > A subclass redefines a method defined in the superclass according to its own needs and it's known as runtime polymorphism

      ```Java
      class Animal {
          void makeSound() {
              System.out.println("Animal makes a sound.");
          }
      }

      class Cat extends Animal {
          void makeSound() {
              System.out.println("Cat meows.");
          }
      }
      ```

## 3. Advanced OOP Concepts

- Constructor and Overloaded Constructor

  - Constructor

    > it's a special methhod that is automaticly called when an object is created, it has name **same name as the class** and **does not have a return type** and it used to **initialize objects** with the default or initial values

    ```Java
    class Person {
    String name;
        // Constructor
        Person() {
            name = "Unknown";
        }
    }
    ```

  - Overloaded Constructor

    > Means that having more than one contructor in the same class with different parametrs, it allows objects to be initialized in multiple ways

    ```Java
      class Person {
          String name;
          int age;

          // Default constructor
          Person() {
              name = "Unknown";
              age = 0;
          }

          // Overloaded constructor
          Person(String name, int age) {
              this.name = name;
              this.age = age;
          }

      }

    ```

- What is the difference between `constructors` and `methods`?

  | Feature                 | Constructor                                                                             | Method                                                   |
  | ----------------------- | --------------------------------------------------------------------------------------- | -------------------------------------------------------- |
  | 🔹 **Purpose**          | Used to create a new object                                                             | Used to define the behavior (functionality) of an object |
  | 🔹 **Name**             | Must have the **same name as the class**                                                | Can have any name                                        |
  | 🔹 **Return type**      | **No return type**, not even `void`                                                     | Must have a return type (`void`, `int`, `String`, etc.)  |
  | 🔹 **How it is called** | Called automatically when a new object is created (with `new`)                          | Called manually: `object.methodName()`                   |
  | 🔹 **Overloading**      | **Yes**, you can have multiple constructors with different parameters                   | Yes, methods can also be overloaded                      |
  | 🔹 **Inheritance**      | Constructors are **not inherited**, but parent constructor can be called with `super()` | Methods **are inherited and can be overridden**          |

- this and super keywords

  - `this` keyword

    > refers to current object of class, it used also when you want to **Distinguish** between **class fields** and **method parameters** that have same name, can also be used to **call another constructor** in the same class

    ```Java
    class Student {
        String name;

        Student(String name) {
            this.name = name; // 'this.name' refers to the class variable
        }
    }
    ```

    ```Java
    class Student {
        String name;
        int age;

        Student() {
            this("Unknown", 0); // Calls the constructor below
        }

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    ```

  - `super` keyword

    > refers to **parent (superclass)** of the current object, Used to acces superclass **methods or constructor** and helps to override methods properly and call parent class contructors

    ```Java
    class Animal {
      Animal() {
        System.out.println("Animal constructor called");
      }
    }

    class Dog extends Animal {
      Dog() {
        super(); // Calls the constructor of Animal
        System.out.println("Dog constructor called");
      }
    }

    ```

    ```Java
    class Animal {
    void makeSound() {
        System.out.println("Some sound");
      }
    }

    class Dog extends Animal {
      void makeSound() {
        super.makeSound(); // Calls the Animal class method
        System.out.println("Dog barks");
      }
    }
    ```

- Static members

  - Defines using the `static` keyword, Only **one copy** exists all objects of the class (shared), Accesed using the class name, not through an object

    ```Java
    class Counter {
      static int count = 0; // static member

      Counter() {
        count++; // count increase for the all objects
        System.out.println(count);
      }
    }

    public class Main {
      public static void main(String[] args) {
          Counter c1 = new Counter(); // 1
          Counter c2 = new Counter(); // 2
          Counter c3 = new Counter(); // 3
      }
    }

    ```

  Note: `static` keyword tips, Useful for storing shared data (like counters, configurations). Used in utility or helper methods (Math.random(), Collections.sort()).

- Final keyword

  | İstifadə         | Mənası                                            |
  | ---------------- | ------------------------------------------------- |
  | `final` variable | Dəyəri dəyişməz                                   |
  | `final` method   | Override edilə bilməz, ancaq overload edile biler |
  | `final` class    | Extend (miras) edilə bilməz                       |

<hr/>

> I will finsh the document after the tasks

<hr/>
- Composition vs Inheritance
- Aggregation

## 4. Access Modifiers

- public, private, protected, and default
- How they affect visibility

## 5. Interface vs Abstract Class

- Interface

  **In Java, an Interface** is a **template** that defines what functions a class should have. It only contains method signatures; **how these methods work is determined by the class that implements the interface**.

  > Simply put: `Interface` tells you "What you should do", but not "How you should do it".

  - Created using the `interface` keyword
  - A class can implement more than one interface
  - Provides 100% abstraction. For example, think about using a SmartPhone with various applications. You use these apps, but you don't care how they are made or how they work internally. In a way, this is like the "interface" for a human.

  ```Java
  interface Car {
      void startEngine();
      void accelerate();
      void brake();
  }

  class Sedan implements Car {

      public void startEngine() {
          System.out.println("Sedan engine started.");
      }

      public void accelerate() {
          System.out.println("Sedan is accelerating smoothly.");
      }

      public void brake() {
          System.out.println("Sedan is slowing down.");
      }
  }

  class SportCar implements Car {

      public void startEngine() {
          System.out.println("SportCar engine roars to life!");
      }

      public void accelerate() {
          System.out.println("SportCar accelerates like a rocket!");
      }

      public void brake() {
          System.out.println("SportCar brakes instantly.");
      }
  }

  public class Main {
      public static void main(String[] args) {
          Car mySedan = new Sedan();
          Car mySportCar = new SportCar();

          System.out.println("--- Sedan ---");
          mySedan.startEngine();
          mySedan.accelerate();git
          mySedan.brake();

          System.out.println("\n--- SportCar ---");
          mySportCar.startEngine();
          mySportCar.accelerate();
          mySportCar.brake();
      }
  }
  ```

- Abstract Class ?

- Differences and use cases
- When to use which?

## 6. Real-world OOP Example

- Mini project or code snippet demonstrating OOP in action

## 7. OOP Best Practices

- SOLID Principles (Single Responsibility, Open/Closed, etc.)
- DRY (Don't Repeat Yourself)
- Reusability
- Maintainability
