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

        /*
        Задача 2
Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
Для обоих циклов можно использовать как одну общую переменную, так и свою в каждом цикле.
Не забудьте выполнить переход на новую строку между двумя циклами.
В результате программы вывод должен получиться следующим
1 2 3 4 5 6 7 8 9 10
10 9 8 7 6 5 4 3 2 1
         */
        System.out.println();
        System.out.println( "Задача № 2 ");
        int a = 0;
         while(  a < 10){
           a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println();
        while(  a > 0 ) {
            System.out.print(a + " ");
            a = a - 1;
        }
        /*
        Задача 3
В стране Y население — 12 миллионов человек.
Рождаемость составляет 17 человек на 1000, смертность — 8 человек. Рассчитайте, какая численность населения будет через
10 лет, если показатели рождаемости и смертности постоянны.
В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».
         */

        System.out.println();
        System.out.println( "Задача № 3");
        int population = 12_000_000;
        int coefficient = 1000;
        int replenishment = 17;
        int decreasing = 8;
        int replenishmentYear = replenishment - decreasing ;
        int age = 10;
        a = 0;
        while ( a < age){
            a = a + 1;
            population = population + (population / coefficient * replenishmentYear) ;
            System.out.println("Год "+ a + ", численность населения составляет "+ population );
        }
            System.out.println("");


/*        System.out.println(" через double")
        double  populat = 12_000_000;
        double  coeff = 1000;
        double  replen = 17/coeff;
        double decreas = 8/coeff;
        double replenishmentY = replen - decreas  ;
       age = 10;
        a = 0;
        while ( a < age){
            a = a + 1;
            populat = populat + (populat * replenishmentY) ;


            System.out.println("Год "+ a + ", численность населения составляет "+ population );
        }

 */
        System.out.println( "Задача № 3 через цикл for");
       population = 12_000_000;
       coefficient = 1000;
       replenishment = 17;
       decreasing = 8;
       replenishmentYear = replenishment - decreasing ;
       age = 10;
       for(a = 0; a < age; a = a + 1, population = population + (population / coefficient * replenishmentYear), System.out.println("Год "+ a + ", численность населения составляет "+ population  ))
        {

        }
          // population = population + (population / coefficient * replenishmentYear) ;
         //  System.out.println("Год "+ a + ", численность населения составляет "+ population );








        }
    }




