package prob2;

public abstract class Bird {
	
	public String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void bird01(String name){
		System.out.println(name + "의 이름은 " +"입니다" );
	}

	public void fly(){
		
	}
	
	public void sing(){
		
	}
	
}
