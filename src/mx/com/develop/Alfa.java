/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop;

/**
 *
 * @author FCGUZMAN
 */
class Alfa {

    Alfa() {
        method();
    }

    static {
        System.out.println("ALFA static");
    }

    {
        System.out.println("ALFA no static");
    }

    void method() {
    }
}

class Beta extends Alfa {

    {
        number = 4;
    }

    int number;

    static {
        System.out.println("BETA static");
    }

    {
        System.out.println("BETA no static");
    }

    void method() {
        System.out.println(number);
    }

    public static void main(String args[]) {
        Beta beta = new Beta();
        System.out.println(beta.number);
    }
}

class Test1 {

    {
        i = 10;
    }
    
    int i;
    
    
    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.i);
    }
}
