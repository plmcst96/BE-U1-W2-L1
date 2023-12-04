package Es3;

import exception.BancaException;

public class ContoCorrenteOnline extends ContoCorrente{
    double maxPrelievo;

    public ContoCorrenteOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo(){
        System.out.println("Titolare: " + titolare + "- Saldo: " + saldo + "- Num movimenti: " + nMovimenti + "- Max movimenti: " + maxMovimenti + "- Massimo prelievo possibile: " + maxPrelievo);
    }

    public void preleva(double x) throws BancaException {
        if (x <= maxPrelievo){
            super.preleva(x);
        } else {
            throw  new BancaException("Il prelievo non è disponibile");
        }
    }
}
