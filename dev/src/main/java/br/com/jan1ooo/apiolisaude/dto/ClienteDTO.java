package br.com.jan1ooo.apiolisaude.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.util.List;

public record ClienteDTO(
        @NotEmpty @NotNull @Length(max = 50, min = 3) String nome,
        @NotNull @NotEmpty String sexo
) {
}
