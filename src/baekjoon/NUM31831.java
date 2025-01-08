package baekjoon;

import java.util.Scanner;

public class NUM31831 {
    static int dayCount = 0;
    static int maxStress = 0;
    static int nowStress = 0;
    
    public static void main(String[] args) {
        int answer = 0;
        
        Scanner scanner = new Scanner(System.in);
        dayCount = scanner.nextInt();
        maxStress = scanner.nextInt();
        for (int i = 0; i < dayCount; i++) {
            changeStress(scanner.nextInt());
            if (nowStress >= maxStress) {
                answer++;
            }
        }
        
        System.out.println(answer);
        
        scanner.close();
    }
    
    static void changeStress(int amount) {
        if (amount < 0) {
            reduceStress(amount);
        }
        else {
            addStress(amount);
        }
    }
    
    static void reduceStress(int amount) {
        nowStress += amount;
        if (nowStress < 0) {
            nowStress = 0;
        }
    }
    
    static void addStress(int amount) {
        nowStress += amount;
    }
}
