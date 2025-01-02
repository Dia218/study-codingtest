package baekjoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NUM30802 {
    static int participant = 0;
    static int[] shirtOrders = new int[6];
    static int shirtBundleSize = 0;
    static int penBundleSize = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        participant = Integer.parseInt(scanner.nextLine());
        shirtOrders = Arrays.stream(scanner.nextLine()
                                           .split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        shirtBundleSize = Integer.parseInt(scanner.next());
        penBundleSize = Integer.parseInt(scanner.next());
        
        System.out.println(calculateShirtBundle());
        System.out.println(Arrays.stream(calculatePen())
                                 .mapToObj(String::valueOf)
                                 .collect(Collectors.joining(" ")));
        
        scanner.close();
    }
    
    static int calculateShirtBundle() {
        int shirtBundle = 0;
        for (int shirtOrder : shirtOrders) {
            if (shirtOrder <= 0) {
                continue;
            }
            shirtBundle += shirtOrder / shirtBundleSize;
            if (shirtOrder % shirtBundleSize != 0) {
                shirtBundle++;
            }
        }
        return shirtBundle;
    }
    
    static int[] calculatePen() {
        int penBundle = 0;
        int eachPen = 0;
        
        penBundle = participant / penBundleSize;
        eachPen = participant % penBundleSize;
        
        return new int[]{penBundle, eachPen};
    }
}
