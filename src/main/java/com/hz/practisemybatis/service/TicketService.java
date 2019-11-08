package com.hz.practisemybatis.service;

import com.hz.practisemybatis.domain.Ticket;

import java.util.List;

public interface TicketService {
    boolean saveTicket(Ticket ticket);
    Ticket getTicket(Ticket ticket);
    boolean saveTicketExceptPassenger(Ticket ticket);
    boolean addTicketList(List<Ticket> list);
    List<Ticket> getTicketsByStation(Ticket ticket);
    Ticket getTicketFirst(Ticket ticket);
    boolean updatePid(Ticket ticket);
    boolean updatePidNull(Ticket ticket);
    List<String> getStation();
    List<String> getDestinationByStation(Ticket ticket);
}
