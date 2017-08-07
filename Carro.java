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
public class Carro {
 
    protected String cor;
    protected String modelo;
    protected double velocidadeAtual;
    protected double velocidadeMaxima;
    protected Motor motor;

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


