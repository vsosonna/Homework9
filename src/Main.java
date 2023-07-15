public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int a : arr) {
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;}
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " +
                "Максимальная сумма трат за день составила " + max + " рублей.");
    }

 public static void task3() {
     int[] arr = generateRandomArray();
     int sum1 = 0;
     for (int i = 0; i < arr.length; ++i) {
         sum1 += arr[i];
     }
     System.out.println("Средняя сумма трат за месяц составила " +sum1+ " рублей");
 }
public static void task4() {
    char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    for (int a = reverseFullName.length - 1; a >= 0; a--) {
        System.out.print(reverseFullName[a]);
    }
}
}