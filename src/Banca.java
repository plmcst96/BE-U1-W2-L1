import Es3.ContoCorrente;
import Es3.ContoCorrenteOnline;
import exception.BancaException;

public class Banca {
    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 200000.0);
        System.out.println("Saldo conto: " + conto1.restituisciSaldo());

        try {
            conto1.preleva(1750.0);
            System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e);
            e.printStackTrace();
        }

        ContoCorrenteOnline conto2 = new ContoCorrenteOnline("Rossi Luigi", 50350.0, 1500);

        conto2.stampaSaldo();
        try {
            conto2.preleva(2000);
            conto2.stampaSaldo();
        } catch (BancaException e){
            System.out.println("Errore durante il prelievo: " + e);
            e.printStackTrace();
        }
    }
}
