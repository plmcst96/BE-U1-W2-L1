package Es2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Fuel {
    private static Logger log = LoggerFactory.getLogger(Fuel.class);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        try {
            System.out.println("Inserisci il numero di kilometri percorsi: ");
            double km = input.nextDouble();

            System.out.println("Inserisci i litri di carburante consumati: ");
            double litri = input.nextDouble();

            double kmLitro = calculateKmLitro(km, litri);

            log.info("Il consumo medio è di " + kmLitro + "Km/litro");
        } catch (ArithmeticException ex){
            log.error("Assicurati di inserire un numero diverso da 0 per i litri consumati. " + ex.getMessage());
        } finally {
            input.close();
        }

    }

    private static double calculateKmLitro(double km, double litro){
        if (litro == 0){
            throw new ArithmeticException("Non puoi dividere per zero");
        }
        return km / litro;
    }

}
