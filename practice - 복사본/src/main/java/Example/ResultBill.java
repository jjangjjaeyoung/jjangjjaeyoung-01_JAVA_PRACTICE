package Example;

import java.util.ArrayList;

public class ResultBill {
    static int total_money;
    static int point_money;
    static ArrayList<String> shoesName = new ArrayList<>();
    static ArrayList<String> shoesSize = new ArrayList<>();
    static ArrayList<Integer> price = new ArrayList<>();







    public static void main(String[] args) {
        PaymentController pc=new PaymentController();
        pc.resultItem();


    }
}
