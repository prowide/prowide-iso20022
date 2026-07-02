
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Common details for all payment instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCommon4", propOrder = {
    "pmtFr",
    "pmtTo",
    "cmonSts",
    "reqdExctnDt",
    "ntryDt",
    "cdtDbtInd",
    "pmtMtd"
})
public class PaymentCommon4 {

    @XmlElement(name = "PmtFr")
    protected System2 pmtFr;
    @XmlElement(name = "PmtTo")
    protected System2 pmtTo;
    @XmlElement(name = "CmonSts")
    protected List<PaymentStatus6> cmonSts;
    @XmlElement(name = "ReqdExctnDt")
    protected DateAndDateTime2Choice reqdExctnDt;
    @XmlElement(name = "NtryDt")
    protected DateAndDateTime2Choice ntryDt;
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
     *     {@link System2 }
     *     
     */
    public System2 getPmtFr() {
        return pmtFr;
    }

    /**
     * Sets the value of the pmtFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link System2 }
     *     
     */
    public PaymentCommon4 setPmtFr(System2 value) {
        this.pmtFr = value;
        return this;
    }

    /**
     * Gets the value of the pmtTo property.
     * 
     * @return
     *     possible object is
     *     {@link System2 }
     *     
     */
    public System2 getPmtTo() {
        return pmtTo;
    }

    /**
     * Sets the value of the pmtTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link System2 }
     *     
     */
    public PaymentCommon4 setPmtTo(System2 value) {
        this.pmtTo = value;
        return this;
    }

    /**
     * Gets the value of the cmonSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmonSts property.
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
     * {@link PaymentStatus6 }
     * 
     * 
     */
    public List<PaymentStatus6> getCmonSts() {
        if (cmonSts == null) {
            cmonSts = new ArrayList<PaymentStatus6>();
        }
        return this.cmonSts;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public PaymentCommon4 setReqdExctnDt(DateAndDateTime2Choice value) {
        this.reqdExctnDt = value;
        return this;
    }

    /**
     * Gets the value of the ntryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getNtryDt() {
        return ntryDt;
    }

    /**
     * Sets the value of the ntryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public PaymentCommon4 setNtryDt(DateAndDateTime2Choice value) {
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
    public PaymentCommon4 setCdtDbtInd(CreditDebitCode value) {
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
    public PaymentCommon4 setPmtMtd(PaymentOrigin1Choice value) {
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
    public PaymentCommon4 addCmonSts(PaymentStatus6 cmonSts) {
        getCmonSts().add(cmonSts);
        return this;
    }

}
