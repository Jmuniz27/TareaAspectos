package ec.edu.espol;

public aspect Adapter{
	
	private Adaptee adaptee = new Adaptee();

    pointcut targetMetodoEsperado(): execution(void Target.metodoEsperado());

    before(): targetMetodoEsperado() {
        adaptee.metodoNoEsperado();
    }
}
