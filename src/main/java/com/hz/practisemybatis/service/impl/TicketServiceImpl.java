package com.hz.practisemybatis.service.impl;

import com.hz.practisemybatis.domain.Ticket;
import com.hz.practisemybatis.mapper.TicketMapper;
import com.hz.practisemybatis.service.TicketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
}
