package ar.com.marete.patrones.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class CompetenciaNacional implements IListadoStrategy {

	public List getListado(ArrayList lista) {
		List resultado = new ArrayList();
		resultado = lista.subList(0, 3);
		return resultado;
	}

}
