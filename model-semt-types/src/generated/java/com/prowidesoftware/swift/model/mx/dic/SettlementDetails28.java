
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
 * Parameters which explicitly state the conditions that must be fulfilled before a particular  transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDetails28", propOrder = {
    "hldInd",
    "sttlmTxCond",
    "sttlgCpcty",
    "stmpDtyTaxBsis",
    "sctiesRTGS",
    "regn",
    "bnfclOwnrsh",
    "cshClrSys",
    "taxCpcty",
    "rpTp",
    "mktClntSd",
    "blckTrad",
    "lglRstrctns",
    "sttlmSysMtd",
    "netgElgblty",
    "ccpElgblty",
    "lttrOfGrnt",
    "prtlSttlmInd"
})
public class SettlementDetails28 {

    @XmlElement(name = "HldInd")
    protected HoldIndicator2 hldInd;
    @XmlElement(name = "SttlmTxCond")
    protected List<SettlementTransactionCondition6Choice> sttlmTxCond;
    @XmlElement(name = "SttlgCpcty")
    protected SettlingCapacity1Choice sttlgCpcty;
    @XmlElement(name = "StmpDtyTaxBsis")
    protected GenericIdentification20 stmpDtyTaxBsis;
    @XmlElement(name = "SctiesRTGS")
    protected SecuritiesRTGS1Choice sctiesRTGS;
    @XmlElement(name = "Regn")
    protected Registration1Choice regn;
    @XmlElement(name = "BnfclOwnrsh")
    protected BeneficialOwnership1Choice bnfclOwnrsh;
    @XmlElement(name = "CshClrSys")
    protected CashSettlementSystem1Choice cshClrSys;
    @XmlElement(name = "TaxCpcty")
    protected TaxCapacityParty1Choice taxCpcty;
    @XmlElement(name = "RpTp")
    protected RepurchaseType3Choice rpTp;
    @XmlElement(name = "MktClntSd")
    protected MarketClientSide1Choice mktClntSd;
    @XmlElement(name = "BlckTrad")
    protected BlockTrade1Choice blckTrad;
    @XmlElement(name = "LglRstrctns")
    protected Restriction1Choice lglRstrctns;
    @XmlElement(name = "SttlmSysMtd")
    protected SettlementSystemMethod1Choice sttlmSysMtd;
    @XmlElement(name = "NetgElgblty")
    protected NettingEligibility1Choice netgElgblty;
    @XmlElement(name = "CCPElgblty")
    protected CentralCounterPartyEligibility1Choice ccpElgblty;
    @XmlElement(name = "LttrOfGrnt")
    protected LetterOfGuarantee1Choice lttrOfGrnt;
    @XmlElement(name = "PrtlSttlmInd")
    @XmlSchemaType(name = "string")
    protected SettlementTransactionCondition5Code prtlSttlmInd;

    /**
     * Gets the value of the hldInd property.
     * 
     * @return
     *     possible object is
     *     {@link HoldIndicator2 }
     *     
     */
    public HoldIndicator2 getHldInd() {
        return hldInd;
    }

    /**
     * Sets the value of the hldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldIndicator2 }
     *     
     */
    public SettlementDetails28 setHldInd(HoldIndicator2 value) {
        this.hldInd = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttlmTxCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmTxCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementTransactionCondition6Choice }
     * 
     * 
     */
    public List<SettlementTransactionCondition6Choice> getSttlmTxCond() {
        if (sttlmTxCond == null) {
            sttlmTxCond = new ArrayList<SettlementTransactionCondition6Choice>();
        }
        return this.sttlmTxCond;
    }

    /**
     * Gets the value of the sttlgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link SettlingCapacity1Choice }
     *     
     */
    public SettlingCapacity1Choice getSttlgCpcty() {
        return sttlgCpcty;
    }

    /**
     * Sets the value of the sttlgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlingCapacity1Choice }
     *     
     */
    public SettlementDetails28 setSttlgCpcty(SettlingCapacity1Choice value) {
        this.sttlgCpcty = value;
        return this;
    }

    /**
     * Gets the value of the stmpDtyTaxBsis property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification20 }
     *     
     */
    public GenericIdentification20 getStmpDtyTaxBsis() {
        return stmpDtyTaxBsis;
    }

    /**
     * Sets the value of the stmpDtyTaxBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification20 }
     *     
     */
    public SettlementDetails28 setStmpDtyTaxBsis(GenericIdentification20 value) {
        this.stmpDtyTaxBsis = value;
        return this;
    }

    /**
     * Gets the value of the sctiesRTGS property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesRTGS1Choice }
     *     
     */
    public SecuritiesRTGS1Choice getSctiesRTGS() {
        return sctiesRTGS;
    }

    /**
     * Sets the value of the sctiesRTGS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesRTGS1Choice }
     *     
     */
    public SettlementDetails28 setSctiesRTGS(SecuritiesRTGS1Choice value) {
        this.sctiesRTGS = value;
        return this;
    }

    /**
     * Gets the value of the regn property.
     * 
     * @return
     *     possible object is
     *     {@link Registration1Choice }
     *     
     */
    public Registration1Choice getRegn() {
        return regn;
    }

    /**
     * Sets the value of the regn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Registration1Choice }
     *     
     */
    public SettlementDetails28 setRegn(Registration1Choice value) {
        this.regn = value;
        return this;
    }

    /**
     * Gets the value of the bnfclOwnrsh property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficialOwnership1Choice }
     *     
     */
    public BeneficialOwnership1Choice getBnfclOwnrsh() {
        return bnfclOwnrsh;
    }

