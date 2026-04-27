# Java Employee Salary System (OOP Final Project)

This project demonstrates a more advanced **Object-Oriented Programming system** using inheritance, method overriding, and polymorphism.

## Classes Included

### Employee (Base Class)
- Stores basic employee data: id, name, department, base salary.
- Provides:
  - Salary calculation structure
  - Bonus logic
  - Salary breakdown
  - Final salary calculation

### Developer (Child Class)
- Inherits from `Employee`
- Adds:
  - Overtime hours
- Overrides:
  - `calculateSalary()`
  - `applyBonus()`

### Manager (Child Class)
- Inherits from `Employee`
- Adds:
  - Working years
  - Yearly bonus system
- Overrides:
  - `calculateSalary()`
  - `applyBonus()`

## Main Features

- Uses **polymorphism** with `Employee[]`
- Calculates final salary for different employee types
- Finds:
  - Highest salary employee
  - Lowest salary employee
- Displays full employee information

## Key Concepts Used
- Inheritance
- Method overriding
- Polymorphism
- Encapsulation
- Arrays of parent class references
- Real-world salary logic system

## Purpose
To simulate a real employee management system and understand:
- How OOP is used in real applications
- How different roles behave differently using the same structure
- How Java handles dynamic method calls

