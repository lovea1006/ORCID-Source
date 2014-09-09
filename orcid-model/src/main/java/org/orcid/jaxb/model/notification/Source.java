/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2014 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.22 at 06:46:00 PM BST 
//

package org.orcid.jaxb.model.notification;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}orcidId" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}sourceName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "orcidId", "sourceName" })
@XmlRootElement(name = "source")
public class Source implements Serializable {

    private final static long serialVersionUID = 1L;
    protected OrcidId orcidId;
    protected String sourceName;

    /**
     * Gets the value of the orcidId property.
     * 
     * @return possible object is {@link OrcidId }
     * 
     */
    public OrcidId getOrcidId() {
        return orcidId;
    }

    /**
     * Sets the value of the orcidId property.
     * 
     * @param value
     *            allowed object is {@link OrcidId }
     * 
     */
    public void setOrcidId(OrcidId value) {
        this.orcidId = value;
    }

    /**
     * Gets the value of the sourceName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

}
