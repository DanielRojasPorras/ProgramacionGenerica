/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaciongenerica;

import com.progra.programaciongenerica.elementos.Chocolate;
import com.progra.programaciongenerica.elementos.Golosina;

/**
 *
 * @author drios
 */
public class ProgramacionGenerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bolsa bolsa = new Bolsa(5);
        Chocolate c = new Chocolate("milka");
        Chocolate c1 = new Chocolate("milka");
        Chocolate c2 = new Chocolate("ferrero");
        Golosina g1 = new Golosina("gominola");
        Golosina g2 = new Golosina("chicle");
        bolsa.add(c);
        bolsa.add(c1);
        bolsa.add(c2);
        bolsa.add(g1);
        bolsa.add(g2);
        for (Object o : bolsa) {
            if (o instanceof Chocolate) {
                Chocolate chocolatina = (Chocolate) o;
                System.out.println(chocolatina.getMarca());
            } else {
                Golosina golosina = (Golosina) o;
                System.out.println(golosina.getNombre());
            }
        }
    }
}
