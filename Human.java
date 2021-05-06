public class Human {
   String name;
   int age;
   int weight;
   
   Human(String name,int age,int weight){
	   
	   this.name = name;
	   this.age = age;
	   this.weight = weight;
   }
   
   void eat() {
	   System.out.println(name + "eat bread of egg");
   }
   
   void drink() {
	   System.out.println(name + "drink milk in breakfast");
   }
}
