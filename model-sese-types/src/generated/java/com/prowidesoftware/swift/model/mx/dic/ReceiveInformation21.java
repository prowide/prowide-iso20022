
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Parameters applied to the settlement of a security transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiveInformation21", propOrder = {
    "trfee",
    "trfeeRegdAcct",
    "intrmyInf",
    "sctiesForm",
    "dmtrlsdInd",
    "incmPref",
    "bnfcryCertfctnCmpltn",
    "reqdTradDt",
    "reqdSttlmDt",
    "sttlmAmt",
    "stmpDty",
    "netAmt",
    "fees",
    "indvTax",
    "fxDtls",
    "sttlmPtiesDtls",
    "physTrf",
    "physTrfDtls",
    "clntRef"
})
public class ReceiveInformation21 {

    @XmlElement(name = "Trfee")
    protected PartyIdentification139 trfee;
    @XmlElement(name = "TrfeeRegdAcct")
    protected Account31 trfeeRegdAcct;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary43> intrmyInf;
    @XmlElement(name = "SctiesForm")
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code sctiesForm;
    @XmlElement(name = "DmtrlsdInd")
    protected Boolean dmtrlsdInd;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference2Code incmPref;
    @XmlElement(name = "BnfcryCertfctnCmpltn")
    @XmlSchemaType(name = "string")
    protected BeneficiaryCertificationCompletion1Code bnfcryCertfctnCmpltn;
    @XmlElement(name = "ReqdTradDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar reqdTradDt;
    @XmlElement(name = "ReqdSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar reqdSttlmDt;
    @XmlElement(name = "SttlmAmt")
    protected ActiveCurrencyAndAmount sttlmAmt;
    @XmlElement(name = "StmpDty")
    @XmlSchemaType(name = "string")
    protected StampDutyType2Code stmpDty;
    @XmlElement(name = "NetAmt")
    protected ActiveCurrencyAndAmount netAmt;
    @XmlElement(name = "Fees")
    protected List<Fees2> fees;
    @XmlElement(name = "IndvTax")
    protected List<Tax38> indvTax;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms37> fxDtls;
    @XmlElement(name = "SttlmPtiesDtls")
    protected FundSettlementParameters16 sttlmPtiesDtls;
    @XmlElement(name = "PhysTrf")
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType1Code physTrf;
    @XmlElement(name = "PhysTrfDtls")
    protected DeliveryParameters4 physTrfDtls;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference10 clntRef;

    /**
     * Gets the value of the trfee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getTrfee() {
        return trfee;
    }

    /**
     * Sets the value of the trfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public ReceiveInformation21 setTrfee(PartyIdentification139 value) {
        this.trfee = value;
        return this;
    }

    /**
     * Gets the value of the trfeeRegdAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Account31 }
     *     
     */
    public Account31 getTrfeeRegdAcct() {
        return trfeeRegdAcct;
    }

    /**
     * Sets the value of the trfeeRegdAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account31 }
     *     
     */
    public ReceiveInformation21 setTrfeeRegdAcct(Account31 value) {
        this.trfeeRegdAcct = value;
        return this;
    }

    /**
     * Gets the value of the intrmyInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrmyInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmyInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary43 }
     * 
     * 
     * @return
     *     The value of the intrmyInf property.
     */
    public List<Intermediary43> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<>();
        }
        return this.intrmyInf;
    }

    /**
     * Gets the value of the sctiesForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FormOfSecurity1Code getSctiesForm() {
        return sctiesForm;
    }

    /**
     * Sets the value of the sctiesForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public ReceiveInformation21 setSctiesForm(FormOfSecurity1Code value) {
        this.sctiesForm = value;
        return this;
    }

    /**
     * Gets the value of the dmtrlsdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDmtrlsdInd() {
        return dmtrlsdInd;
    }

    /**
     * Sets the value of the dmtrlsdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ReceiveInformation21 setDmtrlsdInd(Boolean value) {
        this.dmtrlsdInd = value;
        return this;
    }

    /**
     * Gets the value of the incmPref property.
     * 
     * @return
     *     possible object is
     *     {@link IncomePreference2Code }
     *     
     */
    public IncomePreference2Code getIncmPref() {
        return incmPref;
    }

    /**
     * Sets the value of the incmPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomePreference2Code }
     *     
     */
    public ReceiveInformation21 setIncmPref(IncomePreference2Code value) {
        this.incmPref = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryCertfctnCmpltn property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryCertificationCompletion1Code }
     *     
     */
    public BeneficiaryCertificationCompletion1Code getBnfcryCertfctnCmpltn() {
        return bnfcryCertfctnCmpltn;
    }

