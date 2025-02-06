package middleware;

/**
 * ConcreteHandler. Checks a user's role.
 */

public class RoleCheckModdleware extends Middleware{
    public boolean check(String email, String password){
        if(email.equals("admin@example.com")){
            System.out.println("Hello, admin");
            return true;
        }
        System.out.println("Hello User!");
        return checkNext(email, password);
    }
}   
