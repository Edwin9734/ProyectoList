package com.edwin.proyecto;
import com.edwin.list.ClsVendedores;
import java.util.Scanner;

public class Proyecto {

    public static void main(String[] args) {
        System.out.println("Bienvenido a su menu ");
        menu();
        
    }
    public static void menu(){
       ClsVendedores a = new ClsVendedores(); 
       int Menu =0;
        Scanner t =  new Scanner(System.in);
        a.menu();
        Menu =  t.nextInt();
        switch (Menu) {
            case 1:
                a.Imprimiringresos();
                menu();
                break;
                
            case 2: 
                a.resultados();
                menu();
                break;
            case 3:
                System.out.println("gracias por su preferencia");
                break;
            default:
                System.out.println("Datos incorrectos");
                break;
        } 
    }
}
