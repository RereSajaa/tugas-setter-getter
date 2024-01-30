
package user;


public class Main {
    public static void main(String[] args){
        User petani = new User();
        
        petani.setUsername("Petani");
        petani.setPassword("javaJava");
        
        System.out.println("Username :" + petani.getUsername());
        System.out.println("Password :" + petani.getPassword());
            
        }
    }

