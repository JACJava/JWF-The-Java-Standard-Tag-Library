package com.mantiso;

import java.util.List;

public class ApplicationSettings {

    /* set color of user field */
    private CssClass _formCssClass;

    public CssClass getFormCssClass() {return _formCssClass;}

    public void setformCssClass(CssClass value){
        _formCssClass = value;}

    /* set tab names */
    private String[] _tabNames;

    public String[] getTabNames() {return _tabNames;}

    public void setTabNames(String[] names){
        _tabNames = new String[names.length];
        System.arraycopy(names,0,_tabNames,0, names.length);
    }

    private List<Tab> _tabs;
    public List<Tab> getTabs(){
        return _tabs;
    }
    public void setTabs(List<Tab> tabs){
        _tabs = tabs;
    }





}
