/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package LiveCode;

import java.util.Scanner;

/**
 *
 * @author Alfian Anwar Shodiqi
 * Teknik Informatika - Univ.Islam Balitar
 * 22104410065
 */
public class MainKinetic {

    public double m, v;

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }
    
    public double ek(){
        double hasil = 0.5 * m * Math.pow(v, 2);
        return hasil ;
    }
    
    
    public static void main(String[] args) {
        MainKinetic kinetic = new MainKinetic();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("masukkan masa sepeda(kg): ");
        kinetic.setM(scanner.nextDouble());
        
        System.out.println("masukkan kecepatan sepeda (m/s) : ");
        kinetic.setV(scanner.nextDouble());
        
        
        
        System.out.println("m : " + kinetic.getM() + " kg");
        System.out.println("v : " + kinetic.getV() + " m/s");
        
        System.out.println("Hasil energi kinetic adalah" + kinetic.ek() + "joule");
    }
    
}
