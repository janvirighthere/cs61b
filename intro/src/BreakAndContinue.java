public class BreakAndContinue {
    public static void main(String[] args) {
        String[] a = {"cat", "dog", "laser horse", "horse", "horbse", "ketchup"};

        for (int i =0, n = a.length; i < n; i++) {
            if (a[i].contains("horse")) {
                continue;
            }
            for (int j = 0; j < 3; j++) {
                System.out.println(a[i]);
            }
        }

        System.out.println("**********************************");

        String[] b = {"cat", "dog", "laser horse", "horse", "horbse", "ketchup"};

        for (int i =0, n = b.length; i < n; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.println(b[i]);
                if (b[i].contains("horse")) {
                    break;
                }
            }
        }
    }
}
