package pe.edu.idat.app_ventas_idat.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderid;
    private Date orderdate;
    private Date requireddate;
    private Date shippeddate;
    private Integer shipvia;
    private Double freight;
    private String shipname;
    private String shipaddress;
    private String shipcity;
    private String shipregion;
    private String shippostalcode;
    //@Column(name="sipcountry")  // Mas especifico, te arroja el error si te equivocas al escribir atributos
    private String shipcountry;
    @ManyToOne
    @JoinColumn(name="customerid")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name="employeeid")
    private Employee employee;

}
