package com.example.multilab.app2.controller;


import com.example.multilab.app2.Entities.Arxes;
import com.example.multilab.app2.Entities.Deiktes;
import com.example.multilab.app2.Entities.Dhmos;
import com.example.multilab.app2.Entities.DhmosDeiktes;
import com.example.multilab.app2.Repository.DeiktesRepository;
import com.example.multilab.app2.Repository.DhmosDeiktesRepository;
import com.example.multilab.app2.Repository.DhmosRepository;
import com.example.multilab.app2.Repository.UserRepository;
import com.example.multilab.app2.dto.ArxesDto;
import com.example.multilab.app2.dto.DhmosDeiktesDto;
import com.example.multilab.app2.enumerations.RadioButtons;
import com.example.multilab.app2.service.ArxesService;
import com.example.multilab.app2.service.ArxesServiceImpl;
import com.example.multilab.app2.service.DhmosDeiktesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class WebController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ArxesService arxesService;

    @Autowired
    DhmosRepository dhmosRepository;

    @Autowired
    DeiktesRepository deiktesRepository;

    @Autowired
    DhmosDeiktesRepository dhmosDeiktesRepository;

    @Autowired
    DhmosDeiktesService dhmosDeiktesService;

    ModelMapper modelMapper = new ModelMapper();

    @RequestMapping(value = "/")
    public String process(Model model){

        List<ArxesDto> arxesDtos = arxesService.getArxesDtos();
        model.addAttribute("arxesDtos",arxesDtos);

        return "index";
    }


    @RequestMapping("/arxh" + "/{arxhId}")
    public String getArxh( @PathVariable(required = false) Long arxhId,Model model){

        ArxesDto arxh = arxesService.findArxesByID(arxhId);
        List<DhmosDeiktesDto> dhmosDeiktesDtos = dhmosDeiktesService.findAllDhmosDeiktesByArxh(arxhId);
        model.addAttribute("dhmosDeiktesDtos" , dhmosDeiktesDtos);
        model.addAttribute("arxesDto",arxh);
        model.addAttribute("radioButtons",RadioButtons.getAllButtons());
        return "arxh";
    }

    @RequestMapping(value = "/saveArxh", method = RequestMethod.POST)
    public String saveArxh(Model model, @ModelAttribute("arxesDto") ArxesDto arxesDto){
        //Arxes arxes = modelMapper.map(arxesDto,Arxes.class);
        arxesService.save(arxesDto);
        return  "redirect:/";
    }

    @RequestMapping(value = "/setData")
    public String setData(Model model){

        Dhmos dhmos = dhmosRepository.findDhmosById(1L);
        List<Deiktes> deiktesList = deiktesRepository.findAll();
        deiktesList.stream().forEach(deiktes ->
                dhmosDeiktesRepository.save(new DhmosDeiktes(dhmos,deiktes))
        );
        return "index";
    }

}