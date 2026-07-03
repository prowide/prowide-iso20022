
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
 * Indicator whether there is a reporting requirement for both counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingRequirement2Choice", propOrder = {
    "rptgRqrmnt",
    "noRptgRqrmnt"
})
public class ReportingRequirement2Choice {

    @XmlElement(name = "RptgRqrmnt")
    protected ReconciliationCategory3 rptgRqrmnt;
    @XmlElement(name = "NoRptgRqrmnt")
    protected ReconciliationCategory2 noRptgRqrmnt;

    /**
     * Gets the value of the rptgRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationCategory3 }
     *     
     */
    public ReconciliationCategory3 getRptgRqrmnt() {
        return rptgRqrmnt;
    }

    /**
     * Sets the value of the rptgRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationCategory3 }
     *     
     */
    public ReportingRequirement2Choice setRptgRqrmnt(ReconciliationCategory3 value) {
        this.rptgRqrmnt = value;
        return this;
    }

    /**
     * Gets the value of the noRptgRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationCategory2 }
     *     
     */
    public ReconciliationCategory2 getNoRptgRqrmnt() {
        return noRptgRqrmnt;
    }

    /**
     * Sets the value of the noRptgRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationCategory2 }
     *     
     */
    public ReportingRequirement2Choice setNoRptgRqrmnt(ReconciliationCategory2 value) {
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
