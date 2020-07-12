package ddd.leave.domain.po;

import ddd.leave.domain.vo.LeaveType;
import ddd.leave.domain.vo.PersonType;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
public class ApprovalRulePO {

    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    String id;
    @Enumerated(EnumType.STRING)
    LeaveType leaveType;
    @Enumerated(EnumType.STRING)
    PersonType personType;
    long duration;
    String applicantRoleId;
}
