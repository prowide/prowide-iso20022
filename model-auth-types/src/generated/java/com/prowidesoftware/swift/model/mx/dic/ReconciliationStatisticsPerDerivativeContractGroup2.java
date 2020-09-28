
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
 * Detailed statistics on derivatives submitted for reconciliation per group of derivative contract.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationStatisticsPerDerivativeContractGroup2", propOrder = {
    "otc",
    "etd"
})
public class ReconciliationStatisticsPerDerivativeContractGroup2 {

    @XmlElement(name = "OTC", required = true)
    protected ReconciliationStatisticsPerDerivativeType2 otc;
    @XmlElement(name = "ETD", required = true)
    protected ReconciliationStatisticsPerDerivativeType2 etd;

    /**
     * Gets the value of the otc property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationStatisticsPerDerivativeType2 }
     *     
     */
    public ReconciliationStatisticsPerDerivativeType2 getOTC() {
        return otc;
    }

    /**
     * Sets the value of the otc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationStatisticsPerDerivativeType2 }
     *     
     */
    public ReconciliationStatisticsPerDerivativeContractGroup2 setOTC(ReconciliationStatisticsPerDerivativeType2 value) {
        this.otc = value;
        return this;
    }

    /**
     * Gets the value of the etd property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationStatisticsPerDerivativeType2 }
     *     
     */
    public ReconciliationStatisticsPerDerivativeType2 getETD() {
        return etd;
    }

    /**
     * Sets the value of the etd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationStatisticsPerDerivativeType2 }
     *     
     */
    public ReconciliationStatisticsPerDerivativeContractGroup2 setETD(ReconciliationStatisticsPerDerivativeType2 value) {
        this.etd = value;
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
