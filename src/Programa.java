import java.util.Arrays;

public class Programa {
    public static void main(String[] args){

        System.out.println("-------------------- CONTA CORRENTE --------------------");
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.agencia = "666";
        contaCorrente.numeroConta = "666-666";
        contaCorrente.nomeTitular = "MISTER SATAN";

        String[] deposito = contaCorrente.depositar(100.50);
        System.out.println(deposito[1]);
        String[] saque = contaCorrente.sacar(25.25);
        System.out.println(saque[1]);

        System.out.println("TITULAR: "
                + contaCorrente.nomeTitular
                + "\nAGENCIA: "
                + contaCorrente.agencia
                + "\nNUMERO DA CONTA: "
                + contaCorrente.numeroConta
                + "\nSALDO TOTAL: "
                + contaCorrente.getSaldo()
                + "\nTAXA: "
                + contaCorrente.taxa);

        System.out.println("-------------------- CONTA POUPANÇA --------------------");
        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.agencia = "555";
        contaPoupanca.numeroConta = "555-555";
        contaPoupanca.nomeTitular = "MISTER GOD";

        String[] depositoPoupanca = contaPoupanca.depositar(999.50);
        System.out.println(depositoPoupanca[1]);
        String[] saquePoupanca = contaPoupanca.sacar(100.00);
        System.out.println(saquePoupanca[1]);

        System.out.println("TITULAR: "
                + contaPoupanca.nomeTitular
                + "\nAGENCIA: "
                + contaPoupanca.agencia
                + "\nNUMERO DA CONTA: "
                + contaPoupanca.numeroConta
                + "\nSALDO TOTAL: "
                + contaPoupanca.getSaldo()
                + "\nTAXA: "
                + contaPoupanca.taxa);

        System.out.println("-------------------- CONTA SALÁRIO ---------------------");
        Conta contaSalario = new ContaSalario();
        contaSalario.agencia = "123";
        contaSalario.numeroConta = "123-123";
        contaSalario.nomeTitular = "MISTER WORK";

        String[] depositoSalario = contaSalario.depositar(800.50);
        System.out.println(depositoSalario[1]);
        String[] saqueSalario = contaSalario.sacar(13.00);
        System.out.println(saqueSalario[1]);

        System.out.println("TITULAR: "
                + contaSalario.nomeTitular
                + "\nAGENCIA: "
                + contaSalario.agencia
                + "\nNUMERO DA CONTA: "
                + contaSalario.numeroConta
                + "\nSALDO TOTAL: "
                + contaSalario.getSaldo()
                + "\nTAXA: "
                + contaSalario.taxa);

        System.out.println("-------------------- RELATORIO -------------------------");
        Relatorio relatorio = new Relatorio();
        relatorio.adicionaConta(contaCorrente);
        relatorio.adicionaConta(contaPoupanca);
        relatorio.adicionaConta(contaSalario);
        System.out.println("Total de taxa recolhida pelo banco é: " + relatorio.taxaGeralRecolhido());
        System.out.println("--------------------------------------------------------");
        System.out.println("----------- PROGRAMA DESENVOLVIDO POR BRUNINHO DA FZ25 -----------");
    }

}
