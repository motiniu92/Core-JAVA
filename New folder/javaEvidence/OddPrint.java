package javaEvidence;

public class OddPrint {

    public static void main(String args[]) {
        System.out.println("The Odd Numbers are:");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.println(" Sum "+sum);
    }

}