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
    }
}