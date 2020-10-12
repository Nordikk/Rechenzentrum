package rechenzentrum;

import java.util.ArrayList;
import java.util.List;

public class Rechenzentrum {

	private String name;
	private List<Rack> racks = new ArrayList<>();
	
	public Rechenzentrum(String name)
	{
		this.name = name;

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Rack> getRacks() {
		return racks;
	}
	
	public void addRacks(Rack rack)
	{
		getRacks().add(rack);
	}
	
	public void start()
	{
		System.out.println("Starte Rechenzentrum");
		
		for(Rack rack : racks)
		{
			 rack.start();
		}
	}
	
	public void status()
	{
		System.out.println("Status:");
		
		for(Rack rack : racks)
		{
			System.out.println(rack);
		}
	}
	
	public void stop()
	{
		System.out.println("Stoppe Rechenzentrum");
		
		for(Rack rack : racks)
		{
			rack.stop();
		}
	}

	public static void main(String[] args)
	{
		Rechenzentrum rechenzentrum = new Rechenzentrum("OH12");
		
		Rack rack1 = new Rack("Informatik-Rack 1");
		Rack rack2 = new Rack("Informatik-Rack 2");
		Rack rack3 = new Rack("Informatik-Rack 3");
		Rack rack4 = new Rack("Informatik-Rack 4");
		
		Server kiDnsServer = new Server("Lehrstuhl KI-DNS", false, (short)4, 16384, 1000);
		Server vpnServer = new Server("Pulse Secure VPN", false, (short)4, 8192, 500);
		Server loadBalancer = new Server("Load Balancer", false, (short)8, 32768, 1000);
		Server bluecat = new Server("Bluecat IP Address Manager", false, (short)8, 16384, 1000);
		
		rack1.addServer(kiDnsServer);
		rack2.addServer(vpnServer);
		rack3.addServer(loadBalancer);
		rack4.addServer(bluecat);
		
		rechenzentrum.addRacks(rack1);
		rechenzentrum.addRacks(rack2);
		rechenzentrum.addRacks(rack3);
		rechenzentrum.addRacks(rack4);
		
		rechenzentrum.start();
		rechenzentrum.status();
		rechenzentrum.stop();
		rechenzentrum.status();
	}
}
