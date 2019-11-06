package com.repair_shop.data;

import java.sql.Timestamp;

public class Notification extends AbstractDataElement
{
	private Property notificationType;
	private Ticket ticket;
	private User user;
	private Timestamp timestamp;
	private String comment;
	
	public Property getNotificationType()
	{
		return notificationType;
	}
	
	public void setNotificationType(Property notificationType)
	{
		this.notificationType = notificationType;
	}
	
	public Ticket getTicket()
	{
		return ticket;
	}
	
	public void setTicket(Ticket ticket)
	{
		this.ticket = ticket;
	}
	
	public User getUser()
	{
		return user;
	}
	
	public void setUser(User user)
	{
		this.user = user;
	}
	
	public Timestamp getDate()
	{
		return timestamp;
	}
	
	public void setDate(Timestamp date)
	{
		this.timestamp = date;
	}
	
	public String getComment()
	{
		return comment;
	}
	
	public void setComment(String notification)
	{
		this.comment = notification;
	}
	
	@Override
	public void createReferences()
	{
		notificationType.addReference(this);
		ticket.addReference(this);
		user.addReference(this);
	}
	
	@Override
	public void deleteReferences()
	{
		notificationType.removeReference(this.getID());
		ticket.removeReference(this.getID());
		user.removeReference(this.getID());
	}

	@Override
	public boolean hasUniqueString()
	{
		return false;
	}

	@Override
	public boolean isReferencable()
	{
		return true;
	}
}