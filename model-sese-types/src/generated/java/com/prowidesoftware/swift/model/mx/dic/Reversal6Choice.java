
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
 * Choice between reversal by reference or by reversal details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reversal6Choice", propOrder = {
    "ref",
    "trfInConfDtls"
})
public class Reversal6Choice {

    @XmlElement(name = "Ref")
    protected TransferReference6 ref;
    @XmlElement(name = "TrfInConfDtls")
    protected TransferIn12 trfInConfDtls;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link TransferReference6 }
     *     
     */
    public TransferReference6 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferReference6 }
     *     
     */
    public Reversal6Choice setRef(TransferReference6 value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the trfInConfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransferIn12 }
     *     
     */
    public TransferIn12 getTrfInConfDtls() {
        return trfInConfDtls;
    }

    /**
     * Sets the value of the trfInConfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferIn12 }
     *     
     */
    public Reversal6Choice setTrfInConfDtls(TransferIn12 value) {
        this.trfInConfDtls = value;
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
