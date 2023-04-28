package restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {

        MenuItem cookie = new MenuItem("chocolate chip cookie", "delicious",
                "dessert", 1.50, true);
        MenuItem sandwich = new MenuItem("grilled cheese", "also delicious",
                "entree", 8.50, false);
        MenuItem coke = new MenuItem("coke", "soda pop",
                "drink", 1.00, true);

        ArrayList <MenuItem> startingMenu = new ArrayList<>();

        Date today = Calendar.getInstance().getTime();

        Menu allDay = new Menu(startingMenu, today);

        allDay.printMenu();
        System.out.println("hahshhshedf");
        allDay.addItem(cookie);
        allDay.addItem(sandwich);
        allDay.addItem(coke);
        allDay.printMenu();
    }
}
