package designpatterns.creationaldesignpatterns.singleton;

public class Singleton {
//    we need to create a variable which can access within class only and access globally. means (private static )
//    To store the instance of the class
//    we store the instance in that so using class name we need to create
    private static  Singleton instance;

//    make constructor private so external objection can be stopped
    private Singleton(){
//   Database logic comes here
    }

//    To create instance we create public method we can that method using class name and in that we can create the instance
//    if it is null we create instance, and we return it or else we return previous instance.
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}


