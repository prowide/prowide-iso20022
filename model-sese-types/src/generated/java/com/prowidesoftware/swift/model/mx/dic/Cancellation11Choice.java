
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
 * Choice between cancellation by transfer details or reference.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cancellation11Choice", propOrder = {
    "cxlByTrfInstrDtls",
    "cxlByRef"
})
public class Cancellation11Choice {

    @XmlElement(name = "CxlByTrfInstrDtls")
    protected ISATransfer24 cxlByTrfInstrDtls;
    @XmlElement(name = "CxlByRef")
    protected TransferReference7 cxlByRef;

    /**
     * Gets the value of the cxlByTrfInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ISATransfer24 }
     *     
     */
    public ISATransfer24 getCxlByTrfInstrDtls() {
        return cxlByTrfInstrDtls;
    }

    /**
     * Sets the value of the cxlByTrfInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISATransfer24 }
     *     
     */
    public Cancellation11Choice setCxlByTrfInstrDtls(ISATransfer24 value) {
        this.cxlByTrfInstrDtls = value;
        return this;
    }

    /**
     * Gets the value of the cxlByRef property.
     * 
     * @return
     *     possible object is
     *     {@link TransferReference7 }
     *     
     */
    public TransferReference7 getCxlByRef() {
        return cxlByRef;
    }

    /**
     * Sets the value of the cxlByRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferReference7 }
     *     
     */
    public Cancellation11Choice setCxlByRef(TransferReference7 value) {
        this.cxlByRef = value;
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
