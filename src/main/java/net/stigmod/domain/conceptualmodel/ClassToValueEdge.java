/*
 * Copyright 2014-2016, Stigmergic-Modeling Project
 * SEIDR, Peking University
 * All rights reserved
 *
 * Stigmergic-Modeling is used for collaborative groups to create a conceptual model.
 * It is based on UML 2.0 class diagram specifications and stigmergy theory.
 */

package net.stigmod.domain.conceptualmodel;

import org.neo4j.ogm.annotation.*;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Kai Fu
 * @author Shijun Wang
 * @version 2015/11/10
 */
@RelationshipEntity(type="PROPERTY")
public class ClassToValueEdge implements Edge {

    @GraphId
    private Long id;

    @StartNode
    private ClassNode starter;

    @EndNode
    private ValueNode ender;

    @Property(name="port")
    private String port;

    @Property(name="name")
    private String edgeName;

    @Property(name="icm_list")
    private Set<String> icmSet = new HashSet<>();

    private Long ccmId;
    private Set<Long> icmSetPreCopy = new HashSet<>();
    private boolean isChanged=false;

    public ClassToValueEdge() {
        this.port="";
    }

    public ClassToValueEdge(ClassToValueEdge ctvEdge) {
        this.id=ctvEdge.getId();
        this.starter=new ClassNode(ctvEdge.getStarter());
        this.ender=new ValueNode(ctvEdge.getEnder());
        this.port=ctvEdge.port;
        this.edgeName=ctvEdge.getEdgeName();
        this.setIcmSet(ctvEdge.getIcmSet());
        this.ccmId =ctvEdge.getCcmId();
    }

    public ClassToValueEdge(String edgeName, ClassNode starter, ValueNode ender) {
        this.port="";
        this.edgeName=edgeName;
        this.starter=starter;
        this.ender=ender;
    }

    public ClassToValueEdge(String port, String edgeName, ClassNode starter, ValueNode ender) {
        this.starter = starter;
        this.ender = ender;
        this.edgeName = edgeName;
        this.port = port;
    }

    public ClassToValueEdge(Long ccmId, Long icmId, String edgeName, ClassNode starter, ValueNode ender) {
        this.ccmId = ccmId;
        this.icmSet.add(icmId.toString());
        this.port = "";
        this.edgeName = edgeName;
        this.starter = starter;
        this.ender = ender;
    }

    public void UpdateClassToVEdge(ClassToValueEdge classToValueEdge) {
        this.setIcmSet(classToValueEdge.getIcmSet());//其他的要保持不变
    }

    // 添加 icm id
    public void addIcmId(Long icmId) {
        this.icmSet.add(icmId.toString());
    }

    public Long getId() {
        return id;
    }

    public ClassNode getStarter() {
        return starter;
    }

    public void setStarter(ClassNode starter) {
        this.starter = starter;
    }

    public ValueNode getEnder() {
        return ender;
    }

    public void setEnder(ValueNode ender) {
        this.ender = ender;
    }

    public String getEdgeName() {
        return edgeName;
    }

    public Set<Long> getIcmSet() {
        Set<Long> ret = new HashSet<>();
        for (String elem : this.icmSet) {
            ret.add(Long.parseLong(elem, 10));
        }
        return ret;
    }

    public void setIcmSet(Set<Long> icmSet) {
        for (Long elem : icmSet) {
            this.icmSet.add(elem.toString());
        }
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setEdgeName(String edgeName) {
        this.edgeName = edgeName;
    }

    public Long getCcmId() {
        return ccmId;
    }

    public void setCcmId(Long ccmId) {
        this.ccmId = ccmId;
    }

    public Set<Long> getIcmSetPreCopy() {
        return icmSetPreCopy;
    }

    public void setIcmSetPreCopy(Set<Long> icmSetPreCopy) {
        this.icmSetPreCopy = icmSetPreCopy;
    }

    public boolean isChanged() {
        return isChanged;
    }

    public void setIsChanged(boolean isChanged) {
        this.isChanged = isChanged;
    }

    public void setId(Long id) {
        this.id = id;
    }
}