    /**
     * Sets the value of the bnfcryCertfctnCmpltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryCertificationCompletion1Code }
     *     
     */
    public ReceiveInformation21 setBnfcryCertfctnCmpltn(BeneficiaryCertificationCompletion1Code value) {
        this.bnfcryCertfctnCmpltn = value;
        return this;
    }

    /**
     * Gets the value of the reqdTradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getReqdTradDt() {
        return reqdTradDt;
    }

    /**
     * Sets the value of the reqdTradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReceiveInformation21 setReqdTradDt(Calendar value) {
        this.reqdTradDt = value;
        return this;
    }

    /**
     * Gets the value of the reqdSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getReqdSttlmDt() {
        return reqdSttlmDt;
    }

    /**
     * Sets the value of the reqdSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReceiveInformation21 setReqdSttlmDt(Calendar value) {
        this.reqdSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ReceiveInformation21 setSttlmAmt(ActiveCurrencyAndAmount value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link StampDutyType2Code }
     *     
     */
    public StampDutyType2Code getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link StampDutyType2Code }
     *     
     */
    public ReceiveInformation21 setStmpDty(StampDutyType2Code value) {
        this.stmpDty = value;
        return this;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ReceiveInformation21 setNetAmt(ActiveCurrencyAndAmount value) {
        this.netAmt = value;
        return this;
    }

    /**
     * Gets the value of the fees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fees2 }
     * 
     * 
     * @return
     *     The value of the fees property.
     */
    public List<Fees2> getFees() {
        if (fees == null) {
            fees = new ArrayList<>();
        }
        return this.fees;
    }

    /**
     * Gets the value of the indvTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax38 }
     * 
     * 
     * @return
     *     The value of the indvTax property.
     */
    public List<Tax38> getIndvTax() {
        if (indvTax == null) {
            indvTax = new ArrayList<>();
        }
        return this.indvTax;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFXDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignExchangeTerms37 }
     * 
     * 
     * @return
     *     The value of the fxDtls property.
     */
    public List<ForeignExchangeTerms37> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<>();
        }
        return this.fxDtls;
    }

    /**
     * Gets the value of the sttlmPtiesDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FundSettlementParameters16 }
     *     
     */
    public FundSettlementParameters16 getSttlmPtiesDtls() {
        return sttlmPtiesDtls;
    }

    /**
     * Sets the value of the sttlmPtiesDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundSettlementParameters16 }
     *     
     */
    public ReceiveInformation21 setSttlmPtiesDtls(FundSettlementParameters16 value) {
        this.sttlmPtiesDtls = value;
        return this;
    }

    /**
     * Gets the value of the physTrf property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalTransferType1Code }
     *     
     */
    public PhysicalTransferType1Code getPhysTrf() {
        return physTrf;
    }

    /**
     * Sets the value of the physTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalTransferType1Code }
     *     
     */
    public ReceiveInformation21 setPhysTrf(PhysicalTransferType1Code value) {
        this.physTrf = value;
        return this;
    }

    /**
     * Gets the value of the physTrfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryParameters4 }
     *     
     */
    public DeliveryParameters4 getPhysTrfDtls() {
        return physTrfDtls;
    }

    /**
     * Sets the value of the physTrfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryParameters4 }
     *     
     */
    public ReceiveInformation21 setPhysTrfDtls(DeliveryParameters4 value) {
        this.physTrfDtls = value;
        return this;
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
    public ReceiveInformation21 setClntRef(AdditionalReference10 value) {
        this.clntRef = value;
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
     * Adds a new item to the intrmyInf list.
     * @see #getIntrmyInf()
     * 
     */
    public ReceiveInformation21 addIntrmyInf(Intermediary43 intrmyInf) {
        getIntrmyInf().add(intrmyInf);
        return this;
    }

    /**
     * Adds a new item to the fees list.
     * @see #getFees()
     * 
     */
    public ReceiveInformation21 addFees(Fees2 fees) {
        getFees().add(fees);
        return this;
    }

    /**
     * Adds a new item to the indvTax list.
     * @see #getIndvTax()
     * 
     */
    public ReceiveInformation21 addIndvTax(Tax38 indvTax) {
        getIndvTax().add(indvTax);
        return this;
    }

    /**
     * Adds a new item to the fXDtls list.
     * @see #getFXDtls()
     * 
     */
    public ReceiveInformation21 addFXDtls(ForeignExchangeTerms37 fXDtls) {
        getFXDtls().add(fXDtls);
        return this;
    }

}
