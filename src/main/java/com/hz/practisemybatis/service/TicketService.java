package com.hz.practisemybatis.service;

import com.hz.practisemybatis.domain.Ticket;

public interface TicketService {
    boolean saveTicket(Ticket ticket);
    Ticket getTicket(Ticket ticket);
}
