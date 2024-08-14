
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
 * Detailed statistics on reconciliation per type of derivative.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationStatisticsPerDerivativeType3", propOrder = {
    "allDerivs",
    "outsdngDerivs"
})
public class ReconciliationStatisticsPerDerivativeType3 {

    @XmlElement(name = "AllDerivs", required = true)
    protected DetailedReconciliationStatistics2 allDerivs;
    @XmlElement(name = "OutsdngDerivs", required = true)
    protected DetailedReconciliationStatistics2 outsdngDerivs;

    /**
     * Gets the value of the allDerivs property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedReconciliationStatistics2 }
     *     
     */
    public DetailedReconciliationStatistics2 getAllDerivs() {
        return allDerivs;
    }

    /**
     * Sets the value of the allDerivs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedReconciliationStatistics2 }
     *     
     */
    public ReconciliationStatisticsPerDerivativeType3 setAllDerivs(DetailedReconciliationStatistics2 value) {
        this.allDerivs = value;
        return this;
    }

    /**
     * Gets the value of the outsdngDerivs property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedReconciliationStatistics2 }
     *     
     */
    public DetailedReconciliationStatistics2 getOutsdngDerivs() {
        return outsdngDerivs;
    }

    /**
     * Sets the value of the outsdngDerivs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedReconciliationStatistics2 }
     *     
     */
    public ReconciliationStatisticsPerDerivativeType3 setOutsdngDerivs(DetailedReconciliationStatistics2 value) {
        this.outsdngDerivs = value;
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
