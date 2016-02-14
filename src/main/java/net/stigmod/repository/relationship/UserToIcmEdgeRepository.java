/*
 * Copyright 2014-2016, Stigmergic-Modeling Project
 * SEIDR, Peking University
 * All rights reserved
 *
 * Stigmergic-Modeling is used for collaborative groups to create a conceptual model.
 * It is based on UML 2.0 class diagram specifications and stigmergy theory.
 */

package net.stigmod.repository.relationship;

import net.stigmod.domain.relationship.UserToIcmEdge;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * @author Shijun Wang
 * @version 2016/1/29
 */
public interface UserToIcmEdgeRepository extends GraphRepository<UserToIcmEdge> {
}