# Simple-Banking-Application

The Simple Banking Application is a basic console-based application in Java that allows users to perform fundamental banking operations such as deposits, withdrawals, and checking balances. This project is designed for beginner-level programmers to help them learn the core concepts of Java, such as loops, conditional statements, methods, and input handling using the Scanner class.

The application simulates a real-world banking system by maintaining a user's account balance and performing operations like deposits, withdrawals, and balance checks. It's a great starting point for those who are new to Java programming.

## Features
The Simple Banking Application allows users to:

Deposit Money: The user can deposit any amount into their bank account.

Withdraw Money: The user can withdraw funds from their bank account, ensuring they don’t exceed their current balance.

Check Balance: The user can check their current balance.

Exit the Program: The user can exit the program whenever they are done.

The application provides a basic menu system where users can choose the operation they wish to perform by entering the corresponding option number.

## How It Works

1. **User Input Handling**
The program uses the Scanner class to capture user input. The user is prompted to choose an option from a menu, and based on their choice, the corresponding operation is executed. The program loops continuously until the user selects the option to exit.

2. **Banking Operations**
Deposit: The user inputs the amount to deposit, and the program adds the amount to the balance.
Withdraw: The user inputs the amount to withdraw. If the balance is sufficient, the withdrawal is made; otherwise, an error message is displayed.
Balance Check: The program displays the current balance to the user.

3. **Loop and Conditional Statements**
The program uses a while loop to continuously show the menu and handle user input until the user decides to exit. Conditional statements (if and else) are used to validate the user’s input and ensure the proper functioning of each operation (e.g., ensuring a withdrawal doesn't exceed the balance).
