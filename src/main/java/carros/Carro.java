package carros;


public class Carro {

	 	private String cor;
	    private String modelo;
	    private double velocidadeAtual;
	    private double velocidadeMaxima;
	    private Motor motor;   
	    
	    public int getPotencia(){
	    	
	    	return motor.getPotencia();
	    }
	    
	    public String getTipo(){
	    	
	    	return motor.getTipo();
	    }
	    
	    public void setPotencia(int potencia){
	    	
	    	motor.setPotencia(potencia);
	    }
	    
	    public void setTipo(String tipo){
	    	
	    	motor.setTipo(tipo);
	    }
	    
	    public String getCor() {
	        return cor;
	    }
	    
	    

	    public void setCor(String cor) {
	        this.cor = cor;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    public double getVelocidadeAtual() {
	        return velocidadeAtual;
	    }

	    public void setVelocidadeAtual(double velocidadeAtual) {
	        this.velocidadeAtual = velocidadeAtual;
	    }

	    public double getVelocidadeMaxima() {
	        return velocidadeMaxima;
	    }

	    public void setVelocidadeMaxima(double velocidadeMaxima) {
	        this.velocidadeMaxima = velocidadeMaxima;
	    }
	    
	    protected void liga(){
	        
	        System.out.println("O carro esta ligado.");
	    }
	    protected void acelera(double quantidade){
	        
	        velocidadeAtual = velocidadeAtual+quantidade;
	    }
	    protected int getMarcha(){
	        
	        if (velocidadeAtual<0){
	            return -1;
	        }
	        else{
	           if (velocidadeAtual > 0 && velocidadeAtual < 40){
	               return 1;
	               
	           } else{
	               if (velocidadeAtual >= 40 && velocidadeAtual < 60){
	                   return 2;
	                   
	               }else{
	                   return 3;
	                   
	               }
	           }
	        }
	            
	    }
}
