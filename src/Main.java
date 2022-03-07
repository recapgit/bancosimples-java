public class Main {
    public static void main(String[] args) {
        RepositorioContas repo = new RepositorioContas(5);

        Cliente cliente1 = new Cliente("João", 22, "M");
        Cliente cliente2 = new Cliente("Ana", 18, "F");
        Cliente cliente3 = new Cliente("Maria", 39, "F");
        Cliente cliente4 = new Cliente("Severino", 58, "M");

        ContaCorrente contaC1 = new ContaCorrente("1234-5", cliente1);
        ContaCorrente contaC2 = new ContaCorrente("3521-4", cliente2);
        ContaPoupança contaC3 = new ContaPoupança("1415-0", cliente3);
        ContaPoupança contaC4 = new ContaPoupança("9544-2", cliente4);

        repo.addConta(contaC1);
        repo.addConta(contaC2);
        repo.addConta(contaC3);
        repo.addConta(contaC4);

        System.out.println(repo);
        contaC1.creditar(500);
        contaC2.creditar(2500);
        System.out.println(repo);
        contaC2.transferir(500, contaC1);
        contaC1.debitar(100);
        System.out.println(repo);
        contaC3.creditar(1000);
        contaC3.renderJuros(0.025);

        System.out.println(repo);
        repo.removerConta("9544-2");
        System.out.println(repo);

    }
}
