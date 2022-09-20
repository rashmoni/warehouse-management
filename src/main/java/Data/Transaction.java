package Data;

import Utils.GenerateStrings;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private String id;
    private Date date;
    private String transactionID;
    private int sellQuantity;
    private double price;


    public Transaction(String id, int sellQuantity, double price){
        this.id=id;
        this.sellQuantity= sellQuantity;
        this.price=price;
        transactionID = GenerateStrings.GenerateReciptNum();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        date = new Date();
    }

    @Override
    public String toString(){
        return id+","+date+","+transactionID+ "," +sellQuantity+","+price;
    }

}
