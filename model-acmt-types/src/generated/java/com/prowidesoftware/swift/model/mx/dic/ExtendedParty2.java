
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Other type of party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedParty2", propOrder = {
    "xtndedPtyRole",
    "othrPtyDtls"
})
public class ExtendedParty2 {

    @XmlElement(name = "XtndedPtyRole", required = true)
    protected String xtndedPtyRole;
    @XmlElement(name = "OthrPtyDtls", required = true)
    protected InvestmentAccountOwnershipInformation5 othrPtyDtls;

    /**
     * Gets the value of the xtndedPtyRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedPtyRole() {
        return xtndedPtyRole;
    }

    /**
     * Sets the value of the xtndedPtyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExtendedParty2 setXtndedPtyRole(String value) {
        this.xtndedPtyRole = value;
        return this;
    }

    /**
     * Gets the value of the othrPtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation5 }
     *     
     */
    public InvestmentAccountOwnershipInformation5 getOthrPtyDtls() {
        return othrPtyDtls;
    }

    /**
     * Sets the value of the othrPtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation5 }
     *     
     */
    public ExtendedParty2 setOthrPtyDtls(InvestmentAccountOwnershipInformation5 value) {
        this.othrPtyDtls = value;
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
