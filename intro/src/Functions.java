public class Functions {
    public static int max(int x, int y){
        if (x < y) {
            return y;
        }
        return x;
    }
     public static void drawTriangle(int n) {
         for (int i = 0; i < n; i++) {
             for (int j = 0; j <= i; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
     }
    public static void main(String[] args) {

        drawTriangle(5);
    }
}
