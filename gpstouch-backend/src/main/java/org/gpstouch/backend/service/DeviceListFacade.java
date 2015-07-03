/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gpstouch.backend.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.gpstouch.gts.backend.model.DeviceList;

/**
 *
 * @author mihai
 */
@Stateless
public class DeviceListFacade extends AbstractFacade<DeviceList> {
    @PersistenceContext(unitName = "gpstouchPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DeviceListFacade() {
        super(DeviceList.class);
    }

}
