package com.keshtechnologies.Repository;


import com.keshtechnologies.Entity.SubmissionEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SubmissionRepository extends MongoRepository<SubmissionEntity,String> {



    List<SubmissionEntity> findByDate(String date);

    List<SubmissionEntity> findByStatus(String status);
}
