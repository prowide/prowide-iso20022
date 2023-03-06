
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "FinancialInstrument65", propOrder = {
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
public class FinancialInstrument65 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification25Choice id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "TrfTp", required = true)
    @XmlSchemaType(name = "string")
    protected TransferType1Code trfTp;
    @XmlElement(name = "Qty", required = true)
    protected Quantity43Choice qty;
    @XmlElement(name = "AvrgAcqstnPric")
    protected ActiveCurrencyAndAmount avrgAcqstnPric;
    @XmlElement(name = "TrfCcy")
    protected String trfCcy;
    @XmlElement(name = "TtlBookVal")
    protected ActiveOrHistoricCurrencyAndAmount ttlBookVal;
    @XmlElement(name = "TrfeeAcct")
    protected Account24 trfeeAcct;
    @XmlElement(name = "SubAcctDtls")
    protected SubAccount5 subAcctDtls;
    @XmlElement(name = "SttlmPtiesRcvgSdDtls")
    protected ReceivingPartiesAndAccount18 sttlmPtiesRcvgSdDtls;
    @XmlElement(name = "DlvrgAgtDtls")
    protected PartyIdentificationAndAccount156 dlvrgAgtDtls;
    @XmlElement(name = "ReqdSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdSttlmDt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification25Choice }
     *     
     */
    public SecurityIdentification25Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification25Choice }
     *     
     */
    public FinancialInstrument65 setId(SecurityIdentification25Choice value) {
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
    public FinancialInstrument65 setNm(String value) {
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
    public FinancialInstrument65 setShrtNm(String value) {
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
    public FinancialInstrument65 setTrfTp(TransferType1Code value) {
        this.trfTp = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity43Choice }
     *     
     */
    public Quantity43Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity43Choice }
     *     
     */
    public FinancialInstrument65 setQty(Quantity43Choice value) {
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
    public FinancialInstrument65 setAvrgAcqstnPric(ActiveCurrencyAndAmount value) {
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
    public FinancialInstrument65 setTrfCcy(String value) {
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
    public FinancialInstrument65 setTtlBookVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlBookVal = value;
        return this;
    }

    /**
     * Gets the value of the trfeeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Account24 }
     *     
     */
    public Account24 getTrfeeAcct() {
        return trfeeAcct;
    }

    /**
     * Sets the value of the trfeeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account24 }
     *     
     */
    public FinancialInstrument65 setTrfeeAcct(Account24 value) {
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
    public FinancialInstrument65 setSubAcctDtls(SubAccount5 value) {
        this.subAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPtiesRcvgSdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPartiesAndAccount18 }
     *     
     */
    public ReceivingPartiesAndAccount18 getSttlmPtiesRcvgSdDtls() {
        return sttlmPtiesRcvgSdDtls;
    }

    /**
     * Sets the value of the sttlmPtiesRcvgSdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPartiesAndAccount18 }
     *     
     */
    public FinancialInstrument65 setSttlmPtiesRcvgSdDtls(ReceivingPartiesAndAccount18 value) {
        this.sttlmPtiesRcvgSdDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount156 }
     *     
     */
    public PartyIdentificationAndAccount156 getDlvrgAgtDtls() {
        return dlvrgAgtDtls;
    }

    /**
     * Sets the value of the dlvrgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount156 }
     *     
     */
    public FinancialInstrument65 setDlvrgAgtDtls(PartyIdentificationAndAccount156 value) {
        this.dlvrgAgtDtls = value;
        return this;
    }

    /**
     * Gets the value of the reqdSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public FinancialInstrument65 setReqdSttlmDt(XMLGregorianCalendar value) {
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
