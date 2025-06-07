
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Details of the transactions reported.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction124", propOrder = {
    "clntTrptyCollTxId",
    "trptyAgtSvcPrvdrCollTxId",
    "ctrPtyCollTxRef",
    "cmonTxId",
    "xpsrTp",
    "optnTp",
    "termntnOptn",
    "bsktIdAndElgbltySetPrfl",
    "collPties",
    "exctnReqdDt",
    "clsgDt",
    "valtnAmts",
    "pricgRate",
    "mrgnRate",
    "sprdRate",
    "dayCntBsis",
    "automtcAllcn",
    "txSts",
    "sctiesBal",
    "cshBal"
})
public class Transaction124 {

    @XmlElement(name = "ClntTrptyCollTxId")
    protected String clntTrptyCollTxId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollTxId", required = true)
    protected String trptyAgtSvcPrvdrCollTxId;
    @XmlElement(name = "CtrPtyCollTxRef")
    protected String ctrPtyCollTxRef;
    @XmlElement(name = "CmonTxId")
    protected String cmonTxId;
    @XmlElement(name = "XpsrTp", required = true)
    protected ExposureType23Choice xpsrTp;
    @XmlElement(name = "OptnTp")
    protected OptionType6Choice optnTp;
    @XmlElement(name = "TermntnOptn")
    @XmlSchemaType(name = "string")
    protected RepoTerminationOption1Code termntnOptn;
    @XmlElement(name = "BsktIdAndElgbltySetPrfl")
    protected BasketIdentificationAndEligibilitySetProfile1 bsktIdAndElgbltySetPrfl;
    @XmlElement(name = "CollPties", required = true)
    protected CollateralParties11 collPties;
    @XmlElement(name = "ExctnReqdDt", required = true)
    protected ClosingDate4Choice exctnReqdDt;
    @XmlElement(name = "ClsgDt", required = true)
    protected ClosingDate4Choice clsgDt;
    @XmlElement(name = "ValtnAmts", required = true)
    protected CollateralAmount17 valtnAmts;
    @XmlElement(name = "PricgRate")
    protected RateOrName4Choice pricgRate;
    @XmlElement(name = "MrgnRate")
    protected BigDecimal mrgnRate;
    @XmlElement(name = "SprdRate")
    protected BigDecimal sprdRate;
    @XmlElement(name = "DayCntBsis")
    protected InterestComputationMethodFormat4Choice dayCntBsis;
    @XmlElement(name = "AutomtcAllcn")
    protected Boolean automtcAllcn;
    @XmlElement(name = "TxSts")
    protected List<TransactionStatus6> txSts;
    @XmlElement(name = "SctiesBal")
    protected List<SecuritiesBalance3> sctiesBal;
    @XmlElement(name = "CshBal")
    protected List<CashBalance15> cshBal;

