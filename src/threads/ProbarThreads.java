/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.io.Serializable;

/**
 *
 * @author Azael Fann Heian
 */
public class ProbarThreads implements Runnable, Serializable{
    public static void main(String[] args) {
        //creamos el thread
        PrimerThread t1 = new PrimerThread();
        t1.start();    
       
        //creamos el segundo thread
        Runnable r = new ProbarThreads();
        Thread t2 = new Thread(r);
        t2.start();
    }
    @Override
    public void run(){
        System.out.println("Segundo Thread");
    }
}
