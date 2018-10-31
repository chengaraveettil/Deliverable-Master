package com.statestr.deliverables.repository;


import com.statestr.deliverables.model.Deliverable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public interface DeliverablesRepository extends CrudRepository<Deliverable,String>  {

    public List<Deliverable> findByClientID(String clientID);

    public Deliverable findByClientIDAndDeliverableID(String clienID, String deliverableID);

}