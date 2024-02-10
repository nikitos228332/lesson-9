public class Main {
    public static void main(String[] args) { //
        task1();
    }
    public static int [] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int [] arr = new int [30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
        public static void task1() {
            System.out.println("Задача 1");
            int [] arr = generateRandomArray();
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");

            System.out.println("Задача 2");

            int maxWaste = -1;
            int minWaste = 200_001;
            for (int i = 0; i < arr.length ; i++) {
                if (arr[i] > maxWaste) {
                    maxWaste = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < minWaste) {
                    minWaste = arr[i];
                }
            }
            System.out.println("Минимальная сумма трат за день составила " + minWaste + " рублей");
            System.out.println("Максимальная сумма трат за день составила " + maxWaste + " рублей");

            System.out.println("Задача 3");

            float maxWaste1 = maxWaste;
            float minWaste1 = minWaste;
            float averageSum = (maxWaste1 + minWaste1)/2f;
            System.out.println(averageSum);

            System.out.println("Задача 4");

            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
        }
    }



