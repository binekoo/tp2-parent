package fr.upec.episen;

public class UserController {
    public void greet(){
        String output = UserDAO.hello();
        System.out.println(output);
    }
}
