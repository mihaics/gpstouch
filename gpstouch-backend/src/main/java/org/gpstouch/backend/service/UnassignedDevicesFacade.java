/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gpstouch.backend.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.gpstouch.gts.backend.model.UnassignedDevices;

/**
 *
 * @author mihai
 */
@Stateless
public class UnassignedDevicesFacade extends AbstractFacade<UnassignedDevices> {
    @PersistenceContext(unitName = "gpstouchPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UnassignedDevicesFacade() {
        super(UnassignedDevices.class);
    }

}
