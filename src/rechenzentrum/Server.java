package rechenzentrum;

public class Server {

	private String name;
	private boolean poweredOn;
	private short cpuCores;
	private int ramInMiB;
	private int hardDiskSizeInGb;
	
	public Server(String name, boolean poweredOn, short cpuCores, int ramInMiB, int hardDiskSizeInGb)
	{
		this.name = name;
		this.poweredOn = poweredOn;
		this.cpuCores = cpuCores;
		this.ramInMiB = ramInMiB;
		this.hardDiskSizeInGb = hardDiskSizeInGb;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPoweredOn() {
		return poweredOn;
	}

	public void setPoweredOn(boolean poweredOn) {
		this.poweredOn = poweredOn;
	}

	public short getCpuCores() {
		return cpuCores;
	}

	public void setCpuCores(short cpuCores) {
		this.cpuCores = cpuCores;
	}

	public int getRamInMiB() {
		return ramInMiB;
	}

	public void setRamInMiB(int ramInMiB) {
		this.ramInMiB = ramInMiB;
	}

	public int getHardDiskSizeInGb() {
		return hardDiskSizeInGb;
	}

	public void setHardDiskSizeInGb(int hardDiskSizeInGb) {
		this.hardDiskSizeInGb = hardDiskSizeInGb;
	}
	
	@Override
	public String toString() {
		return String.format("Server\n"
				+ "=====\n"
				+ "* Name: %s\n"
				+ "* Powered On: %s\n"
				+ "* CPU Cores: %d\n"
				+ "* RAM: %d MiB\n"
				+ "* Hard Disk Size: %d GB\n", 
				name, poweredOn, cpuCores, ramInMiB, hardDiskSizeInGb);
	}
}
