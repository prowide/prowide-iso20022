
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
 * Provides details on either the delivering or receiving parties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties37Choice", propOrder = {
    "dlvrgSttlmPties",
    "rcvgSttlmPties"
})
public class SettlementParties37Choice {

    @XmlElement(name = "DlvrgSttlmPties")
    protected DeliveringPartiesAndAccount21 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected ReceivingPartiesAndAccount21 rcvgSttlmPties;

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveringPartiesAndAccount21 }
     *     
     */
    public DeliveringPartiesAndAccount21 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveringPartiesAndAccount21 }
     *     
     */
    public SettlementParties37Choice setDlvrgSttlmPties(DeliveringPartiesAndAccount21 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPartiesAndAccount21 }
     *     
     */
    public ReceivingPartiesAndAccount21 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPartiesAndAccount21 }
     *     
     */
    public SettlementParties37Choice setRcvgSttlmPties(ReceivingPartiesAndAccount21 value) {
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
