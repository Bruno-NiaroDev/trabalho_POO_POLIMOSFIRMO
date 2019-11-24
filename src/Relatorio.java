import java.util.ArrayList;

public class Relatorio {

    public ArrayList<Conta> listaTransacao = new ArrayList<>();

    public void adicionaConta (Conta conta){
        listaTransacao.add(conta);
    }

    public double taxaGeralRecolhido(){
        double totalTaxa = 0;
        for(int i = 0; i < listaTransacao.size(); i++){
            totalTaxa += listaTransacao.get(i).taxa;
        }
        return totalTaxa;
    }
}
