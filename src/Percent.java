import java.util.Scanner;

/**
 * Created by Валентина on 16.05.2017.
 */
public class Percent {
    public static void main(String[] arg)
    {
        System.out.println("Введите пожалуйста сумму денежного вклада: ");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        System.out.println("Введите пожалуйста процент годовых в виде десятичной дроби: ");
        Scanner in = new Scanner(System.in);
        double percent = in.nextDouble();
        System.out.println("Введите пожалуйста длительность времени (лет): ");
        int year = scanner.nextInt();
        double sumprcnt = 0;
        double PrcBonus = 0;
        double NewMoney = 0;

            for (int i = 1; i <= year; i++)
            {
                PrcBonus = money * percent;
                NewMoney = money + PrcBonus;
                sumprcnt = sumprcnt + PrcBonus;


                System.out.printf("Ваша сумма за %d год составляет %f \n", i, NewMoney);
                System.out.println("Ваши процентные выплаты составляют " + (sumprcnt));
                money = NewMoney;



            }



    }
}
