package baiTapSlack.bai2;

import java.util.Scanner;

public class ManagerCustomer extends Customer{
    Customer customer;
    Scanner scanner = new Scanner(System.in);
    private boolean checkid(int id) {
        for (Customer x: customers) {
            if (x.getId() == id){
                return true;
            }
        }
        return false;
    }
    public void addC(int id){
        if (checkid(id)){

        }else {
            System.out.println("name");
            String name = scanner.nextLine();
            System.out.println("phone");
            String phone = scanner.nextLine();
            Customer customer1 = new Customer(id,name,phone);
            customers.add(customer1);
        }
    }


}
