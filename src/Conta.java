
public class Conta {
	private int numAgencia;
	private int numConta;
	private double saldo;
	private double transferencia;
	private Cliente cliente;
	
	public Conta (int numAgencia, int numConta, double saldo, double transferencia){
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.saldo = saldo;
		this.transferencia = transferencia;
			
	}

	public int getNumAgencia() {
		return numAgencia;
	}
	public double getTransferencia() {
		return transferencia;
	}


	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
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


