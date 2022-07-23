package pe.edu.uni.fiis.NaturaCollection.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.uni.fiis.NaturaCollection.Dao.MyDao;
import pe.edu.uni.fiis.NaturaCollection.DemoUtil.DemoUtil;
import pe.edu.uni.fiis.NaturaCollection.Domain.Persona;
import pe.edu.uni.fiis.NaturaCollection.Domain.PersonaNatural;
import pe.edu.uni.fiis.NaturaCollection.Request.PersonaRequest;
import pe.edu.uni.fiis.NaturaCollection.Response.PersonaNaturalResponse;
import pe.edu.uni.fiis.NaturaCollection.Response.PersonaResponse;

import java.util.List;

@Service
public class MyServiceImpl implements MyService {
    @Autowired
    private MyDao myDao;

    @Override
    public PersonaResponse RegisterUser(Persona request) {
        Persona persona=this.myDao.RegisterUser(DemoUtil.mapToPersona(request));
        PersonaResponse response=new PersonaResponse();
        response.setPersona(persona);

        return response;
    }

    @Override
    public List<Persona> ObtenerPersonas() {
        return this.myDao.ObtenerPersonas();
    }

    @Override
    public PersonaNaturalResponse RegistrarPersonaNatural(PersonaNatural request) {
        PersonaNatural personaNatural= this.myDao.RegistrarPersonaNatural(DemoUtil.mapToPersonaNatural(request));
        PersonaNaturalResponse response=new PersonaNaturalResponse();
        response.setPersonaNatural(personaNatural);
        return response;
    }
}
