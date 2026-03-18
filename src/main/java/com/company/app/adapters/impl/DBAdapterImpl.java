import java.sql.Connection;
import java.sql.SQLException;

public class DBAdapterImpl implements DBAdapter {
    @Override
    public Connection getConnection() {
        try {
            return DBUtils.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}