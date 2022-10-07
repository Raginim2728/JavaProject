package todaypgm;

class StringOverLoad

public void StringOverload
String s=str.toLowerCase();
System.out.println("Vowels present in a string");
for(int i=0;i<str.length();i++)
{
	char ch=str.charAt(i);
	if(ch=='a' ch=='e' ch=='i' ch=='o' ch=='u')
		System.out.println(ch+',');
}
}
System.out.println();
}
  
public void reversestr(String str){  
    for(int i=s.length()-1;i>=0;i--)
    	System.out.println(s.charAt(i));
}  
}  

public class FunctionOverLoads {

	public static void main(String[] args) {
		StringOverLoad ob=new StringOverLoad();
		ob.check("success",'s');
		ob.check("EdubridgeIndia");
		ob.reversestr("computer");
	}

}
