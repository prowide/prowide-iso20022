
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.util.ArrayList;
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
 * Execution of a switch order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchExecution3", propOrder = {
    "ordrDtTm",
    "dealRef",
    "ordrRef",
    "invstmtAcctDtls",
    "ttlRedAmt",
    "ttlSbcptAmt",
    "addtlCshIn",
    "rsltgCshOut",
    "redLegDtls",
    "sbcptLegDtls",
    "cshSttlmDtls",
    "fxDtls"
})
public class SwitchExecution3 {

    @XmlElement(name = "OrdrDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime ordrDtTm;
    @XmlElement(name = "DealRef", required = true)
    protected String dealRef;
    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "InvstmtAcctDtls", required = true)
    protected InvestmentAccount13 invstmtAcctDtls;
    @XmlElement(name = "TtlRedAmt")
    protected ActiveCurrencyAndAmount ttlRedAmt;
    @XmlElement(name = "TtlSbcptAmt")
    protected ActiveCurrencyAndAmount ttlSbcptAmt;
    @XmlElement(name = "AddtlCshIn")
    protected ActiveCurrencyAndAmount addtlCshIn;
    @XmlElement(name = "RsltgCshOut")
    protected ActiveCurrencyAndAmount rsltgCshOut;
    @XmlElement(name = "RedLegDtls", required = true)
    protected List<SwitchRedemptionLegExecution2> redLegDtls;
    @XmlElement(name = "SbcptLegDtls", required = true)
    protected List<SwitchSubscriptionLegExecution2> sbcptLegDtls;
    @XmlElement(name = "CshSttlmDtls")
    protected PaymentTransaction14 cshSttlmDtls;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms4> fxDtls;

    /**
     * Gets the value of the ordrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getOrdrDtTm() {
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
    public SwitchExecution3 setOrdrDtTm(OffsetDateTime value) {
        this.ordrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the dealRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealRef() {
        return dealRef;
    }

    /**
     * Sets the value of the dealRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchExecution3 setDealRef(String value) {
        this.dealRef = value;
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
    public SwitchExecution3 setOrdrRef(String value) {
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
    public SwitchExecution3 setInvstmtAcctDtls(InvestmentAccount13 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the ttlRedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlRedAmt() {
        return ttlRedAmt;
    }

    /**
     * Sets the value of the ttlRedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SwitchExecution3 setTtlRedAmt(ActiveCurrencyAndAmount value) {
        this.ttlRedAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlSbcptAmt() {
        return ttlSbcptAmt;
    }

    /**
     * Sets the value of the ttlSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SwitchExecution3 setTtlSbcptAmt(ActiveCurrencyAndAmount value) {
        this.ttlSbcptAmt = value;
        return this;
    }

    /**
     * Gets the value of the addtlCshIn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAddtlCshIn() {
        return addtlCshIn;
    }

    /**
     * Sets the value of the addtlCshIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SwitchExecution3 setAddtlCshIn(ActiveCurrencyAndAmount value) {
        this.addtlCshIn = value;
        return this;
    }

    /**
     * Gets the value of the rsltgCshOut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRsltgCshOut() {
        return rsltgCshOut;
    }

    /**
     * Sets the value of the rsltgCshOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SwitchExecution3 setRsltgCshOut(ActiveCurrencyAndAmount value) {
        this.rsltgCshOut = value;
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
     * {@link SwitchRedemptionLegExecution2 }
     * 
     * 
     * @return
     *     The value of the redLegDtls property.
     */
    public List<SwitchRedemptionLegExecution2> getRedLegDtls() {
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
     * {@link SwitchSubscriptionLegExecution2 }
     * 
     * 
     * @return
     *     The value of the sbcptLegDtls property.
     */
    public List<SwitchSubscriptionLegExecution2> getSbcptLegDtls() {
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
     *     {@link PaymentTransaction14 }
     *     
     */
    public PaymentTransaction14 getCshSttlmDtls() {
        return cshSttlmDtls;
    }

    /**
     * Sets the value of the cshSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction14 }
     *     
     */
    public SwitchExecution3 setCshSttlmDtls(PaymentTransaction14 value) {
        this.cshSttlmDtls = value;
        return this;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFXDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignExchangeTerms4 }
     * 
     * 
     * @return
     *     The value of the fxDtls property.
     */
    public List<ForeignExchangeTerms4> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<>();
        }
        return this.fxDtls;
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
    public SwitchExecution3 addRedLegDtls(SwitchRedemptionLegExecution2 redLegDtls) {
        getRedLegDtls().add(redLegDtls);
        return this;
    }

    /**
     * Adds a new item to the sbcptLegDtls list.
     * @see #getSbcptLegDtls()
     * 
     */
    public SwitchExecution3 addSbcptLegDtls(SwitchSubscriptionLegExecution2 sbcptLegDtls) {
        getSbcptLegDtls().add(sbcptLegDtls);
        return this;
    }

    /**
     * Adds a new item to the fXDtls list.
     * @see #getFXDtls()
     * 
     */
    public SwitchExecution3 addFXDtls(ForeignExchangeTerms4 fXDtls) {
        getFXDtls().add(fXDtls);
        return this;
    }

}
