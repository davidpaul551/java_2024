package pac1;

public class TC004_GettersandSetters {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC004_GettersandSetters obj = new TC004_GettersandSetters();
		obj.setName("David");
		System.out.println("Name is "+obj.getName());
		obj.setAge(22);
		System.out.println("Age is "+obj.getAge());

	}

}
