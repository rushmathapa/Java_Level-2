package EmployementManagementSystem.copy;

public enum PositionEnum {
	MANAGER("manager", 1), SERVER("server", 2), HOST("Host", 3);

	private String value;
	private int id;

	private PositionEnum(String value, int id) {
		this.value = value;
		this.id = id;
	}

	public String getValue() {
		return value;

	}

	public int getId() {
		return id;

	}
	public static PositionEnum findPositionById(int id) {
		for (PositionEnum position : PositionEnum.values()) {
			if(position.id == id) {
				return position;
			}
		}
		return null;
		
	}
	

}
