package Com.coderbd;

/**
 *
 * @author User
 */
public class ImmutableStrings {

    public static void main(String[] args) {
        int y = 20;
        String x = "10";

        String z = x + y;
        System.out.println(z);

        String s1 = "Welcome to java";
        String s2 = new String("Welcome to java");
        String s3 = "Welcome t java";

        System.out.println("s1 == s2 is " + (s1 == s2));
        System.out.println("s1 == s3 is " + (s1 == s3));
    }
}
