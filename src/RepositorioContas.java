import java.util.ArrayList;

public class RepositorioContas {

    private ArrayList<Conta> contas;

    public RepositorioContas(int initCapacidade) {
        this.contas = new ArrayList<>(initCapacidade);
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public boolean addConta(Conta conta){
        boolean result = false;
        if (conta!=null){
            String numConta = conta.getNumeroConta();
            boolean contaRepetida = false;
            for (Conta interno:
                 contas) {
                if (interno.getNumeroConta().equals(numConta)){
                    contaRepetida=true;
                }
            }
            if (!contaRepetida){
                this.contas.add(conta);
                result = true;
            }
        }
        return result;
    }

    public boolean removerConta(String numeroDaConta){
        boolean numeroExiste = false;
        int i, indiceDaConta = 0;
        for (i=0;i<this.contas.size() && !numeroExiste; i++){
            Conta c = this.contas.get(i);
            if (c.getNumeroConta().equals(numeroDaConta)) {
                indiceDaConta = i;
                numeroExiste = true;
            }
        }
        if (numeroExiste){
            this.contas.remove(indiceDaConta);
        }
        return numeroExiste;
    }

    public String toString() {
        String string = "";
        for (Conta conta : this.contas) {
            string = string + "NOME: "
                    + conta.getCliente().getNome()
                    + " | IDADE: "
                    + conta.getCliente().getIdade()
                    + " | SEXO: "
                    + conta.getCliente().getSexo()
                    + " | NUMERO: "
                    + conta.getNumeroConta()
                    + " |  SALDO: "
                    + conta.getSaldo() + "\n";

        }
        return string;
    }
}
