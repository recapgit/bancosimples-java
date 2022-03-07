public abstract class Conta {

    protected String numeroConta;
    protected Cliente cliente;
    private double saldo = 0;

    public Conta(String numeroConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void transferir(double valor, Conta contaDestino){
        if (valor>0 && this.saldo >= valor){
            if (contaDestino!=null){
                this.saldo=-valor;
                contaDestino.creditar(valor);
            }
        }
    }


    public void debitar(double valor){
        if (valor>0)
            valor=-saldo;
    }


    public void creditar(double valor){
        if(valor>0)
            valor+= saldo;
    }


    public String getNumeroConta() {
        return numeroConta;
    }

    protected void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }
}



