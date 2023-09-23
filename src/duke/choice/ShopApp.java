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

        Customer c1 = new Customer();

        c1.name = "Tyer";
        c1.size = "S";

        System.out.println("Customer is " + c1.name);

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] items = {item1, item2};

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

//        System.out.println("Item 1" + "," + item1.description + "," + item1.price + "," + item1.size);
//        System.out.println("Item 2" + "," + item2.description + "," + item2.price + "," + item2.size);
//        total = (item1.price + item2.price * 2) * (1 + tax);
        int measurement = 3;

        switch (measurement) {
            case 1:
            case 2:
                case3:
                c1.size = "S";
                break;
            case 4:
            case 5:
            case 6:
                c1.size = "M";
                break;
            case 7:
            case 8:
            case 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";

        }

        for (Clothing item : items) {
            if (c1.getSize().equals(item.getSize())) {
                total = total + item.getPrice();
                System.out.println("Item " + "," + item.getDescription() + "," + item.getPrice() + "," + item.getSize());

            total = total + total * tax;
                if (total > 15) {
                    break;
                }
            }
        }

        System.out.println("Total = " + total);

    }
}
