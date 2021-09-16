package Week2;


import java.util.Random;
import java.util.Scanner;

public class Gambling {
     Random random;
     int totalAmount;
     boolean check;

    public static void main(String[] args)
    {
        new Gambling().init();
    }

    public void init()
    {
        Scanner scanner = new Scanner(System.in);
        random = new Random();
        String input ="";
        System.out.println("Zarı atmak için enter tuşuna basın");
        while(scanner.hasNextLine())
        {
            input = scanner.nextLine();
            if(check && (input.equals("Y") || input.equals("y")))
            {
                totalAmount = 0;
                check = false;
                play();
            }
            else if(check && (input.equals("N") || input.equals("n")))
            {
                System.out.println("Bye!");
                break;
            }
            else if(check)
            {
                System.out.println("Geçersiz seçim,tekrar deneyin!");
            }
            else if(!(check || input.isEmpty()))
            {
                System.out.println("Zar atmak için enter tuşuna basın!");
            }
            else
            {
                play();
            }
        }

    }
    public void play()
    {
        int dice = random.nextInt(6) + 1;
        System.out.println("Zar: "+dice);
        if(totalAmount >= 50)
        {
            System.out.println("Kazanabileceğin maksimum kazanca ulaştın: "+totalAmount+"$\nTekrar oynamak ister misin? (Y\\N)");
            check = true;

        }
        if(dice < 3)
        {
            System.out.println("Oyun bitti");
            System.out.println("Toplam kazanç: "+totalAmount+ "$  Tekrar oynamak ister misin (Y\\N)");
            check = true;
        }
        else if(dice == 3)
        {
            System.out.println("Kazanım yok devam etmek için \"Enter\" tuşuna basın");

        }
        else
        {
            totalAmount += dice;
            System.out.println("Harika gidiyor! Kazandığın para " +totalAmount+"$ Devam etmek için \"Enter\" tuşuna basın");

        }
    }


}