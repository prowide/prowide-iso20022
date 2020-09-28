
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, dividend option or valuation currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument48", propOrder = {
    "id",
    "nm",
    "shrtNm",
    "trfTp",
    "qty",
    "avrgAcqstnPric",
    "trfCcy",
    "ttlBookVal",
    "trfeeAcct",
    "subAcctDtls",
    "sttlmPtiesRcvgSdDtls",
    "dlvrgAgtDtls",
    "reqdSttlmDt"
})
public class FinancialInstrument48 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification23Choice id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "TrfTp", required = true)
    @XmlSchemaType(name = "string")
    protected TransferType1Code trfTp;
    @XmlElement(name = "Qty", required = true)
    protected Quantity14Choice qty;
    @XmlElement(name = "AvrgAcqstnPric")
    protected ActiveCurrencyAndAmount avrgAcqstnPric;
    @XmlElement(name = "TrfCcy")
    protected String trfCcy;
    @XmlElement(name = "TtlBookVal")
    protected ActiveOrHistoricCurrencyAndAmount ttlBookVal;
    @XmlElement(name = "TrfeeAcct")
    protected Account19 trfeeAcct;
    @XmlElement(name = "SubAcctDtls")
    protected SubAccount5 subAcctDtls;
    @XmlElement(name = "SttlmPtiesRcvgSdDtls")
    protected ReceivingPartiesAndAccount14 sttlmPtiesRcvgSdDtls;
    @XmlElement(name = "DlvrgAgtDtls")
    protected PartyIdentificationAndAccount125 dlvrgAgtDtls;
    @XmlElement(name = "ReqdSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdSttlmDt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification23Choice }
     *     
     */
    public SecurityIdentification23Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification23Choice }
     *     
     */
    public FinancialInstrument48 setId(SecurityIdentification23Choice value) {
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
    public FinancialInstrument48 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the shrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtNm() {
        return shrtNm;
    }

    /**
     * Sets the value of the shrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument48 setShrtNm(String value) {
        this.shrtNm = value;
        return this;
    }

    /**
     * Gets the value of the trfTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransferType1Code }
     *     
     */
    public TransferType1Code getTrfTp() {
        return trfTp;
    }

    /**
     * Sets the value of the trfTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferType1Code }
     *     
     */
    public FinancialInstrument48 setTrfTp(TransferType1Code value) {
        this.trfTp = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity14Choice }
     *     
     */
    public Quantity14Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity14Choice }
     *     
     */
    public FinancialInstrument48 setQty(Quantity14Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the avrgAcqstnPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAvrgAcqstnPric() {
        return avrgAcqstnPric;
    }

    /**
     * Sets the value of the avrgAcqstnPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public FinancialInstrument48 setAvrgAcqstnPric(ActiveCurrencyAndAmount value) {
        this.avrgAcqstnPric = value;
        return this;
    }

    /**
     * Gets the value of the trfCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfCcy() {
        return trfCcy;
    }

    /**
     * Sets the value of the trfCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument48 setTrfCcy(String value) {
        this.trfCcy = value;
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
    public FinancialInstrument48 setTtlBookVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlBookVal = value;
        return this;
    }

    /**
     * Gets the value of the trfeeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Account19 }
     *     
     */
    public Account19 getTrfeeAcct() {
        return trfeeAcct;
    }

    /**
     * Sets the value of the trfeeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account19 }
     *     
     */
    public FinancialInstrument48 setTrfeeAcct(Account19 value) {
        this.trfeeAcct = value;
        return this;
    }

    /**
     * Gets the value of the subAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccount5 }
     *     
     */
    public SubAccount5 getSubAcctDtls() {
        return subAcctDtls;
    }

    /**
     * Sets the value of the subAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccount5 }
     *     
     */
    public FinancialInstrument48 setSubAcctDtls(SubAccount5 value) {
        this.subAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPtiesRcvgSdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPartiesAndAccount14 }
     *     
     */
    public ReceivingPartiesAndAccount14 getSttlmPtiesRcvgSdDtls() {
        return sttlmPtiesRcvgSdDtls;
    }

    /**
     * Sets the value of the sttlmPtiesRcvgSdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPartiesAndAccount14 }
     *     
     */
    public FinancialInstrument48 setSttlmPtiesRcvgSdDtls(ReceivingPartiesAndAccount14 value) {
        this.sttlmPtiesRcvgSdDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount125 }
     *     
     */
    public PartyIdentificationAndAccount125 getDlvrgAgtDtls() {
        return dlvrgAgtDtls;
    }

    /**
     * Sets the value of the dlvrgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount125 }
     *     
     */
    public FinancialInstrument48 setDlvrgAgtDtls(PartyIdentificationAndAccount125 value) {
        this.dlvrgAgtDtls = value;
        return this;
    }

    /**
     * Gets the value of the reqdSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdSttlmDt() {
        return reqdSttlmDt;
    }

    /**
     * Sets the value of the reqdSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public FinancialInstrument48 setReqdSttlmDt(XMLGregorianCalendar value) {
        this.reqdSttlmDt = value;
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
