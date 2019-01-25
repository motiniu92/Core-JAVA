package recurtion;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of disks : ");
        int n = input.nextInt();
        System.out.println("The moves are : ");
        movesDisks(n, 'A', 'B', 'C');
    }

    public static void movesDisks(int n, char fromTower, char toTower, char auxTower) {
        if (n == 1) {
            System.out.println("Move disk " + n + "from" + fromTower + " to " + toTower);
        } else {
            movesDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk" + n + "from" + fromTower + "to" + toTower);
            movesDisks(n - 1, auxTower, toTower, fromTower);
        }
    }
}
