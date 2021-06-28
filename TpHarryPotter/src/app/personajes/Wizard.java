package app.personajes;
import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHaceMagia;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;

public class Wizard extends Personaje implements IHaceMagia {
     public List<Hechizo> hechizos = new ArrayList<>(); 

     public boolean magoOscuro(){
         return true;
     }

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
     public Artefacto setArtefacto(Artefacto artefacto){
         return artefacto;
     }

     @Override
     public void aprender(Hechizo h) {
          this.hechizos.add(h);
          
     }

     @Override
     public void atacar(Personaje personaje, Hechizo hechizo) {
               /*if ((this.magoOscuro() == false ) && (hechizo.esOscuro()== true){
                   int nivelDanio = nivelDanio * 2;
               }
           }*/
     }


     @Override
     public void atacar(Personaje personaje, String hechizo) {    
          
     }

     @Override
     public void setPoderInicial(Poder poderInicial) {
          
     }
}
