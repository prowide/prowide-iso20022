
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
    "bulkRtrvlCrit"
})
public class ReportCriteriaXsys01300101 {

    @XmlElement(name = "BulkRtrvlCrit")
    protected BulkRetrievalCriteria bulkRtrvlCrit;

    /**
     * Gets the value of the bulkRtrvlCrit property.
     * 
     * @return
     *     possible object is
     *     {@link BulkRetrievalCriteria }
     *     
     */
    public BulkRetrievalCriteria getBulkRtrvlCrit() {
        return bulkRtrvlCrit;
    }

    /**
     * Sets the value of the bulkRtrvlCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkRetrievalCriteria }
     *     
     */
    public ReportCriteriaXsys01300101 setBulkRtrvlCrit(BulkRetrievalCriteria value) {
        this.bulkRtrvlCrit = value;
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
