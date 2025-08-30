package br.com.dio.dto;

import br.com.dio.persistence.entity.BoardColumnKindEnum;

// DTO para informações básicas de uma coluna do board
public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}
