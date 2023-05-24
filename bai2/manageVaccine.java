package baiTapSlack.bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class manageVaccine extends Vaccine {
    Scanner input = new Scanner(System.in);

    Vaccine vaccine ;

    @Override
    public String toString() {
        return "manageVaccine{" +
                "input=" + input +
                ", vaccines=" + vaccines +
                ", vaccine=" + vaccine +
                '}';
    }

    private Vaccine addVaccine()  {

        System.out.println("importDate");
        String importDate = input.nextLine();
        System.out.println("price");
        int price = Integer.parseInt(input.nextLine());
        System.out.println("injectedDate");
        String injectedDate = input.nextLine();
        System.out.println("quantity");
        int quantity = Integer.parseInt(input.nextLine());

        Vaccine vaccine1 = new Vaccine(getId(), getName(),importDate,price,injectedDate,quantity);
        vaccines.add(vaccine1);

        System.out.println("date Vaccine");
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        String dateInput = input.nextLine();
        Date date1 = formatter1.parse(dateInput);
        String dateStr1 = formatter1.format(date1);

        System.out.println("price");
        int price = Integer.parseInt(input.nextLine());

        System.out.println("injectVaccine");
        SimpleDateFormat injectVaccine = new SimpleDateFormat("dd/MM/yyyy");
        String injectVaccineInput = input.nextLine();
        Date injectVaccine_date = injectVaccine.parse(injectVaccineInput);
        String dateStr_InjectVaccine = formatter1.format(injectVaccine_date);

        System.out.println("quantity");
        int quantity = Integer.parseInt(input.nextLine());

        vaccine = new Vaccine(name, date1, price, injectVaccine_date,quantity);
        return vaccine;
    }

    public void add() throws ParseException {
        Vaccine vaccine1 = addVaccine();
        vaccines.add(vaccine1);
    }
    public  void delete(int index){
        if (vaccines.get(index).getQuantity() == 0){
            vaccines.remove(index);
        }
    }

    public void editPrice(String name){
        for (Vaccine x : vaccines) {
            if (x.getName().equals(name)){
                System.out.println("nhập giá muốn sửa");
                x.setPrice(Integer.parseInt(input.nextLine()));
            }
        }
    }






}
