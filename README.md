# SC-Assignment-1-OOP

**Course:** Software Construction
**Instructor:** Engr. Rizwan Shah
**Institution:** University of Engineering and Technology, Abbottabad Campus
**Student Name:**       Muhammad Mehtab
**Registration No:** 24ABSWE0018
**Deadline:** 27-Sep-2026

---

## 📌 About This Repository

This repository contains my solutions for **Assignment 01**, which focuses on core Object-Oriented Programming (OOP) concepts in Java: **Encapsulation, Inheritance, Polymorphism, and Abstraction**. Each task refactors or builds a small Java system while applying good OOP design practices.

> **Note:** This assignment is graded primarily through an oral viva (15/20 marks). All code here was written and understood by me, not just AI-generated and copy-pasted.

---

## 📁 Repository Structure

```
SC-Assignment-1-OOP/
│
├
│
├── Task_02
│   ├── Employee.java
│   ├── Developer.java
│   ├── SalesManager.java
│   └── Main.java
│
├── Task_03
│   ├── SmartDevice.java
│   ├── SmartBulb.java
│   ├── SmartThermostat.java
│   └── Main.java
│
├── Task_04
│   ├── LibrarySystemBad.java
│   └── LibrarySystemCorrect.java
│
└── README.md
```

---

## ✅ Task 1: The 'Broken Vault' (Encapsulation)

Refactored the originally unsafe `DigitalWallet` class (which had all public fields) into a properly encapsulated class.

**Key changes:**
- All fields made `private`
- `balance` cannot go negative
- `pinCode` is set once via the constructor and cannot be viewed or modified afterward
- Added `boolean withdraw(double amount, String enteredPin)` which validates the PIN and available funds before processing a withdrawal

**Reflection:** See `Task_01/` code comments / PDF report for the written explanation of why the original design could cause catastrophic failure in a real banking system.

---

## ✅ Task 2: The 'Evolving Workforce' (Inheritance & Polymorphism)

- `Employee` — base class with `name`, `baseSalary`, and `calculatePay()`
- `Developer extends Employee` — adds a fixed `techAllowance`
- `SalesManager extends Employee` — adds sales-based `commission`
- `Main.java` — builds a `List<Employee>` containing both subtypes and demonstrates polymorphic behavior by calling `calculatePay()` on each

**Reflection:** See PDF report for explanation of how Java determines which `calculatePay()` implementation to run at runtime (dynamic method dispatch).

---

## ✅ Task 3: 'Design by Contract' (Abstraction)

- `SmartDevice` — interface defining `turnOn()`, `turnOff()`, `getStatus()`
- `SmartBulb implements SmartDevice` — adds `setBrightness(int level)`
- `SmartThermostat implements SmartDevice` — adds `setTemperature(double temp)`

**Reflection:** See PDF report for explanation of why an interface was used instead of a base class, and the architectural advantage this provides.

---

## ✅ Task 4: The AI Code Review (Meta-Learning)

- Prompted an AI with: *"Write a Java program for a simple Library System using OOP. Include classes for Book and Member."*
- Identified one OOP strength and one design flaw in the AI-generated code
- `LibrarySystemBad.java` — the AI's original, flawed code
- `LibrarySystemCorrect.java` — my corrected version of the flawed class/method

Full critique and before/after code available in `Task_04/` and the PDF report.

---

## 🛠️ How to Run

Each task's `.java` files can be compiled and run independently using the JDK:

```bash
javac Main.java
java Main
```
