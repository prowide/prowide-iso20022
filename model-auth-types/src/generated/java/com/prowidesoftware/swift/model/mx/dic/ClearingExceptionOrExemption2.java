
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
 * Further details on clearing exceptions or exemptions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingExceptionOrExemption2", propOrder = {
    "rptgCtrPty",
    "othrCtrPty"
})
public class ClearingExceptionOrExemption2 {

    @XmlElement(name = "RptgCtrPty", required = true)
    protected NonClearingReason2 rptgCtrPty;
    @XmlElement(name = "OthrCtrPty")
    protected NonClearingReason2 othrCtrPty;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link NonClearingReason2 }
     *     
     */
    public NonClearingReason2 getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonClearingReason2 }
     *     
     */
    public ClearingExceptionOrExemption2 setRptgCtrPty(NonClearingReason2 value) {
        this.rptgCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link NonClearingReason2 }
     *     
     */
    public NonClearingReason2 getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonClearingReason2 }
     *     
     */
    public ClearingExceptionOrExemption2 setOthrCtrPty(NonClearingReason2 value) {
        this.othrCtrPty = value;
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
