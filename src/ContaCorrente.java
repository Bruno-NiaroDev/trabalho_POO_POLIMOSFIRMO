public class ContaCorrente extends Conta {

    @Override
    public String[] sacar(double valorParaDeposito){

        super.countSaque++;
        if(super.countSaque == 1 || super.countSaque <= 5){
            super.taxa = 28.00;
        } else if (super.countSaque <= 10){
            super.taxa = 45.00;
        } else if (super.countSaque > 10){
            super.taxa = 60.00;
        }

        return super.sacar(valorParaDeposito);
    }
}

