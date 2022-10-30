import java.util.Arrays;
import java.util.List;
 
class Main
{
    private static double getAverage(List<Integer> list) {
        long sum = 0;
        for (int i: list) {
            sum += i;
        }
        return list.size() > 0 ? (double) sum / list.size() : 0;
    }
 
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
 
        double avg = getAverage(list);
        System.out.println(avg);
    }
}
