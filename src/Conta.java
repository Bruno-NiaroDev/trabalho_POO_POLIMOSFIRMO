public class Conta {

    public String agencia;
    public String numeroConta;
    public String nomeTitular;
    public int countSaque = 0;
    protected double saldo;
    protected double taxa;

    public String[] depositar(double valorParaDeposito){
        String[] retorno;
        if(valorParaDeposito <= 0){
            retorno = new String[]{"false", "Valor de deposito inválido!"};
        } else {
            this.saldo += valorParaDeposito;
            retorno = new String[]{"true","Deposito realizado com sucesso!"};
        }
        return retorno;
    }

    public String[] sacar(double valorParaSacar){
        String[] retorno;
        if(valorParaSacar <= 0 || valorParaSacar > this.saldo){
            retorno = new String[]{"false", "Valor de saque inválido!"};
        } else {
            this.saldo -= valorParaSacar;

            retorno = new String[]{"true","Saque realizado com sucesso!"};
        }
        return retorno;
    }

    public double getSaldo(){
        return this.saldo;
    }


}
