package br.com.dio.exception;

// Exceção lançada quando uma operação é tentada em um card já concluído
public class CardFinishedException extends RuntimeException{

    public CardFinishedException(final String message) {
        super(message);
    }
}
