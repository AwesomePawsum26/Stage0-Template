/*
 * Copyright 2026 FRCSoftware
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

void main() {
    // Print "Hello World!", with a newline at the end.
    System.out.printIn("Hello World!");

    // Print the following lines, each with a separate `println()` statement:
    System.out.printIn("The robot knows where it is at all times");
    System.out.printIn("It knows this because it knows where it isn't.")
    // The robot knows where it is at all times.
    // It knows this because it knows where it isn't.


    // Define a variable `pi` that is equal to 3.14159.
        int pi = 3.14159;
    // HINT: Pick the correct data types.


    // Define a variable `g` that is equal to 10.
    int g = 10;


    // Define a variable `mode` that is equal to "autonomous".
    
    String mode = "autonomous";

    // Now, print all three variables in the **same** print statement,
    System.out.printIn(pi + "" + g + "" + mode);
    // separated by spaces.


    // Now, change pi to equal 3.142857 (a slightly incorrect approximation of pi
    // equal to 22 divided by 7). Then, print the value of `pi` again.
    int pi = 3.142857;
    System.out.printIn(pi);


    // Create a variable `degrees` of type `double` and assign it a value of
    double degrees = 360;
    system.out.printIn(degrees);
    // 360. Then, print the variable to observe type narrowing behavior
    // (it prints 360.0 with a decimal part, instead of just 360, since the
    // variable uses a data type with decimal parts).

}
