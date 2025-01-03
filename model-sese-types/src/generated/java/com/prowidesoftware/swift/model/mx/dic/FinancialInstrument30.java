
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument30", propOrder = {
    "id",
    "nm",
    "qty",
    "avrgAcqstnPric",
    "ttlBookVal",
    "trfeeAcct",
    "dlvrgAgtDtls"
})
public class FinancialInstrument30 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification3Choice id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Qty")
    protected Quantity12Choice qty;
    @XmlElement(name = "AvrgAcqstnPric")
    protected ActiveOrHistoricCurrencyAndAmount avrgAcqstnPric;
    @XmlElement(name = "TtlBookVal")
    protected ActiveOrHistoricCurrencyAndAmount ttlBookVal;
    @XmlElement(name = "TrfeeAcct")
    protected Account6 trfeeAcct;
    @XmlElement(name = "DlvrgAgtDtls")
    protected PartyIdentificationAndAccount93 dlvrgAgtDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification3Choice }
     *     
     */
    public SecurityIdentification3Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification3Choice }
     *     
     */
    public FinancialInstrument30 setId(SecurityIdentification3Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument30 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity12Choice }
     *     
     */
    public Quantity12Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity12Choice }
     *     
     */
    public FinancialInstrument30 setQty(Quantity12Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the avrgAcqstnPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAvrgAcqstnPric() {
        return avrgAcqstnPric;
    }

    /**
     * Sets the value of the avrgAcqstnPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public FinancialInstrument30 setAvrgAcqstnPric(ActiveOrHistoricCurrencyAndAmount value) {
        this.avrgAcqstnPric = value;
        return this;
    }

    /**
     * Gets the value of the ttlBookVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlBookVal() {
        return ttlBookVal;
    }

    /**
     * Sets the value of the ttlBookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public FinancialInstrument30 setTtlBookVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlBookVal = value;
        return this;
    }

    /**
     * Gets the value of the trfeeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Account6 }
     *     
     */
    public Account6 getTrfeeAcct() {
        return trfeeAcct;
    }

    /**
     * Sets the value of the trfeeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account6 }
     *     
     */
    public FinancialInstrument30 setTrfeeAcct(Account6 value) {
        this.trfeeAcct = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount93 }
     *     
     */
    public PartyIdentificationAndAccount93 getDlvrgAgtDtls() {
        return dlvrgAgtDtls;
    }

    /**
     * Sets the value of the dlvrgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount93 }
     *     
     */
    public FinancialInstrument30 setDlvrgAgtDtls(PartyIdentificationAndAccount93 value) {
        this.dlvrgAgtDtls = value;
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
