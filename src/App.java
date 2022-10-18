import java.util.Date;
import java.text.SimpleDateFormat;
public class App {
	
	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Cliente c1 = new Cliente ("Daniel", sdf.parse("20/06/2000"), "0000000", "Rua Pedro Freitas de Oliveira");
		Conta c = new Conta(6699, 667, 500);
		c.depositar(100);
		//realizarSaque(c,90);
		//realizarSaque(c,70);
		Conta co = new ContaCorrente(0, 0, 500);
		co.depositar(300);
		realizarSaque(co,10);
		
		
	
	
		
		// System.out.println("Nome do cliente: "+c1.getNome() +", Endereco: "+c1.getEndereco() +", CPF: "+c1.getCpf());
		 //System.out.println("Dados da conta "+"[Nome: "+c1.getNome()+"; Endereco: "+c1.getEndereco()
		 //+"; Numero da conta: "+c.getNumConta()+"; Numero da agencia: "+c.getNumAgencia()+"; Saldo: "+c.getSaldo()+"]");
		 System.out.println("Dados da conta:\n "+"Nome: "+c1.getNome()+";\n Endereco: "+c1.getEndereco()
		 +";\n Numero da conta: "+c.getNumConta()+";\n Numero da agencia: "+c.getNumAgencia()+";\n Saldo: "+co.getSaldo()+"");
		
		
	}
	
	private static void realizarSaque(Conta conta,double valor){
		if(conta.sacar(valor)){
			System.out.println("Saque de " +valor+" R$"+" efetuado com sucesso! Novo saldo = "+conta.getSaldo());
			
		}else{
			System.out.println("Saque insuficiente para saque de, "+ valor + ", saldo de = "+conta.getSaldo());
			
			
		}
		
	}
	



	}

	
	

