
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
 * Provides the dispute notification details for the variation margin and the segregated independent amount, or the segregated independent amount only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeNotification2Choice", propOrder = {
    "dsptNtfctnDtls",
    "sgrtdIndpdntAmtDsptDtls"
})
public class DisputeNotification2Choice {

    @XmlElement(name = "DsptNtfctnDtls")
    protected DisputeNotification2 dsptNtfctnDtls;
    @XmlElement(name = "SgrtdIndpdntAmtDsptDtls")
    protected SegregatedIndependentAmountDispute2 sgrtdIndpdntAmtDsptDtls;

    /**
     * Gets the value of the dsptNtfctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeNotification2 }
     *     
     */
    public DisputeNotification2 getDsptNtfctnDtls() {
        return dsptNtfctnDtls;
    }

    /**
     * Sets the value of the dsptNtfctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeNotification2 }
     *     
     */
    public DisputeNotification2Choice setDsptNtfctnDtls(DisputeNotification2 value) {
        this.dsptNtfctnDtls = value;
        return this;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmtDsptDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SegregatedIndependentAmountDispute2 }
     *     
     */
    public SegregatedIndependentAmountDispute2 getSgrtdIndpdntAmtDsptDtls() {
        return sgrtdIndpdntAmtDsptDtls;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmtDsptDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegregatedIndependentAmountDispute2 }
     *     
     */
    public DisputeNotification2Choice setSgrtdIndpdntAmtDsptDtls(SegregatedIndependentAmountDispute2 value) {
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
