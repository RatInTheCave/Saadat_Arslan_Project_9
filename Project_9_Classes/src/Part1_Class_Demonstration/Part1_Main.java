package Part1_Class_Demonstration;

// 1.2. Public method


import java.util.Scanner;

public class Part1_Main {
    public static void main(String[] args) {
        //Part 1.1 Object creation
        MyClass obj = new MyClass();
        //Part 1.2 Public method call
        MyClassWithMethod obj2 = new MyClassWithMethod();
        obj2.print("obj2");
        //Part 1.3 Private method call. This method is commented out. If called, the program will warn that it can't be called due to being a private method.
        //obj2.showError();
        //Part 1.4 Constructor demonstration.
        ConstructorExample obj3 = new ConstructorExample();
        //Part 1.5 Demonstration of public data types. The following variables exist in the PublicDemonstration class, and are used by the obj4 object
        PublicDemonstration obj4 = new PublicDemonstration();
        obj4.PublicBoolean = true;
        obj4.PublicInt = 1;
        obj4.PublicString = "Public";
        System.out.println(obj4.PublicString);
        System.out.println(obj4.PublicBoolean);
        System.out.println(obj4.PublicInt);
        //Part 1.6 Demonstration of private data types. While the object obj5 is created, attempting to perform operations with the private variables will lead to an error
        PrivateDemonstration obj5 = new PrivateDemonstration();
        /*obj5.PrivateBoolean = false;
        obj5.PrivateInt = 0;
        obj5.PrivateString = "Private";
        System.out.println(obj5.PrivateString);
        System.out.println(obj5.PrivateBoolean);
        System.out.println(obj5.PrivateInt);*/
        //Part 1.7 Setters and Getters
        GettersAndSettersDemonstration GetSetGo = new GettersAndSettersDemonstration();
        GetSetGo.setName("Snowflake");
        GetSetGo.setCount(6);
        GetSetGo.setYesOrNo(true);
        System.out.println(GetSetGo.getYesOrNo() + ": a " + GetSetGo.getName() + " has " + GetSetGo.getCount() + " sides");
        //Part 1.8 Constructors with arguments
        Scanner scanObj = new Scanner(System.in);
        //In this case, "System.in" is an argument of our constructor, and "scanObj" is an object created
        ConstructorWithArguments ConWithArg = new ConstructorWithArguments("Constructor With Argument is called");

    }
}
