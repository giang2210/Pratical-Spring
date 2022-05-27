package com.example.demo.service;

import com.example.demo.entity.Candidate;
import com.example.demo.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;
    public List<Candidate> findPage(){
        return candidateRepository.findAll();
    }
    public Candidate save(Candidate candidate){
        return candidateRepository.save(candidate);
    }

}
