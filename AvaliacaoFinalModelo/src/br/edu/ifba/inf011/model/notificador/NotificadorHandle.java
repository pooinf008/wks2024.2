package br.edu.ifba.inf011.model.notificador;

import br.edu.ifba.inf011.model.evento.Evento;

public interface NotificadorHandle {
    public void setProximo(NotificadorHandle proximo);
    public void processar(Evento evento);	
}
