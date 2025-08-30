package br.com.dio.dto;

import java.util.List;

// DTO para detalhes do board, incluindo suas colunas
public record BoardDetailsDTO(Long id,
                              String name,
                              List<BoardColumnDTO> columns) {
}
