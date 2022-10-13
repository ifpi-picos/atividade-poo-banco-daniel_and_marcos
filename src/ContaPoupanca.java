public class ContaPoupanca extends Conta{
    private int Rendimento;

    public int getRendimento() {
        return Rendimento;
    }

    public void setRendimento(int Rendimento) {
        this.Rendimento = Rendimento;
    }
    public double taxa(double valor){
		taxa= 5/100 * valor;
		return taxa;
	}
    
    }


    

