public class DoublesAndStrings {
    public static void main(String[] args) {
        String a = "Achilles";
        String t = "Tortoise";
        double aPos, tPos, aSpeed, tSpeed, totalTime;
        aPos=0; tPos=100; aSpeed=20; tSpeed=10; totalTime=0;

        while(aPos < tPos) {
            System.out.println("At time: " + totalTime);
            System.out.println("  " + a + " is at position " + aPos);
            System.out.println("  " + t + " is at position " + tPos);

            double timeToReach = (tPos - aPos) / aSpeed;
            totalTime = totalTime + timeToReach;
            aPos = aPos + timeToReach * aSpeed;
            tPos = tPos + timeToReach * tSpeed;


        }

    }
}
