package com.imen.gestionStock.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {

    private Integer id;

    private  String roleName;
    private UtilisateurDto utilisateur;
}
