package ajaxtestpackage;

import java.sql.Timestamp;

public class Note {
	private int conversation_ID;
	private String sender;
	private String message;
	private Timestamp time_sent;
	


	public Note(int conversation_ID, String sender, String message, Timestamp timestamp ) {
		this.conversation_ID = conversation_ID;
		this.sender = sender;
		this.message = message;
		this.time_sent = timestamp;
	}
	
	public int getConversationID(){
		return conversation_ID;
	}
	
	public String getSender(){
		return sender;
	}
	
	public String getMessage(){
		return message;
	}
	
	public Timestamp getTimeSent(){
		return time_sent;
	}

}
