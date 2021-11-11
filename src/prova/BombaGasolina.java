package prova;

public class BombaGasolina extends Bomba{
	private String tipo;
	public BombaGasolina(double quantidade, double preco, String tipo) {
		super(quantidade,preco);
		setTipo(tipo);
}
	public BombaGasolina() {
		
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if ((tipo == "Normal") ||(tipo == "Aditivada")){
		this.tipo = tipo;
	}

}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaGasolina [tipo=");
		builder.append(tipo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
