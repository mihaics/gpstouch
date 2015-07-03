/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gpstouch.account;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.CssLayout;

/**
 *
 * @author mihai
 */
public class AccountGridView extends CssLayout implements View {

    private AccountGrid grid;
    private final AccountGridLogic viewLogic = new AccountGridLogic(this);

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        viewLogic.enter(event.getParameters());
    }

}
