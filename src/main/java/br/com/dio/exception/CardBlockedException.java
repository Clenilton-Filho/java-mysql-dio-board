package br.com.dio.exception;


// Exceção lançada quando uma operação é tentada em um card bloqueado
public class CardBlockedException extends RuntimeException{

    public CardBlockedException(final String message) {
        super(message);
    }
}
