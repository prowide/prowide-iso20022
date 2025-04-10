
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
@XmlType(name = "SettlementDetails147", propOrder = {
    "prty",
    "sttlmTxCond",
    "sttlgCpcty",
    "stmpDtyTaxBsis",
    "sctiesRTGS",
    "bnfclOwnrsh",
    "cshClrSys",
    "taxCpcty",
    "mktClntSd",
    "blckTrad",
    "lglRstrctns",
    "sttlmSysMtd",
    "netgElgblty",
    "ccpElgblty",
    "automtcBrrwg",
    "prtlSttlmInd",
    "elgblForColl"
})
public class SettlementDetails147 {

    @XmlElement(name = "Prty")
    protected PriorityNumeric4Choice prty;
    @XmlElement(name = "SttlmTxCond")
    protected List<SettlementTransactionCondition18Choice> sttlmTxCond;
    @XmlElement(name = "SttlgCpcty")
    protected SettlingCapacity7Choice sttlgCpcty;
    @XmlElement(name = "StmpDtyTaxBsis")
    protected GenericIdentification30 stmpDtyTaxBsis;
    @XmlElement(name = "SctiesRTGS")
    protected SecuritiesRTGS4Choice sctiesRTGS;
    @XmlElement(name = "BnfclOwnrsh")
    protected BeneficialOwnership4Choice bnfclOwnrsh;
    @XmlElement(name = "CshClrSys")
    protected CashSettlementSystem4Choice cshClrSys;
    @XmlElement(name = "TaxCpcty")
    protected TaxCapacityParty4Choice taxCpcty;
    @XmlElement(name = "MktClntSd")
    protected MarketClientSide6Choice mktClntSd;
    @XmlElement(name = "BlckTrad")
    protected BlockTrade4Choice blckTrad;
    @XmlElement(name = "LglRstrctns")
    protected Restriction5Choice lglRstrctns;
    @XmlElement(name = "SttlmSysMtd")
    protected SettlementSystemMethod4Choice sttlmSysMtd;
    @XmlElement(name = "NetgElgblty")
    protected NettingEligibility4Choice netgElgblty;
    @XmlElement(name = "CCPElgblty")
    protected CentralCounterPartyEligibility4Choice ccpElgblty;
    @XmlElement(name = "AutomtcBrrwg")
    protected AutomaticBorrowing6Choice automtcBrrwg;
    @XmlElement(name = "PrtlSttlmInd")
    @XmlSchemaType(name = "string")
    protected SettlementTransactionCondition5Code prtlSttlmInd;
    @XmlElement(name = "ElgblForColl")
    protected Boolean elgblForColl;

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
    public SettlementDetails147 setPrty(PriorityNumeric4Choice value) {
        this.prty = value;
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
     * {@link SettlementTransactionCondition18Choice }
     * 
     * 
     * @return
     *     The value of the sttlmTxCond property.
     */
    public List<SettlementTransactionCondition18Choice> getSttlmTxCond() {
        if (sttlmTxCond == null) {
            sttlmTxCond = new ArrayList<>();
        }
        return this.sttlmTxCond;
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
    public SettlementDetails147 setSttlgCpcty(SettlingCapacity7Choice value) {
        this.sttlgCpcty = value;
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
    public SettlementDetails147 setStmpDtyTaxBsis(GenericIdentification30 value) {
        this.stmpDtyTaxBsis = value;
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
    public SettlementDetails147 setSctiesRTGS(SecuritiesRTGS4Choice value) {
        this.sctiesRTGS = value;
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
    public SettlementDetails147 setBnfclOwnrsh(BeneficialOwnership4Choice value) {
        this.bnfclOwnrsh = value;
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
    public SettlementDetails147 setCshClrSys(CashSettlementSystem4Choice value) {
        this.cshClrSys = value;
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
    public SettlementDetails147 setTaxCpcty(TaxCapacityParty4Choice value) {
        this.taxCpcty = value;
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
    public SettlementDetails147 setMktClntSd(MarketClientSide6Choice value) {
        this.mktClntSd = value;
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
    public SettlementDetails147 setBlckTrad(BlockTrade4Choice value) {
        this.blckTrad = value;
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
    public SettlementDetails147 setLglRstrctns(Restriction5Choice value) {
        this.lglRstrctns = value;
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
    public SettlementDetails147 setSttlmSysMtd(SettlementSystemMethod4Choice value) {
        this.sttlmSysMtd = value;
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
    public SettlementDetails147 setNetgElgblty(NettingEligibility4Choice value) {
        this.netgElgblty = value;
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
    public SettlementDetails147 setCCPElgblty(CentralCounterPartyEligibility4Choice value) {
        this.ccpElgblty = value;
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
    public SettlementDetails147 setAutomtcBrrwg(AutomaticBorrowing6Choice value) {
        this.automtcBrrwg = value;
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
    public SettlementDetails147 setPrtlSttlmInd(SettlementTransactionCondition5Code value) {
        this.prtlSttlmInd = value;
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
    public SettlementDetails147 setElgblForColl(Boolean value) {
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
    public SettlementDetails147 addSttlmTxCond(SettlementTransactionCondition18Choice sttlmTxCond) {
        getSttlmTxCond().add(sttlmTxCond);
        return this;
    }

}
