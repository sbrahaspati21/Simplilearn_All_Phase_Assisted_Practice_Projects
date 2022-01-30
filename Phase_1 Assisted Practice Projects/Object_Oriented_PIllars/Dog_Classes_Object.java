
package Object_Oriented_PIllars;
public class Dog_Classes_Object 
{  
    String name; 
    String breed; 
    int age; 
    String color; 
    public Dog_Classes_Object(String name, String breed, int age, String color) 
    { 
        this.name = name; 
        this.breed = breed; 
        this.age = age; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public String getBreed() 
    { 
        return breed; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ ".\nMy breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and"+ this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
        Dog_Classes_Object scott = new Dog_Classes_Object("Scott","papillon", 5, "black"); 
        System.out.println(scott.toString()); 
    } 
}
