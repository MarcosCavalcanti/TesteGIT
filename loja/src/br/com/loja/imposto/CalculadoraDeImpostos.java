package br.com.loja.imposto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {
	
	public BigDecimal calcular(Orcamento orcamento, Imposto tipoImposto)
	{
		return tipoImposto.Calcular(orcamento);
		
		
	}

}
