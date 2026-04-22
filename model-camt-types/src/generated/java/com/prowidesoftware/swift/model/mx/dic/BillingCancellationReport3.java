
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Report on cancelled billing data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingCancellationReport3", propOrder = {
    "rgltryData",
    "svc",
    "invcDt",
    "bllgId",
    "bllgPrd",
    "cxlRsn"
})
public class BillingCancellationReport3 {

    @XmlElement(name = "RgltryData")
    protected InvoiceLegalIssue5 rgltryData;
    @XmlElement(name = "Svc")
    protected SystemAndCurrency1 svc;
    @XmlElement(name = "InvcDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate invcDt;
    @XmlElement(name = "BllgId", required = true)
    protected String bllgId;
    @XmlElement(name = "BllgPrd", required = true)
    protected DatePeriod2 bllgPrd;
    @XmlElement(name = "CxlRsn", required = true)
    protected CancellationReason16Choice cxlRsn;

    /**
     * Gets the value of the rgltryData property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLegalIssue5 }
     *     
     */
    public InvoiceLegalIssue5 getRgltryData() {
        return rgltryData;
    }

    /**
     * Sets the value of the rgltryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLegalIssue5 }
     *     
     */
    public BillingCancellationReport3 setRgltryData(InvoiceLegalIssue5 value) {
        this.rgltryData = value;
        return this;
    }

    /**
     * Gets the value of the svc property.
     * 
     * @return
     *     possible object is
     *     {@link SystemAndCurrency1 }
     *     
     */
    public SystemAndCurrency1 getSvc() {
        return svc;
    }

    /**
     * Sets the value of the svc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemAndCurrency1 }
     *     
     */
    public BillingCancellationReport3 setSvc(SystemAndCurrency1 value) {
        this.svc = value;
        return this;
    }

    /**
     * Gets the value of the invcDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getInvcDt() {
        return invcDt;
    }

    /**
     * Sets the value of the invcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingCancellationReport3 setInvcDt(LocalDate value) {
        this.invcDt = value;
        return this;
    }

    /**
     * Gets the value of the bllgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBllgId() {
        return bllgId;
    }

    /**
     * Sets the value of the bllgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingCancellationReport3 setBllgId(String value) {
        this.bllgId = value;
        return this;
    }

    /**
     * Gets the value of the bllgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2 }
     *     
     */
    public DatePeriod2 getBllgPrd() {
        return bllgPrd;
    }

    /**
     * Sets the value of the bllgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2 }
     *     
     */
    public BillingCancellationReport3 setBllgPrd(DatePeriod2 value) {
        this.bllgPrd = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason16Choice }
     *     
     */
    public CancellationReason16Choice getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason16Choice }
     *     
     */
    public BillingCancellationReport3 setCxlRsn(CancellationReason16Choice value) {
        this.cxlRsn = value;
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
