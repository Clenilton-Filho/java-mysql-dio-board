package br.com.dio.dto;

import java.time.OffsetDateTime;

// DTO que representa os detalhes de um card
public record CardDetailsDTO(Long id,
                             String title,
                             String description,
                             boolean blocked,
                             OffsetDateTime blockedAt,
                             String blockReason,
                             int blocksAmount,
                             Long columnId,
                             String columnName
) {
}
