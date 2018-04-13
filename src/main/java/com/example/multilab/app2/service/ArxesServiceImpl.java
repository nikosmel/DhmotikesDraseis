package com.example.multilab.app2.service;

import com.example.multilab.app2.Entities.Arxes;
import com.example.multilab.app2.Entities.Deiktes;
import com.example.multilab.app2.Repository.AksonesRepository;
import com.example.multilab.app2.Repository.ArxesRepository;
import com.example.multilab.app2.Repository.DeiktesRepository;
import com.example.multilab.app2.dto.ArxesDto;
import com.example.multilab.app2.dto.DeiktesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArxesServiceImpl implements ArxesService {

    @Autowired
    ArxesRepository arxesRepository;

    @Autowired
    AksonesRepository aksonesRepository;

    @Autowired
    DeiktesRepository deiktesRepository;

    @Override
    public List<ArxesDto> getArxesDtos(){
        List<Arxes> arxes = arxesRepository.findAll();
        List<ArxesDto> arxesDto = new ArrayList<>();
        arxes.stream().forEach(arxh ->
            arxesDto.add(new ArxesDto(arxh)));
        return arxesDto;
    }

    @Override
    public ArxesDto findArxesByID(Long id) {
        return new ArxesDto(arxesRepository.findArxesById(id));
    }

    @Override
    public Arxes save(ArxesDto arxesDto) {
        List<DeiktesDto> deiktesDtos = new ArrayList<>();
        arxesDto.getAksonesDtos().stream().forEach(aksonesDto ->
                aksonesDto.getDeiktesDtos().stream().forEach(deiktesDto ->
                        deiktesDtos.add(deiktesDto)));
        for (DeiktesDto deikthsDto: deiktesDtos) {
            Deiktes tempDeikths = deiktesRepository.findDeiktesById(deikthsDto.getId());
            tempDeikths.setStadio(deikthsDto.getStadio());
            tempDeikths = deiktesRepository.save(tempDeikths);
        }
        Arxes arxes = arxesRepository.findArxesById(arxesDto.getId());
        arxes.setStadio(arxesDto.getStadio());
        arxesRepository.save(arxes);
        return null;
    }
}
