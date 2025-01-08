
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
 * Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDetails43", propOrder = {
    "sttlmTxTp",
    "hldInd",
    "prty",
    "sttlmInstrGnrtn",
    "sttlmTxCond",
    "prtlSttlmInd",
    "bnfclOwnrsh",
    "blckTrad",
    "ccpElgblty",
    "cshClrSys",
    "xpsrTp",
    "fxStgInstr",
    "ccyToBuyOrSell",
    "mktClntSd",
    "netgElgblty",
    "regn",
    "rpTp",
    "lglRstrctns",
    "sctiesRTGS",
    "sttlgCpcty",
    "sttlmSysMtd",
    "taxCpcty",
    "stmpDtyInd",
    "stmpDtyTaxBsis",
    "trckg",
    "automtcBrrwg",
    "lttrOfGrnt",
    "rtrLeg",
    "modCxlAllwd",
    "elgblForColl"
})
public class SettlementDetails43 {

    @XmlElement(name = "SttlmTxTp", required = true)
    protected SettlementTransactionType1Choice sttlmTxTp;
    @XmlElement(name = "HldInd")
    protected Boolean hldInd;
    @XmlElement(name = "Prty")
    protected PriorityNumeric3Choice prty;
    @XmlElement(name = "SttlmInstrGnrtn")
    protected SettlementInstructionGeneration1Choice sttlmInstrGnrtn;
    @XmlElement(name = "SttlmTxCond")
    protected List<SettlementTransactionCondition11Choice> sttlmTxCond;
    @XmlElement(name = "PrtlSttlmInd")
    protected Boolean prtlSttlmInd;
    @XmlElement(name = "BnfclOwnrsh")
    protected BeneficialOwnership3Choice bnfclOwnrsh;
    @XmlElement(name = "BlckTrad")
    protected BlockTrade3Choice blckTrad;
    @XmlElement(name = "CCPElgblty")
    protected CentralCounterPartyEligibility3Choice ccpElgblty;
    @XmlElement(name = "CshClrSys")
    protected CashSettlementSystem3Choice cshClrSys;
    @XmlElement(name = "XpsrTp")
    protected ExposureType9Choice xpsrTp;
    @XmlElement(name = "FxStgInstr")
    protected FXStandingInstruction3Choice fxStgInstr;
    @XmlElement(name = "CcyToBuyOrSell")
    protected CurrencyToBuyOrSell1Choice ccyToBuyOrSell;
    @XmlElement(name = "MktClntSd")
    protected MarketClientSide3Choice mktClntSd;
    @XmlElement(name = "NetgElgblty")
    protected NettingEligibility3Choice netgElgblty;
    @XmlElement(name = "Regn")
    protected Registration6Choice regn;
    @XmlElement(name = "RpTp")
    protected RepurchaseType11Choice rpTp;
    @XmlElement(name = "LglRstrctns")
    protected Restriction3Choice lglRstrctns;
    @XmlElement(name = "SctiesRTGS")
    protected SecuritiesRTGS3Choice sctiesRTGS;
    @XmlElement(name = "SttlgCpcty")
    protected SettlingCapacity3Choice sttlgCpcty;
    @XmlElement(name = "SttlmSysMtd")
    protected SettlementSystemMethod3Choice sttlmSysMtd;
    @XmlElement(name = "TaxCpcty")
    protected TaxCapacityParty3Choice taxCpcty;
    @XmlElement(name = "StmpDtyInd")
    protected Boolean stmpDtyInd;
    @XmlElement(name = "StmpDtyTaxBsis")
    protected GenericIdentification38 stmpDtyTaxBsis;
    @XmlElement(name = "Trckg")
    protected Tracking3Choice trckg;
    @XmlElement(name = "AutomtcBrrwg")
    protected AutomaticBorrowing5Choice automtcBrrwg;
    @XmlElement(name = "LttrOfGrnt")
    protected LetterOfGuarantee3Choice lttrOfGrnt;
    @XmlElement(name = "RtrLeg")
    protected Boolean rtrLeg;
    @XmlElement(name = "ModCxlAllwd")
    protected ModificationCancellationAllowed3Choice modCxlAllwd;
    @XmlElement(name = "ElgblForColl")
    protected Boolean elgblForColl;

