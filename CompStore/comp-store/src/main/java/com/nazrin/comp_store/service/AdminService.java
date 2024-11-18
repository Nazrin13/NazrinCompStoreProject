package com.nazrin.comp_store.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nazrin.comp_store.dto.CPUDTO;
import com.nazrin.comp_store.dto.GPUDTO;
import com.nazrin.comp_store.dto.OSDTO;
import com.nazrin.comp_store.dto.ProducerDTO;
import com.nazrin.comp_store.repository.CPURepository;
import com.nazrin.comp_store.repository.GPURepository;
import com.nazrin.comp_store.repository.OSRepository;
import com.nazrin.comp_store.repository.ProducerRepository;
import com.nazrin.comp_store.utility.Converter;

@Service
public class AdminService {

    @Autowired 
    private CPURepository cpuRepository;

    @Autowired 
    private GPURepository gpuRepository;

    @Autowired 
    private ProducerRepository producerRepository;

    @Autowired 
    private OSRepository osRepository; 

    //-----------------------CPU-----------------------
    
    public List<CPUDTO> getAllCpus() { // Gets all CPUs 
        return cpuRepository.findAll().stream().map(Converter:: convertToDto).collect(Collectors.toList());
    }

    public void saveCPU(CPUDTO cpudto) { //Adds/Updates CPU
        cpuRepository.save(Converter.convertToDao(cpudto));
    }

    public void deleteCPU(int id) {
        cpuRepository.deleteById(id);
    }

    public CPUDTO getCpu(int id) { //Gets CPU by id
        return Converter.convertToDto(cpuRepository.findById(id).get());
    }


    //-----------------------GPU-----------------------
    public List<GPUDTO> getAllGpus() {
        return gpuRepository.findAll().stream().map(Converter:: convertToDto).collect(Collectors.toList());
    }

    public void saveGPU(GPUDTO gpudto) {
        gpuRepository.save(Converter.convertToDao(gpudto));
    }

    public void deleteGPU(int id) {
        gpuRepository.deleteById(id);
    }

    public GPUDTO getGPU(int id) {
        return Converter.convertToDto(gpuRepository.findById(id).get());
    }

    //-----------------------Producer------------------
    public List<ProducerDTO> getAllProducers() {
        return producerRepository.findAll().stream().map(Converter:: convertToDto).collect(Collectors.toList());
    }

    public void saveProducer(ProducerDTO producerDto) {
        producerRepository.save(Converter.convertToDao(producerDto));
    }

    public void deleteProducer(int id) {
        producerRepository.deleteById(id);
    }

    public ProducerDTO getProducer(int id) {
        return Converter.convertToDto(producerRepository.findById(id).get());
    }

    //-----------------------OS------------------------
    public List<OSDTO> getAllOSes() {
        return osRepository.findAll().stream().map(Converter:: convertToDto).collect(Collectors.toList());
    }

    public void saveOS(OSDTO osdto) {
        osRepository.save(Converter.convertToDao(osdto));
    }

    public void deleteOS(int id) {
        osRepository.deleteById(id);
    }

    public OSDTO getOS(int id) {
        return Converter.convertToDto(osRepository.findById(id).get());
    }

}
