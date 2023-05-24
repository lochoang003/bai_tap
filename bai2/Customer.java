package baiTapSlack.bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    private int count;
    private int id;
    private String name;
    private String phone;
  public List<Customer> customers = new ArrayList<>();
   Scanner input = new Scanner(System.in);


    public Customer(){

    }

    public Customer( int id,String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
//    public Customer ( String name ,Vaccine vaccine ){
//
//    }

    private void addCustomer(){
        System.out.println("name"  );
        String name = input.nextLine();
        System.out.println("phone"  );
        String phone = input.nextLine();



    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
