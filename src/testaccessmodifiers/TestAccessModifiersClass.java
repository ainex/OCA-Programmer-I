package testaccessmodifiers;

import classstructure.MyPublicClass;

/**
 * Which members of MyPublicClass can be seen from here
 */
public class TestAccessModifiersClass {
    public static void main(String[] args) {
        System.out.println(MyPublicClass.staticPublicField);

        MyPublicClass myPublicClass = new MyPublicClass();
        myPublicClass.publicField = "I can mutate  you";
        //not accessible
//        System.out.println(myPublicClass.defaultField); Error:(15, 41) java: defaultField is not public in classstructure.MyPublicClass; cannot be accessed from outside package
//        System.out.println(myPublicClass.protectedField); Error:(16, 41) java: protectedField has protected access in classstructure.MyPublicClass
//        System.out.println(myPublicClass.privateField);Error:(17, 41) java: privateField has private access in classstructure.MyPublicClass

    }



}
