package prova;

public class BombaEtanol extends Bomba {
	private String fonte;

	public BombaEtanol(double quantidade, double preco, String fonte) {
		super(quantidade, preco);
		setFonte(fonte);
	}

	public BombaEtanol() {

	}

	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		if ((fonte == "Cana-de-Açucar") || (fonte == "Milho")) {
		}
		this.fonte = fonte;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaEtanol [fonte=");
		builder.append(fonte);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
