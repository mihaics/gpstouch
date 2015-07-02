package org.gpstouch;

import javax.servlet.annotation.WebServlet;

import org.gpstouch.gts.MainScreen;
import org.gpstouch.authentication.AccessControl;
import org.gpstouch.authentication.BasicAccessControl;
import org.gpstouch.authentication.LoginScreen;
import org.gpstouch.authentication.LoginScreen.LoginListener;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Viewport;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.Responsive;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Main UI class of the application that shows either the login screen or the
 * main view of the application depending on whether a user is signed in.
 *
 * The @Viewport annotation configures the viewport meta tags appropriately on
 * mobile devices. Instead of device based scaling (default), using responsive
 * layouts.
 */
@Viewport("user-scalable=no,initial-scale=1.0")
@Theme("mytheme")
@Widgetset("org.gpstouch.GPSAppWidgetset")
public class GPSTouchUI extends UI {

    private AccessControl accessControl = new BasicAccessControl();

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Responsive.makeResponsive(this);
        setLocale(vaadinRequest.getLocale());
        getPage().setTitle("GPSTouch");
        if (!accessControl.isUserSignedIn()) {
            setContent(new LoginScreen(accessControl, new LoginListener() {
                @Override
                public void loginSuccessful() {
                    showMainView();
                }
            }));
        } else {
            showMainView();
        }
    }

    protected void showMainView() {
        addStyleName(ValoTheme.UI_WITH_MENU);
        setContent(new MainScreen(GPSTouchUI.this));
        getNavigator().navigateTo(getNavigator().getState());
    }

    public static GPSTouchUI get() {
        return (GPSTouchUI) UI.getCurrent();
    }

    public AccessControl getAccessControl() {
        return accessControl;
    }

    @WebServlet(urlPatterns = "/*", name = "GPSTouchUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = GPSTouchUI.class, productionMode = false)
    public static class GPSTouchUIServlet extends VaadinServlet {
    }
}
