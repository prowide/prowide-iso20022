
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
 * Specifies the Identification of the parties settling the contract.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties31Choice", propOrder = {
    "cntrlSctiesDpstryPtcpt",
    "indrctPtcpt"
})
public class SettlementParties31Choice {

    @XmlElement(name = "CntrlSctiesDpstryPtcpt")
    protected String cntrlSctiesDpstryPtcpt;
    @XmlElement(name = "IndrctPtcpt")
    protected String indrctPtcpt;

    /**
     * Gets the value of the cntrlSctiesDpstryPtcpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrlSctiesDpstryPtcpt() {
        return cntrlSctiesDpstryPtcpt;
    }

    /**
     * Sets the value of the cntrlSctiesDpstryPtcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementParties31Choice setCntrlSctiesDpstryPtcpt(String value) {
        this.cntrlSctiesDpstryPtcpt = value;
        return this;
    }

    /**
     * Gets the value of the indrctPtcpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndrctPtcpt() {
        return indrctPtcpt;
    }

    /**
     * Sets the value of the indrctPtcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementParties31Choice setIndrctPtcpt(String value) {
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
