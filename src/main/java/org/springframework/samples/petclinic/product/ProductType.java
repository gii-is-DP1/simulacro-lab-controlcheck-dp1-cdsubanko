package org.springframework.samples.petclinic.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "producttypes")
public class ProductType {

    @Id
    Integer id;
    
    @NotEmpty
    @Size(min=3, max=50)
    

    @Column(unique = true)
    String name;

   
}
