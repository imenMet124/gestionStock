package com.imen.gestionStock.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import lombok.Data;
import org.apache.logging.log4j.CloseableThreadContext;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;


@Data


@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @CreatedDate
    @Column(name="creationDate", nullable =false)
    @JsonIgnore
    private Instant creationDate;

    @LastModifiedDate
    @Column(name="lastModifiedDate", nullable =false)
    @JsonIgnore
    private Instant lastModifiedDate;

}
