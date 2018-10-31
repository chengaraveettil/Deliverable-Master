package com.statestr.deliverables.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.TimeZone;


@Entity

@Getter @Setter @NoArgsConstructor //

@Table(name = "Deliverable")

public class Deliverable{
    @Id
    @Column(name = "deliverable_id", nullable = false)
    private String deliverableID;

    @Column(name = "client_id", nullable = false)
    private String clientID;

    @Column(name = "client_name", nullable = false)
    private String clientName;

    @Column(name = "deliverable_name", nullable = false)
    private String deliverableName;

    @Column(name = "deliverable_type", nullable = false)
    private String deliverableType;

    @Column(name = "severity", nullable = false)
    private String severity;

    @Column(name = "service_domain", nullable = false)
    private String serviceDomain;

    @Column(name = "region", nullable = false)
    private String region;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "time_zone", nullable = false)
    private TimeZone timeZone;

    @Column(name = "file_format", nullable = false)
    private String fileFormat;

    @Column(name = "delivery_recipient", nullable = false)
    private String deliveryRecipient;
    ;
    @Column(name = "delivery_destination", nullable = false)
    private String deliveryDestination;

    @Column(name = "target_time", nullable = false)
    private java.sql.Timestamp targetTime;

    @Column(name = "monitoring_source", nullable = false)
    private String monitoringSource;


}