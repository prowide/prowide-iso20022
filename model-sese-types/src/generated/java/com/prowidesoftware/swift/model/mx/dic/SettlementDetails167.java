
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of settlement of a transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDetails167", propOrder = {
    "hldInd",
    "prty",
    "sctiesTxTp",
    "sttlmTxCond",
    "prtlSttlmInd",
    "bnfclOwnrsh",
    "blckTrad",
    "ccpElgblty",
    "dlvryRtrRsn",
    "cshClrSys",
    "xpsrTp",
    "fxStgInstr",
    "mktClntSd",
    "netgElgblty",
    "regn",
    "rpTp",
    "lglRstrctns",
    "sctiesRTGS",
    "sttlgCpcty",
    "sttlmSysMtd",
    "taxCpcty",
    "stmpDtyTaxBsis",
    "trckg",
    "automtcBrrwg",
    "lttrOfGrnt",
    "rtrLeg",
    "modCxlAllwd",
    "elgblForColl",
    "sctiesSubBalTp",
    "cshSubBalTp"
})
public class SettlementDetails167 {

    @XmlElement(name = "HldInd")
    protected HoldIndicator6 hldInd;
    @XmlElement(name = "Prty")
    protected PriorityNumeric4Choice prty;
    @XmlElement(name = "SctiesTxTp", required = true)
    protected SecuritiesTransactionType44Choice sctiesTxTp;
    @XmlElement(name = "SttlmTxCond")
    protected List<SettlementTransactionCondition20Choice> sttlmTxCond;
    @XmlElement(name = "PrtlSttlmInd")
    @XmlSchemaType(name = "string")
    protected SettlementTransactionCondition5Code prtlSttlmInd;
    @XmlElement(name = "BnfclOwnrsh")
    protected BeneficialOwnership4Choice bnfclOwnrsh;
    @XmlElement(name = "BlckTrad")
    protected BlockTrade4Choice blckTrad;
    @XmlElement(name = "CCPElgblty")
    protected CentralCounterPartyEligibility4Choice ccpElgblty;
    @XmlElement(name = "DlvryRtrRsn")
    protected DeliveryReturn3Choice dlvryRtrRsn;
    @XmlElement(name = "CshClrSys")
    protected CashSettlementSystem4Choice cshClrSys;
    @XmlElement(name = "XpsrTp")
    protected ExposureType16Choice xpsrTp;
    @XmlElement(name = "FxStgInstr")
    protected FXStandingInstruction4Choice fxStgInstr;
    @XmlElement(name = "MktClntSd")
    protected MarketClientSide6Choice mktClntSd;
    @XmlElement(name = "NetgElgblty")
    protected NettingEligibility4Choice netgElgblty;
    @XmlElement(name = "Regn")
    protected Registration9Choice regn;
    @XmlElement(name = "RpTp")
    protected RepurchaseType23Choice rpTp;
    @XmlElement(name = "LglRstrctns")
    protected Restriction5Choice lglRstrctns;
    @XmlElement(name = "SctiesRTGS")
    protected SecuritiesRTGS4Choice sctiesRTGS;
    @XmlElement(name = "SttlgCpcty")
    protected SettlingCapacity7Choice sttlgCpcty;
    @XmlElement(name = "SttlmSysMtd")
    protected SettlementSystemMethod4Choice sttlmSysMtd;
    @XmlElement(name = "TaxCpcty")
    protected TaxCapacityParty4Choice taxCpcty;
    @XmlElement(name = "StmpDtyTaxBsis")
    protected GenericIdentification30 stmpDtyTaxBsis;
    @XmlElement(name = "Trckg")
    protected Tracking4Choice trckg;
    @XmlElement(name = "AutomtcBrrwg")
    protected AutomaticBorrowing6Choice automtcBrrwg;
    @XmlElement(name = "LttrOfGrnt")
    protected LetterOfGuarantee4Choice lttrOfGrnt;
    @XmlElement(name = "RtrLeg")
    protected Boolean rtrLeg;
    @XmlElement(name = "ModCxlAllwd")
    protected ModificationCancellationAllowed4Choice modCxlAllwd;
    @XmlElement(name = "ElgblForColl")
    protected Boolean elgblForColl;
    @XmlElement(name = "SctiesSubBalTp")
    protected GenericIdentification30 sctiesSubBalTp;
    @XmlElement(name = "CshSubBalTp")
    protected GenericIdentification30 cshSubBalTp;

