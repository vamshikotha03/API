package com.keshtechnologies.candidateServices;

import com.keshtechnologies.Entity.SubmissionEntity;
import com.keshtechnologies.Repository.SubmissionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@DataMongoTest
public class SubmissionRepositoryTest {

    @Mock
    private SubmissionRepository submissionRepository;

    private SubmissionRepository submissionRepositoryUnderTest;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        submissionRepositoryUnderTest = Mockito.mock(SubmissionRepository.class);
    }

    @Test
    public void testFindByDate() {
        // Given
        String date = "2023-07-11";
        SubmissionEntity submissionEntity = new SubmissionEntity();
        submissionEntity.setDate(date);
        List<SubmissionEntity> expectedList = Collections.singletonList(submissionEntity);
        when(submissionRepositoryUnderTest.findByDate(date)).thenReturn(expectedList);

        // When
        List<SubmissionEntity> resultList = submissionRepositoryUnderTest.findByDate(date);

        // Then
        assertEquals(expectedList, resultList);
    }

    @Test
    public void testFindByStatus() {
        // Given
        String status = "pending";
        SubmissionEntity submissionEntity = new SubmissionEntity();
        submissionEntity.setStatus(status);
        List<SubmissionEntity> expectedList = Collections.singletonList(submissionEntity);
        when(submissionRepositoryUnderTest.findByStatus(status)).thenReturn(expectedList);

        // When
        List<SubmissionEntity> resultList = submissionRepositoryUnderTest.findByStatus(status);

        // Then
        assertEquals(expectedList, resultList);
    }
}