    /**
     * Gets the value of the clntTrptyCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntTrptyCollTxId() {
        return clntTrptyCollTxId;
    }

    /**
     * Sets the value of the clntTrptyCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction124 setClntTrptyCollTxId(String value) {
        this.clntTrptyCollTxId = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgtSvcPrvdrCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCollTxId() {
        return trptyAgtSvcPrvdrCollTxId;
    }

    /**
     * Sets the value of the trptyAgtSvcPrvdrCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction124 setTrptyAgtSvcPrvdrCollTxId(String value) {
        this.trptyAgtSvcPrvdrCollTxId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyCollTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrPtyCollTxRef() {
        return ctrPtyCollTxRef;
    }

    /**
     * Sets the value of the ctrPtyCollTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction124 setCtrPtyCollTxRef(String value) {
        this.ctrPtyCollTxRef = value;
        return this;
    }

    /**
     * Gets the value of the cmonTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonTxId() {
        return cmonTxId;
    }

    /**
     * Sets the value of the cmonTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction124 setCmonTxId(String value) {
        this.cmonTxId = value;
        return this;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType23Choice }
     *     
     */
    public ExposureType23Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType23Choice }
     *     
     */
    public Transaction124 setXpsrTp(ExposureType23Choice value) {
        this.xpsrTp = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType6Choice }
     *     
     */
    public OptionType6Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType6Choice }
     *     
     */
    public Transaction124 setOptnTp(OptionType6Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the termntnOptn property.
     * 
     * @return
     *     possible object is
     *     {@link RepoTerminationOption1Code }
     *     
     */
    public RepoTerminationOption1Code getTermntnOptn() {
        return termntnOptn;
    }

    /**
     * Sets the value of the termntnOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepoTerminationOption1Code }
     *     
     */
    public Transaction124 setTermntnOptn(RepoTerminationOption1Code value) {
        this.termntnOptn = value;
        return this;
    }

    /**
     * Gets the value of the bsktIdAndElgbltySetPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link BasketIdentificationAndEligibilitySetProfile1 }
     *     
     */
    public BasketIdentificationAndEligibilitySetProfile1 getBsktIdAndElgbltySetPrfl() {
        return bsktIdAndElgbltySetPrfl;
    }

    /**
     * Sets the value of the bsktIdAndElgbltySetPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketIdentificationAndEligibilitySetProfile1 }
     *     
     */
    public Transaction124 setBsktIdAndElgbltySetPrfl(BasketIdentificationAndEligibilitySetProfile1 value) {
        this.bsktIdAndElgbltySetPrfl = value;
        return this;
    }

    /**
     * Gets the value of the collPties property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParties11 }
     *     
     */
    public CollateralParties11 getCollPties() {
        return collPties;
    }

    /**
     * Sets the value of the collPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParties11 }
     *     
     */
    public Transaction124 setCollPties(CollateralParties11 value) {
        this.collPties = value;
        return this;
    }

    /**
     * Gets the value of the exctnReqdDt property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public ClosingDate4Choice getExctnReqdDt() {
        return exctnReqdDt;
    }

    /**
     * Sets the value of the exctnReqdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public Transaction124 setExctnReqdDt(ClosingDate4Choice value) {
        this.exctnReqdDt = value;
        return this;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public ClosingDate4Choice getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public Transaction124 setClsgDt(ClosingDate4Choice value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the valtnAmts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAmount17 }
     *     
     */
    public CollateralAmount17 getValtnAmts() {
        return valtnAmts;
    }

    /**
     * Sets the value of the valtnAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAmount17 }
     *     
     */
    public Transaction124 setValtnAmts(CollateralAmount17 value) {
        this.valtnAmts = value;
        return this;
    }

    /**
     * Gets the value of the pricgRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateOrName4Choice }
     *     
     */
    public RateOrName4Choice getPricgRate() {
        return pricgRate;
    }

    /**
     * Sets the value of the pricgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOrName4Choice }
     *     
     */
    public Transaction124 setPricgRate(RateOrName4Choice value) {
        this.pricgRate = value;
        return this;
    }

    /**
     * Gets the value of the mrgnRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMrgnRate() {
        return mrgnRate;
    }

    /**
     * Sets the value of the mrgnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Transaction124 setMrgnRate(BigDecimal value) {
        this.mrgnRate = value;
        return this;
    }

    /**
     * Gets the value of the sprdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSprdRate() {
        return sprdRate;
    }

    /**
     * Sets the value of the sprdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Transaction124 setSprdRate(BigDecimal value) {
        this.sprdRate = value;
        return this;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public InterestComputationMethodFormat4Choice getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public Transaction124 setDayCntBsis(InterestComputationMethodFormat4Choice value) {
        this.dayCntBsis = value;
        return this;
    }

    /**
     * Gets the value of the automtcAllcn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomtcAllcn() {
        return automtcAllcn;
    }

    /**
     * Sets the value of the automtcAllcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Transaction124 setAutomtcAllcn(Boolean value) {
        this.automtcAllcn = value;
        return this;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionStatus6 }
     * 
     * 
     */
    public List<TransactionStatus6> getTxSts() {
        if (txSts == null) {
            txSts = new ArrayList<TransactionStatus6>();
        }
        return this.txSts;
    }

    /**
     * Gets the value of the sctiesBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesBalance3 }
     * 
     * 
     */
    public List<SecuritiesBalance3> getSctiesBal() {
        if (sctiesBal == null) {
            sctiesBal = new ArrayList<SecuritiesBalance3>();
        }
        return this.sctiesBal;
    }

    /**
     * Gets the value of the cshBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashBalance15 }
     * 
     * 
     */
    public List<CashBalance15> getCshBal() {
        if (cshBal == null) {
            cshBal = new ArrayList<CashBalance15>();
        }
        return this.cshBal;
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
     * Adds a new item to the txSts list.
     * @see #getTxSts()
     * 
     */
    public Transaction124 addTxSts(TransactionStatus6 txSts) {
        getTxSts().add(txSts);
        return this;
    }

    /**
     * Adds a new item to the sctiesBal list.
     * @see #getSctiesBal()
     * 
     */
    public Transaction124 addSctiesBal(SecuritiesBalance3 sctiesBal) {
        getSctiesBal().add(sctiesBal);
        return this;
    }

    /**
     * Adds a new item to the cshBal list.
     * @see #getCshBal()
     * 
     */
    public Transaction124 addCshBal(CashBalance15 cshBal) {
        getCshBal().add(cshBal);
        return this;
    }

}
