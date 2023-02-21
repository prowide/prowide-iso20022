
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
@XmlType(name = "DTCCCANOCSDDataSD1V03", propOrder = {
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
    "sctiesMvmntDtls",
    "sctiesMvmntSctyDtls",
    "sctiesMvmntRateDtls",
    "sctiesMvmntCshInLieuDtls",
    "sctiesMvmntFrctnDspstn",
    "cshMvmntDtls",
    "newAgt",
    "agt"
})
public class DTCCCANOCSDDataSD1V03 {

    @XmlElement(name = "NtfctnGnlInf")
    protected CorporateActionNotificationSD3 ntfctnGnlInf;
    @XmlElement(name = "CorpActnGnlInf")
    protected CorporateActionGeneralInformationSD5 corpActnGnlInf;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentAttributesSD6 undrlygScty;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateActionSD1 corpActnDtls;
    @XmlElement(name = "CorpActnDtDtls")
    protected CorporateActionDateSD5 corpActnDtDtls;
    @XmlElement(name = "CorpActnPricDtls")
    protected CorporateActionPriceSD3 corpActnPricDtls;
    @XmlElement(name = "CorpActnPrdDtls")
    protected CorporateActionPeriodSD2 corpActnPrdDtls;
    @XmlElement(name = "CorpActnRateAndAmtDtls")
    protected CorporateActionRateSD5 corpActnRateAndAmtDtls;
    @XmlElement(name = "CorpActnSctiesQty")
    protected CorporateActionQuantitySD1 corpActnSctiesQty;
    @XmlElement(name = "OptnDtls")
    protected List<CorporateActionOptionSD2> optnDtls;
    @XmlElement(name = "SctiesMvmntDtls")
    protected List<SecuritiesOptionSD2> sctiesMvmntDtls;
    @XmlElement(name = "SctiesMvmntSctyDtls")
    protected List<FinancialInstrumentAttributesSD1> sctiesMvmntSctyDtls;
    @XmlElement(name = "SctiesMvmntRateDtls")
    protected List<CorporateActionRateSD6> sctiesMvmntRateDtls;
    @XmlElement(name = "SctiesMvmntCshInLieuDtls")
    protected List<CorporateActionPriceSD1> sctiesMvmntCshInLieuDtls;
    @XmlElement(name = "SctiesMvmntFrctnDspstn")
    protected List<FractionDispositionTypeSD2> sctiesMvmntFrctnDspstn;
    @XmlElement(name = "CshMvmntDtls")
    protected List<CashOptionSD1> cshMvmntDtls;
    @XmlElement(name = "NewAgt")
    protected List<PartyIdentificationSD1> newAgt;
    @XmlElement(name = "Agt")
    protected List<PartyIdentificationSD2> agt;

    /**
     * Gets the value of the ntfctnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationSD3 }
     *     
     */
    public CorporateActionNotificationSD3 getNtfctnGnlInf() {
        return ntfctnGnlInf;
    }

