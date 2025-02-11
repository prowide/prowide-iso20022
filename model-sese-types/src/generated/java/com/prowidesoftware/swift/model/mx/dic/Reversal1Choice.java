
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
@XmlType(name = "Reversal1Choice", propOrder = {
    "ref",
    "trfOutConfDtls"
})
public class Reversal1Choice {

    @XmlElement(name = "Ref")
    protected TransferReference2 ref;
    @XmlElement(name = "TrfOutConfDtls")
    protected TransferOut10 trfOutConfDtls;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link TransferReference2 }
     *     
     */
    public TransferReference2 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferReference2 }
     *     
     */
    public Reversal1Choice setRef(TransferReference2 value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the trfOutConfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransferOut10 }
     *     
     */
    public TransferOut10 getTrfOutConfDtls() {
        return trfOutConfDtls;
    }

    /**
     * Sets the value of the trfOutConfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferOut10 }
     *     
     */
    public Reversal1Choice setTrfOutConfDtls(TransferOut10 value) {
        this.trfOutConfDtls = value;
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
