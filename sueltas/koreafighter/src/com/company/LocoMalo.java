package com.company;

public class LocoMalo {
    private int fuerza;

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    public LocoMalo(Loco loco) {
        nombre = loco.getNombre()+" MALISIMO";
        fuerza = (int) (loco.getFuerza()*1.1);
    }
}
