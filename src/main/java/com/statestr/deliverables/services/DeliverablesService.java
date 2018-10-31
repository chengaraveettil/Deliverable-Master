package com.statestr.deliverables.services;

import com.statestr.deliverables.repository.DeliverablesRepository;

import com.statestr.deliverables.model.Deliverable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliverablesService {

    @Autowired
    private DeliverablesRepository deliverableRepository;

    //  @Autowired
    //ServiceConfig config;



    public List<Deliverable> getDeliverables(String clientID){

        return deliverableRepository.findByClientID(clientID);

    }



    public Deliverable getDeliverable(String clientID, String deliverableID) {

        Deliverable deliverable = deliverableRepository.findByClientIDAndDeliverableID( clientID, deliverableID );

        return deliverable;

    }


    public void saveDeliverable(Deliverable deliverable){

        deliverableRepository.save(deliverable);

    }

}
