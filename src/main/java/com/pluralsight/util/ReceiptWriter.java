package com.pluralsight.util;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ReceiptWriter {

    public static void saveReceipt() {
        LocalDateTime dateTime = LocalDateTime.now();

        String filepath = "C:\\Users\\HP\\Desktop\\receiptfile.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath))) {

            bufferedWriter.write(dateTime);


        } catch (
                Exception e) {
            System.out.println("Sorry I dont think i understand. Please try again later.");
            System.exit(0);
        } catch (
                IOException e) {
            System.out.println("Sorry I dont think i understand. Please try again later.");

        }
    }


}
