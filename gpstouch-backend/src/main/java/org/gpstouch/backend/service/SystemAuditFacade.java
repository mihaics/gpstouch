/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gpstouch.backend.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.gpstouch.gts.backend.model.SystemAudit;

/**
 *
 * @author mihai
 */
@Stateless
public class SystemAuditFacade extends AbstractFacade<SystemAudit> {
    @PersistenceContext(unitName = "gpstouchPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SystemAuditFacade() {
        super(SystemAudit.class);
    }

}
