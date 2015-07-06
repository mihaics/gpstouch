/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gpstouch.account;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import org.gpstouch.backend.service.AccountFacade;
import org.gpstouch.gts.backend.model.Account;

/**
 *
 * @author mihai
 */
public class AccountGridLogic {

    @EJB
    AccountFacade accountService;

    private final AccountGridView view;

    public AccountGridLogic(AccountGridView view) {
        this.view = view;
    }

    @PostConstruct
    public void init() {

        view.showAccounts(accountService.findAll());

    }

    void enter(String accountID) {
        //select accountID or create a new one

    }

    void newAccount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void rowSelected(Account selectedRow) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
