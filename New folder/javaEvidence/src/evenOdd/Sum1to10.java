package javaEvidence;

public class Sum1to10 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(i);
        }
        System.out.println(sum);
    }
}