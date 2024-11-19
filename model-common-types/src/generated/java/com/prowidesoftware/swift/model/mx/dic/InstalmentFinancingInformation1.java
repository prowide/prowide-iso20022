
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
 * Information about result of a single instalment (financed or not) within an invoice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalmentFinancingInformation1", propOrder = {
    "instlmtSeqId",
    "instlmtTtlAmt",
    "instlmtFincgRslt"
})
public class InstalmentFinancingInformation1 {

    @XmlElement(name = "InstlmtSeqId", required = true)
    protected String instlmtSeqId;
    @XmlElement(name = "InstlmtTtlAmt", required = true)
    protected ActiveCurrencyAndAmount instlmtTtlAmt;
    @XmlElement(name = "InstlmtFincgRslt", required = true)
    protected FinancingResult1 instlmtFincgRslt;

    /**
     * Gets the value of the instlmtSeqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstlmtSeqId() {
        return instlmtSeqId;
    }

    /**
     * Sets the value of the instlmtSeqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstalmentFinancingInformation1 setInstlmtSeqId(String value) {
        this.instlmtSeqId = value;
        return this;
    }

    /**
     * Gets the value of the instlmtTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getInstlmtTtlAmt() {
        return instlmtTtlAmt;
    }

    /**
     * Sets the value of the instlmtTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InstalmentFinancingInformation1 setInstlmtTtlAmt(ActiveCurrencyAndAmount value) {
        this.instlmtTtlAmt = value;
        return this;
    }

    /**
     * Gets the value of the instlmtFincgRslt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingResult1 }
     *     
     */
    public FinancingResult1 getInstlmtFincgRslt() {
        return instlmtFincgRslt;
    }

    /**
     * Sets the value of the instlmtFincgRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingResult1 }
     *     
     */
    public InstalmentFinancingInformation1 setInstlmtFincgRslt(FinancingResult1 value) {
        this.instlmtFincgRslt = value;
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
