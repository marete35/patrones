package ar.com.marete.patrones.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class CompentenciaInternacional implements IListadoStrategy{

	public List getListado(ArrayList lista) {
		ArrayList resultado = new ArrayList();
		resultado.add(lista.get(0));
		return resultado;
	}

}
