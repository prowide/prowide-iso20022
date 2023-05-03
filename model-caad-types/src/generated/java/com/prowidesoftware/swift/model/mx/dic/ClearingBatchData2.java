
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
 * Clearing data at batch level. Allows clearing in different currencies.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingBatchData2", propOrder = {
    "clrMtd",
    "othrClrMtd",
    "clrPrty",
    "clrDt",
    "clrTtls",
    "intrchngFee",
    "agtFee"
})
public class ClearingBatchData2 {

    @XmlElement(name = "ClrMtd", required = true)
    @XmlSchemaType(name = "string")
    protected ClearingMethod2Code clrMtd;
    @XmlElement(name = "OthrClrMtd")
    protected String othrClrMtd;
    @XmlElement(name = "ClrPrty")
    protected String clrPrty;
    @XmlElement(name = "ClrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate clrDt;
    @XmlElement(name = "ClrTtls")
    protected ClearingTotals2 clrTtls;
    @XmlElement(name = "IntrchngFee")
    protected Amount17 intrchngFee;
    @XmlElement(name = "AgtFee")
    protected Amount17 agtFee;

    /**
     * Gets the value of the clrMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingMethod2Code }
     *     
     */
    public ClearingMethod2Code getClrMtd() {
        return clrMtd;
    }

    /**
     * Sets the value of the clrMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingMethod2Code }
     *     
     */
    public ClearingBatchData2 setClrMtd(ClearingMethod2Code value) {
        this.clrMtd = value;
        return this;
    }

    /**
     * Gets the value of the othrClrMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrClrMtd() {
        return othrClrMtd;
    }

    /**
     * Sets the value of the othrClrMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingBatchData2 setOthrClrMtd(String value) {
        this.othrClrMtd = value;
        return this;
    }

    /**
     * Gets the value of the clrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrPrty() {
        return clrPrty;
    }

    /**
     * Sets the value of the clrPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingBatchData2 setClrPrty(String value) {
        this.clrPrty = value;
        return this;
    }

    /**
     * Gets the value of the clrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getClrDt() {
        return clrDt;
    }

    /**
     * Sets the value of the clrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingBatchData2 setClrDt(LocalDate value) {
        this.clrDt = value;
        return this;
    }

    /**
     * Gets the value of the clrTtls property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingTotals2 }
     *     
     */
    public ClearingTotals2 getClrTtls() {
        return clrTtls;
    }

    /**
     * Sets the value of the clrTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingTotals2 }
     *     
     */
    public ClearingBatchData2 setClrTtls(ClearingTotals2 value) {
        this.clrTtls = value;
        return this;
    }

    /**
     * Gets the value of the intrchngFee property.
     * 
     * @return
     *     possible object is
     *     {@link Amount17 }
     *     
     */
    public Amount17 getIntrchngFee() {
        return intrchngFee;
    }

    /**
     * Sets the value of the intrchngFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount17 }
     *     
     */
    public ClearingBatchData2 setIntrchngFee(Amount17 value) {
        this.intrchngFee = value;
        return this;
    }

    /**
     * Gets the value of the agtFee property.
     * 
     * @return
     *     possible object is
     *     {@link Amount17 }
     *     
     */
    public Amount17 getAgtFee() {
        return agtFee;
    }

    /**
     * Sets the value of the agtFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount17 }
     *     
     */
    public ClearingBatchData2 setAgtFee(Amount17 value) {
        this.agtFee = value;
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
