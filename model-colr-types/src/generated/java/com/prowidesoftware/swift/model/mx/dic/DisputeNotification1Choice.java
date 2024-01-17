
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
 * Provides the dispute notification details for the variation margin and the segregated independent amount, or the segregated independent amount only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeNotification1Choice", propOrder = {
    "dsptNtfctnDtls",
    "sgrtdIndpdntAmtDsptDtls"
})
public class DisputeNotification1Choice {

    @XmlElement(name = "DsptNtfctnDtls")
    protected DisputeNotification1 dsptNtfctnDtls;
    @XmlElement(name = "SgrtdIndpdntAmtDsptDtls")
    protected SegregatedIndependentAmountDispute1 sgrtdIndpdntAmtDsptDtls;

    /**
     * Gets the value of the dsptNtfctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeNotification1 }
     *     
     */
    public DisputeNotification1 getDsptNtfctnDtls() {
        return dsptNtfctnDtls;
    }

    /**
     * Sets the value of the dsptNtfctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeNotification1 }
     *     
     */
    public DisputeNotification1Choice setDsptNtfctnDtls(DisputeNotification1 value) {
        this.dsptNtfctnDtls = value;
        return this;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmtDsptDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SegregatedIndependentAmountDispute1 }
     *     
     */
    public SegregatedIndependentAmountDispute1 getSgrtdIndpdntAmtDsptDtls() {
        return sgrtdIndpdntAmtDsptDtls;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmtDsptDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegregatedIndependentAmountDispute1 }
     *     
     */
    public DisputeNotification1Choice setSgrtdIndpdntAmtDsptDtls(SegregatedIndependentAmountDispute1 value) {
        this.sgrtdIndpdntAmtDsptDtls = value;
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
