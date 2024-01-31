package day27;

import javax.swing.plaf.PanelUI;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("%");
    }
    static {
        System.out.println("1");
    }

    public static void main(String[] args) {
        System.out.println("2");

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();

    }

    static {
    System.out.println("3");
}




}
