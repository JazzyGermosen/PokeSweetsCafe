package com.pluralsight.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ReceiptWriter {

    public static void saveReceipt(){

        String filepatch = "C:\\Users\\HP\\Desktop\\textfile.txt";

        try {
            FileWriter writer = new FileWriter(filepatch)
            BufferedReader bufReader = new BufferedReader(new FileReader());

            bufReader.readLine();

            String machop = bufReader.readLine();
            while ((machop = bufReader.readLine()) != null) {
                // using a variable to store the new info after splitting it properly
                String[] pikamoney = machop.split("\\|");
                //creating an object based on the split files
                //im not sure how to fix the first 2 but we will figure that out later
                // this was supposed to be pikamoney but not sure
                transactions snivy = new transactions(LocalDate.parse(pikamoney[0]), LocalTime.parse(pikamoney[1]), pikamoney[2], pikamoney[3], Double.parseDouble(pikamoney[4]));
                // adding this to the product thingie
                starmie.add(snivy);
            }

        } catch (Exception e) {
            System.out.println("Sorry I dont think i understand. Please try again later.");
            System.exit(0);
        }
    }

}
