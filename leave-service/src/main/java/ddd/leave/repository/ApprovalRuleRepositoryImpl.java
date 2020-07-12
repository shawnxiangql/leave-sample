package ddd.leave.repository;

import ddd.leave.domain.aggregation.ApprovalRule;
import ddd.leave.repository.ApprovalRuleRepositoryInterface;
import ddd.leave.repository.ApprovalRuleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ApprovalRuleRepositoryImpl implements ApprovalRuleRepositoryInterface {

    @Autowired
    ApprovalRuleDao ruleDao;

    @Override
    public int getLeaderMaxLevel(ApprovalRule rule) {
        String personType = rule.getPersonType();
        String leaveType = rule.getLeaveType();
        rule = ruleDao.findRule(personType, leaveType, rule.getDuration());
        return rule.getMaxLeaderLevel();
    }
}
