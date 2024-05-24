
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for ReportCriteria complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportCriteria", propOrder = {
    "rptOptn"
})
public class ReportCriteriaXsys00500201 {

    @XmlElement(name = "RptOptn", required = true)
    protected String rptOptn;

    /**
     * Gets the value of the rptOptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptOptn() {
        return rptOptn;
    }

    /**
     * Sets the value of the rptOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportCriteriaXsys00500201 setRptOptn(String value) {
        this.rptOptn = value;
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
