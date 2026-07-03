
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
 * Drawdown allowance check. For pensions that have a lifetime allowance, a check is made of the maximum value of benefits that may be taken from the pension without incurring a special tax. (This check or 'event' is known as the benefit crystallisation event in the UK market.)
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrawdownAllowanceCheck1", propOrder = {
    "bceInd",
    "chckInf"
})
public class DrawdownAllowanceCheck1 {

    @XmlElement(name = "BCEInd")
    protected Boolean bceInd;
    @XmlElement(name = "ChckInf")
    protected String chckInf;

    /**
     * Gets the value of the bceInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBCEInd() {
        return bceInd;
    }

    /**
     * Sets the value of the bceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DrawdownAllowanceCheck1 setBCEInd(Boolean value) {
        this.bceInd = value;
        return this;
    }

    /**
     * Gets the value of the chckInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChckInf() {
        return chckInf;
    }

    /**
     * Sets the value of the chckInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DrawdownAllowanceCheck1 setChckInf(String value) {
        this.chckInf = value;
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
