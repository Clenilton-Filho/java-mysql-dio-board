package br.com.dio.persistence.entity;

import java.util.stream.Stream;

// Enum representando os tipos de colunas no board
public enum BoardColumnKindEnum {

    INITIAL, FINAL, CANCEL, PENDING;

    // Método para encontrar o enum pelo nome
    public static BoardColumnKindEnum findByName(final String name){
        return Stream.of(BoardColumnKindEnum.values())
                .filter(b -> b.name().equals(name))
                .findFirst().orElseThrow();
    }

}
