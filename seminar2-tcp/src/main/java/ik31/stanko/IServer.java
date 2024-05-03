package ik31.stanko;

import java.util.List;

import ik31.stanko.UserInfo.Message;

public interface IServer {

	void onClientDisconnected(ConnectionHandler connectionHandler);

	boolean userExists(String username);
	
	boolean login(String username, String password, ConnectionHandler connection);
	
	public boolean isAuthenticated(ConnectionHandler connection);
	
	String[] getUsers();
	
	boolean sendMessage(ConnectionHandler connection, String user, String message);
	
	boolean sendFile(ConnectionHandler connection, String user, String message, byte[] content);
	
	Message receiveMessage(ConnectionHandler connection);
	
	Message receiveFile(ConnectionHandler connection);
}
