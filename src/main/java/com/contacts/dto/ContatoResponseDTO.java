package com.contacts.dto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContatoResponseDTO {

    private Long idContato;
    private String nome;
    private String email;
    private String telefone;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dataNascimento;
    private List<EnderecoResponseDTO> enderecos = new ArrayList<>();

}
