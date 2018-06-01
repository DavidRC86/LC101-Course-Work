import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class Menu {

    String item, desc, catagory;
    double price;
    Date time;

    public Menu(String item, String desc, String catagory, double price, Date time) {
        this.item = item;
        this.desc = desc;
        this.catagory = catagory;
        this.price = price;
        this.time = time;
    }


}
    class MakeMenu {
        private static Scanner in = new Scanner(System.in);
        public static HashMap<String, Menu> map = new HashMap<String, Menu>();
        public static void main(String[] args) {

            HashMap<String, String> columnChoices = new HashMap<>();
            columnChoices.put("add", "Add Item");
            columnChoices.put("remove", "Remove Item");

                
                String actionChoice = getUserSelection("Pick a catagory:", columnChoices);


                        additem();




        }

        private static String getUserSelection(String menuHeader, HashMap<String, String> choices) {

            Integer choiceIdx;
            Boolean validChoice = false;
            String[] choiceKeys = new String[choices.size()];


            Integer i = 0;
            for (String choiceKey : choices.keySet()) {
                choiceKeys[i] = choiceKey;
                i++;
            }

            do {

                System.out.println("\n" + menuHeader);

                // Print available choices
                for (Integer j = 0; j < choiceKeys.length; j++) {
                    System.out.println("" + j + " - " + choices.get(choiceKeys[j]));
                }

                choiceIdx = in.nextInt();
                in.nextLine();

                // Validate user's input
                if (choiceIdx < 0 || choiceIdx >= choiceKeys.length) {
                    System.out.println("Invalid choice. Try again.");
                } else {
                    validChoice = true;
                }

            } while (!validChoice);

            return choiceKeys[choiceIdx];
        }
        public  static void additem() {

            while (true) {

                System.out.println("Do you wish to Add an Item?");
                Scanner answer = new Scanner(System.in);
                String a = answer.nextLine();
                if (a.toLowerCase().equals("yes")) {


                    for (int z = 0; z < 1; ) {
                        System.out.print("Please Enter Menu Item");

                        String i = in.nextLine();
                        String d = in.nextLine();
                        String c = in.nextLine();
                        double p = in.nextDouble();
                        Date t = new Date();
                        Menu newItem = new Menu(i, d, c, p, t);
                        map.put(newItem.item,newItem);
                        z++;
                    }

                        }
                if (a.toLowerCase().equals("no")){
                    break;
                }


                    }
                }
            }





