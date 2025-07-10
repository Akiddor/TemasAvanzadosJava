package interfaces;

public interface Traductor {

    // Los metodos son publicos y abstractos

    public void traducir();

    default  void iniciarTraductor(){
        System.out.println("iniciando traductor");
    }

}

class Ingles implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduciendo en ingles");
    }
}

class Frances implements Traductor{
    public void traducir(){
        System.out.println("Traducir en frances");

    }

    @Override
    public void iniciarTraductor(){
        System.out.println("Traduciendo en frances");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor traductor = new Ingles();
        traductor.traducir();

        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();

    }
}