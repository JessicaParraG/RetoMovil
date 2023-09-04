package app.exito.utils;

import com.github.javafaker.Faker;

public class Datos {

    static Faker faker = new Faker();

    private String correo;
    private String nombre;
    private String apellido;
    private String numeroDocumento;

    public Datos() {
        //Datos aleatorios
        this.nombre = faker.name().firstName();
        this.apellido = faker.name().lastName();
        this.correo = faker.internet().emailAddress();
        this.numeroDocumento = String.valueOf(faker.number().digits(10));
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }
}
