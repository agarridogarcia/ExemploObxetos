
package exemplorectangulo1;

import javax.swing.JOptionPane;


public class Rectangulo { 
    //declaro atributo
    private float base, altura;
    //constructores
    public Rectangulo(){
        base=0;
        altura=0;
    }
    public Rectangulo (float ba, float al){
        base= ba;
        altura= al;
    }
    //metodos de acceso
    
   public float getBase(){
       return base;
   }
   public void setBase(float ba){
       base= ba;
   }
   public float getAltura(){
       return altura;
   }
   public void setAltura(float al){
       altura=al;
   }
   
    public void amosar(){
        System.out.println("base = "+ base + "altura = " + altura);
    }
    
    public void calcularArea(){
        float area = base*altura;
        System.out.println("area = "+ area);
        /* tamén se pode poñer: 
        System.out.println(" area = "  + (base * altura));*/
       
    }
    public float calculaPerimetro(){
        float perimetro=2*base+2*altura;
        return perimetro;
        /*tamén se pode poñer
        return (2*base+2*altura);*/
    }
        public void introducirValores (){
         
            base=Float.parseFloat(JOptionPane.showInputDialog("Introduzca base"));
            altura=Float.parseFloat(JOptionPane.showInputDialog("Introduzca altura"));
        
                    }
    
    
    
    
    
    
    
    
}
