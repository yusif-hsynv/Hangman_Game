# 🎯 Hangman Game (Java Console App)

> A simple word guessing game where players try to reveal a hidden word  
> by guessing letters within a limited number of attempts.

![Java](https://img.shields.io/badge/Java-17-orange?logo=openjdk)
![Console](https://img.shields.io/badge/Type-Console%20App-blue)
![Maven](https://img.shields.io/badge/Build-Manual%20Execution-lightgrey)

A fun **Java console application** that allows users to guess a randomly selected word.  
The player has 6 chances to guess incorrectly before the game ends.  
The program checks repeated guesses, displays progress, and tracks remaining attempts.

---

## 🚀 Features
- Random word selection from a predefined list  
- 6 incorrect guesses allowed before the game ends  
- Prevents duplicate guesses using a `Set`  
- Real-time feedback for correct and incorrect guesses  
- Displays the current word progress after each attempt  
- Ends automatically when the word is completely guessed or attempts run out  

---

## 🧩 Game Flow
1. The program selects a random word from a list (e.g., *java*, *kitab*, *komputer*, *insan*).  
2. The user inputs one letter per turn.  
3. Correct guesses reveal letters; wrong guesses reduce remaining chances.  
4. The game prevents repeated letter inputs.  
5. When all letters are guessed or attempts are exhausted, the result is shown.

---

## ⚙️ Tech Stack
- Java 17  
- Console I/O (Scanner)  
- Random class  
- Collections (Set)  
- Loops & Conditionals  

---

## 🧰 How to Run
```bash
javac Main.java HangManGame.java
java Main
```
---
## 👨‍💻 Author  
**Yusif Hüseynov**  
*Java Developer | Core Java | Console Applications*  
[GitHub Profile](https://github.com/yusif-hsynv)
