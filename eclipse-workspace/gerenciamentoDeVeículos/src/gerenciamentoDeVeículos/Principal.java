package gerenciamentoDeVeículos;

public class Principal {

	public static void main(String[] args) {
		 carro meuCarro = new carro("ford","mustang gt",2021);
	        meuCarro.Acelerar(40);
	        meuCarro.Frear(5);
	        meuCarro.abastecer("Gasolina aditivada",50);
	        
			moto MinhaMoto =new moto("twister","cb 300f",2024);
			MinhaMoto.Acelerar(45);
			MinhaMoto.Frear(5);
			MinhaMoto.abastecer("Gasolina comum",20);

	}

}
