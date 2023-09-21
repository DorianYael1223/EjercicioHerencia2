package EjercicioHerencia2;

// Clase abstracta Personaje
abstract class Personaje {
    protected String nombrePersonaje;
    protected int nivel;

    public Personaje(String nombrePersonaje, int nivel) {
        if (nivel < 1) {
            throw new IllegalArgumentException("El nivel no puede ser menor que 1");
        }
        this.nombrePersonaje = nombrePersonaje;
        this.nivel = nivel;
    }

    // Método abstracto para atacar
    public abstract void atacar();
}

// Interfaz HabilidadesMagicas
interface HabilidadesMagicas {
    void lanzarHechizo();
}

// Interfaz HabilidadesFisicas
interface HabilidadesFisicas {
    void usarHabilidadFisica();
}

// Clase que implementa habilidades mágicas
class PersonajeMagico extends Personaje implements HabilidadesMagicas {
    public PersonajeMagico(String nombrePersonaje, int nivel) {
        super(nombrePersonaje, nivel);
    }

    @Override
    public void atacar() {
        if (nivel < 5) {
            throw new RuntimeException(nombrePersonaje + " no puede atacar porque su nivel es menor a 5");
        }
        System.out.println(nombrePersonaje + " ¡atacando!");
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(nombrePersonaje + " está lanzando un hechizo");
    }
}

// Clase que implementa habilidades físicas
// Clase que implementa habilidades físicas
class PersonajeFisico extends Personaje implements HabilidadesFisicas {
    public PersonajeFisico(String nombrePersonaje, int nivel) {
        super(nombrePersonaje, nivel);
    }

    @Override
    public void atacar() {
        if (nivel < 5) {
            throw new RuntimeException(nombrePersonaje + " no puede atacar porque su nivel es menor a 5");
        }
        System.out.println(nombrePersonaje + " ¡atacando!");
    }

    @Override
    public void usarHabilidadFisica() {
        System.out.println(nombrePersonaje + " está usando una habilidad física");
    }
}


