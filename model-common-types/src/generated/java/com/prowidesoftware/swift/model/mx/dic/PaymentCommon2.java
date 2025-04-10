
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Common details for all payment instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCommon2", propOrder = {
    "pmtFr",
    "pmtTo",
    "cmonSts",
    "reqdExctnDt",
    "ntryDt",
    "cdtDbtInd",
    "pmtMtd"
})
public class PaymentCommon2 {

    @XmlElement(name = "PmtFr")
    protected System1 pmtFr;
    @XmlElement(name = "PmtTo")
    protected System1 pmtTo;
    @XmlElement(name = "CmonSts")
    protected List<PaymentStatus2> cmonSts;
    @XmlElement(name = "ReqdExctnDt")
    protected DateAndDateTimeChoice reqdExctnDt;
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
     *     {@link System1 }
     *     
     */
    public System1 getPmtFr() {
        return pmtFr;
    }

    /**
     * Sets the value of the pmtFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link System1 }
     *     
     */
    public PaymentCommon2 setPmtFr(System1 value) {
        this.pmtFr = value;
        return this;
    }

    /**
     * Gets the value of the pmtTo property.
     * 
     * @return
     *     possible object is
     *     {@link System1 }
     *     
     */
    public System1 getPmtTo() {
        return pmtTo;
    }

    /**
     * Sets the value of the pmtTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link System1 }
     *     
     */
    public PaymentCommon2 setPmtTo(System1 value) {
        this.pmtTo = value;
        return this;
    }

    /**
     * Gets the value of the cmonSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmonSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmonSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentStatus2 }
     * 
     * 
     * @return
     *     The value of the cmonSts property.
     */
    public List<PaymentStatus2> getCmonSts() {
        if (cmonSts == null) {
            cmonSts = new ArrayList<>();
        }
        return this.cmonSts;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public PaymentCommon2 setReqdExctnDt(DateAndDateTimeChoice value) {
        this.reqdExctnDt = value;
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
    public PaymentCommon2 setNtryDt(DateAndDateTimeChoice value) {
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
    public PaymentCommon2 setCdtDbtInd(CreditDebitCode value) {
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
    public PaymentCommon2 setPmtMtd(PaymentOrigin1Choice value) {
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

    /**
     * Adds a new item to the cmonSts list.
     * @see #getCmonSts()
     * 
     */
    public PaymentCommon2 addCmonSts(PaymentStatus2 cmonSts) {
        getCmonSts().add(cmonSts);
        return this;
    }

}
