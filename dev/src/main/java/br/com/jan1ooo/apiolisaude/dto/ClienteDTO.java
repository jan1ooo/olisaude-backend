package br.com.jan1ooo.apiolisaude.dto;

import br.com.jan1ooo.apiolisaude.model.Sexo;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

public record ClienteDTO(
        Long id_cliente,
        @NotEmpty @NotNull @Length(max = 50, min = 3) String nome,
        @NotNull @NotNull Sexo sexo,
        @NotNull @NotEmpty Integer problemaSaude,
        @JsonFormat(pattern = "dd-MM-yyyy HH:mm") LocalDateTime dataCriacao,
        @JsonFormat(pattern = "dd-MM-yyyy HH:mm") @Future LocalDateTime dataAutorizacao
) {
}
