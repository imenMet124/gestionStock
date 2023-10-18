package com.imen.gestionStock.dto;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Builder
public class LigneCommandeClientDto {

    private ArticleDto article;
    private CommandeClientDto commandeClient;
    private BigDecimal prixUnitaire;
    private BigDecimal quantite;
}