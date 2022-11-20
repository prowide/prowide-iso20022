
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
 * Content of the Get Totals Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportGetTotalsRequest1", propOrder = {
    "ttlDtls",
    "ttlFltr"
})
public class ReportGetTotalsRequest1 {

    @XmlElement(name = "TtlDtls")
    @XmlSchemaType(name = "string")
    protected TotalDetails1Code ttlDtls;
    @XmlElement(name = "TtlFltr")
    protected TotalFilter1 ttlFltr;

    /**
     * Gets the value of the ttlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TotalDetails1Code }
     *     
     */
    public TotalDetails1Code getTtlDtls() {
        return ttlDtls;
    }

    /**
     * Sets the value of the ttlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalDetails1Code }
     *     
     */
    public ReportGetTotalsRequest1 setTtlDtls(TotalDetails1Code value) {
        this.ttlDtls = value;
        return this;
    }

    /**
     * Gets the value of the ttlFltr property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFilter1 }
     *     
     */
    public TotalFilter1 getTtlFltr() {
        return ttlFltr;
    }

    /**
     * Sets the value of the ttlFltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFilter1 }
     *     
     */
    public ReportGetTotalsRequest1 setTtlFltr(TotalFilter1 value) {
        this.ttlFltr = value;
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
