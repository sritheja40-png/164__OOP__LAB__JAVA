# Object-Oriented Programming (OOP) Java Laboratory

A structured collection of Java programs developed to demonstrate and practice fundamental **Object-Oriented Programming (OOP) concepts**.

This repository covers important Java concepts including **classes and objects, constructors, packages, inheritance, polymorphism, abstraction, interfaces, exception handling, wrapper classes, multithreading, inter-thread communication, collections, file handling, JavaFX, JDBC, and database connectivity**.

The experiments are organized individually, making the repository easy to navigate, understand, compile, and use for academic laboratory practice.

---

## Project Overview

This repository contains a collection of **11 Java Object-Oriented Programming laboratory experiments** designed to provide practical experience with core Java and OOP concepts.

The experiments progress from fundamental programming concepts such as **classes, constructors, and packages** to advanced concepts including **inheritance, abstraction, multithreading, file handling, graphical user interface development, and database connectivity**.

Each experiment is organized in a separate directory for easy navigation and execution.

---

# Repository Structure

```text
OOP_JAVA__161/
│
├── .gitignore
├── README.md
│
├── Ex_1_Telephone_Bill/
│   └── TelephoneBill.java
│
├── Ex_2_Temperature_Converter/
│   ├── TemperatureMain.java
│   └── temperature/
│       └── Converter.java
│
├── Ex_3_Vehicle_Inheritance/
│   └── VehicleDemo.java
│
├── Ex_4_Abstract_Library_Member/
│   └── LibraryDemo.java
│
├── Ex_5_ADT_Queue_Exception_Handling/
│   └── Main.java
│
├── Ex_6_Wrapper_Immutable_Demo/
│   └── WrapperImmutableDemo.java
│
├── Ex_7_Multithreading/
│   └── ArrayThreadDemo.java
│
├── Ex_8_Inter_Thread_Communication/
│   └── RailwayBooking.java
│
├── Ex_9_String_Operations_ArrayList/
│   └── StringMenu.java
│
├── Ex_10_File_Handling_ListFiles/
│   └── File_Handling_ListFiles.java
│
└── Ex_11_JavaFX_JDBC_CRUD/
    ├── database_setup.sql
    └── StudentManagementApp.java
```

---

# Experiments

| No. | Experiment                       | Concepts Covered                                  |
| --- | -------------------------------- | ------------------------------------------------- |
| 1   | Telephone Bill Calculator        | Classes, Objects, Constructors, Conditional Logic |
| 2   | Temperature Converter            | Packages, Static Methods, Utility Classes         |
| 3   | Vehicle Hierarchy                | Inheritance, Method Overriding, Polymorphism      |
| 4   | Library Membership System        | Abstract Classes, Abstract Methods, Polymorphism  |
| 5   | Circular Queue ADT               | Interfaces, ADT, Exception Handling               |
| 6   | Wrapper Classes and Immutability | Autoboxing, Unboxing, Object Immutability         |
| 7   | Multithreaded Array Processing   | Threads, `start()`, `join()`                      |
| 8   | Railway Booking System           | Synchronization, `wait()`, `notifyAll()`          |
| 9   | String Operations                | ArrayList, String Manipulation, Collections       |
| 10  | File Handling                    | Java File API, Directory and File Operations      |
| 11  | Student Management CRUD          | JavaFX, JDBC, MySQL, CRUD Operations              |

---

# Experiment Details

## Experiment 1 — Telephone Bill Calculator

**Directory:** `Ex_1_Telephone_Bill/`

A Java application that calculates telephone bills based on call usage and billing plans.

### Concepts

* Classes and Objects
* Instance Variables
* Parameterized Constructors
* Conditional Statements
* Tier-based Billing Logic

### Run

```bash
cd Ex_1_Telephone_Bill
javac TelephoneBill.java
java TelephoneBill
```

---

## Experiment 2 — Temperature Converter

**Directory:** `Ex_2_Temperature_Converter/`

A temperature conversion utility implemented using a user-defined Java package.

The program supports conversions between different temperature units using reusable static methods.

### Concepts

* Java Packages
* Import Statements
* Static Methods
* Utility Classes
* Modular Program Structure

### Run

```bash
cd Ex_2_Temperature_Converter
javac temperature/Converter.java TemperatureMain.java
java TemperatureMain
```

---

## Experiment 3 — Vehicle Inheritance

**Directory:** `Ex_3_Vehicle_Inheritance/`

A vehicle hierarchy demonstrating inheritance and polymorphism through different vehicle types.

The program uses a base vehicle class and specialized subclasses that implement their own tax and insurance calculations.

### Concepts

* Inheritance
* Method Overriding
* Runtime Polymorphism
* Dynamic Method Dispatch
* Subtyping

### Run

```bash
cd Ex_3_Vehicle_Inheritance
javac VehicleDemo.java
java VehicleDemo
```

---

## Experiment 4 — Abstract Library Member System

**Directory:** `Ex_4_Abstract_Library_Member/`

A library membership system implemented using abstract classes and polymorphism.

Different member types implement their own rules for fees and borrowing limits.

### Concepts

* Abstract Classes
* Abstract Methods
* Inheritance
* Method Overriding
* Polymorphism

### Run

```bash
cd Ex_4_Abstract_Library_Member
javac LibraryDemo.java
java LibraryDemo
```

---

## Experiment 5 — Circular Queue ADT with Exception Handling

**Directory:** `Ex_5_ADT_Queue_Exception_Handling/`

A fixed-capacity circular queue implementation that demonstrates the use of interfaces and custom exception handling.

The application handles situations such as queue overflow and underflow.

