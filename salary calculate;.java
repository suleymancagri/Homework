package week1; //Girilen çalışma saatine göre sadece haftaiçi çalıştığı baz alınarak hesaplanmış maaş

import java.util.Scanner;

public class SalaryCalculator {



    public static void main(String[] args) {
        System.out.println("Please enter working hours");
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
            System.out.println("You can enter a minimum of 40 working hours");
        }
        else {
            if (worksHoursWeek * perhouramount >basesalary){
            System.out.println("The wage you earn "+salary + " Euro");
                    }
        }
        switch (worksHoursWeek){
            case 40:
                System.out.println("The wage you earn 1000 Euro");
        }
    }


}
