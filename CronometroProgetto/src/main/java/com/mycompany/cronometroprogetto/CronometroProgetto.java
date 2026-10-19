/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cronometroprogetto;

/**
 *
 * @author tedesco.luigi
 */
public class CronometroProgetto {

    public static void main(String[] args) {
        
        Cronometro c1 = new Cronometro("primo"); 
        c1.accendi();
        c1.AumentaTempo(100);
        System.out.println(c1.getTempo());
        c1.stop();
        c1.Azzera();
        System.out.println(c1.getTempo());
       
       
    }
}

