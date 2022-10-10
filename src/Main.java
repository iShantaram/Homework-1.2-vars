public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("\nTask 1:");
        byte mark = 5;
        System.out.println("Значение переменной mark с типом byte равно " + mark);
        short pages = 250;
        System.out.println("Значение переменной pages с типом short равно " + pages);
        int sugarWeight = 1476;
        System.out.println("Значение переменной sugarWeight с типом int равно " + sugarWeight);
        long sugarCount = 2000L*sugarWeight;
        System.out.println("Значение переменной sugarCount с типом long равно " + sugarCount);
        float sugarPieceWeight = (float) (sugarWeight) / sugarCount;
        System.out.println("Значение переменной sugarPieceWeight с типом float равно " + sugarPieceWeight);
        double electronWeight = 9.109e-31;
        System.out.println("Значение переменной electronWeight с типом double равно " + electronWeight);

        // Task 2
        System.out.println("\nTask 2:");
        float numf = 27.12f;
        long numl = 987678965549L;
        double numd = 2.786;
        boolean ff = false;
        int pages1 = 569;
        int degreesF = -159;
        short cash = 27897;
        byte daysInYear = 67;

        /*System.out.println(numf + " ");
        System.out.println(numl + " ");
        System.out.println(numd + " ");
        System.out.println(ff + " ");
        System.out.println(pages1 + " ");
        System.out.println(degreesF + " ");
        System.out.println(cash + " ");
        System.out.println(daysInYear + " ");*/

        // Task 3
        System.out.println("\n Task3:");
        int studentsCountLP = 23;
        int studentsCountAS = 27;
        int studentsCountEA = 30;
        int papersForAll = 480;
        int papersForOne = papersForAll / (studentsCountLP + studentsCountEA + studentsCountLP);
        System.out.println("На каждого ученика рассчитано " + papersForOne + " листов бумаги!");

        // Task 4
        System.out.println("\n Task 4:");
        int bottlesInTwoMinutes = 16;
        int twoMinIn20Min = 20 / 2;
        int twoMinInDay = 60 * 24 / 2;
        int twoMinIn3Days = twoMinInDay * 3;
        int twoMinInMonth = twoMinIn3Days * 10;
        System.out.println("За 20 минут работы машина произвела бутылок " + bottlesInTwoMinutes * twoMinIn20Min + " штук!");
        System.out.println("За сутки работы машина произвела бутылок " + bottlesInTwoMinutes * twoMinInDay + " штук!");
        System.out.println("За 3 суток работы машина произвела бутылок " + bottlesInTwoMinutes * twoMinIn3Days + " штук!");
        System.out.println("За месяц (30 дней) работы машина произвела бутылок " + bottlesInTwoMinutes * twoMinInMonth + " штук!");

        // Task 5
        System.out.println("\n Task 5:");
        int paintBottles = 120;
        int bottlesForOneClassroom = 2 + 4;
        int classCount = paintBottles / bottlesForOneClassroom;
        int paintBottlesWhite = classCount * 2;
        int paintBottlesBrown = classCount * 4;
        System.out.println("В школе, где " + classCount + " классов, нужно " + paintBottlesWhite + " банок белой краски и "
                + paintBottlesBrown + " банок коричневой краски!");

        // Task 6
        System.out.println("\n Task 6:");
        int bananaWeight = 80;
        int bananaCount = 5;
        int milkWeight = 105;
        int milkCount = 2;
        int icecreamWeight = 100;
        int icecreamCount = 2;
        int eggWeight = 70;
        int eggCount = 4;
        int totalWeight = bananaWeight * bananaCount + milkWeight * milkCount +
                icecreamWeight * icecreamCount + eggWeight * eggCount;
        float totalWeightInKG = (float) totalWeight / 1000;
        System.out.println("Общий вес завтрака спортсмена в килограммах: " + totalWeightInKG);

        // Task 7
        System.out.println("\n Task 7:");
        int weightForCorrectInKG = 7;
        int minCorrectWeightInDay = 250;
        int maxCorrectWeightInDay = 500;

        int avgCorrectWeightInDay = (minCorrectWeightInDay + maxCorrectWeightInDay) / 2;
        int weightForCorrectInGram = weightForCorrectInKG * 1000;

        int minNeedDayToCorrect = weightForCorrectInGram / maxCorrectWeightInDay;
        int maxNeedDayToCorrect = weightForCorrectInGram / minCorrectWeightInDay;
        int avgNeedDayToCorrect = weightForCorrectInGram / avgCorrectWeightInDay;

        System.out.println("Минимальное количество дней для достижения требуемой весовой " +
                "категории - " + minNeedDayToCorrect + "дней");
        System.out.println("Максимальное количество дней для достижения требуемой весовой " +
                "категории - " + maxNeedDayToCorrect + "дней");
        System.out.println("Среднеее количество дней для достижения требуемой весовой " +
                "категории - " + avgNeedDayToCorrect + "дней");

        System.out.println("\n ~ ~ ~ ~ ~ The end ~ ~ ~ ~ ~ \n");
    }
}