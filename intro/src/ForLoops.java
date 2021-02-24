public class ForLoops {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 510, 12312, 2, 3, 4, 56, 56};
        System.out.println(forMax(numbers));
    }
    public static int sum(int[] a){
        // Uses a basic for loop to sum a.
        int sum = 0;
        for(int i = 0, n = a.length; i < n; i++){
            sum += a[i];
        }
        return sum;
    }
    public static int forMax(int[] m) {
        // Gets a max in a an array of positive integers
        int max = 0;
        for (int i = 0, n = m.length; i < n; i++){
            if (max < m[i]) {
                max = m[i];
            }
        }
        return max;

    }
}
