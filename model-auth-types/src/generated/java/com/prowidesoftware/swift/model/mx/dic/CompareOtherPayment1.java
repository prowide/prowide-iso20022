
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
 * Specifies two values to compare related to payment data attributes not reported in dedicated fields.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompareOtherPayment1", propOrder = {
    "othrPmtTp",
    "othrPmtAmt",
    "othrPmtDt",
    "othrPmtPyer",
    "othrPmtRcvr"
})
public class CompareOtherPayment1 {

    @XmlElement(name = "OthrPmtTp")
    protected CompareOtherPaymentType1 othrPmtTp;
    @XmlElement(name = "OthrPmtAmt")
    protected CompareAmountAndDirection3 othrPmtAmt;
    @XmlElement(name = "OthrPmtDt")
    protected CompareDate3 othrPmtDt;
    @XmlElement(name = "OthrPmtPyer")
    protected CompareOrganisationIdentification7 othrPmtPyer;
    @XmlElement(name = "OthrPmtRcvr")
    protected CompareOrganisationIdentification7 othrPmtRcvr;

    /**
     * Gets the value of the othrPmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOtherPaymentType1 }
     *     
     */
    public CompareOtherPaymentType1 getOthrPmtTp() {
        return othrPmtTp;
    }

    /**
     * Sets the value of the othrPmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOtherPaymentType1 }
     *     
     */
    public CompareOtherPayment1 setOthrPmtTp(CompareOtherPaymentType1 value) {
        this.othrPmtTp = value;
        return this;
    }

    /**
     * Gets the value of the othrPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection3 }
     *     
     */
    public CompareAmountAndDirection3 getOthrPmtAmt() {
        return othrPmtAmt;
    }

    /**
     * Sets the value of the othrPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection3 }
     *     
     */
    public CompareOtherPayment1 setOthrPmtAmt(CompareAmountAndDirection3 value) {
        this.othrPmtAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getOthrPmtDt() {
        return othrPmtDt;
    }

    /**
     * Sets the value of the othrPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareOtherPayment1 setOthrPmtDt(CompareDate3 value) {
        this.othrPmtDt = value;
        return this;
    }

    /**
     * Gets the value of the othrPmtPyer property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOrganisationIdentification7 }
     *     
     */
    public CompareOrganisationIdentification7 getOthrPmtPyer() {
        return othrPmtPyer;
    }

    /**
     * Sets the value of the othrPmtPyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOrganisationIdentification7 }
     *     
     */
    public CompareOtherPayment1 setOthrPmtPyer(CompareOrganisationIdentification7 value) {
        this.othrPmtPyer = value;
        return this;
    }

    /**
     * Gets the value of the othrPmtRcvr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOrganisationIdentification7 }
     *     
     */
    public CompareOrganisationIdentification7 getOthrPmtRcvr() {
        return othrPmtRcvr;
    }

    /**
     * Sets the value of the othrPmtRcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOrganisationIdentification7 }
     *     
     */
    public CompareOtherPayment1 setOthrPmtRcvr(CompareOrganisationIdentification7 value) {
        this.othrPmtRcvr = value;
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
