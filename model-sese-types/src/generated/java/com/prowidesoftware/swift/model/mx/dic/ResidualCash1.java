
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
 * Specifies whether there is cash in the account awaiting investment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResidualCash1", propOrder = {
    "rsdlCshInd",
    "ccy"
})
public class ResidualCash1 {

    @XmlElement(name = "RsdlCshInd")
    protected boolean rsdlCshInd;
    @XmlElement(name = "Ccy")
    protected String ccy;

    /**
     * Gets the value of the rsdlCshInd property.
     * 
     */
    public boolean isRsdlCshInd() {
        return rsdlCshInd;
    }

    /**
     * Sets the value of the rsdlCshInd property.
     * 
     */
    public ResidualCash1 setRsdlCshInd(boolean value) {
        this.rsdlCshInd = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResidualCash1 setCcy(String value) {
        this.ccy = value;
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
