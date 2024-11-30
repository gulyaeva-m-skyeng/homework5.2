import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // task1
        System.out.println("Task 1");
        int[] expenses = new int[]{10, 25, 36, 47, 55};
        int totalExpenses = 0;

        for (int i = 0; i < expenses.length; i++) {
            totalExpenses += expenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");

// task2
        System.out.println("Task 2");
        int[] expenses1 = new int[]{10, 25, 36, 47, 55};
        int totalExpenses1 = 0;
        int minExpense1 = expenses1[0];
        int maxExpense1 = expenses1[0];

        for (int i = 0; i < expenses1.length; i++) {
            totalExpenses1 += expenses1[i];
            if (expenses1[i] < minExpense1) {
                minExpense1 = expenses1[i];
            }
            if (expenses1[i] > maxExpense1) {
                maxExpense1 = expenses1[i];
            }
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses1 + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + minExpense1 + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maxExpense1 + " рублей.");

        // task3
        System.out.println("Task 3");
        int[] expenses2 = new int[]{10, 25, 36, 47, 55};
        int sum = 0;
        for (int i = 0; i < expenses2.length; i++) {
            sum += expenses2[i];
        }
        double average = (double) sum / expenses2.length;
        System.out.println(" Средняя сумма трат за месяц составила " + average + " рублей");

        // task4
        System.out.println("Task 4");
        char[] reverseFullNane = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullNane.length; i > 0; i--) {
            System.out.print(reverseFullNane[i - 1]);
        }
    }
}