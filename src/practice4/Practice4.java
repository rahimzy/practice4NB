/*
 * Breshna Rahimzy
 * Student ID: 991487145
 *     SYST10199 - WEB Programming
 */
package practice4;

/**
 *
 * @author USER
 */
public class Practice4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int num = 10;
        System.out.println(num);
                A cc = new A();
        cc.setName("Fred");
        cc.setAge(12);
        System.out.println("cc name is: " + cc.getName()+ "\t"+"Age is:" + "\t"+ cc.getAge());
    }
    
}
class A{
    private String name;
    private int age;

public void setName(String givenName){
this.name = givenName;
}
public String getName(){
    return this.name;
}
public void setAge(int givenAge){
    this.age = givenAge;
}
public int getAge(){
    return this.age;
}
}
