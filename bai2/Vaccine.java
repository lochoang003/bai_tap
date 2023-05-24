package baiTapSlack.bai2;

import java.util.ArrayList;
import java.lang.String;
import java.util.List;

public class Vaccine extends Customer{
    private static int count = 0;
    private int id ;
    private String name;
    private String importDate;
    private int price;
    private String injectedDate;
    private int quantity;
   public List<Vaccine> vaccines = new ArrayList<>();

    public Vaccine(){

    }

    public Vaccine( int id,String name, String importDate, int price, String injectedDate,int quantity) {
        this.id = id;
        this.name = name;
        this.importDate = importDate;
        this.price = price;
        this.injectedDate = injectedDate;
        this.quantity=quantity;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateVaccine() {
        return importDate;
    }

    public void setDateVaccine(String importDate) {
        this.importDate = importDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInjectVaccine() {
        return injectedDate;
    }

    public void setInjectVaccine(String injectedDate) {
        this.injectedDate = injectedDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
