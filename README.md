# Twitter-like CLI Social Network

A lightweight, console-based social media application built in **Java** that simulates core features of a platform like Twitter. This project showcases **Object-Oriented Programming (OOP)** concepts, data management using object arrays, and custom control flow logic in a Java environment.

## ✨ Features Implemented
- **User Authentication:** Secure Sign-up and Log-in management via a localized database simulation.
- **Profile Management:** Dynamic user biographies (Bio) and the ability to update account credentials (like usernames).
- **Tweeting System:** Users can publish text-based tweets containing active timestamps.
- **Social Interactivity:** Support for liking tweets and adding user comments.
- **Social Graph Simulation:** Basic structure for searching profiles and managing Followers/Following relationships.

## 🏗️ Architecture & OOP Concepts Used
- **Encapsulation:** All fields (like `username`, `password`, `text`) are kept private and managed cleanly using standard Getter/Setter methods.
- **Data Modeling:** Modeled entity classes (`Tweet`, `Login`, `Singup`) acting as relational objects.
- **State Management (`Database.java`):** A mock central database that stores user accounts and handles operations like searching, adding users, and validating credentials.

## 📂 Project Directory Structure
- `Main.java`: The entry point of the application. Initialized the system components.
- `Menu.java`: Manages user interactions, UI prompt cycles, and menus.
- `Singup.java`: Represents user accounts, following/followers lists, and private tweets arrays.
- `Tweet.java`: Houses content, likes count, metadata timestamps, and comment arrays for individual posts.
- `Database.java`: Simulates backend storage and data querying functions.
- `Login.java`: A helper class used for user credential mapping during auth routines.

## 🚀 How to Compile and Run

### 1. Clone the repository
```bash
git clone [https://github.com/YOUR_USERNAME/twitter-cli-java.git](https://github.com/YOUR_USERNAME/twitter-cli-java.git)
cd twitter-cli-java
