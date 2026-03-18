import java.sql.Connection;

public interface DBAdapter {
    Connection getConnection();
}