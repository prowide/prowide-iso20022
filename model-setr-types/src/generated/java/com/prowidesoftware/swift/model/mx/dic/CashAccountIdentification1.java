
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
 * Unique identifier of an account, as assigned by the account servicer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccountIdentification1", propOrder = {
    "dmstAcct"
})
public class CashAccountIdentification1 {

    @XmlElement(name = "DmstAcct", required = true)
    protected SimpleIdentificationInformation dmstAcct;

    /**
     * Gets the value of the dmstAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public SimpleIdentificationInformation getDmstAcct() {
        return dmstAcct;
    }

    /**
     * Sets the value of the dmstAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public CashAccountIdentification1 setDmstAcct(SimpleIdentificationInformation value) {
        this.dmstAcct = value;
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
