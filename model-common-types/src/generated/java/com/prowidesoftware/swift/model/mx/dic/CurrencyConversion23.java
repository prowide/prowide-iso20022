
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider. The currency conversion has to be accepted by the cardholder.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyConversion23", propOrder = {
    "ccyConvsId",
    "trgtCcy",
    "rsltgAmt",
    "xchgRate",
    "nvrtdXchgRate",
    "qtnDt",
    "vldUntil",
    "srcCcy",
    "orgnlAmt",
    "comssnDtls",
    "mrkUpDtls",
    "dclrtnDtls"
})
public class CurrencyConversion23 {

    @XmlElement(name = "CcyConvsId")
    protected String ccyConvsId;
    @XmlElement(name = "TrgtCcy", required = true)
    protected CurrencyDetails3 trgtCcy;
    @XmlElement(name = "RsltgAmt", required = true)
    protected BigDecimal rsltgAmt;
    @XmlElement(name = "XchgRate", required = true)
    protected BigDecimal xchgRate;
    @XmlElement(name = "NvrtdXchgRate")
    protected BigDecimal nvrtdXchgRate;
    @XmlElement(name = "QtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime qtnDt;
    @XmlElement(name = "VldUntil", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime vldUntil;
    @XmlElement(name = "SrcCcy", required = true)
    protected CurrencyDetails2 srcCcy;
    @XmlElement(name = "OrgnlAmt", required = true)
    protected OriginalAmountDetails1 orgnlAmt;
    @XmlElement(name = "ComssnDtls")
    protected List<Commission19> comssnDtls;
    @XmlElement(name = "MrkUpDtls")
    protected List<Commission18> mrkUpDtls;
    @XmlElement(name = "DclrtnDtls")
    protected List<ActionMessage9> dclrtnDtls;

    /**
     * Gets the value of the ccyConvsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyConvsId() {
        return ccyConvsId;
    }

    /**
     * Sets the value of the ccyConvsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion23 setCcyConvsId(String value) {
        this.ccyConvsId = value;
        return this;
    }

    /**
     * Gets the value of the trgtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDetails3 }
     *     
     */
    public CurrencyDetails3 getTrgtCcy() {
        return trgtCcy;
    }

    /**
     * Sets the value of the trgtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDetails3 }
     *     
     */
    public CurrencyConversion23 setTrgtCcy(CurrencyDetails3 value) {
        this.trgtCcy = value;
        return this;
    }

    /**
     * Gets the value of the rsltgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRsltgAmt() {
        return rsltgAmt;
    }

    /**
     * Sets the value of the rsltgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyConversion23 setRsltgAmt(BigDecimal value) {
        this.rsltgAmt = value;
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
    public CurrencyConversion23 setXchgRate(BigDecimal value) {
        this.xchgRate = value;
        return this;
    }

    /**
     * Gets the value of the nvrtdXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNvrtdXchgRate() {
        return nvrtdXchgRate;
    }

    /**
     * Sets the value of the nvrtdXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyConversion23 setNvrtdXchgRate(BigDecimal value) {
        this.nvrtdXchgRate = value;
        return this;
    }

    /**
     * Gets the value of the qtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getQtnDt() {
        return qtnDt;
    }

    /**
     * Sets the value of the qtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion23 setQtnDt(OffsetDateTime value) {
        this.qtnDt = value;
        return this;
    }

    /**
     * Gets the value of the vldUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getVldUntil() {
        return vldUntil;
    }

    /**
     * Sets the value of the vldUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion23 setVldUntil(OffsetDateTime value) {
        this.vldUntil = value;
        return this;
    }

    /**
     * Gets the value of the srcCcy property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDetails2 }
     *     
     */
    public CurrencyDetails2 getSrcCcy() {
        return srcCcy;
    }

    /**
     * Sets the value of the srcCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDetails2 }
     *     
     */
    public CurrencyConversion23 setSrcCcy(CurrencyDetails2 value) {
        this.srcCcy = value;
        return this;
    }

    /**
     * Gets the value of the orgnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalAmountDetails1 }
     *     
     */
    public OriginalAmountDetails1 getOrgnlAmt() {
        return orgnlAmt;
    }

    /**
     * Sets the value of the orgnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalAmountDetails1 }
     *     
     */
    public CurrencyConversion23 setOrgnlAmt(OriginalAmountDetails1 value) {
        this.orgnlAmt = value;
        return this;
    }

    /**
     * Gets the value of the comssnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the comssnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComssnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission19 }
     * 
     * 
     * @return
     *     The value of the comssnDtls property.
     */
    public List<Commission19> getComssnDtls() {
        if (comssnDtls == null) {
            comssnDtls = new ArrayList<>();
        }
        return this.comssnDtls;
    }

    /**
     * Gets the value of the mrkUpDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mrkUpDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrkUpDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission18 }
     * 
     * 
     * @return
     *     The value of the mrkUpDtls property.
     */
    public List<Commission18> getMrkUpDtls() {
        if (mrkUpDtls == null) {
            mrkUpDtls = new ArrayList<>();
        }
        return this.mrkUpDtls;
    }

    /**
     * Gets the value of the dclrtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dclrtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDclrtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionMessage9 }
     * 
     * 
     * @return
     *     The value of the dclrtnDtls property.
     */
    public List<ActionMessage9> getDclrtnDtls() {
        if (dclrtnDtls == null) {
            dclrtnDtls = new ArrayList<>();
        }
        return this.dclrtnDtls;
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
     * Adds a new item to the comssnDtls list.
     * @see #getComssnDtls()
     * 
     */
    public CurrencyConversion23 addComssnDtls(Commission19 comssnDtls) {
        getComssnDtls().add(comssnDtls);
        return this;
    }

    /**
     * Adds a new item to the mrkUpDtls list.
     * @see #getMrkUpDtls()
     * 
     */
    public CurrencyConversion23 addMrkUpDtls(Commission18 mrkUpDtls) {
        getMrkUpDtls().add(mrkUpDtls);
        return this;
    }

    /**
     * Adds a new item to the dclrtnDtls list.
     * @see #getDclrtnDtls()
     * 
     */
    public CurrencyConversion23 addDclrtnDtls(ActionMessage9 dclrtnDtls) {
        getDclrtnDtls().add(dclrtnDtls);
        return this;
    }

}
