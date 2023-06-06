
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The DTCCCANOCSDDataSD1 message extends ISO corporate action notification (CANO) asset servicer data message (CSD type) with data elements that are not covered by the standard message, and additionally, with issuer/offeror/market values where DTC corresponding values are mapped to CANO. For example DTCC announced cash rate will be mapped to the CANO and issuer/offeror/ market declared cash rate will be extended in this message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCANOCSDDataSD1V11", propOrder = {
    "ntfctnGnlInf",
    "corpActnGnlInf",
    "undrlygScty",
    "corpActnDtls",
    "corpActnDtDtls",
    "corpActnPricDtls",
    "corpActnPrdDtls",
    "corpActnRateAndAmtDtls",
    "corpActnSctiesQty",
    "optnDtls",
    "optnDtDtls",
    "sctiesMvmntDtls",
    "sctiesMvmntSctyDtls",
    "sctiesMvmntRateDtls",
    "sctiesMvmntCshInLieuDtls",
    "sctiesMvmntFrctnDspstn",
    "cshMvmntDtls",
    "newAgt",
    "agt"
})
public class DTCCCANOCSDDataSD1V11 {

    @XmlElement(name = "NtfctnGnlInf")
    protected CorporateActionNotificationSD9 ntfctnGnlInf;
    @XmlElement(name = "CorpActnGnlInf")
    protected CorporateActionGeneralInformationSD33 corpActnGnlInf;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentAttributesSD15 undrlygScty;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateActionSD21 corpActnDtls;
    @XmlElement(name = "CorpActnDtDtls")
    protected CorporateActionDateSD10 corpActnDtDtls;
    @XmlElement(name = "CorpActnPricDtls")
    protected CorporateActionPriceSD4 corpActnPricDtls;
    @XmlElement(name = "CorpActnPrdDtls")
    protected CorporateActionPeriodSD3 corpActnPrdDtls;
    @XmlElement(name = "CorpActnRateAndAmtDtls")
    protected CorporateActionRateSD9 corpActnRateAndAmtDtls;
    @XmlElement(name = "CorpActnSctiesQty")
    protected CorporateActionQuantitySD3 corpActnSctiesQty;
    @XmlElement(name = "OptnDtls")
    protected List<CorporateActionOptionSD12> optnDtls;
    @XmlElement(name = "OptnDtDtls")
    protected List<CorporateActionDateSD11> optnDtDtls;
    @XmlElement(name = "SctiesMvmntDtls")
    protected List<SecuritiesOptionSD9> sctiesMvmntDtls;
    @XmlElement(name = "SctiesMvmntSctyDtls")
    protected List<FinancialInstrumentAttributesSD16> sctiesMvmntSctyDtls;
    @XmlElement(name = "SctiesMvmntRateDtls")
    protected List<CorporateActionRateSD10> sctiesMvmntRateDtls;
    @XmlElement(name = "SctiesMvmntCshInLieuDtls")
    protected List<CorporateActionPriceSD5> sctiesMvmntCshInLieuDtls;
    @XmlElement(name = "SctiesMvmntFrctnDspstn")
    protected List<FractionDispositionTypeSD3> sctiesMvmntFrctnDspstn;
    @XmlElement(name = "CshMvmntDtls")
    protected List<CashOptionSD11> cshMvmntDtls;
    @XmlElement(name = "NewAgt")
    protected List<PartyIdentificationSD5> newAgt;
    @XmlElement(name = "Agt")
    protected List<PartyIdentificationSD6> agt;

    /**
     * Gets the value of the ntfctnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationSD9 }
     *     
     */
    public CorporateActionNotificationSD9 getNtfctnGnlInf() {
        return ntfctnGnlInf;
    }

