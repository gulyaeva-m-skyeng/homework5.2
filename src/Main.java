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
    }
}
