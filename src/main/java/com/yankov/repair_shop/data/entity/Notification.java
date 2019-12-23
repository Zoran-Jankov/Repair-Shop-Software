package main.java.com.yankov.repair_shop.data.entity;

import java.sql.Timestamp;

import main.java.com.yankov.repair_shop.data.EntityType;

public class Notification extends AbstractEntity
{
	private NotificationType notificationType;
	private Ticket ticket;
	private User user;
	private Timestamp timestamp;
	private String comment;
	
	@Override
	public EntityType getEntityType()
	{
		return EntityType.NOTIFICATION;
	}
	
	public NotificationType getNotificationType()
	{
		return notificationType;
	}
	
	public void setNotificationType(NotificationType notificationType)
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
		notificationType.removeReference(this.getId());
		ticket.removeReference(this.getId());
		user.removeReference(this.getId());
	}
}