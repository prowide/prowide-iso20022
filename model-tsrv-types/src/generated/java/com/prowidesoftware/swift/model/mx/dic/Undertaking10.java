
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
 * Details related to the undertaking.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Undertaking10", propOrder = {
    "newUdrtkgAmt",
    "newXpryDtls"
})
public class Undertaking10 {

    @XmlElement(name = "NewUdrtkgAmt")
    protected UndertakingAmount2 newUdrtkgAmt;
    @XmlElement(name = "NewXpryDtls")
    protected ExpiryDetails1 newXpryDtls;

    /**
     * Gets the value of the newUdrtkgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount2 }
     *     
     */
    public UndertakingAmount2 getNewUdrtkgAmt() {
        return newUdrtkgAmt;
    }

    /**
     * Sets the value of the newUdrtkgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount2 }
     *     
     */
    public Undertaking10 setNewUdrtkgAmt(UndertakingAmount2 value) {
        this.newUdrtkgAmt = value;
        return this;
    }

    /**
     * Gets the value of the newXpryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDetails1 }
     *     
     */
    public ExpiryDetails1 getNewXpryDtls() {
        return newXpryDtls;
    }

    /**
     * Sets the value of the newXpryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDetails1 }
     *     
     */
    public Undertaking10 setNewXpryDtls(ExpiryDetails1 value) {
        this.newXpryDtls = value;
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
