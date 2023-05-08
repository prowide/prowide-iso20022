
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
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
 * Transfer from one investment fund/fund class to another investment fund or investment fund class by the investor. A switch is composed of one or several subscription legs, and one or several redemption legs.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchOrder2", propOrder = {
    "ordrDtTm",
    "ordrRef",
    "invstmtAcctDtls",
    "ttlRedAmt",
    "ttlSbcptAmt",
    "xpryDtTm",
    "addtlCshIn",
    "rsltgCshOut",
    "cxlRght",
    "redLegDtls",
    "sbcptLegDtls",
    "cshSttlmDtls",
    "fxDtls"
})
public class SwitchOrder2 {

    @XmlElement(name = "OrdrDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar ordrDtTm;
    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "InvstmtAcctDtls", required = true)
    protected InvestmentAccount13 invstmtAcctDtls;
    @XmlElement(name = "TtlRedAmt")
    protected ActiveOrHistoricCurrencyAndAmount ttlRedAmt;
    @XmlElement(name = "TtlSbcptAmt")
    protected ActiveOrHistoricCurrencyAndAmount ttlSbcptAmt;
    @XmlElement(name = "XpryDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar xpryDtTm;
    @XmlElement(name = "AddtlCshIn")
    protected ActiveOrHistoricCurrencyAndAmount addtlCshIn;
    @XmlElement(name = "RsltgCshOut")
    protected ActiveOrHistoricCurrencyAndAmount rsltgCshOut;
    @XmlElement(name = "CxlRght")
    protected CancellationRight1 cxlRght;
    @XmlElement(name = "RedLegDtls", required = true)
    protected List<SwitchRedemptionLegOrder2> redLegDtls;
    @XmlElement(name = "SbcptLegDtls", required = true)
    protected List<SwitchSubscriptionLegOrder2> sbcptLegDtls;
    @XmlElement(name = "CshSttlmDtls")
    protected PaymentTransaction20 cshSttlmDtls;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms5 fxDtls;

    /**
     * Gets the value of the ordrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getOrdrDtTm() {
        return ordrDtTm;
    }

    /**
     * Sets the value of the ordrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchOrder2 setOrdrDtTm(Calendar value) {
        this.ordrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchOrder2 setOrdrRef(String value) {
        this.ordrRef = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount13 }
     *     
     */
    public InvestmentAccount13 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount13 }
     *     
     */
    public SwitchOrder2 setInvstmtAcctDtls(InvestmentAccount13 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the ttlRedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlRedAmt() {
        return ttlRedAmt;
    }

    /**
     * Sets the value of the ttlRedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public SwitchOrder2 setTtlRedAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlRedAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlSbcptAmt() {
        return ttlSbcptAmt;
    }

    /**
     * Sets the value of the ttlSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public SwitchOrder2 setTtlSbcptAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlSbcptAmt = value;
        return this;
    }

    /**
     * Gets the value of the xpryDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getXpryDtTm() {
        return xpryDtTm;
    }

    /**
     * Sets the value of the xpryDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchOrder2 setXpryDtTm(Calendar value) {
        this.xpryDtTm = value;
        return this;
    }

    /**
     * Gets the value of the addtlCshIn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAddtlCshIn() {
        return addtlCshIn;
    }

    /**
     * Sets the value of the addtlCshIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public SwitchOrder2 setAddtlCshIn(ActiveOrHistoricCurrencyAndAmount value) {
        this.addtlCshIn = value;
        return this;
    }

    /**
     * Gets the value of the rsltgCshOut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getRsltgCshOut() {
        return rsltgCshOut;
    }

    /**
     * Sets the value of the rsltgCshOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public SwitchOrder2 setRsltgCshOut(ActiveOrHistoricCurrencyAndAmount value) {
        this.rsltgCshOut = value;
        return this;
    }

    /**
     * Gets the value of the cxlRght property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationRight1 }
     *     
     */
    public CancellationRight1 getCxlRght() {
        return cxlRght;
    }

    /**
     * Sets the value of the cxlRght property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRight1 }
     *     
     */
    public SwitchOrder2 setCxlRght(CancellationRight1 value) {
        this.cxlRght = value;
        return this;
    }

    /**
     * Gets the value of the redLegDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the redLegDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedLegDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchRedemptionLegOrder2 }
     * 
     * 
     * @return
     *     The value of the redLegDtls property.
     */
    public List<SwitchRedemptionLegOrder2> getRedLegDtls() {
        if (redLegDtls == null) {
            redLegDtls = new ArrayList<>();
        }
        return this.redLegDtls;
    }

    /**
     * Gets the value of the sbcptLegDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sbcptLegDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSbcptLegDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchSubscriptionLegOrder2 }
     * 
     * 
     * @return
     *     The value of the sbcptLegDtls property.
     */
    public List<SwitchSubscriptionLegOrder2> getSbcptLegDtls() {
        if (sbcptLegDtls == null) {
            sbcptLegDtls = new ArrayList<>();
        }
        return this.sbcptLegDtls;
    }

    /**
     * Gets the value of the cshSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction20 }
     *     
     */
    public PaymentTransaction20 getCshSttlmDtls() {
        return cshSttlmDtls;
    }

    /**
     * Sets the value of the cshSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction20 }
     *     
     */
    public SwitchOrder2 setCshSttlmDtls(PaymentTransaction20 value) {
        this.cshSttlmDtls = value;
        return this;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms5 }
     *     
     */
    public ForeignExchangeTerms5 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms5 }
     *     
     */
    public SwitchOrder2 setFXDtls(ForeignExchangeTerms5 value) {
        this.fxDtls = value;
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
     * Adds a new item to the redLegDtls list.
     * @see #getRedLegDtls()
     * 
     */
    public SwitchOrder2 addRedLegDtls(SwitchRedemptionLegOrder2 redLegDtls) {
        getRedLegDtls().add(redLegDtls);
        return this;
    }

    /**
     * Adds a new item to the sbcptLegDtls list.
     * @see #getSbcptLegDtls()
     * 
     */
    public SwitchOrder2 addSbcptLegDtls(SwitchSubscriptionLegOrder2 sbcptLegDtls) {
        getSbcptLegDtls().add(sbcptLegDtls);
        return this;
    }

}