    /**
     * Sets the value of the ntfctnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationSD9 }
     *     
     */
    public DTCCCANOCSDDataSD1V11 setNtfctnGnlInf(CorporateActionNotificationSD9 value) {
        this.ntfctnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformationSD33 }
     *     
     */
    public CorporateActionGeneralInformationSD33 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD33 }
     *     
     */
    public DTCCCANOCSDDataSD1V11 setCorpActnGnlInf(CorporateActionGeneralInformationSD33 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributesSD15 }
     *     
     */
    public FinancialInstrumentAttributesSD15 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributesSD15 }
     *     
     */
    public DTCCCANOCSDDataSD1V11 setUndrlygScty(FinancialInstrumentAttributesSD15 value) {
        this.undrlygScty = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionSD21 }
     *     
     */
    public CorporateActionSD21 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionSD21 }
     *     
     */
    public DTCCCANOCSDDataSD1V11 setCorpActnDtls(CorporateActionSD21 value) {
        this.corpActnDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDateSD10 }
     *     
     */
    public CorporateActionDateSD10 getCorpActnDtDtls() {
        return corpActnDtDtls;
    }

    /**
     * Sets the value of the corpActnDtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDateSD10 }
     *     
     */
    public DTCCCANOCSDDataSD1V11 setCorpActnDtDtls(CorporateActionDateSD10 value) {
        this.corpActnDtDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnPricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPriceSD4 }
     *     
     */
    public CorporateActionPriceSD4 getCorpActnPricDtls() {
        return corpActnPricDtls;
    }

    /**
     * Sets the value of the corpActnPricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPriceSD4 }
     *     
     */
    public DTCCCANOCSDDataSD1V11 setCorpActnPricDtls(CorporateActionPriceSD4 value) {
        this.corpActnPricDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnPrdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPeriodSD3 }
     *     
     */
    public CorporateActionPeriodSD3 getCorpActnPrdDtls() {
        return corpActnPrdDtls;
    }

    /**
     * Sets the value of the corpActnPrdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPeriodSD3 }
     *     
     */
    public DTCCCANOCSDDataSD1V11 setCorpActnPrdDtls(CorporateActionPeriodSD3 value) {
        this.corpActnPrdDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnRateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRateSD9 }
     *     
     */
    public CorporateActionRateSD9 getCorpActnRateAndAmtDtls() {
        return corpActnRateAndAmtDtls;
    }

    /**
     * Sets the value of the corpActnRateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRateSD9 }
     *     
     */
    public DTCCCANOCSDDataSD1V11 setCorpActnRateAndAmtDtls(CorporateActionRateSD9 value) {
        this.corpActnRateAndAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionQuantitySD3 }
     *     
     */
    public CorporateActionQuantitySD3 getCorpActnSctiesQty() {
        return corpActnSctiesQty;
    }

    /**
     * Sets the value of the corpActnSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionQuantitySD3 }
     *     
     */
    public DTCCCANOCSDDataSD1V11 setCorpActnSctiesQty(CorporateActionQuantitySD3 value) {
        this.corpActnSctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the optnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionOptionSD12 }
     * 
     * 
     * @return
     *     The value of the optnDtls property.
     */
    public List<CorporateActionOptionSD12> getOptnDtls() {
        if (optnDtls == null) {
            optnDtls = new ArrayList<>();
        }
        return this.optnDtls;
    }

    /**
     * Gets the value of the optnDtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnDtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnDtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionDateSD11 }
     * 
     * 
     * @return
     *     The value of the optnDtDtls property.
     */
    public List<CorporateActionDateSD11> getOptnDtDtls() {
        if (optnDtDtls == null) {
            optnDtDtls = new ArrayList<>();
        }
        return this.optnDtDtls;
    }

    /**
     * Gets the value of the sctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesOptionSD9 }
     * 
     * 
     * @return
     *     The value of the sctiesMvmntDtls property.
     */
    public List<SecuritiesOptionSD9> getSctiesMvmntDtls() {
        if (sctiesMvmntDtls == null) {
            sctiesMvmntDtls = new ArrayList<>();
        }
        return this.sctiesMvmntDtls;
    }

    /**
     * Gets the value of the sctiesMvmntSctyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesMvmntSctyDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntSctyDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentAttributesSD16 }
     * 
     * 
     * @return
     *     The value of the sctiesMvmntSctyDtls property.
     */
    public List<FinancialInstrumentAttributesSD16> getSctiesMvmntSctyDtls() {
        if (sctiesMvmntSctyDtls == null) {
            sctiesMvmntSctyDtls = new ArrayList<>();
        }
        return this.sctiesMvmntSctyDtls;
    }

    /**
     * Gets the value of the sctiesMvmntRateDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesMvmntRateDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntRateDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionRateSD10 }
     * 
     * 
     * @return
     *     The value of the sctiesMvmntRateDtls property.
     */
    public List<CorporateActionRateSD10> getSctiesMvmntRateDtls() {
        if (sctiesMvmntRateDtls == null) {
            sctiesMvmntRateDtls = new ArrayList<>();
        }
        return this.sctiesMvmntRateDtls;
    }

    /**
     * Gets the value of the sctiesMvmntCshInLieuDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesMvmntCshInLieuDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntCshInLieuDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionPriceSD5 }
     * 
     * 
     * @return
     *     The value of the sctiesMvmntCshInLieuDtls property.
     */
    public List<CorporateActionPriceSD5> getSctiesMvmntCshInLieuDtls() {
        if (sctiesMvmntCshInLieuDtls == null) {
            sctiesMvmntCshInLieuDtls = new ArrayList<>();
        }
        return this.sctiesMvmntCshInLieuDtls;
    }

    /**
     * Gets the value of the sctiesMvmntFrctnDspstn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesMvmntFrctnDspstn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntFrctnDspstn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FractionDispositionTypeSD3 }
     * 
     * 
     * @return
     *     The value of the sctiesMvmntFrctnDspstn property.
     */
    public List<FractionDispositionTypeSD3> getSctiesMvmntFrctnDspstn() {
        if (sctiesMvmntFrctnDspstn == null) {
            sctiesMvmntFrctnDspstn = new ArrayList<>();
        }
        return this.sctiesMvmntFrctnDspstn;
    }

    /**
     * Gets the value of the cshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOptionSD11 }
     * 
     * 
     * @return
     *     The value of the cshMvmntDtls property.
     */
    public List<CashOptionSD11> getCshMvmntDtls() {
        if (cshMvmntDtls == null) {
            cshMvmntDtls = new ArrayList<>();
        }
        return this.cshMvmntDtls;
    }

    /**
     * Gets the value of the newAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the newAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationSD5 }
     * 
     * 
     * @return
     *     The value of the newAgt property.
     */
    public List<PartyIdentificationSD5> getNewAgt() {
        if (newAgt == null) {
            newAgt = new ArrayList<>();
        }
        return this.newAgt;
    }

    /**
     * Gets the value of the agt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the agt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationSD6 }
     * 
     * 
     * @return
     *     The value of the agt property.
     */
    public List<PartyIdentificationSD6> getAgt() {
        if (agt == null) {
            agt = new ArrayList<>();
        }
        return this.agt;
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
     * Adds a new item to the optnDtls list.
     * @see #getOptnDtls()
     * 
     */
    public DTCCCANOCSDDataSD1V11 addOptnDtls(CorporateActionOptionSD12 optnDtls) {
        getOptnDtls().add(optnDtls);
        return this;
    }

    /**
     * Adds a new item to the optnDtDtls list.
     * @see #getOptnDtDtls()
     * 
     */
    public DTCCCANOCSDDataSD1V11 addOptnDtDtls(CorporateActionDateSD11 optnDtDtls) {
        getOptnDtDtls().add(optnDtDtls);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntDtls list.
     * @see #getSctiesMvmntDtls()
     * 
     */
    public DTCCCANOCSDDataSD1V11 addSctiesMvmntDtls(SecuritiesOptionSD9 sctiesMvmntDtls) {
        getSctiesMvmntDtls().add(sctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntSctyDtls list.
     * @see #getSctiesMvmntSctyDtls()
     * 
     */
    public DTCCCANOCSDDataSD1V11 addSctiesMvmntSctyDtls(FinancialInstrumentAttributesSD16 sctiesMvmntSctyDtls) {
        getSctiesMvmntSctyDtls().add(sctiesMvmntSctyDtls);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntRateDtls list.
     * @see #getSctiesMvmntRateDtls()
     * 
     */
    public DTCCCANOCSDDataSD1V11 addSctiesMvmntRateDtls(CorporateActionRateSD10 sctiesMvmntRateDtls) {
        getSctiesMvmntRateDtls().add(sctiesMvmntRateDtls);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntCshInLieuDtls list.
     * @see #getSctiesMvmntCshInLieuDtls()
     * 
     */
    public DTCCCANOCSDDataSD1V11 addSctiesMvmntCshInLieuDtls(CorporateActionPriceSD5 sctiesMvmntCshInLieuDtls) {
        getSctiesMvmntCshInLieuDtls().add(sctiesMvmntCshInLieuDtls);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntFrctnDspstn list.
     * @see #getSctiesMvmntFrctnDspstn()
     * 
     */
    public DTCCCANOCSDDataSD1V11 addSctiesMvmntFrctnDspstn(FractionDispositionTypeSD3 sctiesMvmntFrctnDspstn) {
        getSctiesMvmntFrctnDspstn().add(sctiesMvmntFrctnDspstn);
        return this;
    }

    /**
     * Adds a new item to the cshMvmntDtls list.
     * @see #getCshMvmntDtls()
     * 
     */
    public DTCCCANOCSDDataSD1V11 addCshMvmntDtls(CashOptionSD11 cshMvmntDtls) {
        getCshMvmntDtls().add(cshMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the newAgt list.
     * @see #getNewAgt()
     * 
     */
    public DTCCCANOCSDDataSD1V11 addNewAgt(PartyIdentificationSD5 newAgt) {
        getNewAgt().add(newAgt);
        return this;
    }

    /**
     * Adds a new item to the agt list.
     * @see #getAgt()
     * 
     */
    public DTCCCANOCSDDataSD1V11 addAgt(PartyIdentificationSD6 agt) {
        getAgt().add(agt);
        return this;
    }

}
