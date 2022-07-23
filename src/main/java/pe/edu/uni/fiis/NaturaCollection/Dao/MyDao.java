package pe.edu.uni.fiis.NaturaCollection.Dao;

import pe.edu.uni.fiis.NaturaCollection.Domain.Persona;
import pe.edu.uni.fiis.NaturaCollection.Domain.PersonaNatural;

import java.util.List;

public interface MyDao {
    Persona RegisterUser (Persona request);
    List<Persona> ObtenerPersonas();
    PersonaNatural RegistrarPersonaNatural(PersonaNatural request);
}
