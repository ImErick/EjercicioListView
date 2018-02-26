package mx.iteso.erickgarcia.ejerciciolistview;

/**
 * Created by erickgarcia on 21/02/18.
 */

public class ItemAutoModel {
    String marca, modelo, año;
    int logo;

    public ItemAutoModel(String marca, String modelo, String  año, int logo){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.logo = logo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