    /**
     * Sets the value of the bnfclOwnrsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficialOwnership1Choice }
     *     
     */
    public SettlementDetails28 setBnfclOwnrsh(BeneficialOwnership1Choice value) {
        this.bnfclOwnrsh = value;
        return this;
    }

    /**
     * Gets the value of the cshClrSys property.
     * 
     * @return
     *     possible object is
     *     {@link CashSettlementSystem1Choice }
     *     
     */
    public CashSettlementSystem1Choice getCshClrSys() {
        return cshClrSys;
    }

    /**
     * Sets the value of the cshClrSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSettlementSystem1Choice }
     *     
     */
    public SettlementDetails28 setCshClrSys(CashSettlementSystem1Choice value) {
        this.cshClrSys = value;
        return this;
    }

    /**
     * Gets the value of the taxCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCapacityParty1Choice }
     *     
     */
    public TaxCapacityParty1Choice getTaxCpcty() {
        return taxCpcty;
    }

    /**
     * Sets the value of the taxCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCapacityParty1Choice }
     *     
     */
    public SettlementDetails28 setTaxCpcty(TaxCapacityParty1Choice value) {
        this.taxCpcty = value;
        return this;
    }

    /**
     * Gets the value of the rpTp property.
     * 
     * @return
     *     possible object is
     *     {@link RepurchaseType3Choice }
     *     
     */
    public RepurchaseType3Choice getRpTp() {
        return rpTp;
    }

    /**
     * Sets the value of the rpTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepurchaseType3Choice }
     *     
     */
    public SettlementDetails28 setRpTp(RepurchaseType3Choice value) {
        this.rpTp = value;
        return this;
    }

    /**
     * Gets the value of the mktClntSd property.
     * 
     * @return
     *     possible object is
     *     {@link MarketClientSide1Choice }
     *     
     */
    public MarketClientSide1Choice getMktClntSd() {
        return mktClntSd;
    }

    /**
     * Sets the value of the mktClntSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClientSide1Choice }
     *     
     */
    public SettlementDetails28 setMktClntSd(MarketClientSide1Choice value) {
        this.mktClntSd = value;
        return this;
    }

    /**
     * Gets the value of the blckTrad property.
     * 
     * @return
     *     possible object is
     *     {@link BlockTrade1Choice }
     *     
     */
    public BlockTrade1Choice getBlckTrad() {
        return blckTrad;
    }

    /**
     * Sets the value of the blckTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockTrade1Choice }
     *     
     */
    public SettlementDetails28 setBlckTrad(BlockTrade1Choice value) {
        this.blckTrad = value;
        return this;
    }

    /**
     * Gets the value of the lglRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link Restriction1Choice }
     *     
     */
    public Restriction1Choice getLglRstrctns() {
        return lglRstrctns;
    }

    /**
     * Sets the value of the lglRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restriction1Choice }
     *     
     */
    public SettlementDetails28 setLglRstrctns(Restriction1Choice value) {
        this.lglRstrctns = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSysMtd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementSystemMethod1Choice }
     *     
     */
    public SettlementSystemMethod1Choice getSttlmSysMtd() {
        return sttlmSysMtd;
    }

    /**
     * Sets the value of the sttlmSysMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementSystemMethod1Choice }
     *     
     */
    public SettlementDetails28 setSttlmSysMtd(SettlementSystemMethod1Choice value) {
        this.sttlmSysMtd = value;
        return this;
    }

    /**
     * Gets the value of the netgElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link NettingEligibility1Choice }
     *     
     */
    public NettingEligibility1Choice getNetgElgblty() {
        return netgElgblty;
    }

    /**
     * Sets the value of the netgElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingEligibility1Choice }
     *     
     */
    public SettlementDetails28 setNetgElgblty(NettingEligibility1Choice value) {
        this.netgElgblty = value;
        return this;
    }

    /**
     * Gets the value of the ccpElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link CentralCounterPartyEligibility1Choice }
     *     
     */
    public CentralCounterPartyEligibility1Choice getCCPElgblty() {
        return ccpElgblty;
    }

    /**
     * Sets the value of the ccpElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralCounterPartyEligibility1Choice }
     *     
     */
    public SettlementDetails28 setCCPElgblty(CentralCounterPartyEligibility1Choice value) {
        this.ccpElgblty = value;
        return this;
    }

    /**
     * Gets the value of the lttrOfGrnt property.
     * 
     * @return
     *     possible object is
     *     {@link LetterOfGuarantee1Choice }
     *     
     */
    public LetterOfGuarantee1Choice getLttrOfGrnt() {
        return lttrOfGrnt;
    }

    /**
     * Sets the value of the lttrOfGrnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterOfGuarantee1Choice }
     *     
     */
    public SettlementDetails28 setLttrOfGrnt(LetterOfGuarantee1Choice value) {
        this.lttrOfGrnt = value;
        return this;
    }

    /**
     * Gets the value of the prtlSttlmInd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTransactionCondition5Code }
     *     
     */
    public SettlementTransactionCondition5Code getPrtlSttlmInd() {
        return prtlSttlmInd;
    }

    /**
     * Sets the value of the prtlSttlmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTransactionCondition5Code }
     *     
     */
    public SettlementDetails28 setPrtlSttlmInd(SettlementTransactionCondition5Code value) {
        this.prtlSttlmInd = value;
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

    /**
     * Adds a new item to the sttlmTxCond list.
     * @see #getSttlmTxCond()
     * 
     */
    public SettlementDetails28 addSttlmTxCond(SettlementTransactionCondition6Choice sttlmTxCond) {
        getSttlmTxCond().add(sttlmTxCond);
        return this;
    }

}
