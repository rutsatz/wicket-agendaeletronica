package br.com.timtec.agendaeletronica;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class Criar extends BasePage {

	private static final long serialVersionUID = 1L;

	public Criar() {
		add(new Label("titulo", "Criação de Contato"));
	}

}
