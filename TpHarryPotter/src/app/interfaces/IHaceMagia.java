package app.interfaces;
import app.artefactos.Artefacto;
import app.poderes.Poder;
import app.poderes.hechizos.*;
import app.personajes.*;

public interface IHaceMagia {
    public int getEnergiaMagica();
    public void setEnergiaMagica(int EnergiaMagica);
    public Poder getPoderInicial();
    public void setPoderInicial(Poder poderInicial);
    public Artefacto getArtefacto();
    public void aprender(Hechizo h);
    public void atacar(Personaje personaje, Hechizo hechizo);
    public void atacar(Personaje personaje, String hechizo);

}
