package com.example.multilab.app2.service;

import com.example.multilab.app2.Entities.DhmosDeiktes;
import com.example.multilab.app2.Repository.DhmosDeiktesRepository;
import com.example.multilab.app2.dto.DhmosDeiktesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DhmosDeiktesService {

    @Autowired
    DhmosDeiktesRepository dhmosDeiktesRepository;

    public List<DhmosDeiktesDto> findAllDhmosDeiktes(){
        List<DhmosDeiktes> dhmosDeiktesList = dhmosDeiktesRepository.findAll();
        List<DhmosDeiktesDto> dhmosDeiktesDtoList = new ArrayList<>();
        dhmosDeiktesList.stream().forEach(
                dhmosDeiktes -> dhmosDeiktesDtoList.add(new DhmosDeiktesDto(dhmosDeiktes))
        );
        return dhmosDeiktesDtoList;
    }

    public List<DhmosDeiktesDto> findAllDhmosDeiktesByArxh(Long arxhId){
        List<DhmosDeiktes> dhmosDeiktesList = dhmosDeiktesRepository.findDhmosDeiktesByArxh(arxhId);
        List<DhmosDeiktesDto> dhmosDeiktesDtoList = new ArrayList<>();
        dhmosDeiktesList.stream().forEach(
                dhmosDeiktes -> dhmosDeiktesDtoList.add(new DhmosDeiktesDto(dhmosDeiktes))
        );
        return dhmosDeiktesDtoList;
    }
}
