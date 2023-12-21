/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lucia
 */
public class Cubo extends Geom3D{
    private final double lado;
    public Cubo(double lado){
        this.lado = lado;
    }
    @Override
    public double calcArea(){
        super.area = 6* this.lado * this.lado;
        return super.area;
    }
    @Override
    public double calcVolume(){
        super.volume = this.lado * this.lado *this.lado;
        return super.volume;
    }
    @Override
    public String toString() {
        return String.format("Cubo: {\n area: %.2f\n vol: %.2f\n",
                this.calcArea(), this.calcVolume());
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cubo cubo){
            return this.lado == cubo.lado;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.lado) ^ (Double.doubleToLongBits(this.lado) >>> 32));
        return hash;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cubo cubo1 = new Cubo(1);
        Cubo cubo2 = new Cubo(2);
        System.out.println(cubo1); // invoca método toString
        System.out.println(cubo2); // invoca método toString
        if (cubo1.equals(cubo2)){
            System.out.println("Figuras Geométricas Iguais");
        }else {
            System.out.println("Figuras Geométricas Diferentes");
        }
    }
    
}
