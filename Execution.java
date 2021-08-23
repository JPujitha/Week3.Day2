package week3.Day2.Assignmnets;

public class Execution extends Desktop {

	public void hardwareResources() {
		System.out.println("Hardware Resource method from First Interafce");
	}

	public void softwareResources() {
		System.out.println("SoftwareResources method from Second interface");
	}

	@Override
	public void desktopModel() {
		System.out.println("DesktopModel from Abstract class");
	}

	public static void main(String[] args) {
		Execution obj = new Execution();
		obj.hardwareResources();
		obj.softwareResources();
		obj.desktopModel();
		obj.ceoncrete();

	}

}
