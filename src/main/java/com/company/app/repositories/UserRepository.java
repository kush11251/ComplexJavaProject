import com.company.app.models.User;
import java.util.List;

public interface UserRepository {
    List<User> getUsers();
}