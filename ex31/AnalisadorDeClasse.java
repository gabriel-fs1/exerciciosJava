package ex31;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnalisadorDeClasse {
    public static void inspecionar(Object obj) {
        Class<?> classe = obj.getClass();

        System.out.println("\nNome completo da classe: " + classe.getName());
        System.out.println();

        Field[] campos = classe.getDeclaredFields();
        System.out.println("Atributos:");
        for (Field campo : campos) {
            System.out.println("- " + campo.getName());
        }
        System.out.println();

        Method[] metodos = classe.getDeclaredMethods();
        System.out.println("Métodos:");
        for (Method metodo : metodos) {
            System.out.println("- " + metodo.getName());
        }
    }
}


