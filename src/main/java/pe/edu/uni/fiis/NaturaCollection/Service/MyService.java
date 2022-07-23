package pe.edu.uni.fiis.NaturaCollection.Service;

import pe.edu.uni.fiis.NaturaCollection.Domain.Persona;
import pe.edu.uni.fiis.NaturaCollection.Domain.PersonaNatural;
import pe.edu.uni.fiis.NaturaCollection.Request.PersonaRequest;
import pe.edu.uni.fiis.NaturaCollection.Response.PersonaNaturalResponse;
import pe.edu.uni.fiis.NaturaCollection.Response.PersonaResponse;

import java.util.List;

public interface MyService {
    PersonaResponse RegisterUser(Persona request);
    List<Persona> ObtenerPersonas();
    PersonaNaturalResponse RegistrarPersonaNatural(PersonaNatural request);
}
