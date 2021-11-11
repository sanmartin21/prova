package prova;

public class BombaMain {

	public static void main(String[] args) {

		// Bomba
		Bomba b = new Bomba(100, 6);
		System.out.println(b.abastecerPorLitro(50));
		System.out.println(b.abastecerPorValor(6));
		System.out.println(b);

		// Bomba Etanol

		BombaEtanol e = new BombaEtanol(100, 55, "Milho");
		e.abastecerPorLitro(50);
		e.abastecerPorValor(110);
		System.out.println(e);

		// Bomba Gasolina

		BombaGasolina g = new BombaGasolina(100, 55, "Normal");
		System.out.println(g.abastecerPorLitro(50));
		System.out.println(g.abastecerPorValor(110));
		System.out.println(g);

		// Bomba Diesel

		BombaDiesel d = new BombaDiesel(100, 55, "S10");
		System.out.println(d.abastecerPorLitro(50));
		System.out.println(d.abastecerPorValor(100));
		System.out.println(d);
		//

	}

}
