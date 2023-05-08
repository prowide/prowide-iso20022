
package com.prowidesoftware.swift.model.mx.dic;

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
 * Expected trade date and expected settlement date of the order execution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedExecutionDetails3", propOrder = {
    "xpctdTradDtTm",
    "xpctdCshSttlmDt",
    "xpctdExctdAmt",
    "pmtInInd",
    "pmtRef",
    "prepmtDt",
    "topUpAmt",
    "hldBckDtls",
    "sdPcktQty"
})
public class ExpectedExecutionDetails3 {

    @XmlElement(name = "XpctdTradDtTm")
    protected DateAndDateTimeChoice xpctdTradDtTm;
    @XmlElement(name = "XpctdCshSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar xpctdCshSttlmDt;
    @XmlElement(name = "XpctdExctdAmt", required = true)
    protected ActiveCurrencyAndAmount xpctdExctdAmt;
    @XmlElement(name = "PmtInInd")
    protected Boolean pmtInInd;
    @XmlElement(name = "PmtRef")
    protected String pmtRef;
    @XmlElement(name = "PrepmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar prepmtDt;
    @XmlElement(name = "TopUpAmt")
    protected ActiveCurrencyAndAmount topUpAmt;
    @XmlElement(name = "HldBckDtls")
    protected HoldBackInformation1 hldBckDtls;
    @XmlElement(name = "SdPcktQty")
    protected SidePocketQuantityAndAmount1 sdPcktQty;

    /**
     * Gets the value of the xpctdTradDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getXpctdTradDtTm() {
        return xpctdTradDtTm;
    }

    /**
     * Sets the value of the xpctdTradDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public ExpectedExecutionDetails3 setXpctdTradDtTm(DateAndDateTimeChoice value) {
        this.xpctdTradDtTm = value;
        return this;
    }

    /**
     * Gets the value of the xpctdCshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getXpctdCshSttlmDt() {
        return xpctdCshSttlmDt;
    }

    /**
     * Sets the value of the xpctdCshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExpectedExecutionDetails3 setXpctdCshSttlmDt(Calendar value) {
        this.xpctdCshSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the xpctdExctdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getXpctdExctdAmt() {
        return xpctdExctdAmt;
    }

    /**
     * Sets the value of the xpctdExctdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ExpectedExecutionDetails3 setXpctdExctdAmt(ActiveCurrencyAndAmount value) {
        this.xpctdExctdAmt = value;
        return this;
    }

    /**
     * Gets the value of the pmtInInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtInInd() {
        return pmtInInd;
    }

    /**
     * Sets the value of the pmtInInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ExpectedExecutionDetails3 setPmtInInd(Boolean value) {
        this.pmtInInd = value;
        return this;
    }

    /**
     * Gets the value of the pmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtRef() {
        return pmtRef;
    }

    /**
     * Sets the value of the pmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExpectedExecutionDetails3 setPmtRef(String value) {
        this.pmtRef = value;
        return this;
    }

    /**
     * Gets the value of the prepmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPrepmtDt() {
        return prepmtDt;
    }

    /**
     * Sets the value of the prepmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExpectedExecutionDetails3 setPrepmtDt(Calendar value) {
        this.prepmtDt = value;
        return this;
    }

    /**
     * Gets the value of the topUpAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTopUpAmt() {
        return topUpAmt;
    }

    /**
     * Sets the value of the topUpAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ExpectedExecutionDetails3 setTopUpAmt(ActiveCurrencyAndAmount value) {
        this.topUpAmt = value;
        return this;
    }

    /**
     * Gets the value of the hldBckDtls property.
     * 
     * @return
     *     possible object is
     *     {@link HoldBackInformation1 }
     *     
     */
    public HoldBackInformation1 getHldBckDtls() {
        return hldBckDtls;
    }

    /**
     * Sets the value of the hldBckDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldBackInformation1 }
     *     
     */
    public ExpectedExecutionDetails3 setHldBckDtls(HoldBackInformation1 value) {
        this.hldBckDtls = value;
        return this;
    }

    /**
     * Gets the value of the sdPcktQty property.
     * 
     * @return
     *     possible object is
     *     {@link SidePocketQuantityAndAmount1 }
     *     
     */
    public SidePocketQuantityAndAmount1 getSdPcktQty() {
        return sdPcktQty;
    }

    /**
     * Sets the value of the sdPcktQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SidePocketQuantityAndAmount1 }
     *     
     */
    public ExpectedExecutionDetails3 setSdPcktQty(SidePocketQuantityAndAmount1 value) {
        this.sdPcktQty = value;
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
