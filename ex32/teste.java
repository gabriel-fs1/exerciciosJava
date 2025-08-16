package ex32;

import java.lang.reflect.Field;

public class teste {

    public static void main(String[] args) throws Exception{

        Configuracao config = new Configuracao();
       
        Field campo = config.getClass().getDeclaredField("urlConexao");
        campo.setAccessible(true);
        System.out.println("URL antes da modificação: " + campo.get(config));
        campo.set(config, "db.producao.com:5432");
        campo.get(config);
        System.out.println("URL depois da modificação: " + campo.get(config));
    
    }
    
}
