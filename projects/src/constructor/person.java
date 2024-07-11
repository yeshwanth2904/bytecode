package constructor;

public class person {
   private String name;
   private int age;
   person(String name,int age)
   {
	this.name=name;
	this.age=age;
   }
public void introduce() {
	System.out.println("Hello,my name is" +  name +"and I am "+ age + "years old");
}
public static void main(String[] args)
{
	person person = new person("Alice", 30);
	person.introduce();
	}
}