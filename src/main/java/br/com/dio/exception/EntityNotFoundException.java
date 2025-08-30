package br.com.dio.exception;

// Exceção lançada quando uma entidade não é encontrada no sistema
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String message) {
        super(message);
    }

}
