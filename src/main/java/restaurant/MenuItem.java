package restaurant;

import java.util.Date;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price;
    private boolean isNew;
    private Date dateAdded;

    public MenuItem(String name, String description, String category, double price, boolean isNew) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = isNew;
        this.dateAdded = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    // A way to determine whether or not two menu items are equal.
    public boolean isEqual(MenuItem item) {
    }

    // A way to tell if a menu item is new.
    public void isNewItem() {
       Date compareDate = new Date(2023,1,1);
        boolean isItNew = this.dateAdded.after(compareDate);
        if (isItNew) {
            this.isNew = true;
            System.out.println("This item is new.");
        } else {
            this.isNew = false;
            System.out.println("This item is not new.");
        }
    }
}

