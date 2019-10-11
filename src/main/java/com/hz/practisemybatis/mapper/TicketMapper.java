package com.hz.practisemybatis.mapper;

import com.hz.practisemybatis.domain.Ticket;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("ticketMapper")
public interface TicketMapper {
    boolean saveTicket(Ticket ticket);
    Ticket getTicket(Ticket ticket);
}
