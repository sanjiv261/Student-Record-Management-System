# Student Record Management System

![Java](https://img.shields.io/badge/Java-17-blue.svg)

A command-line interface (CLI) based Student Record Management System implemented in Java. This application allows users to perform CRUD (Create, Read, Update, Delete) operations on student records stored in memory.

## Features

- **Add Students**: Create new student records with name and marks
- **View All Students**: Display all stored student records
- **Update Students**: Modify existing student information
- **Delete Students**: Remove student records from the system
- **Simple CLI Interface**: Easy-to-use text-based menu system
- **Input Validation**: Robust handling of user inputs

## Prerequisites

- Java Development Kit (JDK) 8 or later
- Basic understanding of command-line operations

## Getting Started

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/student-record-system.git
   cd student-record-system
   ```

2. **Compile the Java file**:
   ```bash
   javac StudentRecordSystem.java
   ```

3. **Run the application**:
   ```bash
   java StudentRecordSystem
   ```

## Usage

When you run the application, you'll see the following menu:

```
Student Record Management System
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Exit
```

- **Add Student**: Enter student name and marks to create a new record
- **View All Students**: See all currently stored student records
- **Update Student**: Modify name and/or marks of an existing student by ID
- **Delete Student**: Remove a student record by ID
- **Exit**: Quit the application

## Code Structure

- `Student` class: Contains student data (ID, name, marks) and getter/setter methods
- `StudentRecordSystem` class: Main class with the application logic and menu system
  - Uses `ArrayList<Student>` to store records
  - Implements input validation for all user inputs

## Example Usage

1. Add a new student:
   ```
   Enter student name: John Doe
   Enter student marks: 85.5
   Student added successfully!
   ```

2. View all students:
   ```
   ID: 1, Name: John Doe, Marks: 85.5
   ID: 2, Name: Jane Smith, Marks: 92.0
   ```

3. Update a student:
   ```
   Enter student ID to update: 1
   Current student details: ID: 1, Name: John Doe, Marks: 85.5
   Enter new name (leave blank to keep current): Johnathan Doe
   Enter new marks (leave blank to keep current): 87.0
   Student updated successfully!
   ```

4. Delete a student:
   ```
   Enter student ID to delete: 2
   Student deleted successfully!
   ```

## Future Enhancements

- Add data persistence (file or database storage)
- Implement search functionality
- Add more student fields (age, contact info, etc.)
- Implement sorting options for viewing records
