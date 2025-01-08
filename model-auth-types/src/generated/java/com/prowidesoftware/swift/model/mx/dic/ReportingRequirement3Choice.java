
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Indicator whether there is a reporting requirement for both counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingRequirement3Choice", propOrder = {
    "rptgRqrmnt",
    "noRptgRqrmnt"
})
public class ReportingRequirement3Choice {

    @XmlElement(name = "RptgRqrmnt")
    protected ReconciliationCategory5 rptgRqrmnt;
    @XmlElement(name = "NoRptgRqrmnt")
    protected ReconciliationCategory4 noRptgRqrmnt;

    /**
     * Gets the value of the rptgRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationCategory5 }
     *     
     */
    public ReconciliationCategory5 getRptgRqrmnt() {
        return rptgRqrmnt;
    }

    /**
     * Sets the value of the rptgRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationCategory5 }
     *     
     */
    public ReportingRequirement3Choice setRptgRqrmnt(ReconciliationCategory5 value) {
        this.rptgRqrmnt = value;
        return this;
    }

    /**
     * Gets the value of the noRptgRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationCategory4 }
     *     
     */
    public ReconciliationCategory4 getNoRptgRqrmnt() {
        return noRptgRqrmnt;
    }

    /**
     * Sets the value of the noRptgRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationCategory4 }
     *     
     */
    public ReportingRequirement3Choice setNoRptgRqrmnt(ReconciliationCategory4 value) {
        this.noRptgRqrmnt = value;
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
