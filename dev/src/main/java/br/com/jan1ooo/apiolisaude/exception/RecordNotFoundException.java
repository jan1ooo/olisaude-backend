package br.com.jan1ooo.apiolisaude.exception;

public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException(Long id){
        super("Registro não encontrado com o id: " + id);
    }
}
