package com.example.lizbeth.mensajes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Victor on 29/02/2016.
 */
public class Personas {

    //DECLARACION DE VARIABLES
    private int Nombre_Persona;
    private int Descripcion_Persona;
    private int Edad_Persona;
    private int Profesion_Persona;
    private int Img_persona;
    private int EstadoCivil_persona;
    private int Numero_Persona;
    private int Email_Persona;
    private int Facebook_Link;
    private int Twitter_Link;
    private int Web_Link;

    //CONSTRUCTOR
    public Personas(
            int nombre_Persona,
            int descripcion_Persona,
            int edad_Personaint,
            int profesion_Persona,
            int img_persona,
            int estadoCivil_persona,
            int numero_Persona,
            int email_Persona,
            int facebook_Link,
            int twitter_Link){

        this.Nombre_Persona = nombre_Persona;
        this.Descripcion_Persona = descripcion_Persona;
        this.Edad_Persona = edad_Personaint;
        this.Profesion_Persona = profesion_Persona;
        this.Img_persona = img_persona;
        this.EstadoCivil_persona = estadoCivil_persona;
        this.Numero_Persona = numero_Persona;
        this.Email_Persona = email_Persona;
        this.Facebook_Link = facebook_Link;
        this.Twitter_Link = twitter_Link;

    }

    //DECLARACION DE UN LISTA DE TIPO Personas
    public static final List<Personas> PERSONAS_LIST = new ArrayList<Personas>();

    static {
        PERSONAS_LIST.add(new Personas(R.string.nombreP1,
                R.string.descripcionP1,
                R.string.edadP1,
                R.string.profesionP1,
                R.drawable.pedro1,
                R.string.estadocivilP1,
                R.string.numeroP1,
                R.string.emailP1,
                R.string.facebookP1,
                R.string.twitterP1)
        );
        PERSONAS_LIST.add(new Personas(R.string.nombreP2,
                R.string.descripcionP2,
                R.string.edadP2,
                R.string.profesionP2,
                R.drawable.li,
                R.string.estadocivilP2,
                R.string.numeroP2,
                R.string.emailP2,
                R.string.facebookP2,
                R.string.twitterP2)
        );
        PERSONAS_LIST.add(new Personas(R.string.nombreP3,
                R.string.descripcionP3,
                R.string.edadP3,
                R.string.profesionP3,
                R.drawable.person,
                R.string.estadocivilP3,
                R.string.numeroP3,
                R.string.emailP3,
                R.string.facebookP3,
                R.string.twitterP3)
        );
        PERSONAS_LIST.add(new Personas(R.string.nombreP4,
                R.string.descripcionP4,
                R.string.edadP4,
                R.string.profesionP4,
                R.drawable.person,
                R.string.estadocivilP4,
                R.string.numeroP4,
                R.string.emailP4,
                R.string.facebookP4,
                R.string.twitterP4)
        );
        PERSONAS_LIST.add(new Personas(R.string.nombreP5,
                R.string.descripcionP5,
                R.string.edadP5,
                R.string.profesionP5,
                R.drawable.person,
                R.string.estadocivilP5,
                R.string.numeroP5,
                R.string.emailP5,
                R.string.facebookP5,
                R.string.twitterP5)
        );
        PERSONAS_LIST.add(new Personas(R.string.nombreP1,
                R.string.descripcionP1,
                R.string.edadP1,
                R.string.profesionP1,
                R.drawable.person,
                R.string.estadocivilP1,
                R.string.numeroP1,
                R.string.emailP1,
                R.string.facebookP1,
                R.string.twitterP1)
        );
        PERSONAS_LIST.add(new Personas(R.string.nombreP2,
                R.string.descripcionP2,
                R.string.edadP2,
                R.string.profesionP2,
                R.drawable.person,
                R.string.estadocivilP2,
                R.string.numeroP2,
                R.string.emailP2,
                R.string.facebookP2,
                R.string.twitterP2)
        );
        PERSONAS_LIST.add(new Personas(R.string.nombreP3,
                R.string.descripcionP3,
                R.string.edadP3,
                R.string.profesionP3,
                R.drawable.person,
                R.string.estadocivilP3,
                R.string.numeroP3,
                R.string.emailP3,
                R.string.facebookP3,
                R.string.twitterP3)
        );
        PERSONAS_LIST.add(new Personas(R.string.nombreP4,
                R.string.descripcionP4,
                R.string.edadP4,
                R.string.profesionP4,
                R.drawable.person,
                R.string.estadocivilP4,
                R.string.numeroP4,
                R.string.emailP4,
                R.string.facebookP4,
                R.string.twitterP4)
        );
        PERSONAS_LIST.add(new Personas(R.string.nombreP5,
                R.string.descripcionP5,
                R.string.edadP5,
                R.string.profesionP5,
                R.drawable.person,
                R.string.estadocivilP5,
                R.string.numeroP5,
                R.string.emailP5,
                R.string.facebookP5,
                R.string.twitterP5)
        );
    }

    public int getNombre_Persona() {
        return Nombre_Persona;
    }

    public int getDescripcion_Persona() {
        return Descripcion_Persona;
    }

    public int getEdad_Persona() {
        return Edad_Persona;
    }

    public int getProfesion_Persona() {
        return Profesion_Persona;
    }

    public int getImg_persona() {
        return Img_persona;
    }

    public int getEstadoCivil_persona() {
        return EstadoCivil_persona;
    }

    public int getNumero_Persona() {
        return Numero_Persona;
    }

    public int getEmail_Persona() {
        return Email_Persona;
    }

    public int getFacebook_Link() {
        return Facebook_Link;
    }

    public int getTwitter_Link() {
        return Twitter_Link;
    }

    public int getWeb_Link() {
        return Web_Link;
    }
}
