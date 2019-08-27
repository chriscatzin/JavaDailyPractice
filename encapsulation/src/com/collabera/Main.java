package com.collabera;

public class Main {

    public static void main(String[] args) {

        /*
        Player player = new Player();
        player.name = "Chris";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

         */

        // EnhancedPlayer player = new EnhancedPlayer("Chris", 50, "Sword");
        // System.out.println("Initial health is: " + player.getHealth());

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " +
                printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +
                " new total print count for printer = " +
                printer.getPagesPrinted());
    }
}
