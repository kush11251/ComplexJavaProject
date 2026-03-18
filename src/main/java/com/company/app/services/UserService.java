import com.company.app.models.User;
import com.company.app.repositories.UserRepository;
import java.util.List;

public interface UserService {
    List<User> getUsers();
}