package com.example.multilab.app2.service;

import com.example.multilab.app2.Entities.Arxes;
import com.example.multilab.app2.dto.ArxesDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArxesService {

    List<ArxesDto> getArxesDtos();

    ArxesDto findArxesByID(Long id);

    Arxes save(ArxesDto arxesDto);
}
