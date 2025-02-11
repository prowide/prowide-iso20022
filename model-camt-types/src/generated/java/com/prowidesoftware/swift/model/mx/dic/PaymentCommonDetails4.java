
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "PaymentCommonDetails4", propOrder = {
    "pmtFr",
    "pmtTo",
    "cmonInstrSts",
    "trfValDt",
    "ntryDt",
    "cdtDbtInd",
    "pmtMtd"
})
public class PaymentCommonDetails4 {

    @XmlElement(name = "PmtFr")
    protected SystemDetails2 pmtFr;
    @XmlElement(name = "PmtTo")
    protected SystemDetails2 pmtTo;
    @XmlElement(name = "CmonInstrSts")
    protected PaymentStatusDetails4 cmonInstrSts;
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
    public PaymentCommonDetails4 setPmtFr(SystemDetails2 value) {
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
    public PaymentCommonDetails4 setPmtTo(SystemDetails2 value) {
        this.pmtTo = value;
        return this;
    }

    /**
     * Gets the value of the cmonInstrSts property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusDetails4 }
     *     
     */
    public PaymentStatusDetails4 getCmonInstrSts() {
        return cmonInstrSts;
    }

    /**
     * Sets the value of the cmonInstrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusDetails4 }
     *     
     */
    public PaymentCommonDetails4 setCmonInstrSts(PaymentStatusDetails4 value) {
        this.cmonInstrSts = value;
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
    public PaymentCommonDetails4 setTrfValDt(DateAndDateTimeChoice value) {
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
    public PaymentCommonDetails4 setNtryDt(DateAndDateTimeChoice value) {
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
    public PaymentCommonDetails4 setCdtDbtInd(CreditDebitCode value) {
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
    public PaymentCommonDetails4 setPmtMtd(PaymentOrigin1Choice value) {
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
