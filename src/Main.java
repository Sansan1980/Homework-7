public class Main {
    public static void main(String[] args) {
        /*
        Задача 1
Продолжите работать с кодом, который вы написали в предыдущем уроке — в задачах с накоплениями.
С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
 что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
Результат программы должен быть выведен в консоль с тем количеством месяцев, которое необходимо для накопления данной суммы.
 Формат сообщения: «Месяц …, сумма накоплений равна … рублей» .
        */
        System.out.println( " do-while");
        int capital = 2_459_000;
        int monthlyIncome = 0 ;
        int firstDeposit = 15000;
        int mounth = 0;
        do{
            mounth = mounth + 1;
            monthlyIncome = monthlyIncome + firstDeposit;
            System.out.println("Месяц "+ mounth + ", сумма накоплений равна "+ monthlyIncome +" рублей");

        }
       while (monthlyIncome <= capital);

        System.out.println();
        System.out.println( " while");

         capital = 2_459_000;
         monthlyIncome = 0 ;
         firstDeposit = 15000;
         mounth = 0;
        while (monthlyIncome <= capital){
            mounth = mounth + 1;
            monthlyIncome = monthlyIncome + firstDeposit;
            System.out.println("Месяц "+ mounth + ", сумма накоплений равна "+ monthlyIncome +" рублей");
        }
        System.out.println();
        System.out.println( " for ");

        System.out.println();
        capital = 2_459_000;
        monthlyIncome = 0 ;
        firstDeposit = 15000;
        mounth = 0;
        for (; monthlyIncome <= capital; mounth++, monthlyIncome = monthlyIncome + firstDeposit ) {
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + monthlyIncome + " рублей");
        }




        }
    }




