package app.exito.utils;

public class Esperar {

    public static void por(int segundos) throws InterruptedException {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
