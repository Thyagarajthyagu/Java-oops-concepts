package constractionchaining;
class father1{
	father1(){
		this(20);
		System.out.println("age");
	}	
	father1(int x){
		System.out.println("work"+x);

	}
}
class son extends father1{
	son(int x){
		this();
		System.out.println("young"+x);
	}
	son(){
		super();
		System.out.println("unemploye");
	}
}
class daughter extends son{
	daughter(){
		this("raj");
		System.out.println("age");
	}
	daughter(String name){
		super();
		System.out.println("name");
	}
}

class father{
	public static void main(String[] args) {
		daughter s= new daughter();
	}
}

