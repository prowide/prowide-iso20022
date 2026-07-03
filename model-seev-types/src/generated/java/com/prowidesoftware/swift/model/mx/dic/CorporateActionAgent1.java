
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information about the agent.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionAgent1", propOrder = {
    "agtId",
    "agtRole",
    "ctctPrsn"
})
public class CorporateActionAgent1 {

    @XmlElement(name = "AgtId", required = true)
    protected PartyIdentification2Choice agtId;
    @XmlElement(name = "AgtRole", required = true)
    protected AgentRole1FormatChoice agtRole;
    @XmlElement(name = "CtctPrsn")
    protected NameAndAddress5 ctctPrsn;

    /**
     * Gets the value of the agtId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAgtId() {
        return agtId;
    }

    /**
     * Sets the value of the agtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public CorporateActionAgent1 setAgtId(PartyIdentification2Choice value) {
        this.agtId = value;
        return this;
    }

    /**
     * Gets the value of the agtRole property.
     * 
     * @return
     *     possible object is
     *     {@link AgentRole1FormatChoice }
     *     
     */
    public AgentRole1FormatChoice getAgtRole() {
        return agtRole;
    }

    /**
     * Sets the value of the agtRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentRole1FormatChoice }
     *     
     */
    public CorporateActionAgent1 setAgtRole(AgentRole1FormatChoice value) {
        this.agtRole = value;
        return this;
    }

    /**
     * Gets the value of the ctctPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress5 }
     *     
     */
    public NameAndAddress5 getCtctPrsn() {
        return ctctPrsn;
    }

    /**
     * Sets the value of the ctctPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress5 }
     *     
     */
    public CorporateActionAgent1 setCtctPrsn(NameAndAddress5 value) {
        this.ctctPrsn = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
