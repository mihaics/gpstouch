package org.gpstouch.gts;

import org.gpstouch.GPSTouchUI;
import org.gpstouch.gts.about.AboutView;
import org.gpstouch.crud.SampleCrudView;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import org.gpstouch.account.AccountGridView;

/**
 * Content of the UI when the user is logged in.
 *
 *
 */
public class MainScreen extends HorizontalLayout {

    private Menu menu;

    public MainScreen(GPSTouchUI ui) {

        setStyleName("main-screen");

        CssLayout viewContainer = new CssLayout();
        viewContainer.addStyleName("valo-content");
        viewContainer.setSizeFull();

        final Navigator navigator = new Navigator(ui, viewContainer);
        navigator.setErrorView(ErrorView.class);
        menu = new Menu(navigator);
        menu.addView(new SampleCrudView(), SampleCrudView.VIEW_NAME,
                SampleCrudView.VIEW_NAME, FontAwesome.EDIT);
        menu.addView(new AccountGridView(), AccountGridView.VIEW_NAME, AccountGridView.VIEW_NAME,
                FontAwesome.INFO_CIRCLE);

        navigator.addViewChangeListener(viewChangeListener);

        addComponent(menu);
        addComponent(viewContainer);
        setExpandRatio(viewContainer, 1);
        setSizeFull();
    }

    // notify the view menu about view changes so that it can display which view
    // is currently active
    ViewChangeListener viewChangeListener = new ViewChangeListener() {

        @Override
        public boolean beforeViewChange(ViewChangeEvent event) {
            return true;
        }

        @Override
        public void afterViewChange(ViewChangeEvent event) {
            menu.setActiveView(event.getViewName());
        }

    };
}
