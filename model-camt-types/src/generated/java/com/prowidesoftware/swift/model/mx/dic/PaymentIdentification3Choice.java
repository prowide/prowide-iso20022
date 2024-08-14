
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
 * Choice between ways of identifying a payment instruction by its references and business identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentIdentification3Choice", propOrder = {
    "pmtInstrRef",
    "qId",
    "lngBizId",
    "shrtBizId",
    "prtryRef"
})
public class PaymentIdentification3Choice {

    @XmlElement(name = "PmtInstrRef")
    protected String pmtInstrRef;
    @XmlElement(name = "QId")
    protected QueueTransactionIdentificationDetails qId;
    @XmlElement(name = "LngBizId")
    protected PaymentInstructionReferenceDetails4 lngBizId;
    @XmlElement(name = "ShrtBizId")
    protected PaymentInstructionReferenceDetails2 shrtBizId;
    @XmlElement(name = "PrtryRef")
    protected String prtryRef;

    /**
     * Gets the value of the pmtInstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtInstrRef() {
        return pmtInstrRef;
    }

    /**
     * Sets the value of the pmtInstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentIdentification3Choice setPmtInstrRef(String value) {
        this.pmtInstrRef = value;
        return this;
    }

    /**
     * Gets the value of the qId property.
     * 
     * @return
     *     possible object is
     *     {@link QueueTransactionIdentificationDetails }
     *     
     */
    public QueueTransactionIdentificationDetails getQId() {
        return qId;
    }

    /**
     * Sets the value of the qId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueTransactionIdentificationDetails }
     *     
     */
    public PaymentIdentification3Choice setQId(QueueTransactionIdentificationDetails value) {
        this.qId = value;
        return this;
    }

    /**
     * Gets the value of the lngBizId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstructionReferenceDetails4 }
     *     
     */
    public PaymentInstructionReferenceDetails4 getLngBizId() {
        return lngBizId;
    }

    /**
     * Sets the value of the lngBizId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstructionReferenceDetails4 }
     *     
     */
    public PaymentIdentification3Choice setLngBizId(PaymentInstructionReferenceDetails4 value) {
        this.lngBizId = value;
        return this;
    }

    /**
     * Gets the value of the shrtBizId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstructionReferenceDetails2 }
     *     
     */
    public PaymentInstructionReferenceDetails2 getShrtBizId() {
        return shrtBizId;
    }

    /**
     * Sets the value of the shrtBizId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstructionReferenceDetails2 }
     *     
     */
    public PaymentIdentification3Choice setShrtBizId(PaymentInstructionReferenceDetails2 value) {
        this.shrtBizId = value;
        return this;
    }

    /**
     * Gets the value of the prtryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryRef() {
        return prtryRef;
    }

    /**
     * Sets the value of the prtryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentIdentification3Choice setPrtryRef(String value) {
        this.prtryRef = value;
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
