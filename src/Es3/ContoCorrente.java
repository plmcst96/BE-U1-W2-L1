package Es3;

import exception.BancaException;

public class ContoCorrente {
    private final int maxMovimenti = 50;
    private String titolare;
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

    }
}
