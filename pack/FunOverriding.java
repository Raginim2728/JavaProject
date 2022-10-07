package product.pack;
class Parent{
	 void show(){ //default
	    System.out.println("Parent class");
	}
}
class Child extends Parent{
  void show(){ //default
	    System.out.println("child class");
	    super.show();//super is used to call overridden methods
	}

	}

public class FunOverriding {

	public static void main(String[] args) {
		Child cob=new Child();
		cob.show();
		Parent pob=new Child();
		pob.show();//calls parent class method directly

	}

}
