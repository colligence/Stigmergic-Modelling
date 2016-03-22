/*
 * Copyright 2014-2016, Stigmergic-Modeling Project
 * SEIDR, Peking University
 * All rights reserved
 *
 * Stigmergic-Modeling is used for collaborative groups to create a conceptual model.
 * It is based on UML 2.0 class diagram specifications and stigmergy theory.
 */

package net.stigmod.util.config;

//import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * StigMod configuration base object class
 *
 * @version     2015/10/30
 * @author 	    Shijun Wang
 */
@XmlRootElement
public class Config {

    private String host;
    private String port;
    private Neo4j neo4j;
    private MailServer mailServer;
    private String wordNetPath;
    private String adminPassword;
    private String language;

    public String getHost() {
        return host;
    }

    @XmlElement
    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    @XmlElement
    public void setPort(String port) {
        this.port = port;
    }

    public Neo4j getNeo4j() {
        return neo4j;
    }

    @XmlElement
    public void setNeo4j(Neo4j neo4j) {
        this.neo4j = neo4j;
    }

    public MailServer getMailServer() {
        return mailServer;
    }

    @XmlElement
    public void setMailServer(MailServer mailServer) {
        this.mailServer = mailServer;
    }

    public String getWordNetPath() {
        return wordNetPath;
    }

    @XmlElement
    public void setWordNetPath(String wordNetPath) {
        this.wordNetPath = wordNetPath;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    @XmlElement
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getLanguage() {
        return language;
    }

    @XmlElement
    public void setLanguage(String language) {
        this.language = language;
    }
}
