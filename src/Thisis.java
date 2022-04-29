public class Thisis {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.age = 8;
        animal1.name = ("Marley");
        animal1.getInfo();
    }
}
class Animal{
    String name;
    int age;

    public void setName(String theName) {
        name = theName;
        System.out.println(name);
    }
    public void setAge(int theAge){
        age = theAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void getInfo(){
        System.out.println(name + " , " +age);
    }
}

