
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
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
@XmlType(name = "Equity3", propOrder = {
    "prefToIncm",
    "mtrtyDt",
    "nonPdAmt",
    "parVal",
    "vtngRghtsPerShr"
})
public class Equity3 {

    @XmlElement(name = "PrefToIncm", required = true)
    protected PreferenceToIncome5Choice prefToIncm;
    @XmlElement(name = "MtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime mtrtyDt;
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
     *     {@link PreferenceToIncome5Choice }
     *     
     */
    public PreferenceToIncome5Choice getPrefToIncm() {
        return prefToIncm;
    }

    /**
     * Sets the value of the prefToIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenceToIncome5Choice }
     *     
     */
    public Equity3 setPrefToIncm(PreferenceToIncome5Choice value) {
        this.prefToIncm = value;
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
    public OffsetDateTime getMtrtyDt() {
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
    public Equity3 setMtrtyDt(OffsetDateTime value) {
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
    public Equity3 setNonPdAmt(ActiveCurrencyAndAmount value) {
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
    public Equity3 setParVal(ActiveCurrencyAndAmount value) {
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
    public Equity3 setVtngRghtsPerShr(BigDecimal value) {
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
