public class ContaPoupança extends Conta{

    public ContaPoupança(String numeroConta, Cliente cliente) {
        super(numeroConta, cliente);
    }

    public void renderJuros(double taxa){
        this.creditar(this.getSaldo()*taxa);
    }

}
