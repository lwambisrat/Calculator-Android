#  Android Calculator App

This project is a simple Android Calculator application built using Kotlin. The app allows users to input five numbers and perform basic arithmetic operations: addition, subtraction, multiplication, and division. The result is displayed on the screen.

## Features

- Input up to five numbers for calculations.
- Perform the following operations:
    - Addition
    - Subtraction
    - Multiplication
    - Division


## Getting Started

### Prerequisites

- [Android Studio](https://developer.android.com/studio) installed on your machine.
- An Android device or emulator running Android 5.0 (API level 21) or higher.

### Installation

1. Clone the repository:
   git clone git@github.com:lwambisrat/Calculator-Android.git
   
2. Open the project in Android Studio:
    - Go to `File > Open`, and select the project directory.

3. Build the project:
    - Click on the `Build` menu and select `Make Project` or press `Ctrl+F9`.

4. Run the app:
    - Connect your Android device or start an emulator.
    - Click the `Run` button or press `Shift+F10`.

## Usage

1. Enter values into the five available input fields.
2. Tap on any operation button (`+`, `-`, `×`, `÷`) to perform the calculation.
3. The result will be shown below the buttons.

### Notes

- All five fields must be filled with valid integer numbers before performing operations.
- Division is performed sequentially from the first number through the fifth (i.e., ((((num1 / num2) / num3) / num4) / num5)).
- No input validation or zero-division handling is implemented in this basic version.

## Project Structure

- MainActivity.kt: Core logic for the calculator operations and UI interaction.
- activity_main.xml: Layout file containing input fields, buttons, and result display.



## Technology
- Android-Studio