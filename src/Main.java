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

    }
}