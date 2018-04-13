package com.example.multilab.app2.Repository;

import com.example.multilab.app2.Entities.Deiktes;
import com.example.multilab.app2.Entities.DhmosDeiktes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface DhmosDeiktesRepository extends JpaRepository<DhmosDeiktes,Long> {

    @Query(value = "SELECT * FROM deiktes d WHERE d.ID=?1",nativeQuery = true)
    DhmosDeiktes findDhmosDeiktesById(Long id);

    @Query(value = "SELECT dd.ID,dd.DHMOS_ID,dd.DEIKTES_ID,dd.STADIO FROM dhmos_deiktes as dd , deiktes as dei ,aksones as aks " +
            "WHERE dd.DEIKTES_ID = dei.ID AND dei.AKSONES_ID = aks.ID AND aks.ARXES_ID = ?1",
            nativeQuery = true)
    List<DhmosDeiktes> findDhmosDeiktesByArxh(Long id);
}
