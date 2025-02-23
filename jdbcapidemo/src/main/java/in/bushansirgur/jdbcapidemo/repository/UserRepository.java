package in.bushansirgur.jdbcapidemo.repository;

import in.bushansirgur.jdbcapidemo.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserRepository {

    private final JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //CREATE
    public void createUser(User user) {
        String sql = "INSERT INTO tbl_users(name, email) VALUES(?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail());
    }
    //READ
    public List<User> findAll() {
        return jdbcTemplate.query("SELECT * FROM tbl_users", userRowMapper);
    }

    private RowMapper<User> userRowMapper = new RowMapper<User>() {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setEmail(rs.getString("email"));
            return user;
        }
    };
    //UPDATE
    public User findUserById(Long id) {
        String sql = "SELECT * FROM tbl_users WHERE id=?";
        return jdbcTemplate.queryForObject(sql, userRowMapper, id);
    }
    public void update(User user) {
        String sql = "UPDATE tbl_users SET name=?, email=? WHERE id=?";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getId());
    }
    //DELETE
    public void deleteUser(Long id) {
        String sql = "DELETE FROM tbl_users WHERE id=?";
        jdbcTemplate.update(sql, id);
    }



}
