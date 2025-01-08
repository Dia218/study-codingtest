package baekjoon;

import java.util.Scanner;

public class NUM2455 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passengers = 0;
        int maxPassengers = 0;
        
        for (int i = 0; i < 4; i++) {
            passengers += -scanner.nextInt() + scanner.nextInt();
            if (passengers > maxPassengers) {
                maxPassengers = passengers;
            }
        }
        System.out.println(maxPassengers);
        
        scanner.close();
    }
}
