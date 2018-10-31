package com.statestr.deliverables.controllers;


import com.statestr.deliverables.model.Deliverable;
import com.statestr.deliverables.services.DeliverablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import java.util.List;

@RestController

@RequestMapping(value="v1")

public class DeliverablesController {

    @Autowired
    private DeliverablesService deliverableService;

    @RequestMapping(value="/clients/{clientID}/deliverables",method = RequestMethod.GET)
    public List<Deliverable> getDeliverables( @PathVariable("clientID") String clientID) {

        return deliverableService.getDeliverables(clientID);
    }


    @RequestMapping(value="/clients/{clientID}/deliverables/{deliverableID}",method = RequestMethod.GET)

    public Deliverable getDeliverable( @PathVariable("clientID") String clientID,
                                @PathVariable("deliverableID") String deliverableID) {

        return deliverableService.getDeliverable(clientID, deliverableID);
    }



    @RequestMapping(value="/clients",method = RequestMethod.POST)

    public void saveDeliverable(@RequestBody Deliverable deliverable) {

        deliverableService.saveDeliverable(deliverable);

    }


}