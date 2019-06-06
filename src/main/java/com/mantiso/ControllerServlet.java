package com.mantiso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ControllerServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        ApplicationSettings applicationSettings = new ApplicationSettings();
        CssClass cssClass = new CssClass();
        cssClass.setName("redUser");

        List<Tab> tabs = new ArrayList<>();
        tabs.add(new Tab("SignIn", "#signin"));
        tabs.add(new Tab("Home", "#home"));
        tabs.add(new Tab("Profile", "#profile"));
        tabs.add(new Tab("MessagesJAK", "#messages"));
        tabs.add(new Tab("Settings", "#settings"));
        applicationSettings.setTabs(tabs);

        //String[] tabNames = {"SignIn", "Home", "Profile", "SettingsJAK"};
        applicationSettings.setformCssClass(cssClass);
        //applicationSettings.setTabNames(tabNames);
        getServletContext().setAttribute("app", applicationSettings );
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setName("Julie");
        user.setEmail("juliejava@icloud.com");

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
        request.setAttribute("user", user);
        dispatcher.forward(request, response);
    }
}
