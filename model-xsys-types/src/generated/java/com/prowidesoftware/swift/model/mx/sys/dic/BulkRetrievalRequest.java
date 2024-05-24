
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
 * Java class for BulkRetrievalRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BulkRetrievalRequest", propOrder = {
    "rptCrit"
})
public class BulkRetrievalRequest {

    @XmlElement(name = "RptCrit", required = true)
    protected ReportCriteriaXsys01300101 rptCrit;

    /**
     * Gets the value of the rptCrit property.
     * 
     * @return
     *     possible object is
     *     {@link ReportCriteriaXsys01300101 }
     *     
     */
    public ReportCriteriaXsys01300101 getRptCrit() {
        return rptCrit;
    }

    /**
     * Sets the value of the rptCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportCriteriaXsys01300101 }
     *     
     */
    public BulkRetrievalRequest setRptCrit(ReportCriteriaXsys01300101 value) {
        this.rptCrit = value;
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
