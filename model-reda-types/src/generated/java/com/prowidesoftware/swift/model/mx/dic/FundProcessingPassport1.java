
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
 * Fund Processing Passsport (FPP) is a fully harmonised document with all key operational information that fund promoters should provide on their investment funds in order to facilitate their trading.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundProcessingPassport1", propOrder = {
    "updtdDt",
    "sctyId",
    "mainFndOrdrDsk",
    "fndMgmtCpny",
    "fndDtls",
    "valtnDealgChrtcs",
    "invstmtRstrctns",
    "sbcptPrcgChrtcs",
    "redPrcgChrtcs",
    "sttlmDtls",
    "lclMktAnx",
    "xtnsn"
})
public class FundProcessingPassport1 {

    @XmlElement(name = "UpdtdDt", required = true)
    protected UpdatedDate updtdDt;
    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification1 sctyId;
    @XmlElement(name = "MainFndOrdrDsk", required = true)
    protected ContactAttributes1 mainFndOrdrDsk;
    @XmlElement(name = "FndMgmtCpny", required = true)
    protected ContactAttributes1 fndMgmtCpny;
    @XmlElement(name = "FndDtls", required = true)
    protected FinancialInstrument20 fndDtls;
    @XmlElement(name = "ValtnDealgChrtcs", required = true)
    protected ValuationDealingProcessingCharacteristics2 valtnDealgChrtcs;
    @XmlElement(name = "InvstmtRstrctns", required = true)
    protected InvestmentRestrictions2 invstmtRstrctns;
    @XmlElement(name = "SbcptPrcgChrtcs", required = true)
    protected ProcessingCharacteristics2 sbcptPrcgChrtcs;
    @XmlElement(name = "RedPrcgChrtcs", required = true)
    protected ProcessingCharacteristics3 redPrcgChrtcs;
    @XmlElement(name = "SttlmDtls", required = true)
    protected List<CashAccount22> sttlmDtls;
    @XmlElement(name = "LclMktAnx")
    protected List<LocalMarketAnnex2> lclMktAnx;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the updtdDt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedDate }
     *     
     */
    public UpdatedDate getUpdtdDt() {
        return updtdDt;
    }

    /**
     * Sets the value of the updtdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedDate }
     *     
     */
    public FundProcessingPassport1 setUpdtdDt(UpdatedDate value) {
        this.updtdDt = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification1 }
     *     
     */
    public SecurityIdentification1 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification1 }
     *     
     */
    public FundProcessingPassport1 setSctyId(SecurityIdentification1 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the mainFndOrdrDsk property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAttributes1 }
     *     
     */
    public ContactAttributes1 getMainFndOrdrDsk() {
        return mainFndOrdrDsk;
    }

    /**
     * Sets the value of the mainFndOrdrDsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes1 }
     *     
     */
    public FundProcessingPassport1 setMainFndOrdrDsk(ContactAttributes1 value) {
        this.mainFndOrdrDsk = value;
        return this;
    }

    /**
     * Gets the value of the fndMgmtCpny property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAttributes1 }
     *     
     */
    public ContactAttributes1 getFndMgmtCpny() {
        return fndMgmtCpny;
    }

    /**
     * Sets the value of the fndMgmtCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes1 }
     *     
     */
    public FundProcessingPassport1 setFndMgmtCpny(ContactAttributes1 value) {
        this.fndMgmtCpny = value;
        return this;
    }

    /**
     * Gets the value of the fndDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument20 }
     *     
     */
    public FinancialInstrument20 getFndDtls() {
        return fndDtls;
    }

    /**
     * Sets the value of the fndDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument20 }
     *     
     */
    public FundProcessingPassport1 setFndDtls(FinancialInstrument20 value) {
        this.fndDtls = value;
        return this;
    }

    /**
     * Gets the value of the valtnDealgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationDealingProcessingCharacteristics2 }
     *     
     */
    public ValuationDealingProcessingCharacteristics2 getValtnDealgChrtcs() {
        return valtnDealgChrtcs;
    }

    /**
     * Sets the value of the valtnDealgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationDealingProcessingCharacteristics2 }
     *     
     */
    public FundProcessingPassport1 setValtnDealgChrtcs(ValuationDealingProcessingCharacteristics2 value) {
        this.valtnDealgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the invstmtRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentRestrictions2 }
     *     
     */
    public InvestmentRestrictions2 getInvstmtRstrctns() {
        return invstmtRstrctns;
    }

    /**
     * Sets the value of the invstmtRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentRestrictions2 }
     *     
     */
    public FundProcessingPassport1 setInvstmtRstrctns(InvestmentRestrictions2 value) {
        this.invstmtRstrctns = value;
        return this;
    }

    /**
     * Gets the value of the sbcptPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics2 }
     *     
     */
    public ProcessingCharacteristics2 getSbcptPrcgChrtcs() {
        return sbcptPrcgChrtcs;
    }

    /**
     * Sets the value of the sbcptPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics2 }
     *     
     */
    public FundProcessingPassport1 setSbcptPrcgChrtcs(ProcessingCharacteristics2 value) {
        this.sbcptPrcgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the redPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics3 }
     *     
     */
    public ProcessingCharacteristics3 getRedPrcgChrtcs() {
        return redPrcgChrtcs;
    }

    /**
     * Sets the value of the redPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics3 }
     *     
     */
    public FundProcessingPassport1 setRedPrcgChrtcs(ProcessingCharacteristics3 value) {
        this.redPrcgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttlmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount22 }
     * 
     * 
     */
    public List<CashAccount22> getSttlmDtls() {
        if (sttlmDtls == null) {
            sttlmDtls = new ArrayList<CashAccount22>();
        }
        return this.sttlmDtls;
    }

    /**
     * Gets the value of the lclMktAnx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lclMktAnx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLclMktAnx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalMarketAnnex2 }
     * 
     * 
     */
    public List<LocalMarketAnnex2> getLclMktAnx() {
        if (lclMktAnx == null) {
            lclMktAnx = new ArrayList<LocalMarketAnnex2>();
        }
        return this.lclMktAnx;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension1>();
        }
        return this.xtnsn;
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
     * Adds a new item to the sttlmDtls list.
     * @see #getSttlmDtls()
     * 
     */
    public FundProcessingPassport1 addSttlmDtls(CashAccount22 sttlmDtls) {
        getSttlmDtls().add(sttlmDtls);
        return this;
    }

    /**
     * Adds a new item to the lclMktAnx list.
     * @see #getLclMktAnx()
     * 
     */
    public FundProcessingPassport1 addLclMktAnx(LocalMarketAnnex2 lclMktAnx) {
        getLclMktAnx().add(lclMktAnx);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public FundProcessingPassport1 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
