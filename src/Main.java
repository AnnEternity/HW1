public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {

    // Задание 1
    byte cherry = 18;
    short strawberry = 22;
    int blueberry = 50;
    long wildBerry = 150L;
    float melon = (float) 1.8;
    double apple = 12.3;
    boolean overSum = cherry >= 50;
    char star = 42;
    char a = '?';
    }

    public static void task2() {

     // Задание 2
    var oneBoxer = 78.2;
    var secondBoxer = 82.7;
    var commonWeight = oneBoxer + secondBoxer;
    var differentWeight = secondBoxer - oneBoxer;
     System.out.println("Общий вес боксеров " + commonWeight + " кг");
     System.out.println("Разница между весами боксеров " + differentWeight + " кг");
 }
   public static void task3() {
       // Задание 3
       var banana = 5;
       var milk = 2;
       var iceCream = 2;
       var egg = 4;
       var bananaOneWeight = 80;
       var milkWeight = 105;
       var iceCreamWeight = 100;
       var eggWeight = 70;
       var wholeWeight = banana * bananaOneWeight + milk * milkWeight + iceCream * iceCreamWeight +
               egg * eggWeight;
       int grPerKg = 1000;
       float weightKg = wholeWeight / (float) grPerKg;
       System.out.println("Вес спорт-завтрака: " + weightKg + " кг");
   }

   public static void task4() {
       // Задание 4
       int weightKilogramm = 7;
       int everyDayLoseWeight = 250;
       int everyDayLoseMoreWeight = 500;
       int methodLoseWeight = 2;
       int inGr = 1000;

       int weight = weightKilogramm * inGr;
       int quantityDay = weight / everyDayLoseWeight;
       int quantityDayLoseMoreWeight = weight / everyDayLoseMoreWeight;
       int quantityDayAverage = (quantityDay + quantityDayLoseMoreWeight) / methodLoseWeight;
       System.out.println("Количество дней для похудения при снижении веса на 250 гр. в день: " + quantityDay);
       System.out.println("Количество дней для похудения при снижении веса на 500 гр. каждый день : " + quantityDayLoseMoreWeight);
       System.out.println("Среднее количество дней для похудения " + quantityDayAverage);
   }

   public static void task5() {
    // Задание 5
        int  salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKris = 76230;
        double increaseSalaryPercent = 0.1;
        int year = 12;

        int newSalaryMasha = (int) (salaryMasha * increaseSalaryPercent + salaryMasha);
        int yearMashaBefore = salaryMasha * year;
        int yearMashaAfter = newSalaryMasha * year;
        int differentSalaryMasha = yearMashaAfter - yearMashaBefore;

        int newSalaryDenis = (int) (salaryDenis * increaseSalaryPercent + salaryDenis);
        int yearDenisBefore = salaryDenis * year;
        int yearDenisAfter = newSalaryDenis * year;
        int differentSalaryDenis = yearDenisAfter - yearDenisBefore;

        int newSalaryKris = (int) (salaryKris * increaseSalaryPercent + salaryKris);
        int yearKrisBefore = salaryKris * year;
        int yearKrisAfter = newSalaryKris * year;
        int differentSalaryKris = yearKrisAfter - yearKrisBefore;

        System.out.println( "Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differentSalaryMasha + " рублей.");
        System.out.println( "Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differentSalaryDenis + " рублей.");
        System.out.println( "Кристина теперь получает " + newSalaryKris + " рублей. Годовой доход вырос на " + differentSalaryKris + " рублей.");


}}