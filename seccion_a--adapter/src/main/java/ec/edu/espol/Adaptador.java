public class Adaptador implements EnchufeEuropeo{
    private EnchufeAmericano enchufeAmericano;

    public Adaptador(EnchufeAmericano enchufeAmericano){
        this.enchufeAmericano = enchufeAmericano;
    }

    @Override
    public void conectar() {
        //logica de adaptacion
    }
}
