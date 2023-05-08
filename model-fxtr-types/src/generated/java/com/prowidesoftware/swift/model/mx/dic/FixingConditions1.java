
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.Calendar;
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
 * Provides the additional information for an NDF as supplied on a fixing instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixingConditions1", propOrder = {
    "tradDt",
    "orgtrRef",
    "cmonRef",
    "rltdRef",
    "tradgSdBuyAmt",
    "tradgSdSellAmt",
    "xchgRate"
})
public class FixingConditions1 {

    @XmlElement(name = "TradDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar tradDt;
    @XmlElement(name = "OrgtrRef", required = true)
    protected String orgtrRef;
    @XmlElement(name = "CmonRef")
    protected String cmonRef;
    @XmlElement(name = "RltdRef")
    protected String rltdRef;
    @XmlElement(name = "TradgSdBuyAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount tradgSdBuyAmt;
    @XmlElement(name = "TradgSdSellAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount tradgSdSellAmt;
    @XmlElement(name = "XchgRate", required = true)
    protected BigDecimal xchgRate;

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FixingConditions1 setTradDt(Calendar value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the orgtrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtrRef() {
        return orgtrRef;
    }

    /**
     * Sets the value of the orgtrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FixingConditions1 setOrgtrRef(String value) {
        this.orgtrRef = value;
        return this;
    }

    /**
     * Gets the value of the cmonRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonRef() {
        return cmonRef;
    }

    /**
     * Sets the value of the cmonRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FixingConditions1 setCmonRef(String value) {
        this.cmonRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FixingConditions1 setRltdRef(String value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the tradgSdBuyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTradgSdBuyAmt() {
        return tradgSdBuyAmt;
    }

    /**
     * Sets the value of the tradgSdBuyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public FixingConditions1 setTradgSdBuyAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.tradgSdBuyAmt = value;
        return this;
    }

    /**
     * Gets the value of the tradgSdSellAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTradgSdSellAmt() {
        return tradgSdSellAmt;
    }

    /**
     * Sets the value of the tradgSdSellAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public FixingConditions1 setTradgSdSellAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.tradgSdSellAmt = value;
        return this;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FixingConditions1 setXchgRate(BigDecimal value) {
        this.xchgRate = value;
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
