/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

/**
 *
 * @author Tyer Mercado
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double tax = 0.2;
        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = new Customer("Tyer", 14);

        //c1.setName("Tyer");
        //c1.setSize("S");
        
        System.out.println("Min Price " + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S" );

        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5.0 , "S"), new Clothing("Blue T-Shirt", 10.5, "S")};


//        System.out.println("Item 1" + "," + item1.description + "," + item1.price + "," + item1.size);
//        System.out.println("Item 2" + "," + item2.description + "," + item2.price + "," + item2.size);
//        total = (item1.price + item2.price * 2) * (1 + tax);
        int measurement = 8;

        c1.addItems(items);

        //c1.setSize(measurement);

        System.out.println("Customer is " + c1.getName() + "," + c1.getSize() + "," + c1.getTotalClothingCost());

        for (Clothing item : c1.getItems()) {
            System.out.println("Items " + item.getDescription());

        }
    }

}
