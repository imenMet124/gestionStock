package com.imen.gestionStock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lignevente" )
@EqualsAndHashCode(callSuper = true)

public class LigneVente extends AbstractEntity {
}