    /**
     * Sets the value of the ntfctnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationSD3 }
     *     
     */
    public DTCCCANOCSDDataSD1V03 setNtfctnGnlInf(CorporateActionNotificationSD3 value) {
        this.ntfctnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformationSD5 }
     *     
     */
    public CorporateActionGeneralInformationSD5 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD5 }
     *     
     */
    public DTCCCANOCSDDataSD1V03 setCorpActnGnlInf(CorporateActionGeneralInformationSD5 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributesSD6 }
     *     
     */
    public FinancialInstrumentAttributesSD6 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributesSD6 }
     *     
     */
    public DTCCCANOCSDDataSD1V03 setUndrlygScty(FinancialInstrumentAttributesSD6 value) {
        this.undrlygScty = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionSD1 }
     *     
     */
    public CorporateActionSD1 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionSD1 }
     *     
     */
    public DTCCCANOCSDDataSD1V03 setCorpActnDtls(CorporateActionSD1 value) {
        this.corpActnDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDateSD5 }
     *     
     */
    public CorporateActionDateSD5 getCorpActnDtDtls() {
        return corpActnDtDtls;
    }

    /**
     * Sets the value of the corpActnDtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDateSD5 }
     *     
     */
    public DTCCCANOCSDDataSD1V03 setCorpActnDtDtls(CorporateActionDateSD5 value) {
        this.corpActnDtDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnPricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPriceSD3 }
     *     
     */
    public CorporateActionPriceSD3 getCorpActnPricDtls() {
        return corpActnPricDtls;
    }

    /**
     * Sets the value of the corpActnPricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPriceSD3 }
     *     
     */
    public DTCCCANOCSDDataSD1V03 setCorpActnPricDtls(CorporateActionPriceSD3 value) {
        this.corpActnPricDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnPrdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPeriodSD2 }
     *     
     */
    public CorporateActionPeriodSD2 getCorpActnPrdDtls() {
        return corpActnPrdDtls;
    }

    /**
     * Sets the value of the corpActnPrdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPeriodSD2 }
     *     
     */
    public DTCCCANOCSDDataSD1V03 setCorpActnPrdDtls(CorporateActionPeriodSD2 value) {
        this.corpActnPrdDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnRateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRateSD5 }
     *     
     */
    public CorporateActionRateSD5 getCorpActnRateAndAmtDtls() {
        return corpActnRateAndAmtDtls;
    }

    /**
     * Sets the value of the corpActnRateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRateSD5 }
     *     
     */
    public DTCCCANOCSDDataSD1V03 setCorpActnRateAndAmtDtls(CorporateActionRateSD5 value) {
        this.corpActnRateAndAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionQuantitySD1 }
     *     
     */
    public CorporateActionQuantitySD1 getCorpActnSctiesQty() {
        return corpActnSctiesQty;
    }

    /**
     * Sets the value of the corpActnSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionQuantitySD1 }
     *     
     */
    public DTCCCANOCSDDataSD1V03 setCorpActnSctiesQty(CorporateActionQuantitySD1 value) {
        this.corpActnSctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the optnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnDtls property.
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
     * {@link CorporateActionOptionSD2 }
     * 
     * 
     */
    public List<CorporateActionOptionSD2> getOptnDtls() {
        if (optnDtls == null) {
            optnDtls = new ArrayList<CorporateActionOptionSD2>();
        }
        return this.optnDtls;
    }

    /**
     * Gets the value of the sctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntDtls property.
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
     * {@link SecuritiesOptionSD2 }
     * 
     * 
     */
    public List<SecuritiesOptionSD2> getSctiesMvmntDtls() {
        if (sctiesMvmntDtls == null) {
            sctiesMvmntDtls = new ArrayList<SecuritiesOptionSD2>();
        }
        return this.sctiesMvmntDtls;
    }

    /**
     * Gets the value of the sctiesMvmntSctyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntSctyDtls property.
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
     * {@link FinancialInstrumentAttributesSD1 }
     * 
     * 
     */
    public List<FinancialInstrumentAttributesSD1> getSctiesMvmntSctyDtls() {
        if (sctiesMvmntSctyDtls == null) {
            sctiesMvmntSctyDtls = new ArrayList<FinancialInstrumentAttributesSD1>();
        }
        return this.sctiesMvmntSctyDtls;
    }

    /**
     * Gets the value of the sctiesMvmntRateDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntRateDtls property.
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
     * {@link CorporateActionRateSD6 }
     * 
     * 
     */
    public List<CorporateActionRateSD6> getSctiesMvmntRateDtls() {
        if (sctiesMvmntRateDtls == null) {
            sctiesMvmntRateDtls = new ArrayList<CorporateActionRateSD6>();
        }
        return this.sctiesMvmntRateDtls;
    }

    /**
     * Gets the value of the sctiesMvmntCshInLieuDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntCshInLieuDtls property.
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
     * {@link CorporateActionPriceSD1 }
     * 
     * 
     */
    public List<CorporateActionPriceSD1> getSctiesMvmntCshInLieuDtls() {
        if (sctiesMvmntCshInLieuDtls == null) {
            sctiesMvmntCshInLieuDtls = new ArrayList<CorporateActionPriceSD1>();
        }
        return this.sctiesMvmntCshInLieuDtls;
    }

    /**
     * Gets the value of the sctiesMvmntFrctnDspstn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntFrctnDspstn property.
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
     * {@link FractionDispositionTypeSD2 }
     * 
     * 
     */
    public List<FractionDispositionTypeSD2> getSctiesMvmntFrctnDspstn() {
        if (sctiesMvmntFrctnDspstn == null) {
            sctiesMvmntFrctnDspstn = new ArrayList<FractionDispositionTypeSD2>();
        }
        return this.sctiesMvmntFrctnDspstn;
    }

    /**
     * Gets the value of the cshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshMvmntDtls property.
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
     * {@link CashOptionSD1 }
     * 
     * 
     */
    public List<CashOptionSD1> getCshMvmntDtls() {
        if (cshMvmntDtls == null) {
            cshMvmntDtls = new ArrayList<CashOptionSD1>();
        }
        return this.cshMvmntDtls;
    }

    /**
     * Gets the value of the newAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newAgt property.
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
     * {@link PartyIdentificationSD1 }
     * 
     * 
     */
    public List<PartyIdentificationSD1> getNewAgt() {
        if (newAgt == null) {
            newAgt = new ArrayList<PartyIdentificationSD1>();
        }
        return this.newAgt;
    }

    /**
     * Gets the value of the agt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agt property.
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
     * {@link PartyIdentificationSD2 }
     * 
     * 
     */
    public List<PartyIdentificationSD2> getAgt() {
        if (agt == null) {
            agt = new ArrayList<PartyIdentificationSD2>();
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
    public DTCCCANOCSDDataSD1V03 addOptnDtls(CorporateActionOptionSD2 optnDtls) {
        getOptnDtls().add(optnDtls);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntDtls list.
     * @see #getSctiesMvmntDtls()
     * 
     */
    public DTCCCANOCSDDataSD1V03 addSctiesMvmntDtls(SecuritiesOptionSD2 sctiesMvmntDtls) {
        getSctiesMvmntDtls().add(sctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntSctyDtls list.
     * @see #getSctiesMvmntSctyDtls()
     * 
     */
    public DTCCCANOCSDDataSD1V03 addSctiesMvmntSctyDtls(FinancialInstrumentAttributesSD1 sctiesMvmntSctyDtls) {
        getSctiesMvmntSctyDtls().add(sctiesMvmntSctyDtls);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntRateDtls list.
     * @see #getSctiesMvmntRateDtls()
     * 
     */
    public DTCCCANOCSDDataSD1V03 addSctiesMvmntRateDtls(CorporateActionRateSD6 sctiesMvmntRateDtls) {
        getSctiesMvmntRateDtls().add(sctiesMvmntRateDtls);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntCshInLieuDtls list.
     * @see #getSctiesMvmntCshInLieuDtls()
     * 
     */
    public DTCCCANOCSDDataSD1V03 addSctiesMvmntCshInLieuDtls(CorporateActionPriceSD1 sctiesMvmntCshInLieuDtls) {
        getSctiesMvmntCshInLieuDtls().add(sctiesMvmntCshInLieuDtls);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntFrctnDspstn list.
     * @see #getSctiesMvmntFrctnDspstn()
     * 
     */
    public DTCCCANOCSDDataSD1V03 addSctiesMvmntFrctnDspstn(FractionDispositionTypeSD2 sctiesMvmntFrctnDspstn) {
        getSctiesMvmntFrctnDspstn().add(sctiesMvmntFrctnDspstn);
        return this;
    }

    /**
     * Adds a new item to the cshMvmntDtls list.
     * @see #getCshMvmntDtls()
     * 
     */
    public DTCCCANOCSDDataSD1V03 addCshMvmntDtls(CashOptionSD1 cshMvmntDtls) {
        getCshMvmntDtls().add(cshMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the newAgt list.
     * @see #getNewAgt()
     * 
     */
    public DTCCCANOCSDDataSD1V03 addNewAgt(PartyIdentificationSD1 newAgt) {
        getNewAgt().add(newAgt);
        return this;
    }

    /**
     * Adds a new item to the agt list.
     * @see #getAgt()
     * 
     */
    public DTCCCANOCSDDataSD1V03 addAgt(PartyIdentificationSD2 agt) {
        getAgt().add(agt);
        return this;
    }

}
