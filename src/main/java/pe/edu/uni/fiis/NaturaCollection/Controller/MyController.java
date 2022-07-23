package pe.edu.uni.fiis.NaturaCollection.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pe.edu.uni.fiis.NaturaCollection.Domain.Persona;
import pe.edu.uni.fiis.NaturaCollection.Domain.PersonaNatural;
import pe.edu.uni.fiis.NaturaCollection.Response.PersonaNaturalResponse;
import pe.edu.uni.fiis.NaturaCollection.Response.PersonaResponse;
import pe.edu.uni.fiis.NaturaCollection.Service.MyServiceImpl;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 96000L)
@RestController
public class MyController {
    @Autowired
    private MyServiceImpl myService;

    @PostMapping(value = "/registrar",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonaResponse RegisterUser(@RequestBody Persona request){
        PersonaResponse response = this.myService.RegisterUser(request);
        if(response.getPersona() == null){
            response.setError("Error de registro");
        }

        return response;
    }
    @PostMapping(value = "/registrarPersonaNatural",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonaNaturalResponse RegistrarPersonaNatural(@RequestBody PersonaNatural request){
        PersonaNaturalResponse response = this.myService.RegistrarPersonaNatural(request);
        if(response.getPersonaNatural() == null){
            response.setError("Error de registro de persona natural");
        }

        return response;
    }
    @GetMapping(value = "/ObtenerPersonas",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Persona> ObtenerPersonas(){
        return this.myService.ObtenerPersonas();
    }
}
