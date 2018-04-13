package com.example.multilab.app2.Repository;

import com.example.multilab.app2.Entities.Aksones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AksonesRepository extends JpaRepository<Aksones,Long> {

    @Query(value = "SELECT * FROM aksones a WHERE a.ID=?1",nativeQuery = true)
    Aksones findAksonesById(Long id);


}
