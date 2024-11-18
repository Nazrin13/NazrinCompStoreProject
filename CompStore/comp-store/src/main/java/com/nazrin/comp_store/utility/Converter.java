package com.nazrin.comp_store.utility;

import com.nazrin.comp_store.dto.CPUDTO;
import com.nazrin.comp_store.dto.ComputerDTO;
import com.nazrin.comp_store.dto.GPUDTO;
import com.nazrin.comp_store.dto.OSDTO;
import com.nazrin.comp_store.dto.ProducerDTO;
import com.nazrin.comp_store.dto.UserDTO;
import com.nazrin.comp_store.model.CPU;
import com.nazrin.comp_store.model.Computer;
import com.nazrin.comp_store.model.GPU;
import com.nazrin.comp_store.model.OS;
import com.nazrin.comp_store.model.Producer;
import com.nazrin.comp_store.model.User;

public class Converter {
    public static ComputerDTO convertToDto(Computer computer) {
        ComputerDTO computerDTO = new ComputerDTO();
        computerDTO.setId(computer.getId());
        computerDTO.setName(computer.getName());
        computerDTO.setProducer(convertToDto(computer.getProducer()));
        computerDTO.setState(computer.getState());
        computerDTO.setPrice(computer.getPrice());
        computerDTO.setDescrition(computer.getDescrition());
        computerDTO.setRam(computer.getRam());
        computerDTO.setCpu(convertToDto(computer.getCpu()));
        computerDTO.setRom(computer.getRom());
        computerDTO.setRomType(computer.getRomType());
        computerDTO.setOs(convertToDto(computer.getOs()));
        computerDTO.setGpu(convertToDto(computer.getGpu()));
        computerDTO.setImgURL(computer.getImgURL());
        computerDTO.setUser(convertToDto(computer.getUser()));
        return computerDTO;
    }

    public static ProducerDTO convertToDto(Producer producer) {
        ProducerDTO producerDTO = new ProducerDTO();
        producerDTO.setId(producer.getId());
        producerDTO.setName(producer.getName());
        return producerDTO;
    }

    public static Producer convertToDao(ProducerDTO producerDTO) {
        Producer producer = new Producer();
        producer.setId(producerDTO.getId());
        producer.setName(producerDTO.getName());
        return producer;
    }

    public static CPUDTO convertToDto(CPU cpu) {
        CPUDTO cpudto = new CPUDTO();
        cpudto.setId(cpu.getId());
        cpudto.setName(cpu.getName());
        return cpudto;
    }

    public static CPU convertToDao(CPUDTO cpu) {
        CPU cpudao = new CPU();
        cpudao.setId(cpu.getId());
        cpudao.setName(cpu.getName());
        return cpudao;
    }

    public static OSDTO convertToDto(OS os) {
        OSDTO osdto = new OSDTO();
        osdto.setId(os.getId());
        osdto.setName(os.getName());
        return osdto;
    }

    public static OS convertToDao(OSDTO osdto) {
        OS osdao = new OS();
        osdao.setId(osdto.getId());
        osdao.setName(osdto.getName());
        return osdao;
    }

    public static GPUDTO convertToDto(GPU gpu) {
        GPUDTO gpudto = new GPUDTO();
        gpudto.setId(gpu.getId());
        gpudto.setName(gpu.getName());
        return gpudto;
    }

    public static GPU convertToDao(GPUDTO gpu) {
        GPU gpudao = new GPU();
        gpudao.setId(gpu.getId());
        gpudao.setName(gpu.getName());
        return gpudao;
    }

    public static UserDTO convertToDto(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setName(user.getName());
        userDTO.setSurname(user.getSurname());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        return userDTO;
    }

    public static User convertToDao(User user) {
        User userDao = new User();
        userDao.setId(user.getId());
        userDao.setUsername(user.getUsername());
        userDao.setName(user.getName());
        userDao.setSurname(user.getSurname());
        userDao.setEmail(user.getEmail());
        userDao.setPassword(user.getPassword());
        return userDao;
    }



    // public static Computer convertToDao(ComputerDao computerDao) {
    //     Computer computer = new Computer();
    //     computer.setId(computer.getId());
    //     computer.setProducer(convertToDao(computer.getProducer()));
    //     computer.setState(computer.getState());
    //     computer.setName(computer.getName());
    //     computer.setPrice(computer.getPrice());
    //     computer.setDescrition(computer.getDescrition());
    //     computer.setRam(computer.getRam());
    //     computer.setCpu(convertToDao(computer.getCpu()));
    //     computer.setRom(computer.getRom());
    //     computer.setRomType(computer.getRomType());
    //     computer.setOs(convertToDao(computer.getOs()));
    //     computer.setGpu(convertToDao(computer.getGpu()));
    //     computer.setImgURL(computer.getImgURL());
    //     computer.setUser(convertToDao(computer.getUser()));
    //     return computer;
    // }




} 
