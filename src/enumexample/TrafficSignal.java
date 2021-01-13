package enumexample;

public enum TrafficSignal {

	RED("wait"), GREEN("go"), ORANGE("slow down");

	private String action;

	TrafficSignal(String action) {
		System.out.println("inside constructor class...");
		this.action = action;
	}

	public String getAction() {
		return this.action;
	}

}
