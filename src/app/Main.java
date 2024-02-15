package app;

import app.dataprovider.DataProvider;
import app.output.Outputer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        processRequest(getOption());
    }

    private static int getOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose an option:
                1 - show all chat members.
                2 - search for a chat member by index.
                3 - search for a chat member by name.
                4 - search for a chat member by e-mail.
                """);
        return scanner.nextInt();
    }

    private static void processRequest(int option) {
        switch (option) {
            case 1 -> showAllUsersData();
            case 2 -> showDataByIndex();
            case 3 -> showDataByName();
            case 4 -> showDataByEmail();
            default -> System.out.println("Error when processing your request.");
        }
    }

    private static void showAllUsersData() {
        new Outputer().getAllUsers(new DataProvider().getAllUsersData());
    }

    private static void showDataByIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter chat index of the person you would like to search for: ");
        int index = scanner.nextInt();
        new Outputer().getUserByIndex(new DataProvider().getAllUsersData(), index);
    }

    private static void showDataByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter name of the person you would like to search for: ");
        String name = scanner.nextLine().trim();
        new Outputer().getUserByName(new DataProvider().getAllUsersData(), name);
    }

    private static void showDataByEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter e-mail of the person you would like to search for: ");
        String email = scanner.nextLine().trim();
        new Outputer().getUserByEmail(new DataProvider().getAllUsersData(), email);
    }

}
