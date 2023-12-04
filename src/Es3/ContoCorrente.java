package Es3;

import exception.BancaException;

public class ContoCorrente {
     final int maxMovimenti = 50;
     String titolare;
    int nMovimenti;
    double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.nMovimenti = 0;
        this.saldo = saldo;
    }

    public void preleva(double money) throws BancaException{
        if (nMovimenti < maxMovimenti)
            saldo = saldo - money;
        else saldo = saldo - money - 0.50;
        nMovimenti++;
        if (saldo < 0) throw new BancaException("il conto è in rosso");
    }

    public  double restituisciSaldo(){
        return saldo;
    }

}
