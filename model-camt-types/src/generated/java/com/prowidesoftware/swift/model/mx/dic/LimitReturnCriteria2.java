
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
 * Defines the criteria used to report on limit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitReturnCriteria2", propOrder = {
    "startDtTmInd",
    "stsInd",
    "usdAmtInd",
    "usdPctgInd"
})
public class LimitReturnCriteria2 {

    @XmlElement(name = "StartDtTmInd")
    protected Boolean startDtTmInd;
    @XmlElement(name = "StsInd")
    protected Boolean stsInd;
    @XmlElement(name = "UsdAmtInd")
    protected Boolean usdAmtInd;
    @XmlElement(name = "UsdPctgInd")
    protected Boolean usdPctgInd;

    /**
     * Gets the value of the startDtTmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartDtTmInd() {
        return startDtTmInd;
    }

    /**
     * Sets the value of the startDtTmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LimitReturnCriteria2 setStartDtTmInd(Boolean value) {
        this.startDtTmInd = value;
        return this;
    }

    /**
     * Gets the value of the stsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStsInd() {
        return stsInd;
    }

    /**
     * Sets the value of the stsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LimitReturnCriteria2 setStsInd(Boolean value) {
        this.stsInd = value;
        return this;
    }

    /**
     * Gets the value of the usdAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsdAmtInd() {
        return usdAmtInd;
    }

    /**
     * Sets the value of the usdAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LimitReturnCriteria2 setUsdAmtInd(Boolean value) {
        this.usdAmtInd = value;
        return this;
    }

    /**
     * Gets the value of the usdPctgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsdPctgInd() {
        return usdPctgInd;
    }

    /**
     * Sets the value of the usdPctgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LimitReturnCriteria2 setUsdPctgInd(Boolean value) {
        this.usdPctgInd = value;
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
