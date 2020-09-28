
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between a payment term in a coded or free format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCodeOrOther2Choice", propOrder = {
    "pmtCd",
    "pmtDueDt",
    "othrPmtTerms"
})
public class PaymentCodeOrOther2Choice {

    @XmlElement(name = "PmtCd")
    protected PaymentPeriod4 pmtCd;
    @XmlElement(name = "PmtDueDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pmtDueDt;
    @XmlElement(name = "OthrPmtTerms")
    protected String othrPmtTerms;

    /**
     * Gets the value of the pmtCd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPeriod4 }
     *     
     */
    public PaymentPeriod4 getPmtCd() {
        return pmtCd;
    }

    /**
     * Sets the value of the pmtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPeriod4 }
     *     
     */
    public PaymentCodeOrOther2Choice setPmtCd(PaymentPeriod4 value) {
        this.pmtCd = value;
        return this;
    }

    /**
     * Gets the value of the pmtDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPmtDueDt() {
        return pmtDueDt;
    }

    /**
     * Sets the value of the pmtDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public PaymentCodeOrOther2Choice setPmtDueDt(XMLGregorianCalendar value) {
        this.pmtDueDt = value;
        return this;
    }

    /**
     * Gets the value of the othrPmtTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPmtTerms() {
        return othrPmtTerms;
    }

    /**
     * Sets the value of the othrPmtTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCodeOrOther2Choice setOthrPmtTerms(String value) {
        this.othrPmtTerms = value;
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
