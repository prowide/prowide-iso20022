
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
 * Java class for RetrievalRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievalRequest", propOrder = {
    "rptCrit"
})
public class RetrievalRequest {

    @XmlElement(name = "RptCrit", required = true)
    protected ReportCriteriaXsys01500101 rptCrit;

    /**
     * Gets the value of the rptCrit property.
     * 
     * @return
     *     possible object is
     *     {@link ReportCriteriaXsys01500101 }
     *     
     */
    public ReportCriteriaXsys01500101 getRptCrit() {
        return rptCrit;
    }

    /**
     * Sets the value of the rptCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportCriteriaXsys01500101 }
     *     
     */
    public RetrievalRequest setRptCrit(ReportCriteriaXsys01500101 value) {
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
