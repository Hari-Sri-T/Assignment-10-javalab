# Multi-Threaded Number Generator in Java

##  Description

This Java program demonstrates **multi-threading** using the `Thread` class.  
It launches two threads that print numbers at different intervals by incrementing them differently.  

The program is ideal for understanding:
- **Thread creation** via extending `Thread`
- **Concurrent execution**
- **Thread sleep delays**

---

##  How It Works

###  Threads Involved

#### 1️ Thread 1
- **Starts at:** 1  
- **Increments by:** 3  
- **Delay:** 3000 ms (3 seconds)

#### 2️ Thread 2
- **Starts at:** 100  
- **Increments by:** 50  
- **Delay:** 1000 ms (1 second)

Both threads run **indefinitely** in an infinite loop.

---

##  Files

### `Main.java`

- Contains the `MyThread` class and the `main` method.

####  MyThread Class
| Field | Description |
|-------|-------------|
| `init` | Initial value |
| `increment` | Value to increment on each iteration |
| `delay` | Delay in milliseconds between prints |

| Method | Purpose |
|--------|---------|
| `run()` | Continuously prints the current value, increments it, then sleeps for the given delay. |

####  main()
- Starts two threads:
  - One with values `(1, 3, 3000)`
  - One with values `(100, 50, 1000)`

---
