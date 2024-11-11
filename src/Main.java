public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] expenses = new int[]{1, 2, 3, 4, 5};
        int totalExpenses = 0;

        for (int i = 0; i < expenses.length; i++) {
            totalExpenses += expenses[i];

        }

        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");

        //task 2
        System.out.println("task 2");

        int[] weeklyExpenses = new  int[]{1, 2, 3, 4, 5};
        int totalExpenses2 = 0;
        int minExpense = weeklyExpenses[0];
        int maxExpense = weeklyExpenses[0];

        for (int i = 0; i < weeklyExpenses.length; i++) {
            totalExpenses2 += weeklyExpenses[i];
            if (weeklyExpenses[i] < minExpense) {
                minExpense = weeklyExpenses[i];
            }
            if (weeklyExpenses[i] > maxExpense) {
                maxExpense = weeklyExpenses[i];
            }


        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей");

        //task 3
        System.out.println("task 3");

        int[] expenses3 = new int[]{1, 2, 3, 4, 7};
        int sum = 0;
        for (int i = 0; i < expenses3.length; i++) {
            sum += expenses3[i];

        }
        double average = (double) sum / expenses3.length;

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //task 4
        System.out.println("task 4");

        char[] reveseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reveseFullName.length; i > 0; i--) {
            System.out.print(reveseFullName[i -1]);

        }


    }

}