### Concepts

* Interfaces
* Abstract Data Types
* Circular Queue
* Arrays
* Custom Exceptions
* `try-catch` Handling

### Run

```bash
cd Ex_5_ADT_Queue_Exception_Handling
javac Main.java
java Main
```

---

## Experiment 6 — Wrapper Classes and Immutability

**Directory:** `Ex_6_Wrapper_Immutable_Demo/`

A program demonstrating Java wrapper classes, object identity, autoboxing, unboxing, and immutability.

### Concepts

* Wrapper Classes
* Autoboxing
* Unboxing
* Immutable Objects
* Object Identity
* `System.identityHashCode()`

### Run

```bash
cd Ex_6_Wrapper_Immutable_Demo
javac WrapperImmutableDemo.java
java WrapperImmutableDemo
```

---

## Experiment 7 — Multithreaded Array Processing

**Directory:** `Ex_7_Multithreading/`

A program that processes array data using multiple threads.

The experiment demonstrates concurrent execution and synchronization of program flow using thread lifecycle methods.

### Concepts

* Multithreading
* Thread Creation
* `extends Thread`
* `start()`
* `join()`
* Concurrent Execution

### Run

```bash
cd Ex_7_Multithreading
javac ArrayThreadDemo.java
java ArrayThreadDemo
```

---

## Experiment 8 — Inter-Thread Railway Booking System

**Directory:** `Ex_8_Inter_Thread_Communication/`

A railway ticket booking simulation that demonstrates communication and synchronization between multiple threads.

The system coordinates booking and cancellation operations while managing shared resources safely.

### Concepts

* Inter-Thread Communication
* Synchronization
* Monitor Locks
* `wait()`
* `notify()`
* `notifyAll()`

### Run

```bash
cd Ex_8_Inter_Thread_Communication
javac RailwayBooking.java
java RailwayBooking
```

---

## Experiment 9 — String Operations using ArrayList

**Directory:** `Ex_9_String_Operations_ArrayList/`

A menu-driven application for performing operations on a dynamic collection of strings.

### Features

* Add Strings
* Insert Strings at Specific Positions
* Search for Strings
* Filter Strings
* Display Stored Values

### Concepts

* `ArrayList`
* String Manipulation
* Collections Framework
* User Input
* Menu-Driven Programming

### Run

```bash
cd Ex_9_String_Operations_ArrayList
javac StringMenu.java
java StringMenu
```

---

## Experiment 10 — File Handling and Directory Listing

**Directory:** `Ex_10_File_Handling_ListFiles/`

A Java program that reads a directory path and displays the files contained within it.

The application validates the provided path and differentiates between files and directories.

### Concepts

* File Handling
* `java.io.File`
* Directory Validation
* File Listing
* `isDirectory()`
* `isFile()`
* `listFiles()`

### Run

```bash
cd Ex_10_File_Handling_ListFiles
javac File_Handling_ListFiles.java
java File_Handling_ListFiles
```

---

## Experiment 11 — JavaFX JDBC Student Management CRUD

**Directory:** `Ex_11_JavaFX_JDBC_CRUD/`

A desktop-based **Student Management System** developed using JavaFX and JDBC.

The application provides a graphical interface for managing student records stored in a MySQL database and demonstrates complete CRUD functionality.

### Features

* Add Student Records
* View Student Records
* Update Existing Records
* Delete Student Records
* JavaFX Graphical User Interface
* MySQL Database Integration

### Concepts

* JavaFX
* JDBC
* MySQL
* CRUD Operations
* Database Connectivity
* SQL Queries
* Event Handling

### Database Setup

Execute the `database_setup.sql` file in MySQL before running the application.

The database structure includes a student table for storing information such as:

* Student ID
* Student Name
* Age
* Course

### Compilation and Execution

Ensure that JavaFX and the MySQL JDBC driver are properly configured in your development environment.

Compile the application:

```bash
javac StudentManagementApp.java
```

Run the application:

```bash
java StudentManagementApp
```

> Make sure that MySQL Server is running and the database credentials configured in the application are correct before execution.

---

# Prerequisites

Before running the experiments, ensure that the following software is installed.

* Java Development Kit (JDK) 17 or later
* Command Prompt, PowerShell, or Terminal
* Any Java-compatible IDE such as IntelliJ IDEA, Eclipse, or VS Code

For **Experiment 11**, you will also need:

* MySQL Server
* JavaFX SDK
* MySQL Connector/J

Verify your Java installation:

```bash
java --version
```

Verify the Java compiler:

```bash
javac --version
```

---

# How to Use This Repository

### 1. Clone the Repository

```bash
git clone <repository-url>
```

### 2. Navigate to the Repository

```bash
cd OOP_JAVA__161
```

### 3. Open an Experiment

```bash
cd Ex_1_Telephone_Bill
```

### 4. Compile the Program

```bash
javac TelephoneBill.java
```

### 5. Run the Program

```bash
java TelephoneBill
```

> Each experiment is independent and can be compiled and executed separately.

---

# Learning Outcomes

After completing these experiments, you will gain practical experience with:

* Object-Oriented Programming Principles
* Classes and Objects
* Constructors
* Packages
* Inheritance
* Polymorphism
* Abstract Classes
* Interfaces
* Exception Handling
* Wrapper Classes
* Multithreading
* Thread Synchronization
* Inter-Thread Communication
* Java Collections
* String Manipulation
* File Handling
* JavaFX GUI Development
* JDBC Database Connectivity
* MySQL Database Operations
* CRUD Application Development

---

## Author

**Theja Sri**

---

## License

This repository is intended for **educational and academic purposes**.
