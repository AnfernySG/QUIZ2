/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2;
import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */
public class QUIZ2 {
    
public void run(){
        Feligreses arrFeligreses[] = new Feligreses[5];
        String nameIglesia = JOptionPane.showInputDialog("Digite el nombre de la iglesia");
        String namePastor = JOptionPane.showInputDialog("Digite el nombre del pastor");
        int feligreses = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de feligreses"));
      
      
         
        String[] nombres = new String[feligreses];
        String[] cedulas = new String[feligreses];
        double[] diezmos = new double[feligreses];

       
        for (int i = 0; i < feligreses; i++) {
            nombres[i]=JOptionPane.showInputDialog("Digite el nombre del feligres");

            
            cedulas[i] = JOptionPane.showInputDialog("Digite la cedula del feligres");

           
            diezmos[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el diezmo"));
            
            //arrFeligreses[i]=new Feligreses(namePastor, i, i, i);
        }

        
        double totalDiezmos = 0;
        for (double diezmo : diezmos) {
            totalDiezmos += diezmo;
        }

        double impuestoInfraestructura = totalDiezmos * 0.09;
        double impuestoComedor = totalDiezmos * 0.21;
        double gananciaPastor = totalDiezmos * 0.70;

        System.out.println("");
        System.out.println("Informe de la Iglesia " + nameIglesia + " - Pastor: " + namePastor);
        System.out.printf("\nMonto total de ganancias de la iglesia: %.2f%n", totalDiezmos);
        System.out.printf("\nMonto para infraestructura municipal: %.2f%n", impuestoInfraestructura);
        System.out.printf("\nMonto para el comedor municipal: %.2f%n", impuestoComedor);
        System.out.printf("\nMonto de ganancia para el pastor: %.2f%n", gananciaPastor);
        
        System.out.println(" ");
        System.out.println("Personas con diezmo igual a 0:");
        for (int i = 0; i < feligreses; i++) {
            if (diezmos[i] == 0) {
                System.out.println("Nombre: " + nombres[i] + ", Cédula: " + cedulas[i]);
            }
        }

        System.out.println(" ");
        System.out.println("Personas con diezmo mayor a 100000:");
        for (int i = 0; i < feligreses; i++) {
            if (diezmos[i] > 100000) {
                System.out.println("Nombre: " + nombres[i] + ", Cédula: " + cedulas[i]);
            }
        }

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        QUIZ2 quizz = new QUIZ2();
        quizz.run();
    }
}
    
    

