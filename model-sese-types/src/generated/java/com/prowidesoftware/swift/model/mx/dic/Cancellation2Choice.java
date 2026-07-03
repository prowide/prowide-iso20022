
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
 * Choice between cancellation by reference or by transfer details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cancellation2Choice", propOrder = {
    "ref",
    "trfInDtls"
})
public class Cancellation2Choice {

    @XmlElement(name = "Ref")
    protected TransferReference1 ref;
    @XmlElement(name = "TrfInDtls")
    protected TransferIn7 trfInDtls;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link TransferReference1 }
     *     
     */
    public TransferReference1 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferReference1 }
     *     
     */
    public Cancellation2Choice setRef(TransferReference1 value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the trfInDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransferIn7 }
     *     
     */
    public TransferIn7 getTrfInDtls() {
        return trfInDtls;
    }

    /**
     * Sets the value of the trfInDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferIn7 }
     *     
     */
    public Cancellation2Choice setTrfInDtls(TransferIn7 value) {
        this.trfInDtls = value;
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
