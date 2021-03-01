/*
   Programa Realizado por:
   Garcia Briseno Jose Carlos
   Torres Santos Josue Daniel
*/
public class Contactos {
    String Nombres;
    String Apellidos;
    String Correo;
    String BirthDay;
    
    public Contactos(String Nombres, String Apellidos, String Correo, String BirthDay){
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Correo = Correo;
        this.BirthDay = BirthDay;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String BirthDay) {
        this.BirthDay = BirthDay;
    }
}
