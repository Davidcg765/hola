package Strings;

public class manipula_cadenas_I {
    public static void main(String[] args) {
        //TODO Auto:generated method stub

        String nombre = "David Cuevas Gil";
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
        System.out.println("La primera letra de mi nombre " + nombre + " es la " + nombre.charAt(0));

        int ultima_letra;
        ultima_letra = nombre.length();

        System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra - 1));
    }
}