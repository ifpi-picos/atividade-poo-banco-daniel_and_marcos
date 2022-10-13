public class ContaPoupaca extends Conta{
    private int Rendimento;

    public int getDiaRendimento() {
        return Rendimento;
    }

    public void setDiaRendimento(int Rendimento) {
        this.Rendimento = Rendimento;
    }
    public double taxa(double valor){
		taxa= 5/100 * valor;
		return taxa;
	}
    
    }


    

