package day4concatenatıon;

import java.sql.SQLOutput;

public class ShippingAdres {
    public static void main(String[] args) {

      /*
1. Create a class named ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full shipping address
Ex:
Your Shipping address is:
     Aaron Kissinger
     13621A Legacy Circle
     Fairfax, VA 22030
       */


        String name = "Melik Tas",
                buldNum = "13621A",
                city = "Legacy Circle",
                state = "Fairfax",
                zipcode = "VA 22030";

        System.out.println("Your Shipping address is:");
        System.out.println("\t" + name);
        System.out.println("\t" + buldNum + " " + city);
        System.out.println("\t" + state + ", " + zipcode);

        System.out.println("-------------------------------");

        System.out.println("Your Shpping Adress is" + "\n\t" + name + "\n\t" + buldNum + " " + city + "\n\t" +
                state + ", " + zipcode);











    }
}
