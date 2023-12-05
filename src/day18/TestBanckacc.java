package day18;

public class TestBanckacc {
    public static void main(String[] args) {

BankAcc obj1 = new BankAcc();

obj1.setInfo("Kadir",121223);

        System.out.println(obj1);

obj1.deposit(1500);
obj1.checkBalance();


obj1.wthdraw(-50);
obj1.checkBalance();













    }
}
