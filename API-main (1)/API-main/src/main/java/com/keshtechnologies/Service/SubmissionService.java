package com.keshtechnologies.Service;


import com.keshtechnologies.Entity.SubmissionEntity;
import com.keshtechnologies.Model.SubmissionModel;
import com.keshtechnologies.Repository.SubmissionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubmissionService {
    @Autowired
    SubmissionRepository submissionRepository;
    public void createSubmissionForm(SubmissionModel submissionModel) {
        SubmissionEntity submissionEntity=new SubmissionEntity();
        submissionEntity.setClient(submissionModel.getClient());
        submissionEntity.setStatus(submissionModel.getStatus());
        submissionEntity.setDate(submissionModel.getDate());
        submissionEntity.setImplementation(submissionModel.getImplementation());
        submissionEntity.setType(submissionModel.getType());
        submissionEntity.setSubmitted(submissionModel.isSubmitted());
        submissionEntity.setPayRate(submissionModel.getPayRate());
        submissionEntity.setVendorCompanyName(submissionModel.getVendorCompanyName());
        submissionEntity.setVendorMailId(submissionModel.getVendorMailId());
        submissionEntity.setVendorName(submissionModel.getVendorName());
        submissionEntity.setVendorPhoneNumber(submissionModel.getVendorPhoneNumber());
        submissionEntity.setWorkType(submissionModel.getWorkType());
        submissionRepository.save(submissionEntity);
    }

    public List<SubmissionModel> getDetailsbyDate(String date) {
        List<SubmissionEntity> submissionEntities=submissionRepository.findByDate(date);
        List<SubmissionModel> submissionModels=new ArrayList<>();
        for(SubmissionEntity submissionEntity:submissionEntities){
            SubmissionModel submissionModel=new SubmissionModel();
            BeanUtils.copyProperties(submissionEntity,submissionModel);
            submissionModels.add(submissionModel);
        }
        return submissionModels;
    }

    public List<SubmissionModel> getDetailsbyStatus(String status) {
        List<SubmissionEntity> submissionEntities=submissionRepository.findByStatus(status);
        List<SubmissionModel> submissionModels=new ArrayList<>();
        for(SubmissionEntity submissionEntity:submissionEntities){
            SubmissionModel submissionModel=new SubmissionModel();
            BeanUtils.copyProperties(submissionEntity,submissionModel);
            submissionModels.add(submissionModel);
        }
        return submissionModels;
    }
}
