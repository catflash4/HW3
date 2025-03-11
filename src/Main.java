public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte valueFirst = -16;
        short valueSecond = 100;
        int valueThird = 246;
        long valueFourth = 2000L;
        float valueFifth = 3.67f;
        double valueSixth = 63.78944672;
        System.out.println("Значение пременной valueFirst с типом byte равно " + valueFirst);
        System.out.println("Значение пременной valueSecond с типом short равно " + valueSecond);
        System.out.println("Значение пременной valueThird с типом int равно " + valueThird);
        System.out.println("Значение пременной valueFourth с типом long равно " + valueFourth);
        System.out.println("Значение пременной valueFifth с типом float равно " + valueFifth);
        System.out.println("Значение пременной valueSixth с типом double равно " + valueSixth);

        //Задача 2
        float valueSeventh = 27.12f;
        long valueEight = 987678965549L;
        double valueNinth = 2.786;
        short valueTenth = 569;
        short valueEleventh = -159;
        int valueTwelfth = 27897;
        byte valueThirteenth = 67;

        //Задача 3
        byte classOfLudmilaP = 23;
        byte classOfAnnaS = 27;
        byte classOfEkaterinaA = 30;
        int sumOfAllClasses = classOfAnnaS + classOfEkaterinaA + classOfLudmilaP;
        short listsQuantity = 480;
        int listsPerStudent = listsQuantity / sumOfAllClasses;
        System.out.println("На каждого ученика рассчитано " + listsPerStudent + " листов бумаги.");

        //Задача 4
        byte bottleInTwoMin = 16;
        int bottlePerMin = bottleInTwoMin / 2;
        int bottleInTwentyMin = bottlePerMin * 20;
        int bottleInDay = bottlePerMin * (24 * 60);
        int bottleInThreeDays = bottlePerMin * ((24 * 3) * 60);
        long bottleInMonth = bottlePerMin * ((24 * 30) * 60);
        System.out.println("За 20 минут машина произвела " + bottleInTwentyMin + " штук бутылок");
        System.out.println("За день машина произвела " + bottleInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleInThreeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottleInMonth + " штук бутылок");

        //Задача 5
        byte whiteCanPerClass = 2;
        byte brownCanPerClass = 4;
        int reqCanQuan = 120;
        int quanOfClasses = reqCanQuan/(brownCanPerClass + whiteCanPerClass);
        int brBought = brownCanPerClass * quanOfClasses;
        int whBought = whiteCanPerClass * quanOfClasses;
        System.out.println("В школе, где " + quanOfClasses + ", нужно " + whBought + " банок белой краски и " + brBought + " банок коричней краски.");

        //Задача 6

        int bananaGr = 5 * 80;
        int milkGr = 2 * 105;
        int iceCreamGr = 2 * 100;
        int eggGr = 4 * 70;
        int weightGr = bananaGr + milkGr + iceCreamGr + eggGr;
        int grPerKg = 1000;
        float weightKg = grPerKg/(float)weightGr;
        System.out.println("Вес спортзавтрака в граммах " + weightGr + " и в килограммах " + weightKg);

        //Задача 7
        byte reqLoseWeightKg = 7;
        int kgInGr = 1000;
        int loseWeightGr = reqLoseWeightKg*kgInGr;
        int losePlanFirst = 250;
        int losePlanSec = 500;
        int losePerDayFr = loseWeightGr/losePlanFirst;
        int losePerDaySec = loseWeightGr/losePlanSec;
        float average = loseWeightGr/(((float)losePlanFirst + (float)losePlanSec) / 2) ;
        System.out.println("Чтобы похудеть на 7 кг через 250 грамм в день нужно " + losePerDayFr + " а чтобы через 500 грамм надо " + losePerDaySec + ". А в среднем может понадобиться " + (int)average + " дней.");

        //Задача 8
        int oldSalaryMasha = 67760;
        int oldSalaryDenis = 83690;
        int oldSalaryKris = 76230;
        int oldRevenueM = oldSalaryMasha*12;
        int oldRevenueD = oldSalaryDenis*12;
        int oldRevenueK = oldSalaryKris*12;
        double newSalaryM = oldSalaryMasha+oldSalaryMasha*0.1;
        double newSalaryD = oldSalaryDenis+oldSalaryDenis*0.1;
        double newSalaryK = oldSalaryKris+oldSalaryKris*0.1;
        double newRevenueM = newSalaryM*12;
        double newRevenueD = newSalaryD*12;
        double newRevenueK = newSalaryK*12;
        double revenueDiffM = newRevenueM-oldRevenueM;
        double revenueDiffD = newRevenueD-oldRevenueD;
        double revenueDiffK = newRevenueK-oldRevenueK;
        System.out.println("Маша теперь получает " + (int)newSalaryM + " рублей. Годовой доход вырос на " + (int)revenueDiffM + " рублей.");
        System.out.println("Денис теперь получает " + (int)newSalaryD + " рублей. Годовой доход вырос на " + (int)revenueDiffD + " рублей.");
        System.out.println("Кристина теперь получает " + (int)newSalaryK + " рублей. Годовой доход вырос на " + (int)revenueDiffK + " рублей.");

    }
}