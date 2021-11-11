package prova;

public class BombaDiesel extends Bomba{
	private String tipo;
	public BombaDiesel(double quantidade, double preco, String tipo) {
		super(quantidade,preco);
		setTipo(tipo);
}
	public BombaDiesel() {
		
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if ((tipo == "S10") ||(tipo == "S50") ||(tipo == "S500") ||(tipo == "S1800")){
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