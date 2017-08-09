package carros;

	public class testaCarro {

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        
	        Carro carro1 = new Carro();
	        carro1.setCor("Vermelho");
	        carro1.setModelo("Corsa");
	        carro1.setVelocidadeAtual(0);
	        carro1.setVelocidadeMaxima(80);
	        carro1.liga();
	        carro1.acelera(20);
	        carro1.acelera(40);
	        
	        System.out.println("O carro esta na velocidade de: " +carro1.getVelocidadeAtual()+" KM/H");
	        System.out.println(+carro1.getMarcha()+"º Marcha");  
	        
	    }
	    
	}

