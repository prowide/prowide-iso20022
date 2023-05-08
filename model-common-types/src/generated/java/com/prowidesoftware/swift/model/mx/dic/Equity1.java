
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Financial instrument which represents a title of ownership in a company, ie, the shareholder is entitled to a part of the company's profit - usually by payment of a dividend - and to voting rights, if any. Each company issues generally different classes of shares, eg, ordinary or common shares, which have no guaranteed amount of dividend but carry voting rights, or preferred shares, which receive dividends before ordinary shares but have no voting right.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Equity1", propOrder = {
    "prefToIncm",
    "pmtSts",
    "convtblInd",
    "mtrtyDt",
    "nonPdAmt",
    "parVal",
    "vtngRghtsPerShr"
})
public class Equity1 {

    @XmlElement(name = "PrefToIncm", required = true)
    @XmlSchemaType(name = "string")
    protected PreferenceToIncome1Code prefToIncm;
    @XmlElement(name = "PmtSts")
    @XmlSchemaType(name = "string")
    protected SecuritiesPaymentStatus1Code pmtSts;
    @XmlElement(name = "ConvtblInd")
    protected Boolean convtblInd;
    @XmlElement(name = "MtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar mtrtyDt;
    @XmlElement(name = "NonPdAmt")
    protected ActiveCurrencyAndAmount nonPdAmt;
    @XmlElement(name = "ParVal")
    protected ActiveCurrencyAndAmount parVal;
    @XmlElement(name = "VtngRghtsPerShr")
    protected BigDecimal vtngRghtsPerShr;

    /**
     * Gets the value of the prefToIncm property.
     * 
     * @return
     *     possible object is
     *     {@link PreferenceToIncome1Code }
     *     
     */
    public PreferenceToIncome1Code getPrefToIncm() {
        return prefToIncm;
    }

    /**
     * Sets the value of the prefToIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenceToIncome1Code }
     *     
     */
    public Equity1 setPrefToIncm(PreferenceToIncome1Code value) {
        this.prefToIncm = value;
        return this;
    }

    /**
     * Gets the value of the pmtSts property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesPaymentStatus1Code }
     *     
     */
    public SecuritiesPaymentStatus1Code getPmtSts() {
        return pmtSts;
    }

    /**
     * Sets the value of the pmtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesPaymentStatus1Code }
     *     
     */
    public Equity1 setPmtSts(SecuritiesPaymentStatus1Code value) {
        this.pmtSts = value;
        return this;
    }

    /**
     * Gets the value of the convtblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConvtblInd() {
        return convtblInd;
    }

    /**
     * Sets the value of the convtblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Equity1 setConvtblInd(Boolean value) {
        this.convtblInd = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Equity1 setMtrtyDt(Calendar value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the nonPdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNonPdAmt() {
        return nonPdAmt;
    }

    /**
     * Sets the value of the nonPdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Equity1 setNonPdAmt(ActiveCurrencyAndAmount value) {
        this.nonPdAmt = value;
        return this;
    }

    /**
     * Gets the value of the parVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getParVal() {
        return parVal;
    }

    /**
     * Sets the value of the parVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Equity1 setParVal(ActiveCurrencyAndAmount value) {
        this.parVal = value;
        return this;
    }

    /**
     * Gets the value of the vtngRghtsPerShr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVtngRghtsPerShr() {
        return vtngRghtsPerShr;
    }

    /**
     * Sets the value of the vtngRghtsPerShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Equity1 setVtngRghtsPerShr(BigDecimal value) {
        this.vtngRghtsPerShr = value;
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
