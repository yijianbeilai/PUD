package com.hz.practisemybatis.service.impl;

import com.hz.practisemybatis.domain.Ticket;
import com.hz.practisemybatis.mapper.TicketMapper;
import com.hz.practisemybatis.service.TicketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ticketService")
public class TicketServiceImpl implements TicketService {
    @Resource
    private TicketMapper ticketMapper;

    @Override
    public boolean saveTicket(Ticket ticket) {
        return ticketMapper.saveTicket(ticket);
    }

    @Override
    public Ticket getTicket(Ticket ticket) {
        return ticketMapper.getTicket(ticket);
    }

    @Override
    public boolean saveTicketExceptPassenger(Ticket ticket) {
        return ticketMapper.saveTicketExceptPassenger(ticket);
    }

    @Override
    public boolean addTicketList(List<Ticket> list) {
        return ticketMapper.addTicketList(list);
    }

    @Override
    public List<Ticket> getTicketsByStation(Ticket ticket) {
        return ticketMapper.getTicketsByStation(ticket);
    }

    @Override
    public Ticket getTicketFirst(Ticket ticket) {
        return ticketMapper.getTicketFirst(ticket);
    }

    @Override
    public boolean updatePid(Ticket ticket) {
        return ticketMapper.updatePid(ticket);
    }

    @Override
    public boolean updatePidNull(Ticket ticket) {
        return ticketMapper.updatePidNull(ticket);
    }

    @Override
    public List<String> getStation() {
        return ticketMapper.getStation();
    }
    public List<String> getDestinationByStation(Ticket ticket){
        return ticketMapper.getDestinationByStation(ticket);
    }
}
