# ATM System

ATM System <br>
Overview <br>
This ATM System is a simple Java application that simulates basic ATM functionalities. It allows users to check their balance, withdraw money, deposit money, and exit the system.
<br>
<br>
<br>

Features<br>
Check Balance: Displays the current balance. <br>
Withdraw Money: Allows users to withdraw money from their account if sufficient balance is available. <br>
Deposit Money: Allows users to deposit money into their account. <br>
Exit: Exits the application.<br>
Requirements<br>
Java Development Kit (JDK) 8 or higher.<br>
A terminal or command prompt to run the application.<br>
<br>
<br>
<br>


How to Run <br>
Clone the Repository: <br>
 <br>
<br>
git clone <repository-url> <br>
Navigate to the Project Directory: <br>
 <br>
 <br>
cd atm-system <br>
Compile the Code: <br>
<br>
<br>
javac atmSystem.java<br>
Run the Application:<br>
<br>
<br>
java atmSystem<br>


# Code Description
Main Class: atmSystem <br><br><br>

Contains the main method which is the entry point of the application.<br>
Uses a Scanner to get user input and a do-while loop to continuously present the menu until the user chooses to exit.<br>
Balance Management:
<br><br>
Initial Balance: Set to 500.<br>
Withdraw Money: Checks if the amount to withdraw is greater than the balance and updates the balance accordingly.<br>
Deposit Money: Adds the deposit amount to the balance.<br>
Menu Options:<br>

1. Check Balance: Displays the current balance.<br>
2. Withdraw Money: Prompts for the amount to withdraw and updates the balance.<br>
3. Deposit Money: Prompts for the amount to deposit and updates the balance.<br>
4. Exit: Ends the program and thanks the user.<br>