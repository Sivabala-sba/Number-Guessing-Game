# 🎮 Number Guessing Game

## 🚀 Description
The **Number Guessing Game** is a simple and fun command-line game where the computer randomly selects a number between 1 and 100, and the user tries to guess the number. The user gets a limited number of attempts to guess correctly, depending on the difficulty level chosen (Easy, Medium, or Hard). The game provides real-time feedback, telling the user whether their guess was too high or too low. The game ends when the correct number is guessed or the user runs out of chances.

This project is built in **Java** and provides a great way to practice basic programming concepts like random number generation, user input handling, loops, and conditionals.

## 💡 Features
- **Three Difficulty Levels**:
    - Easy: 10 chances to guess the number.
    - Medium: 5 chances to guess the number.
    - Hard: 3 chances to guess the number.
- **Random Number Generation**: The computer selects a random number between 1 and 100 at the start of the game.
- **Chances Based on Difficulty**: The number of attempts provided is based on the chosen difficulty level.
- **Real-Time Feedback**: The game provides hints after each guess, indicating if the correct number is higher or lower than the guess.
- **Multiple Rounds**: After each round, the user can choose to play again.
- **Graceful Game End**: The game ends when the user either guesses the correct number or exhausts all chances.

## 🛠️ Technologies Used
- **Java**: Core programming language.
- **CLI (Command-Line Interface)**: For interaction between the user and the game.

## 🔧 Setup Instructions
### Prerequisites
- **Java Development Kit (JDK 8 or higher)** should be installed on your system.
- Basic knowledge of running Java programs from the command line.

### Installation
1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/number-guessing-game.git
    cd number-guessing-game
    ```

2. **Compile the program**:
    ```bash
    javac NumberGuessingGame.java
    ```

3. **Run the game**:
    ```bash
    java NumberGuessingGame
    ```

## 🕹️ How to Play
1. When the game starts, a welcome message is displayed along with the rules.
2. Select the **difficulty level**:
    - Easy (10 chances)
    - Medium (5 chances)
    - Hard (3 chances)
3. The computer randomly selects a number between 1 and 100.
4. Start guessing the number! After each guess, the game will give feedback:
    - "The number is greater than your guess."
    - "The number is less than your guess."
5. If you guess the correct number, a congratulatory message is displayed along with the number of attempts.
6. If you run out of chances, the game reveals the correct number.
7. After the round, you can choose to play again or quit.

### Sample Output:
```bash
Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.

Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)

Enter your choice: 2

You have selected Medium difficulty level. You have 5 chances.

Enter your guess: 50
Incorrect! The number is less than 50.
Chances left: 4

Enter your guess: 25
Incorrect! The number is greater than 25.
Chances left: 3

Enter your guess: 30
Congratulations! You guessed the correct number in 3 attempts!

Do you want to play again? (yes/no): no
Thank you for playing the Number Guessing Game!
```

## 🌟 Future Improvements
- **Hint System**: Provide hints to the user when they are struggling to guess the number.
- **High Score Tracker**: Track and display the user's best performance in terms of the fewest guesses.
- **Timer**: Track how long it takes the user to guess the correct number.
- **Multiple Players**: Implement a multiplayer mode where two or more players take turns guessing.


## 🤝 Contributing

If you find a bug or want to add a feature, feel free to create an issue or submit a pull request.

Project URL: [Number-Guessing-Game](https://roadmap.sh/projects/number-guessing-game "Number-Guessing-Game")