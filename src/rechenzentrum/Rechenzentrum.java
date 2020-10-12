package rechenzentrum;

public class Rechenzentrum {

	private String name;
	
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

	public static void main(String[] args)
	{
		new Rechenzentrum("OH12");
	}
}
