package Loops_in_Java;

public class Hollow_triangle_Downward_angle {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n ; i++) {

            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*(n-i)+1 ; j++) {
                if(i==1||i==n||j==1||j==2*(n-i)+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
