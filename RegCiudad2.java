package ExamenAemet;

import java.util.Scanner;

public class RegCiudad2 {
    public final int NDIAS = 7;
    public final int NTEMP = 3;

    private String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    private int[][] Temperaturas = new double[NDIAS][NTEMP];

    private String nombre;
    private int vmin;
    private int vmax;

    public RegCiudad2 (String nombre, int vmin, int vmax){
        //Nombre de ciudad y valores vmas y vmin entre los q oscilan las temperaturas
        this.setNombre(nombre);
        this.setVmax(vmax);
        this.setVmin(vmin);
        this.GenerarTemperaturas();
    }

    public void GenerarTemperaturas(){
        for (int i=0; i<NDIAS; i++){
            for (int j=0; j<NTEMP; j++){
                int temperatura = (int)(Math.random() * (this.vmax - this.vmin + 1)) + this.vmin;
                this.Temperaturas[i][j] = temperatura;
            }
        }
    }

    public void mostrarTabla(){
        String temp="";
        System.out.printf("%10s", this.getNombre());
        for (int i=0; i<7; i++){
            System.out.printf("%15s", this.dias[i]);
        }
        System.out.println();
        System.out.printf("%10s", "");
        for (int i=0; i<NDIAS; i++){
            temp="";
            for (int j=0; j<NTEMP; j++){
                temp = temp + this.Temperaturas[i][j] + ", ";
            }
            System.out.printf("%15s", temp);
        }
        System.out.println();
    }













    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setVmax(String vmax){
        this.vmax = vmax;
    }
    public void setVmin(String vmin){
        this.vmin = vmin;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getVmax(){
        return this.vmax;
    }
    public int getVmin(){
        return this.vmin;
    }
}
