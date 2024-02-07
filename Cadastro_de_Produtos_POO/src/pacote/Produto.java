package pacote;

public class Produto {
	
	private String marca;
	private String modelo;
	private double preco;
	
	
//	construtor
	public Produto  (String marca, String modedlo, double preco) {
		this.marca = marca;
		this.modelo = modedlo;
		this.preco = preco;
	}
	
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
