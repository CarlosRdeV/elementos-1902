package org.unitec.elementos;

public class Localizacion {

    private long lat;
    private long lon;

    //Encapsulation
    public long getLat() {
        return lat;
    }

    public void setLat(long lat) {
        this.lat = lat;
    }

    public long getLon() {
        return lon;
    }

    public void setLon(long lon) {
        this.lon = lon;
    }

    //Constructor de defecto vacio
    public Localizacion() {
    }

}
