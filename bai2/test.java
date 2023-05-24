package baiTapSlack.bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class test   {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("date Vaccine");
//        System.out.println("dd");
//        int day = Integer.parseInt(scanner.nextLine());
//        System.out.println("MM");
//        int month = Integer.parseInt(scanner.nextLine());
//        System.out.println("yyyy");
//        int year = Integer.parseInt(scanner.nextLine());
//        LocalDate currentDateTime = LocalDate.of(year,month,day) ;
//        System.out.println("Ngày muốn hiển thị: " + currentDateTime);

//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        String dateStr = scanner.nextLine();
//        Date date = formatter.parse(dateStr);
//        System.out.println(date);

        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        String dateInput = scanner.nextLine();
        Date date1 = formatter1.parse(dateInput);
        String dateStr1 = formatter1.format(date1);
        System.out.println(dateStr1);


    }
}
