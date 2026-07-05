
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
 * Specifies the requested authority investigation information details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityInvestigation2", propOrder = {
    "tp",
    "invstgtdRoles",
    "addtlInvstgtdPties",
    "addtlInf"
})
public class AuthorityInvestigation2 {

    @XmlElement(name = "Tp", required = true)
    protected AuthorityRequestType1 tp;
    @XmlElement(name = "InvstgtdRoles", required = true)
    protected InvestigatedParties1Choice invstgtdRoles;
    @XmlElement(name = "AddtlInvstgtdPties")
    protected InvestigatedParties1Choice addtlInvstgtdPties;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityRequestType1 }
     *     
     */
    public AuthorityRequestType1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityRequestType1 }
     *     
     */
    public AuthorityInvestigation2 setTp(AuthorityRequestType1 value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the invstgtdRoles property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public InvestigatedParties1Choice getInvstgtdRoles() {
        return invstgtdRoles;
    }

    /**
     * Sets the value of the invstgtdRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public AuthorityInvestigation2 setInvstgtdRoles(InvestigatedParties1Choice value) {
        this.invstgtdRoles = value;
        return this;
    }

    /**
     * Gets the value of the addtlInvstgtdPties property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public InvestigatedParties1Choice getAddtlInvstgtdPties() {
        return addtlInvstgtdPties;
    }

    /**
     * Sets the value of the addtlInvstgtdPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public AuthorityInvestigation2 setAddtlInvstgtdPties(InvestigatedParties1Choice value) {
        this.addtlInvstgtdPties = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AuthorityInvestigation2 setAddtlInf(String value) {
        this.addtlInf = value;
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
