/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_retangulos;

/**
 *
 * @author lucia
 */
public class Retangulo extends Geom2D{
    private final double base;
    private final double altura;
    public Retangulo(double lado){
        this.base = lado;
        this.altura = lado;
    }
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcPerimetro(){
        super.perimetro = 2* this.base + 2 * this.altura;
        return super.perimetro;
    }
    @Override
    public double calcArea(){
        super.area = this.base * this.altura;
        return super.area;
    }
    @Override
    public String toString() {
        return String.format("Rect:{\n peri: %.2f\n area: %.2f\n",
        this.calcPerimetro(), this.calcArea());
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Retangulo){
            Retangulo r = (Retangulo)obj;
            return (base == r.base) && (altura == r.altura);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Retangulo rect1 = new Retangulo(4, 25);
        Retangulo rect2 = new Retangulo(4,26);
        System.out.println(rect1); // invoca método toString
        System.out.println(rect2); // invoca método toString
        if(rect1.equals(rect2)){
            System.out.println("Figuras Geométricas Iguais");
        }else{
            System.out.println("Figuras Geométricas Diferentes");
        }
    }
}
