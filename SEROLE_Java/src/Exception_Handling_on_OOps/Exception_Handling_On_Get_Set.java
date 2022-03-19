package Exception_Handling_on_OOps;

class Iphone {
	String Model;
	String Feature;
	int Cost;

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getFeature() {
		return Feature;
	}

	public void setFeature(String feature) {
		Feature = feature;
	}

	public int getCost() {
		return Cost;
	}

	public void setCost(int cost) {
		Cost = cost;
	}
}

class ios extends Iphone {

	int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}

public class Exception_Handling_On_Get_Set {
	public static void main(String[] args) {
		ios obj = new ios();
		obj.setModel("13 pro max");
		obj.setFeature("Pro res");
		obj.setVersion(15);
		try {
			System.out.println(obj.getVersion());
			System.out.println(obj.getModel().charAt(89)); // raises exception here
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Iam catch execute if try block have exception");
		} finally {
			System.out.println("Iam finally i allways excecutes if catch handled exception or not");
		}

	}
}
