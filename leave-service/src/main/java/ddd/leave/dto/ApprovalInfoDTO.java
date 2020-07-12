package ddd.leave.dto;

import lombok.Data;

@Data
public class ApprovalInfoDTO {

    String approvalInfoId;
    ApproverDTO approverDTO;
    String msg;
    long time;
}
