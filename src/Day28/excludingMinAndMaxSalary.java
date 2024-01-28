package Day28;

import java.util.Arrays;

public class excludingMinAndMaxSalary {
    public static void main(String[] args) {
    int[] arr={4000,3000,1000,2000};
        System.out.println(average(arr));
    }
    public static double average(int[] salary) {
        if (salary == null || salary.length < 3) {
            return 0.0;
        }
        Arrays.sort(salary);
        int sum = 0;
        int count = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
            count++;
        }
        return (double) sum / count;

    }
}
