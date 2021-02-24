public class WhileLoops {
    public static void main(String[] args) {
        int bottles = 90;
        int counter = 0;

        while (bottles > 0) {
            System.out.println(bottles + " bottles of beer on the wall!");
            System.out.println("Counter is " + counter);
            bottles -= 1;
            counter += 1;
        }

        int bottles2 = 5;
        counter = 9;
        while (bottles2 > 0) {
            bottles = -312;
            System.out.println(bottles + " bottles of beer on the wall!");
            System.out.println("Counter is " + counter);
            counter += 1;

        }

    }
}
