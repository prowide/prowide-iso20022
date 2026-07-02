
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
 * Liability a clearing member has to a central counterparty with respect to potential future exposures.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitialMarginExposure1", propOrder = {
    "amt",
    "tp",
    "coreInd"
})
public class InitialMarginExposure1 {

    @XmlElement(name = "Amt", required = true)
    protected Amount3 amt;
    @XmlElement(name = "Tp", required = true)
    protected MarginType2Choice tp;
    @XmlElement(name = "CoreInd")
    protected boolean coreInd;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount3 }
     *     
     */
    public Amount3 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount3 }
     *     
     */
    public InitialMarginExposure1 setAmt(Amount3 value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link MarginType2Choice }
     *     
     */
    public MarginType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginType2Choice }
     *     
     */
    public InitialMarginExposure1 setTp(MarginType2Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the coreInd property.
     * 
     */
    public boolean isCoreInd() {
        return coreInd;
    }

    /**
     * Sets the value of the coreInd property.
     * 
     */
    public InitialMarginExposure1 setCoreInd(boolean value) {
        this.coreInd = value;
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
