package com.pluralsight.ui;

import com.pluralsight.models.MenuItem;
import com.pluralsight.models.Order;
import com.pluralsight.models.Platter;
import com.pluralsight.models.enums.DrinkType;
import com.pluralsight.models.enums.PlatterType;
import com.pluralsight.models.enums.SideType;
import com.pluralsight.models.enums.SweetType;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    // any time you have a method that calls for user input that in the user interface
    public static Scanner Sweets = new Scanner(System.in);

    // calling for the orderclass
    private static Order order = new Order();

    public UserInterface() {

    }

    public void init() {
        order = new Order();

    }


    public void userMenu() {

        init();

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

    public static void newOrder() {
        // the start of a new menu loop
        boolean isPichuRunning = true;
        while (isPichuRunning) {
            // printing out the loop statement
            System.out.println("""
                    
                    What can I get for you?
                    
                    - (1) Add Platter
                    - (2) Add Drink
                    - (3) Add Sweets
                    - (4) Add Side
                    - (5) Item Summary
                    - (6) Checkout
                    - (0) cancel Order
                    
                    """);

            // prompting for user input
            int chooseOption = Sweets.nextInt();
            // eating the next line
            Sweets.nextLine();

            // switch statement for the next options
            switch (chooseOption) {
                case 1:
                    AddPlatter();
                    break;
                case 2:
                    AddDrink();
                    break;
                case 3:
                    AddSweets();
                    break;
                case 4:
                    AddSide();
                case 5:
                    ItemSummary();
                    break;
                case 6:
                    CheckOut();
                    break;
                case 0:
                    System.out.println(" Lets restart your order!");
                    isPichuRunning = false;
                    break;
                default:
                    System.out.println("Sorry I don't think I quite got that. Please try again");
                    break;
            }


        }

    }

    public static void AddPlatter() {
        boolean isPichuRunning = true;
        while (isPichuRunning) {
            System.out.println("""
                    Please select what you want to do:
                    
                    1) Choose Size
                    2) Choose Meat
                    3) Choose Spice Level
                    4) Extra Meat
                    0) Cancel Order
                    
                    
                    """);

            //asking for user input
            int chooseOption = Sweets.nextInt();
            Sweets.nextLine();

            switch (chooseOption) {
                case 1:
                    ChooseSize();
                    break;
                case 2:
                    ChooseMeat();
                    break;
                case 3:
                    isSpicy();
                    break;
                case 4:
                    ExtraMeat();
                    break;
                default:
                    System.out.println("Sorry I don't think I quite got that. Please try again");
                    break;
            }


        }

    }

    public static void ChooseSize() {
        boolean isPichuRunning = true;
        while (isPichuRunning) {
            System.out.println("""
                    Please select a Platter Size:
                    
                    1) Kids Size
                    2) Half Size 
                    3) Full Size
                    0) Cancel Order
                    
                    
                    """);

            //asking for user input
            int chooseOption = Sweets.nextInt();
            Sweets.nextLine();

            switch (chooseOption) {
                case 1:
                    Platter kids = new Platter("kids");
                    break;
                case 2:
                    Platter half = new Platter("half");
                    break;
                case 3:
                    Platter full = new Platter("full");
                case 0:
                    isPichuRunning = false;
                    break;
                default:
                    System.out.println("Sorry I don't think I quite got that. Please try again");
                    break;
            }


        }

    }

    public static void ChooseMeat() {
        boolean isPichuRunning = true;
        while (isPichuRunning) {
            System.out.println("""
                    Please Select a Meat Type:
                    
                    1) Pork Katsu
                    2) Chicken Katsu
                    3) Beef Katsu
                    0) Cancel Order
                    
                    
                    """);

            //asking for user input
            int chooseMeat = Sweets.nextInt();
            Sweets.nextLine();

            switch (chooseMeat) {
                case 1:
                    PlatterType porkKatsu = PlatterType.PORKKATSU;
                    break;
                case 2:
                    PlatterType chickenKatsu = PlatterType.CHICKENKATSU;
                    break;
                case 3:
                    PlatterType beefKatsu = PlatterType.BEEFKATSU;
                    break;
                case 4:
                    isPichuRunning = false;
                    break;
                default:
                    System.out.println("Sorry I don't think I quite got that. Please try again");
                    break;
            }
        }
    }

    public static void isSpicy() {
        System.out.println("""
                would you like spice?
                
                - Yes!
                - No!
                
                
                """);


        String response = Sweets.nextLine().trim().toLowerCase();
        Sweets.nextLine();

        if (response.equals("yes") || response.equals("y")) {

            System.out.println(" You now have extra meat! ");
        } else {

            System.out.println(" no extra meat for you! ");
        }


    }

    public static void ExtraMeat(Platter platter) {
        System.out.println("""
                would you like extra meat?
                
                - Yes!
                - No!
                
                
                """);

        // ask for user input
        // if they say yes set platter to true
        // if anything else set platter to false

        String response = Sweets.nextLine().trim().toLowerCase();
        Sweets.nextLine();

        if (response.equals("yes") || response.equals("y")) {
            platter.setExtraMeat(true);
            System.out.println(" You now have extra meat! ");
        } else {
            platter.setExtraMeat(false);
            System.out.println(" no extra meat for you! ");
        }

    }

    public static void AddDrink() {
        boolean isPichuRunning = true;
        while (isPichuRunning) {
            System.out.println("""
                    Please Select a Drink:
                    
                    1) Gardevoir's Matcha Bubble tea
                    2) Sylveon's Strawberry Bubble Tea
                    3) Gengar's Confuse Ray Smoothie
                    4) Fuecoco's Apple Soda Float
                    5) MimiKyu's Play Rough Smoothie
                    6) Shinx's Electrik Soda Float
                    0) Cancel Order
                    
                    """);

            int chooseDrink = Sweets.nextInt();
            Sweets.nextLine();

            switch (chooseDrink) {
                case 1:
                    DrinkType gardevoir = DrinkType.GARDEVOIR;
                    break;
                case 2:
                    DrinkType sylveon = DrinkType.SYLVEON;
                    break;
                case 3:
                    DrinkType gengar = DrinkType.GENGAR;
                    break;
                case 4:
                    DrinkType fuecoco = DrinkType.FUECOCO;
                    break;
                case 5:
                    DrinkType mimikyu = DrinkType.MIMIKYU;
                    break;
                case 6:
                    DrinkType shinx = DrinkType.SHINX;
                    break;
                case 0:
                    isPichuRunning = false;
                    break;
                default:
                    System.out.println("Sorry I don't think I quite got that. Please try again");
                    break;

            }


        }
    }

    public static void AddSweets() {
        boolean isPichuRunning = true;
        while (isPichuRunning) {
            System.out.println("""
                    Please Select a Side:
                    
                    (1) Mega Altaria's Fluffy Tres-Leches
                    (2) I Choose You PokeBall
                    (3) Oshawott Parfait
                    (4) Garchomp Souffle
                    (5) Infernape's Firey Brownies
                    (6) Cancel Order
                    
                    """);

            //asking for user input
            int chooseDrink = Sweets.nextInt();
            Sweets.nextLine();

            switch (chooseDrink) {
                case 1:
                    SweetType altartia = SweetType.ALTARIA;
                    break;
                case 2:
                    SweetType pokebawl = SweetType.POKEBAWL;
                    break;
                case 3:
                    SweetType oshawott = SweetType.OSHAWOTT;
                    break;
                case 4:
                    SweetType garchomp = SweetType.GARCHOMP;
                    break;
                case 5:
                    SweetType Infernape = SweetType.INFERNAPE;
                    break;
                case 6:
                    isPichuRunning = false;
                    break;
                default:
                    System.out.println("Sorry I don't think I quite got that. Please try again");
                    break;
            }

        }
    }

    public static void AddSide() {
        boolean isPichuRunning = true;
        while (isPichuRunning) {
            System.out.println("""
                    Please Select a Side:
                    
                    (1) Tatsugiri Roll
                    (2) Rhyperior Roll
                    (3) Torchic's Fried Egg
                    (4) Vullaby's Omelette
                    (5) Cancel Order
                    
                    """);

            //asking for user input
            int chooseDrink = Sweets.nextInt();
            Sweets.nextLine();

            switch (chooseDrink) {
                case 1:
                    SideType tatsugiri = SideType.TATSUGIRI;
                    break;
                case 2:
                    SideType rhyperior = SideType.RHYPERIOR;
                    break;
                case 3:
                    SideType torchic = SideType.TORCHI;
                    break;
                case 4:
                    SideType vullaby = SideType.VULLABY;
                    break;
                case 5:
                    isPichuRunning = false;
                    break;
                default:
                    System.out.println("Sorry I don't think I quite got that. Please try again");
                    break;
            }

        }
    }


    public static void ItemSummary() {
        //  i need to return a list of the items that were selected
        System.out.println(order.toString());

    }

    public static void CheckOut() {
        // recieve input for yest or no
        // if they say yes then the order disapears
        // if no then return to main menu
        boolean isPichuRunning = true;
        while (isPichuRunning) {

            System.out.println("""
                    would you like check out?
                    
                    - Yes!
                    - No!
                    
                    
                    """);


            String response = Sweets.nextLine().trim().toLowerCase();
            Sweets.nextLine();

            switch (response) {
                case "yes":
                    System.out.println(order.toString());
                    System.out.println(" Your total is " + order.totalPrice());
                    debOrCred();
                    break;
                case "no":
                    isPichuRunning = false;
                    break;
                default:
                    System.out.println("Sorry I don't think I quite got that. Please try again");
                    break;
            }
        }


    }


    public static void debOrCred() {
        System.out.println("""
                Will that be Debit or credit!
                
                - Debit
                - Credit
                
                
                """);

        String response = Sweets.nextLine().trim().toLowerCase();
        Sweets.nextLine();

        System.out.println(" Thank you for Shopping at the PokeSweetsCafe ");
        System.out.println("""
                
                ⠀⠀⠀⠀⠀⠀⠀⠠⣄⠀⠀⠀⠀⢀⡠⠤⠤⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⢠⠂⠀⠁⠀⠀⠀⠀⢸⠀⠀⠀⡰⠋⠀⠀⠀⠀⠸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠸⣄⠀⠀⠀⠀⠀⠀⡼⠀⠀⢠⡁⠀⣰⡆⠀⠀⠰⠥⠤⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠈⠑⠢⢤⡀⡠⠊⠀⠀⠀⠀⢧⡀⣿⠃⠀⠀⠔⠀⠀⢀⣀⠉⠳⢄⢠⠔⠂⠒⠦⡀⠀
                ⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⡸⠁⠀⠀⡎⠀⢠⠊⠀⠀⠑⠄⡄⠫⠀⠀⠀⠀⠸⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠢⠞⢦⡇⠀⢀⣸⣗⡆⠘⣄⠀⠀⠀⠡⠃⠀⠀⣠⣄⠀⢠⠁
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢫⠀⠀⠀⢣⡄⠀⠈⠉⠀⠤⡀⠁⣆⣦⠀⠀⠀⣎⠛⠃⣠⠎⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢣⡀⠀⠀⢳⡀⠀⢸⠻⢲⣤⠀⠉⢫⠀⠀⢠⠋⠉⠉⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⢄⡀⠀⠑⠢⣈⠂⠔⠁⠀⠀⠘⢀⡴⠋⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡹⠂⠀⠀⠀⠉⠑⠒⢲⠒⠊⠉⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⡖⠦⠊⠣⣴⠁⠀⠀⢀⠄⠀⠀⠀⠸⣄⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⢸⡀⠐⢤⠈⠀⠀⢠⠁⠀⠀⠀⠀⠀⠀⢠⠇⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠳⣀⠀⠙⢂⠀⢘⠀⠀⢴⠀⡄⢀⢠⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠠⠄⡀⠈⠉⠉⠁⠉⠉⠉⠙⠻⢤⣣⢾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                
                """);

    }


}
