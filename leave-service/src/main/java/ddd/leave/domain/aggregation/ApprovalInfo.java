package ddd.leave.domain.aggregation;

import ddd.leave.domain.vo.ApprovalType;
import ddd.leave.domain.vo.Approver;
import lombok.Data;

@Data
public class ApprovalInfo {

    String approvalInfoId;
    Approver approver;
    ApprovalType approvalType;
    String msg;
    long time;

}
