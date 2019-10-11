package com.hz.practisemybatis.controller;

import com.hz.practisemybatis.domain.Ticket;
import com.hz.practisemybatis.service.TicketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("ticket")
public class TicketController {
    @Resource
    private TicketService ticketService;
    @RequestMapping("saveTicket")
    public boolean saveTicket(Ticket ticket){
        return ticketService.saveTicket(ticket);
    }
    @RequestMapping("getTicket")
    public Ticket getTicket(Ticket ticket){
        return ticketService.getTicket(ticket);
    }

}
