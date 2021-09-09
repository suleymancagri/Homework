package week1; //haftaiçi ve haftasonu mesai saatine göre hesaplayan ödev

import java.util.Scanner;

public class FullSalaryCalculator {
    public static void main(String[] args){

        System.out.println("Please write the base salary:");
        Scanner scanner = new Scanner(System.in);
        int baseSalary = scanner.nextInt();
        if(baseSalary >= 1000)
        {
            System.out.println("Please write weekdayworkinghourswithoutovertime:");
            int weekdayworkinghourswithoutovertime = scanner.nextInt();
            System.out.println("weekdayovertime :");
            int weekdayovertime = scanner.nextInt();
            System.out.println("weekendovertime :");
            int weekendovertime = scanner.nextInt();
            scanner.close();
            double hourlywage= baseSalary / 40;
            double finalsalary= 0;

            if ( weekdayworkinghourswithoutovertime >=40 && weekendovertime >10)
            {
                finalsalary = weekdayworkinghourswithoutovertime*hourlywage + weekdayovertime*hourlywage * 1.5 + weekendovertime*hourlywage*2 + 500;
            }
            else{
                finalsalary = weekdayworkinghourswithoutovertime*hourlywage + weekdayovertime*hourlywage * 1.5 + weekendovertime*hourlywage*2;
            }

            System.out.println("Your salary is : " + finalsalary);
        }
        else
            System.out.print("Your salary must be bigger than 1000");
    }
}
