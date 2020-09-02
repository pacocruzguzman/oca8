/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Remi
 */
public class Java8 implements Comparable<String> {

    public void ordenar() {
        List<String> lista = new ArrayList<>();
        lista.add("MitoCode");
        lista.add("Code");
        lista.add("Mito");

        /* Collections.sort(lista, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
        return o1.compareTo(o2);
        }
        }
        );*/
        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

        lista.forEach((string) -> {
            System.out.println(string);
        });
    }

    @Override
    public int compareTo(String string) {
        return -1;
    }

    public static void main(String[] args) {
        Java8 lambda = new Java8();
        lambda.ordenar();
    }

}
