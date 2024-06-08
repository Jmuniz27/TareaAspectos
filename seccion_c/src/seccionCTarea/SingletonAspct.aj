package seccionCTarea;

public aspect SingletonAspct {
	before(): call(static Singleton Singleton.getInstance()) {
        System.out.println("Interceptando a Singleton");
    }
}
