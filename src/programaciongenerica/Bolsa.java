/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaciongenerica;

/**
 *
 * @author drios
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa implements Iterable {

    private ArrayList lista = new ArrayList();
    private int tope;

    public Bolsa(int tope) {
        super();
        this.tope = tope;
    }

    public void add(Object objeto) {
        if (lista.size() <= tope) {
            lista.add(objeto);
        } else {
            throw new RuntimeException("no caben mas");
        }
    }

    public Iterator iterator() {
        return lista.iterator();
    }
}
