package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
public class ProdutoRequestCreateDto {
    private String nome;
	private BigDecimal valor;
}
