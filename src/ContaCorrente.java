public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(int numAgencia, int numConta, double saldo) {
        super(numAgencia, numConta, saldo);
    }
    
    public double getChequeEspecial() {
        return chequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        return super.sacar(valor);
    }
    
    }
