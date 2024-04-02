# RandomPasswordGenerator

This Java application generates random passwords based on user-defined criteria such as including uppercase letters, numbers, symbols, and other characters. It provides a simple graphical user interface (GUI) for users to select their desired password options and specify the length of the password.

**Features**

Allows users to select password criteria through checkboxes:
Has UpperCase Letters
Has Numbers
Has Symbols
Has Other Characters
Users can specify the length of the password using a spinner.
Generates a random password based on the selected criteria and specified length.
Provides a "Generate" button to generate passwords and display them in a text field.
Offers a "Copy" button to copy the generated password to the clipboard for easy usage.

**Usage**

Launch the application.
Select the desired password criteria by checking the corresponding checkboxes:
Has UpperCase Letters
Has Numbers
Has Symbols
Has Other Characters
Specify the length of the password using the spinner labeled "How many letters?".
Click on the "Generate" button to generate a random password based on the selected criteria and length. The generated password will be displayed in the text field.
Optionally, click on the "Copy" button to copy the generated password to the clipboard for easy pasting.

**Notes**

The application follows a simple logic to generate passwords based on user preferences. It randomly selects characters based on the selected criteria and length.
Users can adjust the length of the password according to their requirements using the spinner.
Passwords generated by this application are randomly generated and may not adhere to specific password policies or requirements.
The application provides basic functionality and does not include features such as password strength estimation or advanced password policies.

**Dependencies**

This application uses Java's Swing library for building the graphical user interface.
No external dependencies are required to run this application.

**How to Run**

Compile the PasswordGen.java file and execute the generated bytecode to run the application.
javac PasswordGen.java
java PasswordGen
