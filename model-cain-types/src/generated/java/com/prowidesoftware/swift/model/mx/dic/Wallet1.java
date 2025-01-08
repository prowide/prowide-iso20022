
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
 * Container for tenders used by the customer to perform the payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wallet1", propOrder = {
    "prvdr",
    "addtlWlltData"
})
public class Wallet1 {

    @XmlElement(name = "Prvdr")
    protected PartyIdentification197 prvdr;
    @XmlElement(name = "AddtlWlltData")
    protected String addtlWlltData;

    /**
     * Gets the value of the prvdr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getPrvdr() {
        return prvdr;
    }

    /**
     * Sets the value of the prvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public Wallet1 setPrvdr(PartyIdentification197 value) {
        this.prvdr = value;
        return this;
    }

    /**
     * Gets the value of the addtlWlltData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlWlltData() {
        return addtlWlltData;
    }

    /**
     * Sets the value of the addtlWlltData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Wallet1 setAddtlWlltData(String value) {
        this.addtlWlltData = value;
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
