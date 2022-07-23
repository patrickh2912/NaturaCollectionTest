package pe.edu.uni.fiis.NaturaCollection.Response;

import pe.edu.uni.fiis.NaturaCollection.Domain.Persona;

public class PersonaResponse {
    private Persona persona;
    private String error;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
