package main;

import java.util.Scanner;

public class _11_Phytagorean {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Befogók bekérése / Request clamps
        System.out.println("Derékszögű háromszög átfogójának számítása Pitagorasz-tétellel.");
        System.out.print("Add meg az első befogót (a) cm-ben!\na = ");
        double a = scanner.nextDouble();

        System.out.print("Add meg a második befogót (b) cm-ben!\nb = ");
        double b = scanner.nextDouble();

        //Átfogó számítása / Comprehensive calculation
        double c = calculateHypotenuse(a, b);

        //Eredmény kiírása / Result announcement
        System.out.printf("A háromszög átfogója %.2f cm.%n", c);

        scanner.close();
    }

    //Átfogó számítása Pitagorasz-tétellel / Comprehensive calculation using Pythagoras' theorem
    public static double calculateHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }
}

/**
 * Write JUnit tests for the methods of the provided Java class in a test class. The IDE project and program name
 * should be _10_CalculatorTest.
 */
