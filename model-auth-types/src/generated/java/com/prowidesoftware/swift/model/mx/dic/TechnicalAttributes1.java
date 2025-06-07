
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies technical attributes of the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TechnicalAttributes1", propOrder = {
    "rcncltnFlg"
})
public class TechnicalAttributes1 {

    @XmlElement(name = "RcncltnFlg")
    @XmlSchemaType(name = "string")
    protected Reconciliation1Code rcncltnFlg;

    /**
     * Gets the value of the rcncltnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Reconciliation1Code }
     *     
     */
    public Reconciliation1Code getRcncltnFlg() {
        return rcncltnFlg;
    }

    /**
     * Sets the value of the rcncltnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reconciliation1Code }
     *     
     */
    public TechnicalAttributes1 setRcncltnFlg(Reconciliation1Code value) {
        this.rcncltnFlg = value;
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
