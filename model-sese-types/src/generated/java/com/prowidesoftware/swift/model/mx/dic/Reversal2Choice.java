
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
 * Choice between reversal by reference or by reversal details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reversal2Choice", propOrder = {
    "ref",
    "trfInConfDtls"
})
public class Reversal2Choice {

    @XmlElement(name = "Ref")
    protected TransferReference2 ref;
    @XmlElement(name = "TrfInConfDtls")
    protected TransferIn8 trfInConfDtls;

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
    public Reversal2Choice setRef(TransferReference2 value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the trfInConfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransferIn8 }
     *     
     */
    public TransferIn8 getTrfInConfDtls() {
        return trfInConfDtls;
    }

    /**
     * Sets the value of the trfInConfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferIn8 }
     *     
     */
    public Reversal2Choice setTrfInConfDtls(TransferIn8 value) {
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
