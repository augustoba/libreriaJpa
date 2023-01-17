
package libreriaJPA1.Entities;


import javax.persistence.*;

@Entity // le indica a jpa que es una entidad para poder mapearla en la db
public class Autor {

    @Id // le indica que es el id para la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)// le ingresa un id autoincremental    
    private Integer id;
    @Basic
    private String nombre;
    private Boolean alta;

    public Autor() {
    }

    public Autor(Integer id, String nombre, Boolean alta) {
        this.id = id;
        this.nombre = nombre;
        this.alta = alta;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public Integer getId() {
        return id;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor(" + "id:" + id + ", nombre:" + nombre + ", alta:" + alta + ')';
    }
    
}
