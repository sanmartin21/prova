package prova;

public class Bomba {
	private double quantidade;
	private double preco;
	private double litrosVendidos;

	public Bomba(double quantidade, double preco) {
		setQuantidade(quantidade);
		setPreco(preco);

	}

	public Bomba() {

	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		if (quantidade >= 0)
			this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco >= 0)
			this.preco = preco;
	}

	public double getLitrosVendidos() {
		return litrosVendidos;
	}

	public void setLitrosVendidos(double litrosVendidos) {
		this.litrosVendidos = litrosVendidos;
	}

	private double valorParaLitros(double valor) {
		return valor / preco;

	}

	public boolean abastecerPorLitro(double valor) {
		if (valor <= getQuantidade() && quantidade > 0) {
			setQuantidade(getQuantidade() - valor);
			setLitrosVendidos(getLitrosVendidos() + valor);
			return true;
		}
		return false;

	}

	public boolean abastecerPorValor(double valorEmReais) {
		double valorLitros = valorParaLitros(valorEmReais);
		return abastecerPorLitro(valorLitros);
	}

	public double faturamento() {
		return (getLitrosVendidos() * getPreco());

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [quantidade=");
		builder.append(quantidade);
		builder.append(", preco=");
		builder.append(preco);
		builder.append(", litrosVendidos=");
		builder.append(litrosVendidos);
		builder.append(", faturamento()=");
		builder.append(faturamento());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
