package com.company;

public class Loco {
    private int fuerza;
    private String nombre;

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public Loco(int fuerza, String nombre) {
        this.fuerza = fuerza;
        this.nombre = nombre;
    }
    public LocoBueno malo(){
        LocoBueno loquito = new LocoBueno(Loco.this);
        this.nombre = this.nombre+" BUENISIMO";
        this.fuerza = (int) (this.fuerza*0.8);
        return loquito;
    }
    public LocoMalo bueno(){
        LocoMalo loquito = new LocoMalo(Loco.this);
        this.nombre = this.nombre+" MALISIMO";
        this.fuerza = (int) (this.fuerza*1.1);
        return loquito;
    }

}
