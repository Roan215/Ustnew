package Tasks;

public abstract class Appliance implements SmartHomeDevice {
String brand;
String status;
public String getStatus() {
	return status;
}
abstract void adjustSettings(int level);
}