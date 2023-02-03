import org.example.User;
import org.junit.jupiter.api.Test;

public class UserTest {
    User user1 = new User("anna", "anna@mail.ru");
    User user2 = new User(null,null);

    @Test
    public void createNewUser() {
        System.out.println(user1.getLogin());
        System.out.println(user1.getEmail());
    }

    @Test
    public void createUserWithNull() {
        System.out.println(user2.getLogin());
        System.out.println(user2.getEmail());
    }

    @Test
    public void validEmail() {
        if(user1.getEmail().contains("@") & user1.getEmail().contains(".")) {
            System.out.println("Корректный email");
        } else {
            System.out.println("Некорректный email! email должен содержать знаки @ и .");
        }
    }

    @Test
    public void equalsEmailAndLogin() {
        if(user1.getEmail().equals(user1.getLogin())) {
            System.out.println("Поля логина и почты не могут быть равны!");
        } else {
            System.out.println("Поля пароля и почты не равны");
        }
    }
}
