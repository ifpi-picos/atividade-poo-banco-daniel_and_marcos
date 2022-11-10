
import java.text.SimpleDateFormat;

public class App {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
//		Cliente cl1 = new Cliente ("Daniel", sdf.parse("20/06/2000"), "0000000", "Rua Pedro Freitas de Oliveira");
//		Conta c = new Conta(6699, 667,new Email(), 500, cl1);
//		
//		
//		c.transferir(c, 100);
//		c.sacar(100);
//		Cliente cl2 = new Cliente(null, null, null, null);
//		Conta cc=new ContaCorrente(0, 0, 0, cl2, null);
//		cp.depositar(100);
//		cc.transferir(c, 100);
//		cc.transferir(c, 100);
		Cliente cl3 = new Cliente("Lucas", sdf.parse("30/06/2002"), "111111111", "dfhviuhsiv");
		Conta c1=new ContaPoupanca(8888, 9999, 700, cl3, new Sms());
		
		Cliente cl4 = new Cliente("Marcos", sdf.parse("15/05/2002"), "22222222", "shnfidsnnds");
		Conta c2=new ContaPoupanca(5555, 66666, 700, cl4, new Email());
		c1.transferir(c2, 100);
		

		 System.out.println("Dados da conta Poupança:\n "+"Nome: "+cl3.getNome()+";\n Endereco: "+cl3.getEndereco()
		 +";\n CPF: "+cl3.getCpf()+";\n Numero da conta: "+c1.getNumConta()+";\n Numero da agencia: "+c1.getNumAgencia()+";\n [Saldo da conta Poupança 1]: "+c1.getSaldo()+"");
		 System.out.println("----------------------");
		 System.out.println("Dados da conta Poupança:\n "+"Nome: "+cl4.getNome()+";\n Endereco: "+cl4.getEndereco()
		 +";\n CPF: "+cl3.getCpf()+";\n Numero da conta: "+c2.getNumConta()+";\n Numero da agencia: "+c2.getNumAgencia()+";\n [Saldo da conta Poupança 2]: "+c2.getSaldo()+"");
		
		// System.out.println("Nome do cliente: "+c1.getNome() +", Endereco: "+c1.getEndereco() +", CPF: "+c1.getCpf());
				 //System.out.println("Dados da conta "+"[Nome: "+c1.getNome()+"; Endereco: "+c1.getEndereco()
				 //+"; Numero da conta: "+c.getNumConta()+"; Numero da agencia: "+c.getNumAgencia()+"; Saldo: "+c.getSaldo()+"]");
	}
	
}
	

