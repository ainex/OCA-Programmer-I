package scope;
 import java.util.List;

/**
 *
 */
public class ScopeExample {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            //why is it allowed to re-declare variable in this scope?
            //a: scope is destroyed every iteration
            int j = 5+i;
            System.out.println(j);
        }

        //You can also do this, for the similar reason
        {
            int someInteger = 3;
        }
        {
            int someInteger = 13;
        }

        //By the way, Java does not allow local variable shadowing, which might be inconvenient

        int x = 3;
        {
            //int x = 13; // error!
        }

        //Consumer<Integer> consumer = (x)-> System.out.println(x);  // ERROR!
        // lambda parameter is treated like local variable

       // Runnable r = ()->{ int x; ... } // ERROR
        // lambda body is treated like local block
    }
}