    /**
     * Gets the value of the hldInd property.
     * 
     * @return
     *     possible object is
     *     {@link HoldIndicator6 }
     *     
     */
    public HoldIndicator6 getHldInd() {
        return hldInd;
    }

    /**
     * Sets the value of the hldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldIndicator6 }
     *     
     */
    public SettlementDetails167 setHldInd(HoldIndicator6 value) {
        this.hldInd = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public PriorityNumeric4Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public SettlementDetails167 setPrty(PriorityNumeric4Choice value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the sctiesTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionType44Choice }
     *     
     */
    public SecuritiesTransactionType44Choice getSctiesTxTp() {
        return sctiesTxTp;
    }

    /**
     * Sets the value of the sctiesTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionType44Choice }
     *     
     */
    public SettlementDetails167 setSctiesTxTp(SecuritiesTransactionType44Choice value) {
        this.sctiesTxTp = value;
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
     * {@link SettlementTransactionCondition20Choice }
     * 
     * 
     * @return
     *     The value of the sttlmTxCond property.
     */
    public List<SettlementTransactionCondition20Choice> getSttlmTxCond() {
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
    public SettlementDetails167 setPrtlSttlmInd(SettlementTransactionCondition5Code value) {
        this.prtlSttlmInd = value;
        return this;
    }

    /**
     * Gets the value of the bnfclOwnrsh property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficialOwnership4Choice }
     *     
     */
    public BeneficialOwnership4Choice getBnfclOwnrsh() {
        return bnfclOwnrsh;
    }

    /**
     * Sets the value of the bnfclOwnrsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficialOwnership4Choice }
     *     
     */
    public SettlementDetails167 setBnfclOwnrsh(BeneficialOwnership4Choice value) {
        this.bnfclOwnrsh = value;
        return this;
    }

    /**
     * Gets the value of the blckTrad property.
     * 
     * @return
     *     possible object is
     *     {@link BlockTrade4Choice }
     *     
     */
    public BlockTrade4Choice getBlckTrad() {
        return blckTrad;
    }

    /**
     * Sets the value of the blckTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockTrade4Choice }
     *     
     */
    public SettlementDetails167 setBlckTrad(BlockTrade4Choice value) {
        this.blckTrad = value;
        return this;
    }

    /**
     * Gets the value of the ccpElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link CentralCounterPartyEligibility4Choice }
     *     
     */
    public CentralCounterPartyEligibility4Choice getCCPElgblty() {
        return ccpElgblty;
    }

    /**
     * Sets the value of the ccpElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralCounterPartyEligibility4Choice }
     *     
     */
    public SettlementDetails167 setCCPElgblty(CentralCounterPartyEligibility4Choice value) {
        this.ccpElgblty = value;
        return this;
    }

    /**
     * Gets the value of the dlvryRtrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReturn3Choice }
     *     
     */
    public DeliveryReturn3Choice getDlvryRtrRsn() {
        return dlvryRtrRsn;
    }

    /**
     * Sets the value of the dlvryRtrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReturn3Choice }
     *     
     */
    public SettlementDetails167 setDlvryRtrRsn(DeliveryReturn3Choice value) {
        this.dlvryRtrRsn = value;
        return this;
    }

    /**
     * Gets the value of the cshClrSys property.
     * 
     * @return
     *     possible object is
     *     {@link CashSettlementSystem4Choice }
     *     
     */
    public CashSettlementSystem4Choice getCshClrSys() {
        return cshClrSys;
    }

    /**
     * Sets the value of the cshClrSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSettlementSystem4Choice }
     *     
     */
    public SettlementDetails167 setCshClrSys(CashSettlementSystem4Choice value) {
        this.cshClrSys = value;
        return this;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType16Choice }
     *     
     */
    public ExposureType16Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType16Choice }
     *     
     */
    public SettlementDetails167 setXpsrTp(ExposureType16Choice value) {
        this.xpsrTp = value;
        return this;
    }

    /**
     * Gets the value of the fxStgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link FXStandingInstruction4Choice }
     *     
     */
    public FXStandingInstruction4Choice getFxStgInstr() {
        return fxStgInstr;
    }

    /**
     * Sets the value of the fxStgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FXStandingInstruction4Choice }
     *     
     */
    public SettlementDetails167 setFxStgInstr(FXStandingInstruction4Choice value) {
        this.fxStgInstr = value;
        return this;
    }

    /**
     * Gets the value of the mktClntSd property.
     * 
     * @return
     *     possible object is
     *     {@link MarketClientSide6Choice }
     *     
     */
    public MarketClientSide6Choice getMktClntSd() {
        return mktClntSd;
    }

    /**
     * Sets the value of the mktClntSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClientSide6Choice }
     *     
     */
    public SettlementDetails167 setMktClntSd(MarketClientSide6Choice value) {
        this.mktClntSd = value;
        return this;
    }

    /**
     * Gets the value of the netgElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link NettingEligibility4Choice }
     *     
     */
    public NettingEligibility4Choice getNetgElgblty() {
        return netgElgblty;
    }

    /**
     * Sets the value of the netgElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingEligibility4Choice }
     *     
     */
    public SettlementDetails167 setNetgElgblty(NettingEligibility4Choice value) {
        this.netgElgblty = value;
        return this;
    }

    /**
     * Gets the value of the regn property.
     * 
     * @return
     *     possible object is
     *     {@link Registration9Choice }
     *     
     */
    public Registration9Choice getRegn() {
        return regn;
    }

    /**
     * Sets the value of the regn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Registration9Choice }
     *     
     */
    public SettlementDetails167 setRegn(Registration9Choice value) {
        this.regn = value;
        return this;
    }

    /**
     * Gets the value of the rpTp property.
     * 
     * @return
     *     possible object is
     *     {@link RepurchaseType23Choice }
     *     
     */
    public RepurchaseType23Choice getRpTp() {
        return rpTp;
    }

    /**
     * Sets the value of the rpTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepurchaseType23Choice }
     *     
     */
    public SettlementDetails167 setRpTp(RepurchaseType23Choice value) {
        this.rpTp = value;
        return this;
    }

    /**
     * Gets the value of the lglRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link Restriction5Choice }
     *     
     */
    public Restriction5Choice getLglRstrctns() {
        return lglRstrctns;
    }

    /**
     * Sets the value of the lglRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restriction5Choice }
     *     
     */
    public SettlementDetails167 setLglRstrctns(Restriction5Choice value) {
        this.lglRstrctns = value;
        return this;
    }

    /**
     * Gets the value of the sctiesRTGS property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesRTGS4Choice }
     *     
     */
    public SecuritiesRTGS4Choice getSctiesRTGS() {
        return sctiesRTGS;
    }

    /**
     * Sets the value of the sctiesRTGS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesRTGS4Choice }
     *     
     */
    public SettlementDetails167 setSctiesRTGS(SecuritiesRTGS4Choice value) {
        this.sctiesRTGS = value;
        return this;
    }

    /**
     * Gets the value of the sttlgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link SettlingCapacity7Choice }
     *     
     */
    public SettlingCapacity7Choice getSttlgCpcty() {
        return sttlgCpcty;
    }

    /**
     * Sets the value of the sttlgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlingCapacity7Choice }
     *     
     */
    public SettlementDetails167 setSttlgCpcty(SettlingCapacity7Choice value) {
        this.sttlgCpcty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSysMtd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementSystemMethod4Choice }
     *     
     */
    public SettlementSystemMethod4Choice getSttlmSysMtd() {
        return sttlmSysMtd;
    }

    /**
     * Sets the value of the sttlmSysMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementSystemMethod4Choice }
     *     
     */
    public SettlementDetails167 setSttlmSysMtd(SettlementSystemMethod4Choice value) {
        this.sttlmSysMtd = value;
        return this;
    }

    /**
     * Gets the value of the taxCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCapacityParty4Choice }
     *     
     */
    public TaxCapacityParty4Choice getTaxCpcty() {
        return taxCpcty;
    }

    /**
     * Sets the value of the taxCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCapacityParty4Choice }
     *     
     */
    public SettlementDetails167 setTaxCpcty(TaxCapacityParty4Choice value) {
        this.taxCpcty = value;
        return this;
    }

    /**
     * Gets the value of the stmpDtyTaxBsis property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getStmpDtyTaxBsis() {
        return stmpDtyTaxBsis;
    }

    /**
     * Sets the value of the stmpDtyTaxBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public SettlementDetails167 setStmpDtyTaxBsis(GenericIdentification30 value) {
        this.stmpDtyTaxBsis = value;
        return this;
    }

    /**
     * Gets the value of the trckg property.
     * 
     * @return
     *     possible object is
     *     {@link Tracking4Choice }
     *     
     */
    public Tracking4Choice getTrckg() {
        return trckg;
    }

    /**
     * Sets the value of the trckg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tracking4Choice }
     *     
     */
    public SettlementDetails167 setTrckg(Tracking4Choice value) {
        this.trckg = value;
        return this;
    }

    /**
     * Gets the value of the automtcBrrwg property.
     * 
     * @return
     *     possible object is
     *     {@link AutomaticBorrowing6Choice }
     *     
     */
    public AutomaticBorrowing6Choice getAutomtcBrrwg() {
        return automtcBrrwg;
    }

    /**
     * Sets the value of the automtcBrrwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomaticBorrowing6Choice }
     *     
     */
    public SettlementDetails167 setAutomtcBrrwg(AutomaticBorrowing6Choice value) {
        this.automtcBrrwg = value;
        return this;
    }

    /**
     * Gets the value of the lttrOfGrnt property.
     * 
     * @return
     *     possible object is
     *     {@link LetterOfGuarantee4Choice }
     *     
     */
    public LetterOfGuarantee4Choice getLttrOfGrnt() {
        return lttrOfGrnt;
    }

    /**
     * Sets the value of the lttrOfGrnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterOfGuarantee4Choice }
     *     
     */
    public SettlementDetails167 setLttrOfGrnt(LetterOfGuarantee4Choice value) {
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
    public SettlementDetails167 setRtrLeg(Boolean value) {
        this.rtrLeg = value;
        return this;
    }

    /**
     * Gets the value of the modCxlAllwd property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationCancellationAllowed4Choice }
     *     
     */
    public ModificationCancellationAllowed4Choice getModCxlAllwd() {
        return modCxlAllwd;
    }

    /**
     * Sets the value of the modCxlAllwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationCancellationAllowed4Choice }
     *     
     */
    public SettlementDetails167 setModCxlAllwd(ModificationCancellationAllowed4Choice value) {
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
    public SettlementDetails167 setElgblForColl(Boolean value) {
        this.elgblForColl = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSubBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getSctiesSubBalTp() {
        return sctiesSubBalTp;
    }

    /**
     * Sets the value of the sctiesSubBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public SettlementDetails167 setSctiesSubBalTp(GenericIdentification30 value) {
        this.sctiesSubBalTp = value;
        return this;
    }

    /**
     * Gets the value of the cshSubBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getCshSubBalTp() {
        return cshSubBalTp;
    }

    /**
     * Sets the value of the cshSubBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public SettlementDetails167 setCshSubBalTp(GenericIdentification30 value) {
        this.cshSubBalTp = value;
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
    public SettlementDetails167 addSttlmTxCond(SettlementTransactionCondition20Choice sttlmTxCond) {
        getSttlmTxCond().add(sttlmTxCond);
        return this;
    }

}
