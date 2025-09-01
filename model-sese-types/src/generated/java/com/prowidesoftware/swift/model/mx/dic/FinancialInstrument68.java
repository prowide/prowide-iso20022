
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identification of a security or other asset.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument68", propOrder = {
    "lineId",
    "instrm",
    "qty",
    "unitsDtls",
    "clntRef",
    "ctrPtyRef",
    "bizFlowTp",
    "avrgAcqstnPric",
    "ttlBookVal",
    "latstValtn",
    "trfeeAcct",
    "trfr",
    "crstllstnDtls",
    "taxValtnPt",
    "sttlmPtiesDtls",
    "addtlInf"
})
public class FinancialInstrument68 {

    @XmlElement(name = "LineId")
    protected String lineId;
    @XmlElement(name = "Instrm", required = true)
    protected FinancialInstrument1Choice instrm;
    @XmlElement(name = "Qty", required = true)
    protected Quantity44Choice qty;
    @XmlElement(name = "UnitsDtls")
    protected List<Unit11> unitsDtls;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference10 clntRef;
    @XmlElement(name = "CtrPtyRef")
    protected AdditionalReference10 ctrPtyRef;
    @XmlElement(name = "BizFlowTp")
    @XmlSchemaType(name = "string")
    protected BusinessFlowType1Code bizFlowTp;
    @XmlElement(name = "AvrgAcqstnPric")
    protected ActiveOrHistoricCurrencyAndAmount avrgAcqstnPric;
    @XmlElement(name = "TtlBookVal")
    protected DateAndAmount2 ttlBookVal;
    @XmlElement(name = "LatstValtn")
    protected DateAndAmount2 latstValtn;
    @XmlElement(name = "TrfeeAcct")
    protected Account28 trfeeAcct;
    @XmlElement(name = "Trfr")
    protected Account28 trfr;
    @XmlElement(name = "CrstllstnDtls")
    protected List<Crystallisation1> crstllstnDtls;
    @XmlElement(name = "TaxValtnPt")
    protected Tax36 taxValtnPt;
    @XmlElement(name = "SttlmPtiesDtls")
    protected FundSettlementParameters14 sttlmPtiesDtls;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the lineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Sets the value of the lineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument68 setLineId(String value) {
        this.lineId = value;
        return this;
    }

    /**
     * Gets the value of the instrm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument1Choice }
     *     
     */
    public FinancialInstrument1Choice getInstrm() {
        return instrm;
    }

    /**
     * Sets the value of the instrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument1Choice }
     *     
     */
    public FinancialInstrument68 setInstrm(FinancialInstrument1Choice value) {
        this.instrm = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity44Choice }
     *     
     */
    public Quantity44Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity44Choice }
     *     
     */
    public FinancialInstrument68 setQty(Quantity44Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the unitsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Unit11 }
     * 
     * 
     */
    public List<Unit11> getUnitsDtls() {
        if (unitsDtls == null) {
            unitsDtls = new ArrayList<Unit11>();
        }
        return this.unitsDtls;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public FinancialInstrument68 setClntRef(AdditionalReference10 value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getCtrPtyRef() {
        return ctrPtyRef;
    }

    /**
     * Sets the value of the ctrPtyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public FinancialInstrument68 setCtrPtyRef(AdditionalReference10 value) {
        this.ctrPtyRef = value;
        return this;
    }

    /**
     * Gets the value of the bizFlowTp property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessFlowType1Code }
     *     
     */
    public BusinessFlowType1Code getBizFlowTp() {
        return bizFlowTp;
    }

    /**
     * Sets the value of the bizFlowTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessFlowType1Code }
     *     
     */
    public FinancialInstrument68 setBizFlowTp(BusinessFlowType1Code value) {
        this.bizFlowTp = value;
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
    public FinancialInstrument68 setAvrgAcqstnPric(ActiveOrHistoricCurrencyAndAmount value) {
        this.avrgAcqstnPric = value;
        return this;
    }

    /**
     * Gets the value of the ttlBookVal property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount2 }
     *     
     */
    public DateAndAmount2 getTtlBookVal() {
        return ttlBookVal;
    }

    /**
     * Sets the value of the ttlBookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount2 }
     *     
     */
    public FinancialInstrument68 setTtlBookVal(DateAndAmount2 value) {
        this.ttlBookVal = value;
        return this;
    }

    /**
     * Gets the value of the latstValtn property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount2 }
     *     
     */
    public DateAndAmount2 getLatstValtn() {
        return latstValtn;
    }

    /**
     * Sets the value of the latstValtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount2 }
     *     
     */
    public FinancialInstrument68 setLatstValtn(DateAndAmount2 value) {
        this.latstValtn = value;
        return this;
    }

    /**
     * Gets the value of the trfeeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Account28 }
     *     
     */
    public Account28 getTrfeeAcct() {
        return trfeeAcct;
    }

    /**
     * Sets the value of the trfeeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account28 }
     *     
     */
    public FinancialInstrument68 setTrfeeAcct(Account28 value) {
        this.trfeeAcct = value;
        return this;
    }

    /**
     * Gets the value of the trfr property.
     * 
     * @return
     *     possible object is
     *     {@link Account28 }
     *     
     */
    public Account28 getTrfr() {
        return trfr;
    }

    /**
     * Sets the value of the trfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account28 }
     *     
     */
    public FinancialInstrument68 setTrfr(Account28 value) {
        this.trfr = value;
        return this;
    }

    /**
     * Gets the value of the crstllstnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crstllstnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrstllstnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Crystallisation1 }
     * 
     * 
     */
    public List<Crystallisation1> getCrstllstnDtls() {
        if (crstllstnDtls == null) {
            crstllstnDtls = new ArrayList<Crystallisation1>();
        }
        return this.crstllstnDtls;
    }

    /**
     * Gets the value of the taxValtnPt property.
     * 
     * @return
     *     possible object is
     *     {@link Tax36 }
     *     
     */
    public Tax36 getTaxValtnPt() {
        return taxValtnPt;
    }

    /**
     * Sets the value of the taxValtnPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tax36 }
     *     
     */
    public FinancialInstrument68 setTaxValtnPt(Tax36 value) {
        this.taxValtnPt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPtiesDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FundSettlementParameters14 }
     *     
     */
    public FundSettlementParameters14 getSttlmPtiesDtls() {
        return sttlmPtiesDtls;
    }

    /**
     * Sets the value of the sttlmPtiesDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundSettlementParameters14 }
     *     
     */
    public FinancialInstrument68 setSttlmPtiesDtls(FundSettlementParameters14 value) {
        this.sttlmPtiesDtls = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<AdditionalInformation15>();
        }
        return this.addtlInf;
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
     * Adds a new item to the unitsDtls list.
     * @see #getUnitsDtls()
     * 
     */
    public FinancialInstrument68 addUnitsDtls(Unit11 unitsDtls) {
        getUnitsDtls().add(unitsDtls);
        return this;
    }

    /**
     * Adds a new item to the crstllstnDtls list.
     * @see #getCrstllstnDtls()
     * 
     */
    public FinancialInstrument68 addCrstllstnDtls(Crystallisation1 crstllstnDtls) {
        getCrstllstnDtls().add(crstllstnDtls);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public FinancialInstrument68 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
