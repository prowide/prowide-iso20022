
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
 * Provides the details of the security pledged as collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityReuseData1", propOrder = {
    "isin",
    "reuseVal"
})
public class SecurityReuseData1 {

    @XmlElement(name = "ISIN", required = true)
    protected String isin;
    @XmlElement(name = "ReuseVal", required = true)
    protected ReuseValue1Choice reuseVal;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityReuseData1 setISIN(String value) {
        this.isin = value;
        return this;
    }

    /**
     * Gets the value of the reuseVal property.
     * 
     * @return
     *     possible object is
     *     {@link ReuseValue1Choice }
     *     
     */
    public ReuseValue1Choice getReuseVal() {
        return reuseVal;
    }

    /**
     * Sets the value of the reuseVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReuseValue1Choice }
     *     
     */
    public SecurityReuseData1 setReuseVal(ReuseValue1Choice value) {
        this.reuseVal = value;
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
