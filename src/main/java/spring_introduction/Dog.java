package spring_introduction;

public class Dog implements Pet{


    public void init (){
        System.out.println("method init");
    }

    public void destroy (){
        System.out.println("method destroy");
    }
    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}
