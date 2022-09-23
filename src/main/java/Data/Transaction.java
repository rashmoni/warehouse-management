package Data;

import Utils.GenerateRecOrdStrings;
import java.util.Date;

public class Transaction {
    private final String id;
    private final Date date;
    private final String transactionID;
    private final int sellQuantity;
    private final double price;


    public Transaction(String id, int sellQuantity, double price){
        this.id=id;
        this.sellQuantity= sellQuantity;
        this.price=price;
        transactionID = GenerateRecOrdStrings.GenerateReciptNum();
        date = new Date();
    }

    @Override
    public String toString(){
        return id+","+date+","+transactionID+ "," +sellQuantity+","+price;
    }

}
