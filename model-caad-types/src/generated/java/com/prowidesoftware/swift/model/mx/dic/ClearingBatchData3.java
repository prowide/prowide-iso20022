
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
@XmlType(name = "ClearingBatchData3", propOrder = {
    "mtd",
    "othrMtd",
    "prty",
    "dt",
    "ttlsCnt",
    "ttlsAmt",
    "ttlsCcy",
    "ttlsCdtDbt",
    "intrchngFeeAmt",
    "intrchngFeeCcy",
    "intrchngFeeCdtDbt",
    "agtFeeAmt",
    "agtFeeCcy",
    "agtFeeCdtDbt"
})
public class ClearingBatchData3 {

    @XmlElement(name = "Mtd", required = true)
    @XmlSchemaType(name = "string")
    protected ClearingMethod2Code mtd;
    @XmlElement(name = "OthrMtd")
    protected String othrMtd;
    @XmlElement(name = "Prty")
    protected String prty;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dt;
    @XmlElement(name = "TtlsCnt")
    protected BigDecimal ttlsCnt;
    @XmlElement(name = "TtlsAmt")
    protected BigDecimal ttlsAmt;
    @XmlElement(name = "TtlsCcy")
    protected String ttlsCcy;
    @XmlElement(name = "TtlsCdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code ttlsCdtDbt;
    @XmlElement(name = "IntrchngFeeAmt")
    protected BigDecimal intrchngFeeAmt;
    @XmlElement(name = "IntrchngFeeCcy")
    protected String intrchngFeeCcy;
    @XmlElement(name = "IntrchngFeeCdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code intrchngFeeCdtDbt;
    @XmlElement(name = "AgtFeeAmt")
    protected BigDecimal agtFeeAmt;
    @XmlElement(name = "AgtFeeCcy")
    protected String agtFeeCcy;
    @XmlElement(name = "AgtFeeCdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code agtFeeCdtDbt;

    /**
     * Gets the value of the mtd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingMethod2Code }
     *     
     */
    public ClearingMethod2Code getMtd() {
        return mtd;
    }

    /**
     * Sets the value of the mtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingMethod2Code }
     *     
     */
    public ClearingBatchData3 setMtd(ClearingMethod2Code value) {
        this.mtd = value;
        return this;
    }

    /**
     * Gets the value of the othrMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrMtd() {
        return othrMtd;
    }

    /**
     * Sets the value of the othrMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingBatchData3 setOthrMtd(String value) {
        this.othrMtd = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingBatchData3 setPrty(String value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingBatchData3 setDt(LocalDate value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the ttlsCnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlsCnt() {
        return ttlsCnt;
    }

    /**
     * Sets the value of the ttlsCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ClearingBatchData3 setTtlsCnt(BigDecimal value) {
        this.ttlsCnt = value;
        return this;
    }

    /**
     * Gets the value of the ttlsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlsAmt() {
        return ttlsAmt;
    }

    /**
     * Sets the value of the ttlsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ClearingBatchData3 setTtlsAmt(BigDecimal value) {
        this.ttlsAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlsCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlsCcy() {
        return ttlsCcy;
    }

    /**
     * Sets the value of the ttlsCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingBatchData3 setTtlsCcy(String value) {
        this.ttlsCcy = value;
        return this;
    }

    /**
     * Gets the value of the ttlsCdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getTtlsCdtDbt() {
        return ttlsCdtDbt;
    }

    /**
     * Sets the value of the ttlsCdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public ClearingBatchData3 setTtlsCdtDbt(CreditDebit3Code value) {
        this.ttlsCdtDbt = value;
        return this;
    }

    /**
     * Gets the value of the intrchngFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrchngFeeAmt() {
        return intrchngFeeAmt;
    }

    /**
     * Sets the value of the intrchngFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ClearingBatchData3 setIntrchngFeeAmt(BigDecimal value) {
        this.intrchngFeeAmt = value;
        return this;
    }

    /**
     * Gets the value of the intrchngFeeCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrchngFeeCcy() {
        return intrchngFeeCcy;
    }

    /**
     * Sets the value of the intrchngFeeCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingBatchData3 setIntrchngFeeCcy(String value) {
        this.intrchngFeeCcy = value;
        return this;
    }

    /**
     * Gets the value of the intrchngFeeCdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getIntrchngFeeCdtDbt() {
        return intrchngFeeCdtDbt;
    }

    /**
     * Sets the value of the intrchngFeeCdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public ClearingBatchData3 setIntrchngFeeCdtDbt(CreditDebit3Code value) {
        this.intrchngFeeCdtDbt = value;
        return this;
    }

    /**
     * Gets the value of the agtFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgtFeeAmt() {
        return agtFeeAmt;
    }

    /**
     * Sets the value of the agtFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ClearingBatchData3 setAgtFeeAmt(BigDecimal value) {
        this.agtFeeAmt = value;
        return this;
    }

    /**
     * Gets the value of the agtFeeCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgtFeeCcy() {
        return agtFeeCcy;
    }

    /**
     * Sets the value of the agtFeeCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingBatchData3 setAgtFeeCcy(String value) {
        this.agtFeeCcy = value;
        return this;
    }

    /**
     * Gets the value of the agtFeeCdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getAgtFeeCdtDbt() {
        return agtFeeCdtDbt;
    }

    /**
     * Sets the value of the agtFeeCdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public ClearingBatchData3 setAgtFeeCdtDbt(CreditDebit3Code value) {
        this.agtFeeCdtDbt = value;
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
