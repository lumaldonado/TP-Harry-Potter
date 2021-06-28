package app.personajes;
import java.util.ArrayList;
import java.util.List;
import app.interfaces.IHaceMagia;
import app.artefactos.Artefacto;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;

public class Elfo extends Criatura implements IHaceMagia {
    public List<Hechizo> hechizos = new ArrayList<>();

    @Override
    public int getEnergiaMagica() {

        return 0;
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {

    }

    @Override
    public Poder getPoderInicial() {

        return null;
    }

    @Override
    public Artefacto getArtefacto() {

        return null;
    }

    public List getHechizos() {
        return this.hechizos;
    }

    public void setHechizos(List<Hechizo> hechizos) {
        this.hechizos = hechizos;
    }

    @Override
    public void aprender(Hechizo h) {
        this.hechizos.add(h);

    }

    @Override
    public void atacar(Personaje personaje, Hechizo hechizo) {

    }

    @Override
    public void atacar(Personaje personaje, String hechizo) {

    }

    @Override
    public void setPoderInicial(Poder poderInicial) {

    }
}
