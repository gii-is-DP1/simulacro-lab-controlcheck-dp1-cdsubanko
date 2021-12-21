package org.springframework.samples.petclinic.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Check;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity 
@Table(name="products")
@Check(constraints = "price >= 0")
public class Product {

    @Id
    Integer id;

    @NotEmpty
    @Size(min =3, max = 50)
    String name;

    @NotEmpty
    @Min(value = 0)
    //@PositiveOrZero
    @Column(name = "price")
    double price;

    @ManyToOne
    @JoinColumn(name = "type")
    ProductType productType;
}
