package Es1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    private static Logger log = LoggerFactory.getLogger(Array.class);

    public static void main(String[] args) throws NumberFormatException {
        int[] arr = new int[5];
        Random rdm = new Random();
        String selection;
        int position;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rdm.nextInt(10) + 1;
            log.info(String.valueOf(arr[i]));
        }

        do {
            System.out.println("Select array position 1 - 5");
            selection = input.nextLine();
            try {
                position = Integer.parseInt(selection) - 1;
                if (position >= 0) System.out.println(arr[position]);
                System.out.println("Inserisci un valore da inserire in questa posizione");
                int value = Integer.parseInt(input.nextLine());
                arr[position] = value;
                if (value == 0) break;
                System.out.println(Arrays.toString(arr));
            } catch (NumberFormatException ex) {
                   log.error("non hai inserito un valore numerico!");
            } catch (ArrayIndexOutOfBoundsException ex){
                log.error("Hai insertio un valore fuori range!");
            }
        } while (!selection.equals("0"));
        input.close();
    }
}