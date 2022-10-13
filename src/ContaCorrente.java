public class ContaCorrente extends Conta {
    private double chequeEspecial;
    

    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public double getSaldo() {
        return saldo;
    }
    public boolean sacar(double valor){
        if (valor<=saldo){
            saldo = saldo - valor;
            return true;
            
        }else{
            return false;
        }
    }
	public double depositar(double valor){
		saldo= saldo + valor;
		return saldo;
	}


    
    }
