import java.util.Date;
public class Cliente {
	private String nome;
	private int cpf;
	private Date dataNasc;
	private String endereco;
	private Conta conta;
	
	public Cliente (String nome,Date dataNasc,int cpf,String endereco){
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.endereco = endereco;
        
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public String getEndereco() {
		return endereco;
	}

	public Conta getConta() {
		return conta;
	}


}
