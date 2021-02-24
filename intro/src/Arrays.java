public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 7;
        numbers[2] = 8;

        System.out.println(numbers[1]);

        int[] numbers2 = new int[]{1, 2, 34, 3, 10};
        System.out.println(numbers2[2]);
        System.out.println(max(numbers2));
    }
    public static int max(int[] m) {
        int n = 0;
        int counter = 0;
        while (m.length > counter) {
            if (m[counter] > n) {
                n = m[counter];
            }
            counter += 1;
        }
        return n;
    }
}
