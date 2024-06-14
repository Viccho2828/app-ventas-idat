package pe.edu.idat.app_ventas_idat.model.bd;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="categories")
public class Category {
    @Id
    private Integer categoryid;
    private String categoryname;
    private String description;

}
