package modelos;

import java.io.Serializable;

public class Persona implements Serializable{
    public String nombre;
    public String password;

    public Persona() {
        this.nombre = "";
        this.password = "";
    }

    public Persona(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {

        return nombre;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
