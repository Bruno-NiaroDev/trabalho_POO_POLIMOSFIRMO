public class ContaPoupanca extends Conta{
    @Override
    public String[] sacar(double valorParaDeposito){

        super.countSaque++;
        if(super.countSaque == 1 || super.countSaque <= 3){
            super.taxa = 12.00;
        } else if (super.countSaque > 3){
            super.taxa = 20.00;
        }

        return super.sacar(valorParaDeposito);
    }
}
