/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao1;

/**
 *
 * @author Home
 */
public class Revisao1 {

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
