package app.personajes;

import app.interfaces.IEsMagico;

public class Criatura extends Personaje implements IEsMagico {

    @Override
    public boolean esInvisibleAMuggles() {

        return false;
    }

    @Override
    public boolean esInvisible() {

        return false;
    }

}
