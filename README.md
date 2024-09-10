# Custom Collections Framework

## Overview

This project provides custom implementations of basic Java collections: `List`, `Queue`, and `Set`. The framework is designed to help understand the inner workings of these data structures by implementing them from scratch.

## Implementations

### 1. `User`
- A simple class to represent a user with a `name` property.

### 2. Interfaces
- **`MyCollection`**: Base interface for collection operations.
- **`ListI`**: Extends `MyCollection` with list-specific operations (`get`, `indexOf`, `sublist`).
- **`QueueI`**: Extends `MyCollection` with queue-specific operations (`offer`, `peek`, `poll`).
- **`SetI`**: Extends `MyCollection` without additional methods.

### 3. Custom Data Structures
- **`MyList`**: A linked list implementation. Supports addition, removal, and access of elements. Includes `indexOf` and `sublist` methods.
- **`MyQueue`**: A queue implementation using a linked list. Supports `offer`, `peek`, and `poll` operations.
- **`MySet`**: A placeholder set implementation. Currently does not support real set operations.

### 4. Main Classes
- **`MainList`**: Tests operations for `MyList`.
- **`MainQueue`**: Tests operations for `MyQueue`.
- **`MainSet`**: Placeholder for `MySet`.

## Build and Package

1. **Build**: Use Ant to compile and package the project.
   ```bash
    ant
2. **Package**: The resulting JAR file will be created in the build directory.


## Future Enhancements
  - Implement full functionality for MySet.
  - Improve test coverage.
  - Add more sophisticated data structures.
