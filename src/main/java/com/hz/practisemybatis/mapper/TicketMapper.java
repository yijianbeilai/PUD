package com.hz.practisemybatis.mapper;

import com.hz.practisemybatis.domain.Ticket;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("ticketMapper")
public interface TicketMapper {
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
