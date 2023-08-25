package in.fssa.globalfuncity.service;

import java.sql.SQLException;
import java.util.List;

import com.google.protobuf.ServiceException;

import in.fssa.globalfuncity.dao.TicketDAO;
import in.fssa.globalfuncity.exception.PersistenceException;
import in.fssa.globalfuncity.exception.ValidationException;
import in.fssa.globalfuncity.model.Ticket;
import in.fssa.globalfuncity.validator.TicketValidator;

public class TicketService {
/**
 * 
 * @param ticket
 * @return
 * @throws ValidationException
 * @throws PersistenceException
 * @throws SQLException 
 */
	
	// Book Ticket 
	
	public void bookTicket(Ticket ticket)throws ValidationException, PersistenceException, SQLException {

		TicketValidator.validate(ticket);
		TicketDAO ticketDAO = new TicketDAO();
		int aprice = ticketDAO.getPrice("adult");
		int cprice = ticketDAO.getPrice("children");
		
		ticket.setAdultPrice(aprice);
		ticket.setChildrenPrice(cprice);
		
		ticketDAO.bookNewTicket(ticket);
		
		//System.out.println(aprice);
		//System.out.print(cprice);
		//return aprice;
    }

	
/**
 * 
 * @param userId
 * @return
 * @throws PersistenceException 
 */
    public List<Ticket> getAllBookedTicketsByUserId(int userId) throws ServiceException, PersistenceException {
        try {
           TicketDAO ticketDAO = new TicketDAO();
           return ticketDAO.getAllBookedHistoryByUserId(userId);
        } catch (PersistenceException e) {
        	throw new ServiceException("Error occurred while retrieving tickets.", e);
        }
    }

	
}
