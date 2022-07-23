package pe.edu.uni.fiis.NaturaCollection.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.edu.uni.fiis.NaturaCollection.Domain.Persona;
import pe.edu.uni.fiis.NaturaCollection.Domain.PersonaNatural;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public class MyDaoImpl implements MyDao {
    @Autowired
    private JdbcTemplate template;
    @Override
    public Persona RegisterUser(Persona request) {

        this.template.update("call CREAR_PERSONA(?,?)",
                request.getTipoPersona(),request.getFechaRegistro());
        /*
        String sql = "insert into persona (id_persona,tipo_persona,fecha_registro) values (?,?,?) ";
        this.template.update(sql,
                new Object[]{
                        String.valueOf(request.getIdPersona()),
                        request.getTipoPersona(),
                        request.getFechaRegistro()
                });
        */

        return request;
    }

    @Override
    public List<Persona> ObtenerPersonas() {
        List<Persona>lista=null;
        try{
            List<Map<String, Object>> filas = this.template.queryForList(

                    " select id_persona, tipo_persona, fecha_registro from persona ");

            lista = new ArrayList<>();

            for (Map<String, Object> fila : filas) {
                Persona p = new Persona();
                p.setIdPersona((String)fila.get("id_persona"));
                p.setTipoPersona((String)fila.get("tipo_persona"));
                p.setFechaRegistro((Date) fila.get("fecha_registro"));
                lista.add(p);
            }
        }catch (Exception ex){
            ex.printStackTrace();
            return lista;
        }
        return lista;
    }

    @Override
    public PersonaNatural RegistrarPersonaNatural(PersonaNatural request) {
        this.template.update("call crear_persona_natural(?,?,?,?,?,?)",
                request.getTipoPersona(),request.getFechaRegistro(),
                request.getNombres(),request.getApellidos(),request.getDni(),request.getSexo());
        return request;
    }
}
