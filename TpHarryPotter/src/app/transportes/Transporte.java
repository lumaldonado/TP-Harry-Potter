package app.transportes;
import app.interfaces.IEsMagico;

public abstract class Transporte implements IEsMagico {

      private String nombre;


      public void setNombre(String nombre) {
            this.nombre = nombre;
      }

      public String getNombre() {
            return this.nombre;
      }

      @Override
      public boolean esInvisible() {
            return false;
      }

      @Override
      public boolean esInvisibleAMuggles() {
            return false;

      }

}  
