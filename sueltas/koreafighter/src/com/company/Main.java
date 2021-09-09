package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Eres bueno? o malo? (1 para bueno y 2 para malo)");
        int decidir = escaner.nextInt();
        System.out.println("Cual es tu nombre?");
        escaner.nextLine();
        String nombreLoco = escaner.nextLine();
        Loco jugador = new Loco(10,nombreLoco);
        Loco contrincante = new Loco (10,"Peter");
        decidirLoco(decidir,jugador);
        if (decidir!=1){
            LocoMalo jefazo = contrincante.bueno();
            peleaLocosB(jugador,jefazo);
        }
        else{
            LocoBueno jefazo = contrincante.malo();
            peleaLocosM(jugador,jefazo);
        }
    }

    public static void decidirLoco(int decision, Loco loco){
        if (decision==1){
            loco.bueno();
        }
        else {
            loco.malo();
        }
    }
    public static void peleaLocosB(Loco loco1, LocoMalo loco2){
        System.out.println("habra una pelea entre "+loco1.getNombre()+" y "+loco2.getNombre()+". El primero tiene como fuerza "+loco1.getFuerza()+" y el segundo "+loco2.getFuerza());
        if (loco1.getFuerza() > loco2.getFuerza()){
            System.out.println("eres el mejor ejjeje");
        }
        else {
            System.out.println("perdiste");
        }
    }
    public static void peleaLocosM(Loco loco1, LocoBueno loco2){
        System.out.println("habra una pelea entre "+loco1.getNombre()+" y "+loco2.getNombre()+". El primero tiene como fuerza "+loco1.getFuerza()+" y el segundo "+loco2.getFuerza());
        if (loco1.getFuerza() > loco2.getFuerza()){
            System.out.println("eres el mejor ejjeje");
        }
        else {
            System.out.println("perdiste");
        }
    }
}
