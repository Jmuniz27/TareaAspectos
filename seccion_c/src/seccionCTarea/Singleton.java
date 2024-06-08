package seccionCTarea;

public class Singleton {
	private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void mensajeMethod() {
        System.out.println("Singleton en Paradigma orientado a Aspectos");
    }
}
