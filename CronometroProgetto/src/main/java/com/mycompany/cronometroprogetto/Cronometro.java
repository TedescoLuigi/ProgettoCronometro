
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cronometroprogetto;

/**
 *
 * @author tedesco.luigi
 */
public class Cronometro {
    
    String IDCronometro;
    private int Tempo = 0;
     private boolean stato = false;
    
    public Cronometro(String ID)
    {
        IDCronometro = ID;
    }
    
    
    public int getTempo()
    {
    return Tempo;
    }
    
    public void accendi()
    {
        stato=true;
        
    }
    
    public void AumentaTempo(int tempo)
    {
        if(stato == true)
        {
            this.Tempo = tempo;
        }
        else
        {
            System.out.println("il cronometro è spento");
        }
        
    }
    
    public void Azzera()
    {
        if(stato == false)
        {
            this.Tempo = 0; 
                   
        }
        else
        {
            System.out.println("il cronometro deve essere spento per azzerare");
        }
        
        
    }
    
    public void stop()
    {
        stato = false;
    }
}
