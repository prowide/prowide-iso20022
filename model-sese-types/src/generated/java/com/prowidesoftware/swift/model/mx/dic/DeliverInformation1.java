
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
 * Parameters applied to the settlement of a security transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliverInformation1", propOrder = {
    "sttlmPtiesDtls",
    "physTrfInd",
    "physTrfDtls"
})
public class DeliverInformation1 {

    @XmlElement(name = "SttlmPtiesDtls", required = true)
    protected DeliveringPartiesAndAccount1 sttlmPtiesDtls;
    @XmlElement(name = "PhysTrfInd")
    protected boolean physTrfInd;
    @XmlElement(name = "PhysTrfDtls")
    protected DeliveryParameters2 physTrfDtls;

    /**
     * Gets the value of the sttlmPtiesDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveringPartiesAndAccount1 }
     *     
     */
    public DeliveringPartiesAndAccount1 getSttlmPtiesDtls() {
        return sttlmPtiesDtls;
    }

    /**
     * Sets the value of the sttlmPtiesDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveringPartiesAndAccount1 }
     *     
     */
    public DeliverInformation1 setSttlmPtiesDtls(DeliveringPartiesAndAccount1 value) {
        this.sttlmPtiesDtls = value;
        return this;
    }

    /**
     * Gets the value of the physTrfInd property.
     * 
     */
    public boolean isPhysTrfInd() {
        return physTrfInd;
    }

    /**
     * Sets the value of the physTrfInd property.
     * 
     */
    public DeliverInformation1 setPhysTrfInd(boolean value) {
        this.physTrfInd = value;
        return this;
    }

    /**
     * Gets the value of the physTrfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryParameters2 }
     *     
     */
    public DeliveryParameters2 getPhysTrfDtls() {
        return physTrfDtls;
    }

    /**
     * Sets the value of the physTrfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryParameters2 }
     *     
     */
    public DeliverInformation1 setPhysTrfDtls(DeliveryParameters2 value) {
        this.physTrfDtls = value;
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
