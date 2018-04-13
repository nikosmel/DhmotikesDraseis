package com.example.multilab.app2.Repository;

import com.example.multilab.app2.Entities.Deiktes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface DeiktesRepository extends JpaRepository<Deiktes,Long> {


    @Query(value = "SELECT * FROM deiktes d WHERE d.ID=?1",nativeQuery = true)
    Deiktes findDeiktesById(Long id);

}