package ex33;

import java.lang.reflect.Method;
public class ExecutorDeTestes {
    public static void executarTestes(Object obj){
        Class<?> classe = obj.getClass();
        Method[] metodos = classe.getDeclaredMethods();

        for (Method metodo : metodos) {
            if (metodo.isAnnotationPresent(Teste.class)) {
                try {
                    metodo.invoke(obj);
                } catch (Exception e) {
                    System.out.println("Falha ao executar o método: " + metodo.getName());
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) {
        MinhaClasseDeTeste testes = new MinhaClasseDeTeste();
        executarTestes(testes);
    }
}
