public class HarmonicMean {
    public static void main(String[] args) {
        double[] arr = {1,2,3,4,5};
        double harmonicMean = 0;
        for (double i : arr) {
            harmonicMean += (1 / i);
        }

        System.out.println( (arr.length / harmonicMean));
    }
}
