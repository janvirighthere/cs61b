public class Conditionals {
    public static void main(String[] args) {
        int x = 5;
        if (x < 10){
            System.out.println("I shall increment x by 10");
            x += 10;
        }
        if (x < 10){
            System.out.println("I shall increment x by 10");
            x += 10;
        }
        System.out.println(x);

        int y = -5;
        if (y < 0) {
            System.out.println("I shall negate X");
             y -= y;
        }
        System.out.println(y);
        int dogSize = 20;
        if (dogSize >= 50){
            System.out.println("woof");

        } else if (dogSize >= 20) {
            System.out.println("bark");
        } else {
            System.out.println("yip");
        }
    }
}
