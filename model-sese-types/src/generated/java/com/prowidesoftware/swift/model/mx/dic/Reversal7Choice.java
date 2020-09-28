
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
@XmlType(name = "Reversal7Choice", propOrder = {
    "ref",
    "trfInConfDtls"
})
public class Reversal7Choice {

    @XmlElement(name = "Ref")
    protected TransferReference10 ref;
    @XmlElement(name = "TrfInConfDtls")
    protected TransferIn14 trfInConfDtls;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link TransferReference10 }
     *     
     */
    public TransferReference10 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferReference10 }
     *     
     */
    public Reversal7Choice setRef(TransferReference10 value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the trfInConfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransferIn14 }
     *     
     */
    public TransferIn14 getTrfInConfDtls() {
        return trfInConfDtls;
    }

    /**
     * Sets the value of the trfInConfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferIn14 }
     *     
     */
    public Reversal7Choice setTrfInConfDtls(TransferIn14 value) {
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
