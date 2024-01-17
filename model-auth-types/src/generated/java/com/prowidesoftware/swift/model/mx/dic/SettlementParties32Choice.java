
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
 * Specifies the Identification of the parties settling the contract.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties32Choice", propOrder = {
    "cntrlSctiesDpstryPtcpt",
    "indrctPtcpt"
})
public class SettlementParties32Choice {

    @XmlElement(name = "CntrlSctiesDpstryPtcpt")
    protected OrganisationIdentification9Choice cntrlSctiesDpstryPtcpt;
    @XmlElement(name = "IndrctPtcpt")
    protected OrganisationIdentification9Choice indrctPtcpt;

    /**
     * Gets the value of the cntrlSctiesDpstryPtcpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public OrganisationIdentification9Choice getCntrlSctiesDpstryPtcpt() {
        return cntrlSctiesDpstryPtcpt;
    }

    /**
     * Sets the value of the cntrlSctiesDpstryPtcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public SettlementParties32Choice setCntrlSctiesDpstryPtcpt(OrganisationIdentification9Choice value) {
        this.cntrlSctiesDpstryPtcpt = value;
        return this;
    }

    /**
     * Gets the value of the indrctPtcpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public OrganisationIdentification9Choice getIndrctPtcpt() {
        return indrctPtcpt;
    }

    /**
     * Sets the value of the indrctPtcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public SettlementParties32Choice setIndrctPtcpt(OrganisationIdentification9Choice value) {
        this.indrctPtcpt = value;
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
