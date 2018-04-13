package com.example.multilab.app2.Repository;

import com.example.multilab.app2.Entities.Deiktes;
import com.example.multilab.app2.Entities.Dhmos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface DhmosRepository extends JpaRepository<Dhmos,Long> {

    @Query(value = "SELECT * FROM dhmos d WHERE d.ID=?1",nativeQuery = true)
    Dhmos findDhmosById  (Long id);
}
