package com.nazrin.comp_store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nazrin.comp_store.dto.CPUDTO;
import com.nazrin.comp_store.dto.GPUDTO;
import com.nazrin.comp_store.dto.OSDTO;
import com.nazrin.comp_store.dto.ProducerDTO;
import com.nazrin.comp_store.service.AdminService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    //-----------------------CPU-----------------------
    @GetMapping("/main")
    public String getAdminMainPage(Model model) {
        return "admin-main";
    }

    @GetMapping("/cpu")
    public String getCpuPage(Model model) {
        model.addAttribute("cpus", adminService.getAllCpus());
        return "cpu-page";
    }

    @GetMapping("/cpu/add")
    public String getAddCpuPage(Model model) {
        model.addAttribute("cpu", new CPUDTO());
        return "add-cpu";
    }

    @PostMapping("/cpu/save")
    public String saveCpu(@Valid @ModelAttribute("cpu") CPUDTO cpudto, BindingResult result) {
        if (result.hasErrors()) return "add-cpu";
        adminService.saveCPU(cpudto);
        return "redirect:/admin/cpu";
    }

    @GetMapping("/cpu/change/{id}")
    public String getEditCpuPage(@ModelAttribute("id") int id, Model model) {
        model.addAttribute("cpu", adminService.getCpu(id));
        return "add-cpu";
    }

    @GetMapping("/cpu/delete/{id}")
    public String deleteCpu(@ModelAttribute("id") int id) {
        adminService.deleteCPU(id);
        return "redirect:/admin/cpu";
    }
    
    //-----------------------GPU-----------------------
    @GetMapping("/gpu")
    public String getGpuPage(Model model) {
        model.addAttribute("gpus", adminService.getAllGpus());
        return "gpu-page";
    }

    @GetMapping("/gpu/add")
    public String getAddGpuPage(Model model) {
        model.addAttribute("gpu", new GPUDTO());
        return "add-gpu";
    }

    @PostMapping("/gpu/save")
    public String saveGpu(@Valid @ModelAttribute("gpu") GPUDTO gpudto, BindingResult result) {
        if (result.hasErrors()) return "add-gpu";
        adminService.saveGPU(gpudto);
        return "redirect:/admin/gpu";
    }

    @GetMapping("/gpu/change/{id}")
    public String getEditGpuPage(@ModelAttribute("id") int id, Model model) {
        model.addAttribute("gpu", adminService.getGPU(id));
        return "add-gpu";
    }

    @GetMapping("/gpu/delete/{id}")
    public String deleteGpu(@ModelAttribute("id") int id) {
        adminService.deleteGPU(id);
        return "redirect:/admin/gpu";
    }

    //-----------------------Producer------------------
    @GetMapping("/producer")
    public String getProducerPage(Model model) {
        model.addAttribute("producers", adminService.getAllProducers());
        return "producer-page";
    }

    @GetMapping("/producer/add")
    public String getAddProducerPage(Model model) {
        model.addAttribute("producer", new ProducerDTO());
        return "add-producer";
    }

    @PostMapping("/producer/save")
    public String saveProducer(@Valid @ModelAttribute("producer") ProducerDTO producerDTO, BindingResult result) {
        if (result.hasErrors()) return "add-producer";
        adminService.saveProducer(producerDTO);
        return "redirect:/admin/producer";
    }

    @GetMapping("/producer/change/{id}")
    public String getEditProducerPage(@ModelAttribute("id") int id, Model model) {
        model.addAttribute("producer", adminService.getProducer(id));
        return "add-producer";
    }

    @GetMapping("/producer/delete/{id}")
    public String deleteProducer(@ModelAttribute("id") int id) {
        adminService.deleteProducer(id);
        return "redirect:/admin/producer";
    }

    //-----------------------OS------------------------
    @GetMapping("/os")
    public String getOSPage(Model model) {
        model.addAttribute("oses", adminService.getAllOSes());
        return "os-page";
    }

    @GetMapping("/os/add")
    public String getAddOSPage(Model model) {
        model.addAttribute("os", new OSDTO());
        return "add-os";
    }

    @PostMapping("/os/save")
    public String saveOS(@Valid @ModelAttribute("os") OSDTO osdto, BindingResult result) {
        if (result.hasErrors()) return "add-os";
        adminService.saveOS(osdto);
        return "redirect:/admin/os";
    }

    @GetMapping("/os/change/{id}")
    public String getEditOSPage(@ModelAttribute("id") int id, Model model) {
        model.addAttribute("os", adminService.getOS(id));
        return "add-os";
    }

    @GetMapping("/os/delete/{id}")    
    public String deleteOS(@ModelAttribute("id") int id) {
        adminService.deleteOS(id);
        return "redirect:/admin/os";    
    }
}
