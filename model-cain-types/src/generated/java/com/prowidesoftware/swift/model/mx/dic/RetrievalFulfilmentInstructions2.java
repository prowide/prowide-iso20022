
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
 * Fulfilment instructions for the retrieval
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievalFulfilmentInstructions2", propOrder = {
    "mtd",
    "dlvryInf",
    "addtlInf"
})
public class RetrievalFulfilmentInstructions2 {

    @XmlElement(name = "Mtd")
    protected RetrievalDeliveryMethod1Choice mtd;
    @XmlElement(name = "DlvryInf")
    protected DeliveryInformation5 dlvryInf;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation22 addtlInf;

    /**
     * Gets the value of the mtd property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievalDeliveryMethod1Choice }
     *     
     */
    public RetrievalDeliveryMethod1Choice getMtd() {
        return mtd;
    }

    /**
     * Sets the value of the mtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievalDeliveryMethod1Choice }
     *     
     */
    public RetrievalFulfilmentInstructions2 setMtd(RetrievalDeliveryMethod1Choice value) {
        this.mtd = value;
        return this;
    }

    /**
     * Gets the value of the dlvryInf property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInformation5 }
     *     
     */
    public DeliveryInformation5 getDlvryInf() {
        return dlvryInf;
    }

    /**
     * Sets the value of the dlvryInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInformation5 }
     *     
     */
    public RetrievalFulfilmentInstructions2 setDlvryInf(DeliveryInformation5 value) {
        this.dlvryInf = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation22 }
     *     
     */
    public AdditionalInformation22 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation22 }
     *     
     */
    public RetrievalFulfilmentInstructions2 setAddtlInf(AdditionalInformation22 value) {
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
