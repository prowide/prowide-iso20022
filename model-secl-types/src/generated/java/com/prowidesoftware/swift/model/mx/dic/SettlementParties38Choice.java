
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
 * Provides details on either the delivering or receiving parties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties38Choice", propOrder = {
    "dlvrgSttlmPties",
    "rcvgSttlmPties"
})
public class SettlementParties38Choice {

    @XmlElement(name = "DlvrgSttlmPties")
    protected DeliveringPartiesAndAccount22 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected ReceivingPartiesAndAccount22 rcvgSttlmPties;

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveringPartiesAndAccount22 }
     *     
     */
    public DeliveringPartiesAndAccount22 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveringPartiesAndAccount22 }
     *     
     */
    public SettlementParties38Choice setDlvrgSttlmPties(DeliveringPartiesAndAccount22 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPartiesAndAccount22 }
     *     
     */
    public ReceivingPartiesAndAccount22 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPartiesAndAccount22 }
     *     
     */
    public SettlementParties38Choice setRcvgSttlmPties(ReceivingPartiesAndAccount22 value) {
        this.rcvgSttlmPties = value;
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
