package com.pluralsight;

import com.pluralsight.ui.UserInterface;

import java.util.Scanner;

public class MainSweets {
    // creating the sweets
    public static Scanner Sweets = new Scanner(System.in);

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        // ui.display(); future command that would display all the information from the ui
        ui.userMenu();

    }


}
