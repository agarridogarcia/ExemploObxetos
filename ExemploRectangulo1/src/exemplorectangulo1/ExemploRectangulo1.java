
package exemplorectangulo1;

import javax.swing.JOptionPane;


public class ExemploRectangulo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rec1= new Rectangulo(5f,10f);
        rec1.amosar();
        rec1.setAltura(7f);
        rec1.amosar();
        
        Rectangulo rec2= new Rectangulo();
        rec2.setBase(14.2f);
        rec2.setAltura(6.9f);
        rec2.amosar();
        rec1.calcularArea();
        /*float res =rec1.calculaPerimetro();
        System.out.println("perimetro = " +res);*/
        System.out.println("perimetro = " + rec1.calculaPerimetro());
        
        Rectangulo rec3= new Rectangulo ();
        rec3.setBase(20f);
        rec3.setAltura(10f);
        rec3.amosar();
        rec3.calcularArea();
        
        System.out.println( "perimetro = " + rec3.calculaPerimetro());
        
        Rectangulo rec4= new Rectangulo();
        rec4.introducirValores();
        rec4.calcularArea();
        System.out.println("perimetro = " + rec4.calculaPerimetro());
        
        
                
        
        
    }
    
}
