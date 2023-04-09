package restaurant;
import java.util.ArrayList;
import java.util.Date;
public class Menu {
 private ArrayList<MenuItem> menu = new ArrayList<>();
 private Date lastUpdated = new Date();
// A way to add and remove menu items from the menu.
 public void addItem(MenuItem newItem) {
  menu.add(newItem);
  lastUpdated = new Date();
 }
 public void removeItem(MenuItem oldItem) {
  menu.remove(oldItem);
  lastUpdated = new Date();
 }



// A way to tell when the menu was last updated.
 public Date getLastUpdated() {
  return lastUpdated;
 }

 // A way to print out both a single menu item as well as the entire menu.
 public void printMenu() {
  for(MenuItem item : menu) {
   System.out.println(item.getName());
   System.out.println(item.getDescription());

  }
 }
 public void printMenuItem(MenuItem item) {
  System.out.println();
 }


}
