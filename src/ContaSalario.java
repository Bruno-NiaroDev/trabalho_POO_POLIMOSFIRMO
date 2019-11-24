public class ContaSalario extends Conta{
    @Override
    public String[] sacar(double valorParaDeposito){
        super.countSaque++;
        if (super.countSaque >= 1){
            super.taxa = 50.00;
        }
        return super.sacar(valorParaDeposito);
    }
}
