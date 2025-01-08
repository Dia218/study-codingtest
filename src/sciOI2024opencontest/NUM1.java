package sciOI2024opencontest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NUM1 {
    static List<Integer> listA = new ArrayList<>();
    static int[] listAllRoom;
    static int roomCount;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        roomCount = Integer.parseInt(scanner.next());
        for (int i = 0; i < Integer.parseInt(scanner.next()); i++) {
            listA.add(Integer.parseInt(scanner.next()));
        }
        listAllRoom = new int[roomCount];
        for (int i = 0; i < roomCount; i++) {
            listAllRoom[i] = Integer.parseInt(scanner.next());
        }
        
        int turnedOffCount = 0;
        int unableToTurnOff = 0;
        
        for (int i = 0; i < roomCount; i++) {
            if (listAllRoom[i] == 0) {
                turnedOffCount++;
            }
            else {
                if (listA.contains(turnedOffCount)) {
                    turnedOffCount++;
                }
                else {
                    unableToTurnOff++;
                }
            }
        }
        System.out.println(unableToTurnOff);
        
        scanner.close();
    }
}
