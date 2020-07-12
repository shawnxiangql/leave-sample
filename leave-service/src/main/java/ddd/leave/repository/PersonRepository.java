package ddd.leave.repository;

import ddd.leave.domain.po.PersonPO;

public interface PersonRepository {

    void insert(PersonPO personPO);

    void update(PersonPO personPO);

    PersonPO findById(String id);

    PersonPO findLeaderByPersonId(String personId);

}