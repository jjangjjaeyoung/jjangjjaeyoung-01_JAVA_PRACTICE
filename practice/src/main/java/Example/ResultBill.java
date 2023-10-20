package Example;

import java.util.ArrayList;

public class ResultBill {
    public static void main(String[] args) {

        productDTO pro = new productDTO("아디", "240", 50000);

        ArrayList<productDTO> dto = new ArrayList<productDTO>();
        dto.add(pro);

        PaymentController pay = new PaymentController();
        pay.print(dto, 50000);
    }



}
