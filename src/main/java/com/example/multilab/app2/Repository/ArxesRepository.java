package com.example.multilab.app2.Repository;

import com.example.multilab.app2.Entities.Arxes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ArxesRepository extends JpaRepository<Arxes,Long> {

    @Query(value = "SELECT * FROM arxes a WHERE a.ID=?1",nativeQuery = true)
    Arxes findArxesById(Long id);


}