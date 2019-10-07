package com.confdevscom.gn;


public class Presentation {
    private String name;
    private String       language;
    private String  framework;
    private String         version;
    private String  role;
    private String desc;
    private String siteOfficiel;


    public Presentation(String name, String language, String framework, String version, String role, String desc, String siteOfficiel) {
        this.name = name;
        this.language = language;
        this.framework = framework;
        this.version = version;
        this.role = role;
        this.desc = desc;
        this.siteOfficiel = siteOfficiel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSiteOfficiel() {
        return siteOfficiel;
    }

    public void setSiteOfficiel(String siteOfficiel) {
        this.siteOfficiel = siteOfficiel;
    }
}
