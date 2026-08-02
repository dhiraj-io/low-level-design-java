# Library Management System — LLD in Java

A fully implemented Library Management System demonstrating core Object-Oriented Programming principles in Java.

---

## What Was Built

| Class/Interface | Type | Purpose |
|----------------|------|---------|
| `User` | Abstract Class | Base entity for all users |
| `Member` | Concrete Class | Extends User, can borrow books |
| `Librarian` | Concrete Class | Extends User, manages library |
| `Lendable` | Interface | Contract for lendable items |
| `Book` | Abstract Class | Base entity for all books |
| `TextBook` | Concrete Class | Extends Book, has subject/edition |
| `NovelBook` | Concrete Class | Extends Book, has genre |
| `BookType` | Enum | Categorizes book types |
| `LibraryManagementSystem` | Concrete Class | Core system — ties everything together |

---

## Features Implemented

- User registration (Member + Librarian)
- Book inventory management (add, search by title/author/type)
- Lending system with borrow limit enforcement (max 5 books per member)
- Return system with availability tracking
- Display all books and registered users

---

## Design Decisions

### Why is `User` an abstract class?
A `User` in isolation doesn't exist in real life — you always have a `Member` or `Librarian`. Making it abstract prevents direct instantiation while sharing common fields (`userId`, `name`, `contactInfo`) and enforcing `displayDashboard()` and `canBorrowBooks()` in every subclass.

### Why is `Lendable` an interface and not an abstract class?
`Lendable` represents a **capability** (CAN-DO), not an identity (IS-A). A `Book` IS-A `Book` but CAN-DO lending. Using an interface keeps it loosely coupled — in future, other objects (e.g. `Magazine`, `DVD`) can implement `Lendable` without being part of the Book hierarchy.

### Why is `Book` abstract even though it implements `Lendable`?
`Book` provides shared implementation for `lend()`, `returnItem()`, and `isAvailable()` — but `displayBookDetails()` differs per book type. So `Book` is abstract to force subclasses (`TextBook`, `NovelBook`) to implement their own display logic.

### Why is `totalUsers` static but `userId` is not?
`totalUsers` is a **class-level counter** — shared across all instances to track how many users exist. `userId` is **per object** — each user needs their own unique ID. Making `userId` static would mean all users share the same ID, which defeats the purpose.

### Why is `MAX_BORROW_LIMIT` final?
It is a constant — the borrow limit should never change at runtime. `final` enforces this. It is also not `static` because it conceptually belongs to each `Member` instance (even though the value is the same for all).

### Why `ArrayList` instead of a plain array for inventory?
Library inventory size is dynamic — books get added over time. A plain array has fixed size at creation. `ArrayList` grows dynamically and is backed by OOP-friendly `List<Book>` interface, making the code flexible and extendable.

### Why `List<Book>` as the type instead of `ArrayList<Book>`?
Programming to an interface (`List`) instead of implementation (`ArrayList`) keeps the code loosely coupled. Tomorrow if we switch to `LinkedList`, only one line changes — nothing else breaks.

### Why `instanceof` for type-based search?
The `searchBooks(criteria, type)` method needs to filter by book subtype at runtime. Since `TextBook` and `NovelBook` are different classes, `instanceof` is the correct way to check the actual runtime type of a `Book` object.

### Why a setter for `employeeNumber` in `Librarian` instead of a constructor?
The BRD did not specify a parameterized constructor for `Librarian`. A setter keeps it flexible — `employeeNumber` can be assigned after object creation, which maps to real-world scenarios where employee numbers are assigned post-onboarding.

### Why does `lendBook()` take `Member` and not `User`?
Only `Member` tracks `borrowedBooksCount` via `incrementBorrowCount()`. `Librarian` doesn't need count tracking. Using `Member` directly avoids casting and keeps the method type-safe.

---

## Key OOP Concepts Covered

- **Abstraction** — `User` and `Book` as abstract classes
- **Encapsulation** — private fields with controlled access via getters/setters
- **Inheritance** — `Member`/`Librarian` extend `User`; `TextBook`/`NovelBook` extend `Book`
- **Polymorphism** — `List<Book>` holds both `TextBook` and `NovelBook`; `displayBookDetails()` behaves differently per type
- **Interface** — `Lendable` as a CAN-DO contract
- **Static vs Instance** — `totalUsers` (static) vs `userId` (instance)
- **Final** — `MAX_BORROW_LIMIT` as a constant
- **Enum** — `BookType` for type-safe book categorization
- **Constructor chaining** — `super()` calls across hierarchy

---

## BRD Document

The full Business Requirements Document is available in [`LMS - OOPS.docx`](LMS%20-%20OOPS.docx).
