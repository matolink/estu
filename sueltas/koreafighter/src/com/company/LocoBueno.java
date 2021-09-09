package com.company;

public class LocoBueno {
    private int fuerza;
    private String nombre;

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

    public LocoBueno(Loco loco) {
        nombre= loco.getNombre()+" BUENISIMOMAN";
        fuerza= (int) (loco.getFuerza()*0.8);
    }
}
