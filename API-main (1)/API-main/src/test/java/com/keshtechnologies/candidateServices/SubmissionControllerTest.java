package com.keshtechnologies.candidateServices;

import com.keshtechnologies.Controller.SubmissionController;
import com.keshtechnologies.Model.SubmissionModel;
import com.keshtechnologies.Service.SubmissionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class SubmissionControllerTest {
    private MockMvc mockMvc;

    @Mock
    private SubmissionService submissionService;

    private SubmissionController submissionController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        submissionController = new SubmissionController(submissionService);
        mockMvc = MockMvcBuilders.standaloneSetup(submissionController).build();
    }






    @Test
    public void testGetDetailsByDate() throws Exception {

        String date = "2023-07-11";
        List<SubmissionModel> submissionModels = Collections.singletonList(new SubmissionModel());
        when(submissionService.getDetailsbyDate(date)).thenReturn(submissionModels);
         mockMvc.perform(MockMvcRequestBuilders.get("/submissionDetails/{date}", date))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].date").value(submissionModels.get(0).getDate()))
                .andExpect(jsonPath("$[0].vendorName").value(submissionModels.get(0).getVendorName()))
                .andExpect(jsonPath("$[0].vendorCompanyName").value(submissionModels.get(0).getVendorCompanyName()))
                .andExpect(jsonPath("$[0].vendorMailId").value(submissionModels.get(0).getVendorMailId()))
                .andExpect(jsonPath("$[0].vendorPhoneNumber").value(submissionModels.get(0).getVendorPhoneNumber()))
                .andExpect(jsonPath("$[0].implementation").value(submissionModels.get(0).getImplementation()))
                .andExpect(jsonPath("$[0].client").value(submissionModels.get(0).getClient()))
                .andExpect(jsonPath("$[0].submitted").value(submissionModels.get(0).isSubmitted()))
                .andExpect(jsonPath("$[0].workType").value(submissionModels.get(0).getWorkType()))
                .andExpect(jsonPath("$[0].type").value(submissionModels.get(0).getType()))
                .andExpect(jsonPath("$[0].payRate").value(submissionModels.get(0).getPayRate()))
                .andExpect(jsonPath("$[0].status").value(submissionModels.get(0).getStatus()));
          verify(submissionService).getDetailsbyDate(date);
    }

    @Test
    public void testGetDetailsByStatus() throws Exception {
          String status = "pending";
        List<SubmissionModel> submissionModels = Collections.singletonList(new SubmissionModel());
        when(submissionService.getDetailsbyStatus(status)).thenReturn(submissionModels);
         mockMvc.perform(MockMvcRequestBuilders.get("/submissionDetail/{status}", status))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].date").value(submissionModels.get(0).getDate()))
                .andExpect(jsonPath("$[0].vendorName").value(submissionModels.get(0).getVendorName()))
                .andExpect(jsonPath("$[0].vendorCompanyName").value(submissionModels.get(0).getVendorCompanyName()))
                .andExpect(jsonPath("$[0].vendorMailId").value(submissionModels.get(0).getVendorMailId()))
                .andExpect(jsonPath("$[0].vendorPhoneNumber").value(submissionModels.get(0).getVendorPhoneNumber()))
                .andExpect(jsonPath("$[0].implementation").value(submissionModels.get(0).getImplementation()))
                .andExpect(jsonPath("$[0].client").value(submissionModels.get(0).getClient()))
                .andExpect(jsonPath("$[0].submitted").value(submissionModels.get(0).isSubmitted()))
                .andExpect(jsonPath("$[0].workType").value(submissionModels.get(0).getWorkType()))
                .andExpect(jsonPath("$[0].type").value(submissionModels.get(0).getType()))
                .andExpect(jsonPath("$[0].payRate").value(submissionModels.get(0).getPayRate()))
                .andExpect(jsonPath("$[0].status").value(submissionModels.get(0).getStatus()));
        // Verify that the service method was called with the correct argument
        verify(submissionService).getDetailsbyStatus(status);
    }

}
