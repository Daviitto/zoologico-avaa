package gerenciamentoDeVeículos;

public class Veiculos {

	
	private String marca ;
	private String modelo;
	private int ano;
	private double velocidadeAtual;
	
	public Veiculos(String marca, String modelo,int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.velocidadeAtual = 0.0;
	}
	
	
	 public String getMarca() {
		 return marca;
	 }
	 
	 public String getModelo() {
		 return modelo;
	 }

	 public int getAno() {
		 return ano;
	 }
	 
	 public double  getvelocidadeAtual() {
		 return velocidadeAtual;
	 }
	 
	 
	 
	 public void setvelocidadeAtual(double velocidadeAtual) {
		 if (velocidadeAtual >= 0) {
			 this.velocidadeAtual = velocidadeAtual;
	 } else {
		 System.out.println("A velocidade não pode ser negativa.");
	 
	  }
	 } 
		 public void Acelerar (double incremento) {
			 
			 setvelocidadeAtual(velocidadeAtual + incremento);
			 System.out.println("Acelerando.Velocidade atual :" + velocidadeAtual +"km/h");
			 
		 }
		 
		 public void Frear (double decremento) {
			 setvelocidadeAtual(velocidadeAtual + decremento);
			 System.out.println("Freando. reduzindo velocidade :" + velocidadeAtual + "km/h");
		 }
		 
		 public void abastecer (String tipoCombustivel) {
			 	System.out.println("Abastecendo com :" + tipoCombustivel);
		 }
		 
		 public void abastecer (String tipoCombustivel, double litros) {
			 System.out.println("Abastecendo :" + litros + " litros de combustivel :" + tipoCombustivel);
		 }
		 
  }

      class carro extends Veiculos {
         public carro(String marca,String modelo,int ano) {
		
         super(marca,modelo,ano);
         }
         public void Acelerar(double incremento) {
        	 System.out.println("Acelerando o carro á:" + (incremento * 1.5) + "km/h.");
         }
}
         class moto extends Veiculos {
     public moto(String marca,String modelo,int ano) {
    	 super(marca,modelo,ano);
     }
     
     public void Acelerar(double incremento) {
    	 System.out.println("Acelerando a moto á:" + incremento + "km/h.");
     }
     
        }
	 	
        
        
