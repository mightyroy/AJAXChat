
package ajaxtestpackage;

import java.io.IOException;
import java.io.StringWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


/**
 * Servlet implementation class ChatHandler
 */
@WebServlet("/ChatHandler")
public class ChatHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChatHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//String latestMessage = request.getParameter("message").toString();
		//System.out.println(latestMessage);
		//gson.fromJson("{'sender':'roy','message':'hello'}", Message.class);
		//System.out.println(gson);
		
		
		
		DatabaseConnect.databaseConnect();
		System.out.println("DatabseConnect");
		
		
		
		String lastmessage = request.getParameter("lastmessage");
		
		if (lastmessage != null && lastmessage !=""){
			System.out.println("last message = " + lastmessage);
			
			int conversation_ID = 1;
			String sender ="Roy";
			java.util.Date date= new java.util.Date();
			Timestamp timesent = new Timestamp(date.getTime());
			try {
				DatabaseConnect.messageToDatabase(conversation_ID, sender, lastmessage, timesent);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		ArrayList<Note> noteArray  = new ArrayList<Note>();
		Note note;
		
		try {
			ResultSet result = DatabaseConnect.getConversationNotes(1);
			
			JsonArray list = new JsonArray();
			while(result.next()) {
			    // ... get column values from this record
				note = new Note(result.getInt("conversation_ID"), result.getString("sender"), result.getString("message"), result.getTimestamp("time_sent") );
				noteArray.add(note);
				
				JsonObject jsonEntry = new JsonObject(); 
				jsonEntry.addProperty("conversation_ID",result.getInt("conversation_ID"));
				jsonEntry.addProperty("sender",result.getString("sender"));
				jsonEntry.addProperty("message",result.getString("message"));
				jsonEntry.addProperty("time_sent",result.getTimestamp("time_sent").toString());
				list.add(jsonEntry);
				
				System.out.println(jsonEntry);
				
				
			}
			response.setContentType("text/html");
			response.getWriter().write(list.toString());
			
//			Gson gson = new GsonBuilder().setPrettyPrinting().create();
//			JsonParser jp = new JsonParser();
//			JsonElement je = jp.parse(list.toString());
//			String prettyJsonString = gson.toJson(je);
//			System.out.println(prettyJsonString);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
