package pe.edu.uni.fiis.NaturaCollection.Response;

import pe.edu.uni.fiis.NaturaCollection.Domain.Persona;
import pe.edu.uni.fiis.NaturaCollection.Domain.PersonaNatural;

public class PersonaNaturalResponse {
    private PersonaNatural personaNatural;
    private String error;

    public PersonaNatural getPersonaNatural() {
        return personaNatural;
    }

    public void setPersonaNatural(PersonaNatural personaNatural) {
        this.personaNatural = personaNatural;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
