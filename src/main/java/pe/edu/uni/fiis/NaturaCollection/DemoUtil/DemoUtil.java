package pe.edu.uni.fiis.NaturaCollection.DemoUtil;

import pe.edu.uni.fiis.NaturaCollection.Domain.Persona;
import pe.edu.uni.fiis.NaturaCollection.Domain.PersonaNatural;

public class DemoUtil {
    public static Persona mapToPersona(Persona request){
        Persona response = new Persona();
        response.setIdPersona(request.getIdPersona());
        response.setTipoPersona(request.getTipoPersona());
        response.setFechaRegistro(request.getFechaRegistro());
        return response;
    }
    public static PersonaNatural mapToPersonaNatural(PersonaNatural request){
        PersonaNatural response = new PersonaNatural();
        response.setIdPersona(request.getIdPersona());
        response.setTipoPersona(request.getTipoPersona());
        response.setFechaRegistro(request.getFechaRegistro());
        response.setNombres((request.getNombres()));
        response.setApellidos((request.getApellidos()));
        response.setDni((request.getDni()));
        response.setSexo((request.getSexo()));
        return response;
    }
}
