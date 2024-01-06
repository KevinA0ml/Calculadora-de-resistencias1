/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora_resistencia.Constructores;

/**
 *
 * @author tato
 */
public class temperatura {

    public temperatura() {
    }
  private String color;
  private int valor;

    public temperatura(String color, int valor) {
        this.color = color;
        this.valor = valor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
  
}
