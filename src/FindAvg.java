public class FindAvg {
    public static void main(String[] args) {

        {
            int a = 10;
            int b = 60;
            int c = 90;
            int sum = a + b + c;
            int avg = sum / 3;


            System.out.println("average: " + avg);
        }

        // Measuring time for the loop-based sum
        {
            long startTime = System.nanoTime(); // Start time

            int n = 5;
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            long endTime = System.nanoTime(); // End time
            long duration = endTime - startTime; // Calculate duration

            System.out.println("Sum (using loop): " + sum);
            System.out.println("Time taken (using loop): " + duration + " nanoseconds");
        }

        // Measuring time for the formula-based sum
        {
            long startTime = System.nanoTime(); // Start time

            int n = 5;
            int sum = n * (n + 1) / 2; // Using the formula

            long endTime = System.nanoTime(); // End time
            long duration = endTime - startTime; // Calculate duration

            System.out.println("Sum (using formula): " + sum);
            System.out.println("Time taken (using formula): " + duration + " nanoseconds");
        }
    }
}
