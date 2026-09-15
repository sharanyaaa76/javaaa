
public class AverageSalary {
    public static void main(String[] args) {
        int[] salary = {4000, 3000, 1000, 2000};

        int min = salary[0];
        int max = salary[0];
        int sum = 0;

        for (int i = 0; i < salary.length; i++) {
            sum = sum + salary[i];

            if (salary[i] < min) {
                min = salary[i];
            }

            if (salary[i] > max) {
                max = salary[i];
            }
        }

        double average = (double) (sum - min - max)
                         / (salary.length - 2);

        System.out.println("Average Salary: " + average);
    }
}
