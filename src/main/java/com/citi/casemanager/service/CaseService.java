package com.citi.casemanager.service;

import org.springframework.stereotype.Service;

@Service
public class CaseService {


//    private final CaseRepository caseRepository;
//
//    private final CaseProcessService caseProcessService;
//
//    public CaseService(CaseRepository caseRepository, CaseProcessService caseProcessService) {
//        this.caseRepository = caseRepository;
//        this.caseProcessService = caseProcessService;
//    }
//
//    public Case createCase(Case caseDetails) {
//        // Save the case in the database
//        Case savedCase = caseRepository.save(caseDetails);
//        // Start the BPMN process for the case
//        return caseProcessService.startCaseProcess(savedCase);
//    }
//
//    public Case moveCase(Long caseId, String decision) {
//        Optional<Case> optionalCase = caseRepository.findById(caseId);
//        if (optionalCase.isPresent()) {
//            // Update the case using the process management service
//            return caseProcessService.moveCaseProcess(caseId, decision);
//        }
//        throw new RuntimeException("Case not found");
//    }
}

