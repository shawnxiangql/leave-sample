package ddd.leave.repository;

import ddd.leave.domain.aggregation.ApprovalRule;

public interface ApprovalRuleRepositoryInterface {

    int getLeaderMaxLevel(ApprovalRule rule);
}