    /**
     * Gets the value of the sttlmTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTransactionType1Choice }
     *     
     */
    public SettlementTransactionType1Choice getSttlmTxTp() {
        return sttlmTxTp;
    }

    /**
     * Sets the value of the sttlmTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTransactionType1Choice }
     *     
     */
    public SettlementDetails43 setSttlmTxTp(SettlementTransactionType1Choice value) {
        this.sttlmTxTp = value;
        return this;
    }

    /**
     * Gets the value of the hldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHldInd() {
        return hldInd;
    }

    /**
     * Sets the value of the hldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SettlementDetails43 setHldInd(Boolean value) {
        this.hldInd = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityNumeric3Choice }
     *     
     */
    public PriorityNumeric3Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityNumeric3Choice }
     *     
     */
    public SettlementDetails43 setPrty(PriorityNumeric3Choice value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmInstrGnrtn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstructionGeneration1Choice }
     *     
     */
    public SettlementInstructionGeneration1Choice getSttlmInstrGnrtn() {
        return sttlmInstrGnrtn;
    }

    /**
     * Sets the value of the sttlmInstrGnrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstructionGeneration1Choice }
     *     
     */
    public SettlementDetails43 setSttlmInstrGnrtn(SettlementInstructionGeneration1Choice value) {
        this.sttlmInstrGnrtn = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmTxCond property.
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
     * {@link SettlementTransactionCondition11Choice }
     * 
     * 
     * @return
     *     The value of the sttlmTxCond property.
     */
    public List<SettlementTransactionCondition11Choice> getSttlmTxCond() {
        if (sttlmTxCond == null) {
            sttlmTxCond = new ArrayList<>();
        }
        return this.sttlmTxCond;
    }

    /**
     * Gets the value of the prtlSttlmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlSttlmInd() {
        return prtlSttlmInd;
    }

    /**
     * Sets the value of the prtlSttlmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SettlementDetails43 setPrtlSttlmInd(Boolean value) {
        this.prtlSttlmInd = value;
        return this;
    }

    /**
     * Gets the value of the bnfclOwnrsh property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficialOwnership3Choice }
     *     
     */
    public BeneficialOwnership3Choice getBnfclOwnrsh() {
        return bnfclOwnrsh;
    }

    /**
     * Sets the value of the bnfclOwnrsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficialOwnership3Choice }
     *     
     */
    public SettlementDetails43 setBnfclOwnrsh(BeneficialOwnership3Choice value) {
        this.bnfclOwnrsh = value;
        return this;
    }

    /**
     * Gets the value of the blckTrad property.
     * 
     * @return
     *     possible object is
     *     {@link BlockTrade3Choice }
     *     
     */
    public BlockTrade3Choice getBlckTrad() {
        return blckTrad;
    }

    /**
     * Sets the value of the blckTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockTrade3Choice }
     *     
     */
    public SettlementDetails43 setBlckTrad(BlockTrade3Choice value) {
        this.blckTrad = value;
        return this;
    }

    /**
     * Gets the value of the ccpElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link CentralCounterPartyEligibility3Choice }
     *     
     */
    public CentralCounterPartyEligibility3Choice getCCPElgblty() {
        return ccpElgblty;
    }

    /**
     * Sets the value of the ccpElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralCounterPartyEligibility3Choice }
     *     
     */
    public SettlementDetails43 setCCPElgblty(CentralCounterPartyEligibility3Choice value) {
        this.ccpElgblty = value;
        return this;
    }

    /**
     * Gets the value of the cshClrSys property.
     * 
     * @return
     *     possible object is
     *     {@link CashSettlementSystem3Choice }
     *     
     */
    public CashSettlementSystem3Choice getCshClrSys() {
        return cshClrSys;
    }

    /**
     * Sets the value of the cshClrSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSettlementSystem3Choice }
     *     
     */
    public SettlementDetails43 setCshClrSys(CashSettlementSystem3Choice value) {
        this.cshClrSys = value;
        return this;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType9Choice }
     *     
     */
    public ExposureType9Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType9Choice }
     *     
     */
    public SettlementDetails43 setXpsrTp(ExposureType9Choice value) {
        this.xpsrTp = value;
        return this;
    }

    /**
     * Gets the value of the fxStgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link FXStandingInstruction3Choice }
     *     
     */
    public FXStandingInstruction3Choice getFxStgInstr() {
        return fxStgInstr;
    }

    /**
     * Sets the value of the fxStgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FXStandingInstruction3Choice }
     *     
     */
    public SettlementDetails43 setFxStgInstr(FXStandingInstruction3Choice value) {
        this.fxStgInstr = value;
        return this;
    }

    /**
     * Gets the value of the ccyToBuyOrSell property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyToBuyOrSell1Choice }
     *     
     */
    public CurrencyToBuyOrSell1Choice getCcyToBuyOrSell() {
        return ccyToBuyOrSell;
    }

    /**
     * Sets the value of the ccyToBuyOrSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyToBuyOrSell1Choice }
     *     
     */
    public SettlementDetails43 setCcyToBuyOrSell(CurrencyToBuyOrSell1Choice value) {
        this.ccyToBuyOrSell = value;
        return this;
    }

    /**
     * Gets the value of the mktClntSd property.
     * 
     * @return
     *     possible object is
     *     {@link MarketClientSide3Choice }
     *     
     */
    public MarketClientSide3Choice getMktClntSd() {
        return mktClntSd;
    }

    /**
     * Sets the value of the mktClntSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClientSide3Choice }
     *     
     */
    public SettlementDetails43 setMktClntSd(MarketClientSide3Choice value) {
        this.mktClntSd = value;
        return this;
    }

    /**
     * Gets the value of the netgElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link NettingEligibility3Choice }
     *     
     */
    public NettingEligibility3Choice getNetgElgblty() {
        return netgElgblty;
    }

    /**
     * Sets the value of the netgElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingEligibility3Choice }
     *     
     */
    public SettlementDetails43 setNetgElgblty(NettingEligibility3Choice value) {
        this.netgElgblty = value;
        return this;
    }

    /**
     * Gets the value of the regn property.
     * 
     * @return
     *     possible object is
     *     {@link Registration6Choice }
     *     
     */
    public Registration6Choice getRegn() {
        return regn;
    }

    /**
     * Sets the value of the regn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Registration6Choice }
     *     
     */
    public SettlementDetails43 setRegn(Registration6Choice value) {
        this.regn = value;
        return this;
    }

    /**
     * Gets the value of the rpTp property.
     * 
     * @return
     *     possible object is
     *     {@link RepurchaseType11Choice }
     *     
     */
    public RepurchaseType11Choice getRpTp() {
        return rpTp;
    }

    /**
     * Sets the value of the rpTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepurchaseType11Choice }
     *     
     */
    public SettlementDetails43 setRpTp(RepurchaseType11Choice value) {
        this.rpTp = value;
        return this;
    }

    /**
     * Gets the value of the lglRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link Restriction3Choice }
     *     
     */
    public Restriction3Choice getLglRstrctns() {
        return lglRstrctns;
    }

    /**
     * Sets the value of the lglRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restriction3Choice }
     *     
     */
    public SettlementDetails43 setLglRstrctns(Restriction3Choice value) {
        this.lglRstrctns = value;
        return this;
    }

    /**
     * Gets the value of the sctiesRTGS property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesRTGS3Choice }
     *     
     */
    public SecuritiesRTGS3Choice getSctiesRTGS() {
        return sctiesRTGS;
    }

    /**
     * Sets the value of the sctiesRTGS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesRTGS3Choice }
     *     
     */
    public SettlementDetails43 setSctiesRTGS(SecuritiesRTGS3Choice value) {
        this.sctiesRTGS = value;
        return this;
    }

    /**
     * Gets the value of the sttlgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link SettlingCapacity3Choice }
     *     
     */
    public SettlingCapacity3Choice getSttlgCpcty() {
        return sttlgCpcty;
    }

    /**
     * Sets the value of the sttlgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlingCapacity3Choice }
     *     
     */
    public SettlementDetails43 setSttlgCpcty(SettlingCapacity3Choice value) {
        this.sttlgCpcty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSysMtd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementSystemMethod3Choice }
     *     
     */
    public SettlementSystemMethod3Choice getSttlmSysMtd() {
        return sttlmSysMtd;
    }

    /**
     * Sets the value of the sttlmSysMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementSystemMethod3Choice }
     *     
     */
    public SettlementDetails43 setSttlmSysMtd(SettlementSystemMethod3Choice value) {
        this.sttlmSysMtd = value;
        return this;
    }

    /**
     * Gets the value of the taxCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCapacityParty3Choice }
     *     
     */
    public TaxCapacityParty3Choice getTaxCpcty() {
        return taxCpcty;
    }

    /**
     * Sets the value of the taxCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCapacityParty3Choice }
     *     
     */
    public SettlementDetails43 setTaxCpcty(TaxCapacityParty3Choice value) {
        this.taxCpcty = value;
        return this;
    }

    /**
     * Gets the value of the stmpDtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStmpDtyInd() {
        return stmpDtyInd;
    }

    /**
     * Sets the value of the stmpDtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SettlementDetails43 setStmpDtyInd(Boolean value) {
        this.stmpDtyInd = value;
        return this;
    }

    /**
     * Gets the value of the stmpDtyTaxBsis property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification38 }
     *     
     */
    public GenericIdentification38 getStmpDtyTaxBsis() {
        return stmpDtyTaxBsis;
    }

    /**
     * Sets the value of the stmpDtyTaxBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification38 }
     *     
     */
    public SettlementDetails43 setStmpDtyTaxBsis(GenericIdentification38 value) {
        this.stmpDtyTaxBsis = value;
        return this;
    }

    /**
     * Gets the value of the trckg property.
     * 
     * @return
     *     possible object is
     *     {@link Tracking3Choice }
     *     
     */
    public Tracking3Choice getTrckg() {
        return trckg;
    }

    /**
     * Sets the value of the trckg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tracking3Choice }
     *     
     */
    public SettlementDetails43 setTrckg(Tracking3Choice value) {
        this.trckg = value;
        return this;
    }

    /**
     * Gets the value of the automtcBrrwg property.
     * 
     * @return
     *     possible object is
     *     {@link AutomaticBorrowing5Choice }
     *     
     */
    public AutomaticBorrowing5Choice getAutomtcBrrwg() {
        return automtcBrrwg;
    }

    /**
     * Sets the value of the automtcBrrwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomaticBorrowing5Choice }
     *     
     */
    public SettlementDetails43 setAutomtcBrrwg(AutomaticBorrowing5Choice value) {
        this.automtcBrrwg = value;
        return this;
    }

    /**
     * Gets the value of the lttrOfGrnt property.
     * 
     * @return
     *     possible object is
     *     {@link LetterOfGuarantee3Choice }
     *     
     */
    public LetterOfGuarantee3Choice getLttrOfGrnt() {
        return lttrOfGrnt;
    }

    /**
     * Sets the value of the lttrOfGrnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterOfGuarantee3Choice }
     *     
     */
    public SettlementDetails43 setLttrOfGrnt(LetterOfGuarantee3Choice value) {
        this.lttrOfGrnt = value;
        return this;
    }

    /**
     * Gets the value of the rtrLeg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRtrLeg() {
        return rtrLeg;
    }

    /**
     * Sets the value of the rtrLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SettlementDetails43 setRtrLeg(Boolean value) {
        this.rtrLeg = value;
        return this;
    }

    /**
     * Gets the value of the modCxlAllwd property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationCancellationAllowed3Choice }
     *     
     */
    public ModificationCancellationAllowed3Choice getModCxlAllwd() {
        return modCxlAllwd;
    }

    /**
     * Sets the value of the modCxlAllwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationCancellationAllowed3Choice }
     *     
     */
    public SettlementDetails43 setModCxlAllwd(ModificationCancellationAllowed3Choice value) {
        this.modCxlAllwd = value;
        return this;
    }

    /**
     * Gets the value of the elgblForColl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElgblForColl() {
        return elgblForColl;
    }

    /**
     * Sets the value of the elgblForColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SettlementDetails43 setElgblForColl(Boolean value) {
        this.elgblForColl = value;
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
    public SettlementDetails43 addSttlmTxCond(SettlementTransactionCondition11Choice sttlmTxCond) {
        getSttlmTxCond().add(sttlmTxCond);
        return this;
    }

}
