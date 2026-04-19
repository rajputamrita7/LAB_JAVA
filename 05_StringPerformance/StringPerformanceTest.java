// 2b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder
// for appending the string ‘AIET’ for 10000 times and justify which one is better.

public class StringPerformanceTest {
    public static void main(String[] args) {

        int n = 10000;

        // StringBuffer Performance
        StringBuffer sbf = new StringBuffer();
        long start1 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            sbf.append("AIET");
        }

        long end1 = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end1 - start1) + " ms");

        // StringBuilder Performance
        StringBuilder sbd = new StringBuilder();
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            sbd.append("AIET");
        }

        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end2 - start2) + " ms");

        // Conclusion
        if ((end2 - start2) < (end1 - start1)) {
            System.out.println("StringBuilder is faster than StringBuffer");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder");
        }
    }
}