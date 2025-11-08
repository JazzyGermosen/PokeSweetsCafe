package com.pluralsight.ui;

import java.util.Scanner;

public class UserInterface {

    // any time you have a method that calls for user input that in the user inter
    public static Scanner Sweets = new Scanner(System.in);
    public UserInterface(){

    }

    public void initial(){

    }

    public void userMenu() {
        initial();
        System.out.println(" Welcome to the Poke Sweets Cafe! ");
        System.out.println("""
                ⠀⠀⠀⠀⠀⠀   ⣀⣀⣠⣤⣤⣤⣤⣤⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⣠⡶⠿⠿⢛⣩⣭⣶⣶⣶⣶⣦⣭⣙⠿⣶⣤⣀⠀⠀⠀⠀
                ⠀⠀⠀⣾⠁⠀⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠈⠛⠿⣷⡄⠀⠀
                ⠀⠀⢠⣿⠀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠈⣿⠀⠀
                ⠀⠀⢸⡟⣼⡿⢉⡉⢿⣿⡿⠿⠿⣿⣿⣿⠛⠛⣿⣧⠀⠀⣸⡿⠀⠀
                ⠀⠀⢸⡇⣿⡇⠘⠃⣸⠁⠀⠀⠀⠀⢹⡇⠸⠇⢸⣿⣷⠆⣿⡇⠀
                ⠀⠀⠈⣿⡘⣿⢶⣶⡿⣦⣀⣀⣀⣠⣾⣷⣤⣤⢿⣿⣿⢰⡿⠁⠀⠀
                ⠀⠀⠀⠈⢷⣜⢿⣯⣿⣟⣡⣶⣌⠻⣿⣯⣿⣻⣿⡿⣡⣿⠁⠀⠀⠀
                ⠀⠀⠀⣀⣼⡇⢲⣈⣴⣶⡙⣿⡿⢋⣭⣉⣰⣶⣦⢰⣿⠁⠀⠀⠀⠀
                ⣠⡾⢟⣛⣋⣭⡤⢡⣿⣿⣧⣶⣦⡹⢛⣩⣴⣮⡉⢼⡏⠀⠀⠀⠀⠀
                ⢻⣦⡻⠿⢿⣿⢡⣿⠟⢋⣭⣭⠙⣰⣿⣿⠿⡋⢀⣾⣧⣤⣄⡀⠀⠀
                ⠀⠉⠻⠿⢷⡆⣿⡇⣾⢸⣿⡟⣴⣤⢠⣴⣶⣾⡌⠟⠋⠉⠙⠻⢷⣄
                ⠀⠀⠀⠀⢸⡇⢿⣿⣎⢘⣿⣇⠛⣫⣼⣿⣿⣿⠇⠀⠀⠀⠀⠀⣀⡿
                ⠀⠀⠀⠀⠘⢷⡘⢿⣿⣦⣬⣥⣵⣿⣿⣿⣿⠟⣀⣠⣤⣴⠶⠛⠉⠀
                ⠀⠀⠀⠀⢀⣼⠟⠂⠉⠛⠛⠿⠿⠿⠟⠛⠁⠘⢿⣿⡉⠀⠀⠀⠀⠀
                ⠀⠀⠀⢠⣿⡃⠀⠀⠀⢀⣾⡿⠿⢿⣧⠀⠀⠀⠀⢹⣷⠀⠀⠀⠀⠀
                ⠀⠀⠀⠈⠛⠿⠿⠿⠿⠟⠉⠀⠀⠈⠛⠿⠿⠿⠿⠿⠋⠀⠀⠀⠀⠀""");

        // created a silly new name to check if the statement is running for the loop
        boolean isPichuRunning = true;
        //creating the menu loop
        while (isPichuRunning) {

            //displaying the options
            System.out.println("""
                    
                    What can I do for you?
                    - (1) New order
                    - (0) Exit 
                    
                    """);

            //prompting the user for input
            int chooseOption = Sweets.nextInt();
            // eating the next line
            Sweets.nextLine();

            // creating a switch statement for the first loop
            switch (chooseOption) {
                case 1:
                    //takes user into a new order
                    newOrder();
                    break;
                case 0:
                    //exiting the system, turning isPichuRunning to false
                    System.out.println("Thank you for choosing PokeSweetsCafe! Have an amazing day!");
                    System.out.println("""
                            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡾⠋⠉⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠃⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⣠⠖⠲⢤⡖⠒⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                            ⠀⠀⠀⠀⠀⠀⠀⠀⢀⡏⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⡏⠀⠀⠀⠀⠀⢀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                            ⠀⠀⠀⠀⢀⣀⠀⠀⢸⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠸⣄⠀⠁⣠⠞⠉⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣠⣤⣤⣤⣤⠀⠀
                            ⠀⡞⠉⠻⠁⢹⠀⠀⡏⠀⠀⠀⠀⢸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠹⣶⠋⠀⠀⠀⠀⣀⡤⠴⠒⠊⠉⠉⠀⠀⣿⣿⣿⠿⠋⠀⠀
                            ⠀⠳⢤⡀⠀⡞⠁⠀⡇⠀⠀⢀⡠⠼⠴⠒⠒⠒⠒⠦⠤⠤⣄⣀⠀⢀⣠⠴⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀⣼⠿⠋⠁⠀⠀⠀⠀
                            ⠀⠀⠀⠈⠷⡏⠀⠀⣇⠔⠂⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢨⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠖⠋⠁⠀⠀⠀⠀⠀⠀⠀
                            ⠀⠀⠀⠀⠀⠀⠀⢰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⠤⠒⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                            ⠀⠀⠀⠀⠀⠀⢀⡟⠀⣠⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⢻⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣤⡤⠤⢴
                            ⠀⠀⠀⠀⠀⠀⣸⠁⣾⣿⣀⣽⡆⠀⠀⠀⠀⠀⠀⠀⢠⣾⠉⢿⣦⠀⠀⠀⢸⡀⠀⠀⢀⣠⠤⠔⠒⠋⠉⠉⠀⠀⠀⠀⢀⡞
                            ⠀⠀⠀⠀⠀⢀⡏⠀⠹⠿⠿⠟⠁⠀⠰⠦⠀⠀⠀⠀⠸⣿⣿⣿⡿⠀⠀⠀⢘⡧⠖⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠀
                            ⠀⠀⠀⠀⠀⣼⠦⣄⠀⠀⢠⣀⣀⣴⠟⠶⣄⡀⠀⠀⡀⠀⠉⠁⠀⠀⠀⠀⢸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠁⠀
                            ⠀⠀⠀⠀⢰⡇⠀⠈⡇⠀⠀⠸⡾⠁⠀⠀⠀⠉⠉⡏⠀⠀⠀⣠⠖⠉⠓⢤⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠃⠀⠀
                            ⠀⠀⠀⠀⠀⢧⣀⡼⠃⠀⠀⠀⢧⠀⠀⠀⠀⠀⢸⠃⠀⠀⠀⣧⠀⠀⠀⣸⢹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠃⠀⠀⠀
                            ⠀⠀⠀⠀⠀⠈⢧⡀⠀⠀⠀⠀⠘⣆⠀⠀⠀⢠⠏⠀⠀⠀⠀⠈⠳⠤⠖⠃⡟⠀⠀⠀⢾⠛⠛⠛⠛⠛⠛⠛⠛⠁⠀⠀⠀⠀
                            ⠀⠀⠀⠀⠀⠀⠀⠙⣆⠀⠀⠀⠀⠈⠦⣀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⠙⢦⠀⠀⠘⡇⠀⠀⠀⠀⠀⠀⢀⣀⠀⠀⠀⠀
                            ⠀⠀⠀⠀⠀⠀⠀⢠⡇⠙⠦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠴⠋⠸⡇⠈⢳⡀⠀⢹⡀⠀⠀⠀⢀⡞⠁⠉⣇⣀⠀⠀
                            ⠀⠀⠀⠀⠀⠀⠀⡼⣀⠀⠀⠈⠙⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⣷⠴⠚⠁⠀⣀⣷⠀⠀⠀⢠⠇⠀⠀⠀⠀⠀⣳
                            ⠀⠀⠀⠀⠀⠀⡴⠁⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣆⡴⠚⠉⠉⠀⠀⠀⠀⢸⠃⣀⣠⠤⠤⠖⠋
                            ⣼⢷⡆⠀⣠⡴⠧⣄⣇⠀⠀⠀⠀⡴⠚⠙⠲⠞⠛⠙⡆⠀⠀⠀⠀⠀⢀⡇⣠⣽⢦⣄⢀⣴⣶⠀⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀
                            ⡿⣼⣽⡞⠁⠀⠀⠀⢹⡀⠀⠀⠀⢹⠀⠀⠀⠀⠀⠀⣸⠀⠀⠀⠀⠀⣼⠉⠁⠀⠀⢠⢟⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                            ⣷⠉⠁⢳⠀⠀⠀⠀⠈⣧⠀⠀⠀⠀⠙⢦⠀⠀⠀⡠⠁⠀⠀⠀⠀⣰⠃⠀⠀⠀⠀⠏⠀⠀⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                            ⠹⡆⠀⠈⡇⠀⠀⠀⠀⠘⣆⠀⠀⠀⠀⠀⠹⣧⠞⠁⠀⠀⠀⠀⣰⠃⠀⠀⠀⠀⠀⠀⠀⣸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                            ⠀⢳⡀⠀⠙⠀⠀⠀⠀⠀⠘⣆⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⣰⠃⠀⠀⠀⠀⢀⡄⠀⢠⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                            ⠀⠀⢳⡀⣰⣀⣀⣀⠀⠀⠀⠘⣦⣀⠀⠀⠀⡇⠀⠀⠀⢀⡴⠃⠀⠀⠀⠀⠀⢸⡇⢠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                            ⠀⠀⠀⠉⠉⠀⠀⠈⠉⠉⠉⠙⠻⠿⠾⠾⠻⠓⢦⠦⡶⡶⠿⠛⠛⠓⠒⠒⠚⠛⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                            """);
                    isPichuRunning = false;
                    break;
                default:
                    // acounting for errors
                    System.out.println("Sorry I don't think I quite got that. Please try again");
                    break;

            }
        }

    }

    public static void newOrder(){
        // the start of a new menu loop
        boolean isPichuRunning = true;
        while (isPichuRunning){
            // printing out the loop statement
            System.out.println("""
                    
                    What can I get for you?
                    
                    - (1) Add Sandwich
                    - (2) Add Drink
                    - (3) Add Sweets
                    - (4) Checkout
                    - (0) cancel Order
                    
                    """);

            // prompting for user input
            int chooseOption = Sweets.nextint();
            // eating the next line
            Sweets.nextline();

            // switch statement for the next options
            switch (chooseOption){
                case 1:
                    AddSandwich();
                    break;
                case 2:
                    AddDrink();
                    break;
                case 3:
                    AddSweets();
                    break;
                case 4:
                    CheckOut();
                    break;
                case 0:
                    System.out.println(" Lets restart your order!");
                    break;
            }


        }

    }

    public static void AddSandwich(){

    }

    public static void AddDrink(){

    }

    public static void AddSweets(){

    }

    public static void CheckOut(){

    }



}
