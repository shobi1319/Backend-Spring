public class Man {
    int age, height, weight;
    String name, occupation, address;

    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }
    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }
    public String getOccupation() {
        return occupation;
    }
    public String getAddress() {
        return address;
    }


   public static void  Eat(){
        System.out.println("I am eating Jalebi");
    }
    private static void  Sleep(){
        System.out.println("I am sleeping");
    }
    private static void  Say(){
        System.out.println("I am is saying Hello");
    }
}
