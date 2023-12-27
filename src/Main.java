import java.sql.SQLOutput;

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
        System.out.println(" do-while");
        int capital = 2_459_000;
        int monthlyIncome = 0;
        int firstDeposit = 15000;
        int mounth = 0;
        do {
            mounth = mounth + 1;
            monthlyIncome = monthlyIncome + firstDeposit;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + monthlyIncome + " рублей");

        }
        while (monthlyIncome <= capital);

        System.out.println();
        System.out.println(" while");

        capital = 2_459_000;
        monthlyIncome = 0;
        firstDeposit = 15000;
        mounth = 0;
        while (monthlyIncome <= capital) {
            mounth = mounth + 1;
            monthlyIncome = monthlyIncome + firstDeposit;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + monthlyIncome + " рублей");
        }
        System.out.println();
        System.out.println(" for ");

        System.out.println();
        capital = 2_459_000;
        monthlyIncome = 0;
        firstDeposit = 15000;
        mounth = 0;
        for (; monthlyIncome <= capital; mounth++, monthlyIncome = monthlyIncome + firstDeposit) {
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
        System.out.println("Задача № 2 ");
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println();
        while (a > 0) {
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
        System.out.println("Задача № 3");
        int population = 12_000_000;
        int coefficient = 1000;
        int replenishment = 17;
        int decreasing = 8;
        int replenishmentYear = replenishment - decreasing;
        int age = 10;
        a = 0;
        while (a < age) {
            a = a + 1;
            population = population + (population / coefficient * replenishmentYear);
            System.out.println("Год " + a + ", численность населения составляет " + population);
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
        System.out.println("Задача № 3 через цикл for");
        population = 12_000_000;
        coefficient = 1000;
        replenishment = 17;
        decreasing = 8;
        replenishmentYear = replenishment - decreasing;
        age = 10;
        for (a = 0; a < age; a = a + 1, population = population + (population / coefficient * replenishmentYear), System.out.println("Год " + a + ", численность населения составляет " + population)) {

        }
       /* {

           population = population + (population / coefficient * replenishmentYear) ;
           System.out.println("Год "+ a + ", численность населения составляет "+ population );
       }

        */
        /*

Задача 4
Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%.
Первоначальная сумма вклада — 15 тысяч рублей.
Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов
рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%.
Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.

         */
        System.out.println("");
        System.out.println("Задача № 4");

        int fnlCapital = 12_000_000;
        firstDeposit = 15000;
        int interestDeposit = 7;
        mounth = 0;
        int deposit = 0;
        while (deposit <= fnlCapital) {
            mounth = mounth + 1;
            deposit = firstDeposit + (deposit) + (deposit / 100 * interestDeposit);
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + deposit + " рублей");

        }
        System.out.println(" через for");
        fnlCapital = 12_000_000;
        firstDeposit = 15000;
        interestDeposit = 7;
        mounth = 0;
        deposit = 0;
        for (; deposit <= fnlCapital; mounth++, deposit = firstDeposit + (deposit) + (deposit / 100 * interestDeposit)) {
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println("");
           /*

         Задача 5
Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
а только каждый шестой. Должны быть видны накопления за 6-й, 12-й, 18-й, 24-й и следующие месяцы.
            */
        fnlCapital = 12_000_000;
        firstDeposit = 15000;
        interestDeposit = 7;
        mounth = 0;
        deposit = 0;
        System.out.println("задача № 5");
        for (; deposit <= fnlCapital; mounth++) {
            deposit = firstDeposit + (deposit) + (deposit / 100 * interestDeposit);
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
        System.out.println();
        System.out.println("Задача № 6");
        /*
        Задача 6
Василий решил, что будет копить деньги ближайшие 9 лет. Он хочет знать, какой будет сумма его
накоплений каждые полгода на протяжении этих 9 лет.
Исходная сумма всё та же — 15 тысяч рублей, проценты банка — 7% ежемесячно.
Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.
         */

        firstDeposit = 15000;
        interestDeposit = 7;
        deposit = 0;
        int year = 9;
        int generalMounth = year * 12;

        for (a = 0; a <= generalMounth; a++) {
            deposit = firstDeposit + (deposit) + (deposit / 100 * interestDeposit);
            if (a % 6 == 0) {
                System.out.println("Месяц " + a + ", сумма накоплений равна " + deposit + " рублей");

            }
        }
        /*
        Задача 7
В компании пятница — отчетный день.
Нужно написать программу, которая считает дни месяца по датам, определяет, какой день — пятница, и выводит сообщение
 с напоминанием, что нужно подготовить еженедельный отчет.
Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида: «Сегодня пятница, ...-е число. Необходимо подготовить отчет».
В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений с напоминаниями по разным датам.
         */
        System.out.println();
        System.out.println("Задача № 7");
        // int friday = 6;
        int endMonth = 31;
        for (int b = 1, friday = 6; b < 31; b = b + 1) {
            if (b % friday == 0) {
                System.out.println("Сегодня пятница," + b + "-е число. Необходимо подготовить отчет».");

            }
        }
        /*
        Задача 8
Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.
Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления(ближайшие 100 лет).
Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего
(из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
В результате решения задачи в консоли должен получиться следующий результат:
1896
1975
2054

         */




