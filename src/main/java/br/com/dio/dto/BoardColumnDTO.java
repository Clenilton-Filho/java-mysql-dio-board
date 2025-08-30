package br.com.dio.dto;

import br.com.dio.persistence.entity.BoardColumnKindEnum;

// DTO para transferência de dados das colunas do board
public record BoardColumnDTO(Long id,
                             String name,
                             BoardColumnKindEnum kind,
                             int cardsAmount) {
}
