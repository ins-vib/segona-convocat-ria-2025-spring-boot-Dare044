package com.exemple.futbolmini.controller;

import com.exemple.futbolmini.model.Partit;
import com.exemple.futbolmini.repository.PartitRepository;
import com.exemple.futbolmini.repository.EquipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/partits")
public class PartitController {

    @Autowired
    private PartitRepository partitRepo;

    @Autowired
    private EquipRepository equipRepo;

    @GetMapping
    public String llistarPartits(Model model) {
        model.addAttribute("partits", partitRepo.findAll());
        return "partits/llista";
    }

    @GetMapping("/editar/{id}")
    public String editarPartit(@PathVariable Long id, Model model) {
        Partit partit = partitRepo.findById(id).orElseThrow();
        model.addAttribute("partit", partit);
        return "partits/form";
    }

    @PostMapping("/guardar")
    public String guardarResultat(@ModelAttribute Partit partit) {
        int puntsLocal = calcularPunts(partit.getGolsLocal(), partit.getGolsVisitant());
        int puntsVisitant = calcularPunts(partit.getGolsVisitant(), partit.getGolsLocal());

        partit.setResultatLocal(puntsLocal);
        partit.setResultatVisitant(puntsVisitant);

        partitRepo.save(partit);
        return "redirect:/partits";
    }

    private int calcularPunts(int gols1, int gols2) {
        if (gols1 > gols2) return 3;
        if (gols1 == gols2) return 1;
        return 0;
    }
}
