package com.edwin.list;
import java.util.ArrayList;
import java.util.List;
 
public class ClsVendedores {
 
   
 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getEnero() {
        return enero;
    }
    public void setEnero(double enero) {
        this.enero = enero;
    }
    public double getFebrero() {
        return febrero;
    }
    public void setFebrero(double febrero) {
        this.febrero = febrero;
    }
    public double getMarzo() {
        return marzo;
    }
    public void setMarzo(double marzo) {
        this.marzo = marzo;
    }
    public double getAbril() {
        return abril;
    }
    public void setAbril(double abril) {
        this.abril = abril;
    }
    public double getSumaMeses() {
        return SumaMeses;
    } 
    public void setSumaMeses(double SumaMeses) {
        this.SumaMeses = SumaMeses;
    }
    public double getComisiones() {
        return Comisiones;
    }
    public void setComisiones(double Comisiones) {
        this.Comisiones = Comisiones;
    }
    public double getComMeses() {
        return ComMeses;
    }
    public void setComMeses(double ComMeses) {
        this.ComMeses = ComMeses;
    }
    public double getComisionesmayor() {
        return Comisionesmayor;
    }
    public void setComisionesmayor(double Comisionesmayor) {
        this.Comisionesmayor = Comisionesmayor;
    }
    public double getISR() {
        return ISR;
    }
    public void setISR(double ISR) {
        this.ISR = ISR;
    }
    public double getLiquido() {
        return liquido;
    }
    public void setLiquido(double liquido) {
        this.liquido = liquido;
    }
    
    
    private String nombre;
    private double enero;
    private double febrero;
    private double marzo;
    private double abril;
    private double SumaMeses;
    private double Comisiones;
    private double Comisionesmayor;
    private double ComMeses;
    private double ISR;
    private double liquido;
  
    List<ClsVendedores> Ingresos = new ArrayList();
    public void listaEm(){
        ClsVendedores ven =new ClsVendedores();
    
    
    
    ven.setNombre("Oswaldo");
    ven.setEnero(500);
    ven.setFebrero(100);
    ven.setMarzo(200);
    ven.setAbril(20);
    Ingresos.add(ven);
    ven = new ClsVendedores();
    
    ven.setNombre("Jaime");
    ven.setEnero(2600);
    ven.setFebrero(100);
    ven.setMarzo(10);
    ven.setAbril(20);
    Ingresos.add(ven);
    ven = new ClsVendedores();
    
    ven.setNombre("Edwin");
    ven.setEnero(700);
    ven.setFebrero(503);
    ven.setMarzo(100);
    ven.setAbril(700);
    Ingresos.add(ven);
    ven = new ClsVendedores();
    
    ven.setNombre("Sandra");
    ven.setEnero(300);
    ven.setFebrero(400);
    ven.setMarzo(1030);
    ven.setAbril(2030);
    Ingresos.add(ven);
    ven = new ClsVendedores();
    
    ven.setNombre("Maria");
    ven.setEnero(700);
    ven.setFebrero(330);
    ven.setMarzo(130);
    ven.setAbril(2030);
    Ingresos.add(ven);
    ven = new ClsVendedores();
    
    ven.setNombre("Vicente");
    ven.setEnero(70);
    ven.setFebrero(30);
    ven.setMarzo(100);
    ven.setAbril(200);
    Ingresos.add(ven);
    ven = new ClsVendedores();
    
    ven.setNombre("Rosa");
    ven.setEnero(100);
    ven.setFebrero(400);
    ven.setMarzo(100);
    ven.setAbril(200);
    Ingresos.add(ven);
    ven = new ClsVendedores();
    
    ven.setNombre("Yeili");
    ven.setEnero(740);
    ven.setFebrero(400);
    ven.setMarzo(105);
    ven.setAbril(500);
    Ingresos.add(ven);
    ven = new ClsVendedores();
    
    ven.setNombre("Ferna");
    ven.setEnero(400);
    ven.setFebrero(300);
    ven.setMarzo(100);
    ven.setAbril(200);
    Ingresos.add(ven);
    ven = new ClsVendedores();
    
        
    }
    public void Imprimiringresos(){
        listaEm();
        for(ClsVendedores v : Ingresos){
            System.out.println(""+v.getNombre()+("\t ")+v.getEnero()+("\t ")+v.getFebrero()+(" \t")+v.getMarzo()+("\t ")+v.getAbril());    

        }
    }
    public void resultados(){
    listaEm();
    double mayorPago=0;
    double MenorPago=0;
    String MenorNombre="";
    String NomMayor="";
    
    System.out.println("Nombres"+"\t"+"Enero"+"\t"+"Febrero"+"\t"+"Marzo"+"\t"+"Abril"+"\t"+"Sumas"+"\t"+"Com.20%"+"\t"+"Com.30%"+"\t"+"  Total"+"\t"+"  ISR"+"\t"+"PAGO");
    for( ClsVendedores v : Ingresos){
        v.setSumaMeses(v.getEnero()+v.getFebrero()+v.getMarzo()+v.getAbril());
        if( v.getSumaMeses() <=2000){
         v.setComisiones(v.getSumaMeses()*0.20);   
         v.setComMeses(v.getComisiones()+v.getSumaMeses());
        }
        if (v.getSumaMeses()>= 2001){
         v.setComisionesmayor(v.getSumaMeses()*0.30);   
         v.setComMeses(v.getComisiones()+ v.getSumaMeses());
         
        }
        v.setISR(v.getComMeses()*0.05);//para sacar el 5% del total
        v.setLiquido(v.getComMeses()-v.getISR());
        
        System.out.println(""+v.getNombre()+("\t ")+v.getEnero()+("\t ")+v.getFebrero()+(" \t")+v.getMarzo()+("\t ")+v.getAbril()+("\t ")+v.getSumaMeses()+("\t ")+v.getComisiones()+("\t ")+v.getComisionesmayor()+("\t ")+v.getComMeses()+("\t ")+v.getISR()+("\t ")+v.getLiquido());
        
    }
        for( ClsVendedores v1 : Ingresos)
        if (v1.getLiquido() > mayorPago){
        mayorPago = v1.getLiquido();
        NomMayor = v1.getNombre();
        }
        
        MenorPago = mayorPago;
    
    
        for( ClsVendedores v2 : Ingresos){
            if (v2.getLiquido() < MenorPago){
        //mayorPago = v.getLiquido();
        MenorPago=v2.getLiquido();
        MenorNombre = v2.getNombre();
        }
        }
    System.out.println("El mayor es pago es el de:  "+  NomMayor+ ";  "+ mayorPago+" Y el menor pago es el de:"+ MenorNombre+";  "+MenorPago);
     
    }
    public void menu(){
         System.out.println("ingrese el numero se la opcion que desee");
         System.out.println("1 Ver lista de ingresos ");
         System.out.println("2 Ver Datos operados ");
         System.out.println("3 Sair del programa");        
    }
    
}
    
    
    
    
    
    
    
    
    

