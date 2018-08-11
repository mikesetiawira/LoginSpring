package repository;

import domain.User;
import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, String> {

    //find both username and password no fancy encoding will be made for now
    @Query(nativeQuery = true,value="")
    User findByUsernameAndPassword(@Param("username")String userName, @Param("password")String password);
}
