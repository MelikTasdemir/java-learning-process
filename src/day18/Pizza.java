package day18;

public class Pizza {

    public static char size ;
    public int CheeseTop, PepperTop ;


    public double Cost (){
        double totalPrice = 0;

        switch (size){
            case 'S':
            case 's':
                totalPrice = 10 + (CheeseTop + PepperTop) * 2 ;
                break;

            case 'M':
            case 'm':
                totalPrice = 12 + (CheeseTop + PepperTop) * 2 ;
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + (CheeseTop + PepperTop) * 2 ;
                break;

            default:
                System.out.println("Invalid size" + size);


        }
return totalPrice;





    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", CheeseTop=" + CheeseTop +
                ", PepperTop=" + PepperTop +
                ", totalprice=" + Cost() +
                '}';
    }

    public void setInfo(char size, int CheeseTop, int PepperTop){
this.size = size ;
this.CheeseTop = CheeseTop;
this.PepperTop = PepperTop;
    }



}
/*
1. Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping

			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping
 */