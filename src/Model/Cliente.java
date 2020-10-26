package Model;

public class Cliente {
	protected String nome;
	protected String email;
	protected double linhaCredito;
	protected double valorFatura;
	
	
	
	
	
	public String exibirFatura() {
		return ("Nome >>> "+nome+"\n" +
				"E-mail >>> "+email+"\n" +
				"Sua Linha de Credito é de >>> R$ "+ linhaCredito+ "\n" +
				"Valor da Fatura >>> "+valorFatura);
		
	}
	
	public void pagarFatura(double valor) {
		this.valorFatura = valor - valorFatura;
	}
	
	public boolean comprar(double valor) {
		if (valorFatura + valor > linhaCredito) {
			return false;
		}
		else{
			this.valorFatura = valorFatura + valor;
			return true;
			
		}
	}
	
	public Cliente(String nome, String email, double linhaCredito) {
		super();
		this.nome = nome;
		this.email = email;
		this.linhaCredito = linhaCredito;
		this.valorFatura = 0.0;
		
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getLinhaCredito() {
		return linhaCredito;
	}
	public void setLinhaCredito(double linhaCredito) {
		this.linhaCredito = linhaCredito;
	}
	public double getValorFatura() {
		return valorFatura;
	}
	public void setValorFatura(double valorFatura) {
		this.valorFatura = valorFatura;
	}
	
	

}
