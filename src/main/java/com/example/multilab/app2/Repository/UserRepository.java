package com.example.multilab.app2.Repository;


import com.example.multilab.app2.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<Users,Long> {


    @Query(value = "SELECT * FROM users u WHERE u.ID=?1",nativeQuery = true)
    Users findUsersById(Long id);

    Users findByUsername(String username);

}
