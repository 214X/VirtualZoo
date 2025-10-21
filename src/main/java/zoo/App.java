package zoo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        new App().run();
    }   

    private final Scanner sc = new Scanner(System.in);
    private boolean running = true;

    private void run() {
        printHeader();
        while (running){
            printMenu();
            String choice = sc.nextLine().trim();
            handleChoice(choice);
        }
        System.out.println("Goodbye :)");
    }

    private void printHeader() {
        System.out.println("""
                    .-..-. _      .-.              .-.  .----.            
                    : :: ::_;    .' `.             : :  `--. :            
                    : :: :.-..--.`. .'.-..-. .--.  : :    ,',' .--.  .--. 
                    : `' ;: :: ..': : : :; :' .; ; : :_ .'.'_ ' .; :' .; :
                     `.,' :_;:_;  :_; `.__.'`.__,_;`.__;:____;`.__.'`.__.'
                    """);
    }

    private void printMenu(){
        System.out.println("""
                --------------------
                        MENU 
                --------------------
                    0) Exit
                """);
        System.out.print("> ");
    }

    private void handleChoice(String choice) {
        switch(choice) {
            case "0":
                running = false;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}