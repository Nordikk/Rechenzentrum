package rechenzentrum;

import java.util.ArrayList;
import java.util.List;

public class Rack {
	private String name;
	private List<Server> servers = new ArrayList<>();
	
	public List<Server> getServers() {
		return servers;
	}
	
	public void addServer(Server server)
	{
		getServers().add(server);
	}
	
	public Rack(String name)
	{
		this.name = name;

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void start()
	{
		for(Server server : servers)
		{
			server.setPoweredOn(true);
		}
	}
	
	public void status()
	{
		for(Server server : servers)
		{
			server.setPoweredOn(false);
		}
	}
	
	public void stop()
	{
		for(Server server : servers)
		{
			server.setPoweredOn(false);
		}
	}

	@Override
	public String toString() {
		
		String str = "Rack\n"
				+ "====\n"
				+ "* Name: " + name + "\n"
				+ "----\n";
		
		for(Server server : servers)
		{
			str += server;
		}
		
		return str;
	}
	
	
}
