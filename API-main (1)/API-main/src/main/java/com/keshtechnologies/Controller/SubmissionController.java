package com.keshtechnologies.Controller;


import com.keshtechnologies.Model.SubmissionModel;
import com.keshtechnologies.Service.SubmissionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class SubmissionController {
  private SubmissionService submissionService;

    public SubmissionController(SubmissionService submissionService) {
        this.submissionService = submissionService;
    }

    @PostMapping("/submissionForm")
public void createSubmissionForm(@RequestBody SubmissionModel submissionModel){
        submissionService.createSubmissionForm(submissionModel);
}
@GetMapping("/submissionDetails/{date}")
    public List<SubmissionModel> getDetailsbyDate(@PathVariable String date){
        return submissionService.getDetailsbyDate(date);

}
    @GetMapping("/submissionDetail/{status}")
    public List<SubmissionModel> getDetailsbyStatus(@PathVariable String status){
        return submissionService.getDetailsbyStatus(status);

    }


}
