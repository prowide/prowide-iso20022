
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The DTCCCANOMarketDataSD1 message extends ISO corporate action notification (CANO) market data message (Market Data type) with data elements that are not covered by the standard message, and additionally, with DTC values where issuer/offeror/market corresponding values are mapped to CANO. For example issuer/offeror/market declared cash rate will be mapped to the CANO and DTC announced cash rate will be extended in this message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCANOMarketDataSD1V02", propOrder = {
    "pgntn",
    "ntfctnGnlInfXtnsn",
    "corpActnGnlInfXtnsn",
    "undrlygSctyXtnsn",
    "corpActnDtlsXtnsn",
    "corpActnDtDtlsXtnsn",
    "corpActnPricDtlsXtnsn",
    "corpActnPrdDtlsXtnsn",
    "corpActnSctiesQtyXtnsn",
    "corpActnRateAndAmtDtlsXtnsn",
    "optnDtlsXtnsn",
    "optnSctiesQtyXtnsn",
    "sctiesMvmntDtlsXtnsn",
    "sctiesMvmntSctyDtlsXtnsn",
    "sctiesMvmntRateDtlsXtnsn",
    "sctiesMvmntCshInLieuDtlsXtnsn",
    "sctiesMvmntFrctnDspstnXtnsn",
    "cshMvmntDtlsXtnsn",
    "agtXtnsn",
    "newAgtXtnsn"
})
public class DTCCCANOMarketDataSD1V02 {

