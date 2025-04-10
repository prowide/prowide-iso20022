
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Common detailed payment instruction information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCommonDetails3", propOrder = {
    "pmtFr",
    "pmtTo",
    "pmtInstrSts",
    "trfValDt",
    "ntryDt",
    "cdtDbtInd",
    "pmtMtd"
})
public class PaymentCommonDetails3 {

    @XmlElement(name = "PmtFr")
    protected SystemDetails2 pmtFr;
    @XmlElement(name = "PmtTo")
    protected SystemDetails2 pmtTo;
    @XmlElement(name = "PmtInstrSts")
    protected PaymentStatusCode3Choice pmtInstrSts;
    @XmlElement(name = "TrfValDt")
    protected DateAndDateTimeChoice trfValDt;
    @XmlElement(name = "NtryDt")
    protected DateAndDateTimeChoice ntryDt;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "PmtMtd")
    protected PaymentOrigin1Choice pmtMtd;

    /**
     * Gets the value of the pmtFr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetails2 }
     *     
     */
    public SystemDetails2 getPmtFr() {
        return pmtFr;
    }

    /**
     * Sets the value of the pmtFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetails2 }
     *     
     */
    public PaymentCommonDetails3 setPmtFr(SystemDetails2 value) {
        this.pmtFr = value;
        return this;
    }

    /**
     * Gets the value of the pmtTo property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetails2 }
     *     
     */
    public SystemDetails2 getPmtTo() {
        return pmtTo;
    }

    /**
     * Sets the value of the pmtTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetails2 }
     *     
     */
    public PaymentCommonDetails3 setPmtTo(SystemDetails2 value) {
        this.pmtTo = value;
        return this;
    }

    /**
     * Gets the value of the pmtInstrSts property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusCode3Choice }
     *     
     */
    public PaymentStatusCode3Choice getPmtInstrSts() {
        return pmtInstrSts;
    }

    /**
     * Sets the value of the pmtInstrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusCode3Choice }
     *     
     */
    public PaymentCommonDetails3 setPmtInstrSts(PaymentStatusCode3Choice value) {
        this.pmtInstrSts = value;
        return this;
    }

    /**
     * Gets the value of the trfValDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getTrfValDt() {
        return trfValDt;
    }

    /**
     * Sets the value of the trfValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public PaymentCommonDetails3 setTrfValDt(DateAndDateTimeChoice value) {
        this.trfValDt = value;
        return this;
    }

    /**
     * Gets the value of the ntryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getNtryDt() {
        return ntryDt;
    }

    /**
     * Sets the value of the ntryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public PaymentCommonDetails3 setNtryDt(DateAndDateTimeChoice value) {
        this.ntryDt = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public PaymentCommonDetails3 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOrigin1Choice }
     *     
     */
    public PaymentOrigin1Choice getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOrigin1Choice }
     *     
     */
    public PaymentCommonDetails3 setPmtMtd(PaymentOrigin1Choice value) {
        this.pmtMtd = value;
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
