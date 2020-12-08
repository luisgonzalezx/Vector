package vector;

import java.util.Scanner;


public class Vector {

    public static void main(String[] args) {
        
        String Nombre[] = new String [5];
        int Edad[] = new int[5];
        String Sexo [] = new String[5];
        
        
        Nombre[0] = "Bart Simpson";
        Nombre[1] = "Homero simpson";
        Nombre[2] = "Marge Simpson";
        Nombre[3] = "Lisa Simpson";
        Nombre[4] = "Magui simpson";
        
        Edad[0] = 10;
        Edad[1] = 50;
        Edad[2] = 45;
        Edad[3] = 8;
        Edad[4] = 1;
        
        Sexo[0] ="Masculino";
        Sexo[1] ="Masculino";
        Sexo[2] ="femenino";
        Sexo[3] ="Femenino";
        Sexo[4] ="Femenino";
        
        for (int i = 0;i < Edad.length;i++){
            System.out.println("Nombre: " + Nombre[i]+ "  Edad : " + Edad[i]  + "   Sexo : " + Sexo[i] );
        
        }
        
        
        
            
        }
    }
    

