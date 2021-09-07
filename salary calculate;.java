package week1;

import java.util.Scanner;

public class SalaryCalculator {



    public static void main(String[] args) {
        System.out.println("Lütfen çalışma saati giriniz");
        Scanner scanner = new Scanner(System.in);
        int worksHoursWeek = scanner.nextInt();
        scanner.close();

        int basesalary = 1000;
        int hour = 40;
        int perhouramount = 25;
        double unit = 1.5;
        double salary ;

        salary = (basesalary)+(worksHoursWeek - hour)*(perhouramount* unit);


        if(worksHoursWeek * perhouramount <basesalary){
            System.out.println("Minimum 40 saat girebilirsiniz");
        }
        else {
            if (worksHoursWeek * perhouramount >basesalary){
            System.out.println("Kazandığınız ücret "+salary + " Euro");
                    }
        }
        switch (worksHoursWeek){
            case 40:
                System.out.println("Kazandığınız ücret 1000 Euro");
        }
    }


}