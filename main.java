import java.util.Scanner;
import java.io.*;
import java.util.*;

public class main {

    public static void Main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String option;

        System.out.println("Welcome to the contact manager! \n");
        option = menu(scnr);

        while (option.compareTo("4") == 0) {

            if (option.compareTo("1") == 0) {

            } else if (option.compareTo("2") == 0) {

            } else if (option.compareTo("3") == 0) {

            } else if (option.compareTo("4") == 0) {
                System.out.println("GoodBye!\n");
                option = "4";
                break;
            }
        }

        scnr.close();
    }

    static String menu(Scanner scnr) {
        String option = "";
        System.out.println("Choose one of the options:");
        System.out.println("1 - Enter a new contact");
        System.out.println("2 - Search for an existing contact");
        System.out.println("3 - Delete a contact");
        System.out.println("4 - Exit");

        option = scnr.nextLine();

        System.out.println("\n");
        return option;
    }
}