    @XmlElement(name = "Pgntn")
    protected Pagination pgntn;
    @XmlElement(name = "NtfctnGnlInfXtnsn")
    protected CorporateActionNotificationSD3 ntfctnGnlInfXtnsn;
    @XmlElement(name = "CorpActnGnlInfXtnsn")
    protected CorporateActionNotificationSD8 corpActnGnlInfXtnsn;
    @XmlElement(name = "UndrlygSctyXtnsn")
    protected FinancialInstrumentAttributesSD6 undrlygSctyXtnsn;
    @XmlElement(name = "CorpActnDtlsXtnsn")
    protected CorporateActionSD3 corpActnDtlsXtnsn;
    @XmlElement(name = "CorpActnDtDtlsXtnsn")
    protected CorporateActionDateSD3 corpActnDtDtlsXtnsn;
    @XmlElement(name = "CorpActnPricDtlsXtnsn")
    protected CorporateActionPriceSD3 corpActnPricDtlsXtnsn;
    @XmlElement(name = "CorpActnPrdDtlsXtnsn")
    protected CorporateActionPeriodSD1 corpActnPrdDtlsXtnsn;
    @XmlElement(name = "CorpActnSctiesQtyXtnsn")
    protected CorporateActionQuantitySD1 corpActnSctiesQtyXtnsn;
    @XmlElement(name = "CorpActnRateAndAmtDtlsXtnsn")
    protected CorporateActionRateSD1 corpActnRateAndAmtDtlsXtnsn;
    @XmlElement(name = "OptnDtlsXtnsn")
    protected List<CorporateActionOptionSD3> optnDtlsXtnsn;
    @XmlElement(name = "OptnSctiesQtyXtnsn")
    protected List<SecuritiesOptionSD1> optnSctiesQtyXtnsn;
    @XmlElement(name = "SctiesMvmntDtlsXtnsn")
    protected List<SecuritiesOptionSD3> sctiesMvmntDtlsXtnsn;
    @XmlElement(name = "SctiesMvmntSctyDtlsXtnsn")
    protected List<FinancialInstrumentAttributesSD3> sctiesMvmntSctyDtlsXtnsn;
    @XmlElement(name = "SctiesMvmntRateDtlsXtnsn")
    protected List<CorporateActionRateSD4> sctiesMvmntRateDtlsXtnsn;
    @XmlElement(name = "SctiesMvmntCshInLieuDtlsXtnsn")
    protected List<CorporateActionPriceSD2> sctiesMvmntCshInLieuDtlsXtnsn;
    @XmlElement(name = "SctiesMvmntFrctnDspstnXtnsn")
    protected List<FractionDispositionTypeSD1> sctiesMvmntFrctnDspstnXtnsn;
    @XmlElement(name = "CshMvmntDtlsXtnsn")
    protected List<CashOptionSD3> cshMvmntDtlsXtnsn;
    @XmlElement(name = "AgtXtnsn")
    protected List<PartyIdentificationSD2> agtXtnsn;
    @XmlElement(name = "NewAgtXtnsn")
    protected List<PartyIdentificationSD1> newAgtXtnsn;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public DTCCCANOMarketDataSD1V02 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnGnlInfXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationSD3 }
     *     
     */
    public CorporateActionNotificationSD3 getNtfctnGnlInfXtnsn() {
        return ntfctnGnlInfXtnsn;
    }

    /**
     * Sets the value of the ntfctnGnlInfXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationSD3 }
     *     
     */
    public DTCCCANOMarketDataSD1V02 setNtfctnGnlInfXtnsn(CorporateActionNotificationSD3 value) {
        this.ntfctnGnlInfXtnsn = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInfXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationSD8 }
     *     
     */
    public CorporateActionNotificationSD8 getCorpActnGnlInfXtnsn() {
        return corpActnGnlInfXtnsn;
    }

    /**
     * Sets the value of the corpActnGnlInfXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationSD8 }
     *     
     */
    public DTCCCANOMarketDataSD1V02 setCorpActnGnlInfXtnsn(CorporateActionNotificationSD8 value) {
        this.corpActnGnlInfXtnsn = value;
        return this;
    }

    /**
     * Gets the value of the undrlygSctyXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributesSD6 }
     *     
     */
    public FinancialInstrumentAttributesSD6 getUndrlygSctyXtnsn() {
        return undrlygSctyXtnsn;
    }

    /**
     * Sets the value of the undrlygSctyXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributesSD6 }
     *     
     */
    public DTCCCANOMarketDataSD1V02 setUndrlygSctyXtnsn(FinancialInstrumentAttributesSD6 value) {
        this.undrlygSctyXtnsn = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtlsXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionSD3 }
     *     
     */
    public CorporateActionSD3 getCorpActnDtlsXtnsn() {
        return corpActnDtlsXtnsn;
    }

    /**
     * Sets the value of the corpActnDtlsXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionSD3 }
     *     
     */
    public DTCCCANOMarketDataSD1V02 setCorpActnDtlsXtnsn(CorporateActionSD3 value) {
        this.corpActnDtlsXtnsn = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtDtlsXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDateSD3 }
     *     
     */
    public CorporateActionDateSD3 getCorpActnDtDtlsXtnsn() {
        return corpActnDtDtlsXtnsn;
    }

    /**
     * Sets the value of the corpActnDtDtlsXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDateSD3 }
     *     
     */
    public DTCCCANOMarketDataSD1V02 setCorpActnDtDtlsXtnsn(CorporateActionDateSD3 value) {
        this.corpActnDtDtlsXtnsn = value;
        return this;
    }

    /**
     * Gets the value of the corpActnPricDtlsXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPriceSD3 }
     *     
     */
    public CorporateActionPriceSD3 getCorpActnPricDtlsXtnsn() {
        return corpActnPricDtlsXtnsn;
    }

    /**
     * Sets the value of the corpActnPricDtlsXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPriceSD3 }
     *     
     */
    public DTCCCANOMarketDataSD1V02 setCorpActnPricDtlsXtnsn(CorporateActionPriceSD3 value) {
        this.corpActnPricDtlsXtnsn = value;
        return this;
    }

    /**
     * Gets the value of the corpActnPrdDtlsXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPeriodSD1 }
     *     
     */
    public CorporateActionPeriodSD1 getCorpActnPrdDtlsXtnsn() {
        return corpActnPrdDtlsXtnsn;
    }

    /**
     * Sets the value of the corpActnPrdDtlsXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPeriodSD1 }
     *     
     */
    public DTCCCANOMarketDataSD1V02 setCorpActnPrdDtlsXtnsn(CorporateActionPeriodSD1 value) {
        this.corpActnPrdDtlsXtnsn = value;
        return this;
    }

    /**
     * Gets the value of the corpActnSctiesQtyXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionQuantitySD1 }
     *     
     */
    public CorporateActionQuantitySD1 getCorpActnSctiesQtyXtnsn() {
        return corpActnSctiesQtyXtnsn;
    }

    /**
     * Sets the value of the corpActnSctiesQtyXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionQuantitySD1 }
     *     
     */
    public DTCCCANOMarketDataSD1V02 setCorpActnSctiesQtyXtnsn(CorporateActionQuantitySD1 value) {
        this.corpActnSctiesQtyXtnsn = value;
        return this;
    }

    /**
     * Gets the value of the corpActnRateAndAmtDtlsXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRateSD1 }
     *     
     */
    public CorporateActionRateSD1 getCorpActnRateAndAmtDtlsXtnsn() {
        return corpActnRateAndAmtDtlsXtnsn;
    }

    /**
     * Sets the value of the corpActnRateAndAmtDtlsXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRateSD1 }
     *     
     */
    public DTCCCANOMarketDataSD1V02 setCorpActnRateAndAmtDtlsXtnsn(CorporateActionRateSD1 value) {
        this.corpActnRateAndAmtDtlsXtnsn = value;
        return this;
    }

    /**
     * Gets the value of the optnDtlsXtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnDtlsXtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnDtlsXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionOptionSD3 }
     * 
     * 
     */
    public List<CorporateActionOptionSD3> getOptnDtlsXtnsn() {
        if (optnDtlsXtnsn == null) {
            optnDtlsXtnsn = new ArrayList<CorporateActionOptionSD3>();
        }
        return this.optnDtlsXtnsn;
    }

    /**
     * Gets the value of the optnSctiesQtyXtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnSctiesQtyXtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnSctiesQtyXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesOptionSD1 }
     * 
     * 
     */
    public List<SecuritiesOptionSD1> getOptnSctiesQtyXtnsn() {
        if (optnSctiesQtyXtnsn == null) {
            optnSctiesQtyXtnsn = new ArrayList<SecuritiesOptionSD1>();
        }
        return this.optnSctiesQtyXtnsn;
    }

    /**
     * Gets the value of the sctiesMvmntDtlsXtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntDtlsXtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntDtlsXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesOptionSD3 }
     * 
     * 
     */
    public List<SecuritiesOptionSD3> getSctiesMvmntDtlsXtnsn() {
        if (sctiesMvmntDtlsXtnsn == null) {
            sctiesMvmntDtlsXtnsn = new ArrayList<SecuritiesOptionSD3>();
        }
        return this.sctiesMvmntDtlsXtnsn;
    }

    /**
     * Gets the value of the sctiesMvmntSctyDtlsXtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntSctyDtlsXtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntSctyDtlsXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentAttributesSD3 }
     * 
     * 
     */
    public List<FinancialInstrumentAttributesSD3> getSctiesMvmntSctyDtlsXtnsn() {
        if (sctiesMvmntSctyDtlsXtnsn == null) {
            sctiesMvmntSctyDtlsXtnsn = new ArrayList<FinancialInstrumentAttributesSD3>();
        }
        return this.sctiesMvmntSctyDtlsXtnsn;
    }

    /**
     * Gets the value of the sctiesMvmntRateDtlsXtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntRateDtlsXtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntRateDtlsXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionRateSD4 }
     * 
     * 
     */
    public List<CorporateActionRateSD4> getSctiesMvmntRateDtlsXtnsn() {
        if (sctiesMvmntRateDtlsXtnsn == null) {
            sctiesMvmntRateDtlsXtnsn = new ArrayList<CorporateActionRateSD4>();
        }
        return this.sctiesMvmntRateDtlsXtnsn;
    }

    /**
     * Gets the value of the sctiesMvmntCshInLieuDtlsXtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntCshInLieuDtlsXtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntCshInLieuDtlsXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionPriceSD2 }
     * 
     * 
     */
    public List<CorporateActionPriceSD2> getSctiesMvmntCshInLieuDtlsXtnsn() {
        if (sctiesMvmntCshInLieuDtlsXtnsn == null) {
            sctiesMvmntCshInLieuDtlsXtnsn = new ArrayList<CorporateActionPriceSD2>();
        }
        return this.sctiesMvmntCshInLieuDtlsXtnsn;
    }

    /**
     * Gets the value of the sctiesMvmntFrctnDspstnXtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntFrctnDspstnXtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntFrctnDspstnXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FractionDispositionTypeSD1 }
     * 
     * 
     */
    public List<FractionDispositionTypeSD1> getSctiesMvmntFrctnDspstnXtnsn() {
        if (sctiesMvmntFrctnDspstnXtnsn == null) {
            sctiesMvmntFrctnDspstnXtnsn = new ArrayList<FractionDispositionTypeSD1>();
        }
        return this.sctiesMvmntFrctnDspstnXtnsn;
    }

    /**
     * Gets the value of the cshMvmntDtlsXtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshMvmntDtlsXtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmntDtlsXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOptionSD3 }
     * 
     * 
     */
    public List<CashOptionSD3> getCshMvmntDtlsXtnsn() {
        if (cshMvmntDtlsXtnsn == null) {
            cshMvmntDtlsXtnsn = new ArrayList<CashOptionSD3>();
        }
        return this.cshMvmntDtlsXtnsn;
    }

    /**
     * Gets the value of the agtXtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agtXtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgtXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationSD2 }
     * 
     * 
     */
    public List<PartyIdentificationSD2> getAgtXtnsn() {
        if (agtXtnsn == null) {
            agtXtnsn = new ArrayList<PartyIdentificationSD2>();
        }
        return this.agtXtnsn;
    }

    /**
     * Gets the value of the newAgtXtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newAgtXtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewAgtXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationSD1 }
     * 
     * 
     */
    public List<PartyIdentificationSD1> getNewAgtXtnsn() {
        if (newAgtXtnsn == null) {
            newAgtXtnsn = new ArrayList<PartyIdentificationSD1>();
        }
        return this.newAgtXtnsn;
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
     * Adds a new item to the optnDtlsXtnsn list.
     * @see #getOptnDtlsXtnsn()
     * 
     */
    public DTCCCANOMarketDataSD1V02 addOptnDtlsXtnsn(CorporateActionOptionSD3 optnDtlsXtnsn) {
        getOptnDtlsXtnsn().add(optnDtlsXtnsn);
        return this;
    }

    /**
     * Adds a new item to the optnSctiesQtyXtnsn list.
     * @see #getOptnSctiesQtyXtnsn()
     * 
     */
    public DTCCCANOMarketDataSD1V02 addOptnSctiesQtyXtnsn(SecuritiesOptionSD1 optnSctiesQtyXtnsn) {
        getOptnSctiesQtyXtnsn().add(optnSctiesQtyXtnsn);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntDtlsXtnsn list.
     * @see #getSctiesMvmntDtlsXtnsn()
     * 
     */
    public DTCCCANOMarketDataSD1V02 addSctiesMvmntDtlsXtnsn(SecuritiesOptionSD3 sctiesMvmntDtlsXtnsn) {
        getSctiesMvmntDtlsXtnsn().add(sctiesMvmntDtlsXtnsn);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntSctyDtlsXtnsn list.
     * @see #getSctiesMvmntSctyDtlsXtnsn()
     * 
     */
    public DTCCCANOMarketDataSD1V02 addSctiesMvmntSctyDtlsXtnsn(FinancialInstrumentAttributesSD3 sctiesMvmntSctyDtlsXtnsn) {
        getSctiesMvmntSctyDtlsXtnsn().add(sctiesMvmntSctyDtlsXtnsn);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntRateDtlsXtnsn list.
     * @see #getSctiesMvmntRateDtlsXtnsn()
     * 
     */
    public DTCCCANOMarketDataSD1V02 addSctiesMvmntRateDtlsXtnsn(CorporateActionRateSD4 sctiesMvmntRateDtlsXtnsn) {
        getSctiesMvmntRateDtlsXtnsn().add(sctiesMvmntRateDtlsXtnsn);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntCshInLieuDtlsXtnsn list.
     * @see #getSctiesMvmntCshInLieuDtlsXtnsn()
     * 
     */
    public DTCCCANOMarketDataSD1V02 addSctiesMvmntCshInLieuDtlsXtnsn(CorporateActionPriceSD2 sctiesMvmntCshInLieuDtlsXtnsn) {
        getSctiesMvmntCshInLieuDtlsXtnsn().add(sctiesMvmntCshInLieuDtlsXtnsn);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntFrctnDspstnXtnsn list.
     * @see #getSctiesMvmntFrctnDspstnXtnsn()
     * 
     */
    public DTCCCANOMarketDataSD1V02 addSctiesMvmntFrctnDspstnXtnsn(FractionDispositionTypeSD1 sctiesMvmntFrctnDspstnXtnsn) {
        getSctiesMvmntFrctnDspstnXtnsn().add(sctiesMvmntFrctnDspstnXtnsn);
        return this;
    }

    /**
     * Adds a new item to the cshMvmntDtlsXtnsn list.
     * @see #getCshMvmntDtlsXtnsn()
     * 
     */
    public DTCCCANOMarketDataSD1V02 addCshMvmntDtlsXtnsn(CashOptionSD3 cshMvmntDtlsXtnsn) {
        getCshMvmntDtlsXtnsn().add(cshMvmntDtlsXtnsn);
        return this;
    }

    /**
     * Adds a new item to the agtXtnsn list.
     * @see #getAgtXtnsn()
     * 
     */
    public DTCCCANOMarketDataSD1V02 addAgtXtnsn(PartyIdentificationSD2 agtXtnsn) {
        getAgtXtnsn().add(agtXtnsn);
        return this;
    }

    /**
     * Adds a new item to the newAgtXtnsn list.
     * @see #getNewAgtXtnsn()
     * 
     */
    public DTCCCANOMarketDataSD1V02 addNewAgtXtnsn(PartyIdentificationSD1 newAgtXtnsn) {
        getNewAgtXtnsn().add(newAgtXtnsn);
        return this;
    }

}
