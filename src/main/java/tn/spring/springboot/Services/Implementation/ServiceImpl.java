package tn.spring.springboot.Services.Implementation;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Services.Interfaces.IServices;
import tn.spring.springboot.repositories.ClientRepository;


@Service
@Slf4j
public class ServiceImpl implements IServices {

    @Autowired
    ClientRepository clientRepository;


}
