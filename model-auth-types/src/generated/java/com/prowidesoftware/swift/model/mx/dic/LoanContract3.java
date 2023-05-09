
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
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
 * Contract by which an amount of money in exchange for future repayment of the principal amount along with interest or other finance charges.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanContract3", propOrder = {
    "ctrctDocId",
    "lnTpId",
    "buyr",
    "sellr",
    "amt",
    "mtrtyDt",
    "prlngtnFlg",
    "startDt",
    "sttlmCcy",
    "spclConds",
    "drtnCd",
    "intrstRate",
    "trch",
    "pmtSchdl",
    "intrstSchdl",
    "intraCpnyLn",
    "coll",
    "sndctdLn",
    "attchmnt"
})
public class LoanContract3 {

    @XmlElement(name = "CtrctDocId", required = true)
    protected DocumentIdentification22 ctrctDocId;
    @XmlElement(name = "LnTpId")
    protected String lnTpId;
    @XmlElement(name = "Buyr", required = true)
    protected List<TradeParty5> buyr;
    @XmlElement(name = "Sellr", required = true)
    protected List<TradeParty5> sellr;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "MtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate mtrtyDt;
    @XmlElement(name = "PrlngtnFlg")
    protected Boolean prlngtnFlg;
    @XmlElement(name = "StartDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate startDt;
    @XmlElement(name = "SttlmCcy")
    protected String sttlmCcy;
    @XmlElement(name = "SpclConds")
    protected SpecialCondition1 spclConds;
    @XmlElement(name = "DrtnCd")
    protected String drtnCd;
    @XmlElement(name = "IntrstRate")
    protected InterestRate2Choice intrstRate;
    @XmlElement(name = "Trch")
    protected List<LoanContractTranche1> trch;
    @XmlElement(name = "PmtSchdl")
    protected List<PaymentSchedule1> pmtSchdl;
    @XmlElement(name = "IntrstSchdl")
    protected List<InterestPaymentSchedule1> intrstSchdl;
    @XmlElement(name = "IntraCpnyLn")
    protected boolean intraCpnyLn;
    @XmlElement(name = "Coll")
    protected ContractCollateral1 coll;
    @XmlElement(name = "SndctdLn")
    protected List<SyndicatedLoan2> sndctdLn;
    @XmlElement(name = "Attchmnt")
    protected List<DocumentGeneralInformation5> attchmnt;

    /**
     * Gets the value of the ctrctDocId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public DocumentIdentification22 getCtrctDocId() {
        return ctrctDocId;
    }

    /**
     * Sets the value of the ctrctDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public LoanContract3 setCtrctDocId(DocumentIdentification22 value) {
        this.ctrctDocId = value;
        return this;
    }

    /**
     * Gets the value of the lnTpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnTpId() {
        return lnTpId;
    }

    /**
     * Sets the value of the lnTpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanContract3 setLnTpId(String value) {
        this.lnTpId = value;
        return this;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeParty5 }
     * 
     * 
     * @return
     *     The value of the buyr property.
     */
    public List<TradeParty5> getBuyr() {
        if (buyr == null) {
            buyr = new ArrayList<>();
        }
        return this.buyr;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeParty5 }
     * 
     * 
     * @return
     *     The value of the sellr property.
     */
    public List<TradeParty5> getSellr() {
        if (sellr == null) {
            sellr = new ArrayList<>();
        }
        return this.sellr;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public LoanContract3 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanContract3 setMtrtyDt(LocalDate value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the prlngtnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrlngtnFlg() {
        return prlngtnFlg;
    }

    /**
     * Sets the value of the prlngtnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LoanContract3 setPrlngtnFlg(Boolean value) {
        this.prlngtnFlg = value;
        return this;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanContract3 setStartDt(LocalDate value) {
        this.startDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanContract3 setSttlmCcy(String value) {
        this.sttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the spclConds property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialCondition1 }
     *     
     */
    public SpecialCondition1 getSpclConds() {
        return spclConds;
    }

    /**
     * Sets the value of the spclConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialCondition1 }
     *     
     */
    public LoanContract3 setSpclConds(SpecialCondition1 value) {
        this.spclConds = value;
        return this;
    }

    /**
     * Gets the value of the drtnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrtnCd() {
        return drtnCd;
    }

    /**
     * Sets the value of the drtnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanContract3 setDrtnCd(String value) {
        this.drtnCd = value;
        return this;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate2Choice }
     *     
     */
    public InterestRate2Choice getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate2Choice }
     *     
     */
    public LoanContract3 setIntrstRate(InterestRate2Choice value) {
        this.intrstRate = value;
        return this;
    }

    /**
     * Gets the value of the trch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanContractTranche1 }
     * 
     * 
     * @return
     *     The value of the trch property.
     */
    public List<LoanContractTranche1> getTrch() {
        if (trch == null) {
            trch = new ArrayList<>();
        }
        return this.trch;
    }

    /**
     * Gets the value of the pmtSchdl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtSchdl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtSchdl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentSchedule1 }
     * 
     * 
     * @return
     *     The value of the pmtSchdl property.
     */
    public List<PaymentSchedule1> getPmtSchdl() {
        if (pmtSchdl == null) {
            pmtSchdl = new ArrayList<>();
        }
        return this.pmtSchdl;
    }

    /**
     * Gets the value of the intrstSchdl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrstSchdl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrstSchdl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestPaymentSchedule1 }
     * 
     * 
     * @return
     *     The value of the intrstSchdl property.
     */
    public List<InterestPaymentSchedule1> getIntrstSchdl() {
        if (intrstSchdl == null) {
            intrstSchdl = new ArrayList<>();
        }
        return this.intrstSchdl;
    }

    /**
     * Gets the value of the intraCpnyLn property.
     * 
     */
    public boolean isIntraCpnyLn() {
        return intraCpnyLn;
    }

    /**
     * Sets the value of the intraCpnyLn property.
     * 
     */
    public LoanContract3 setIntraCpnyLn(boolean value) {
        this.intraCpnyLn = value;
        return this;
    }

    /**
     * Gets the value of the coll property.
     * 
     * @return
     *     possible object is
     *     {@link ContractCollateral1 }
     *     
     */
    public ContractCollateral1 getColl() {
        return coll;
    }

    /**
     * Sets the value of the coll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractCollateral1 }
     *     
     */
    public LoanContract3 setColl(ContractCollateral1 value) {
        this.coll = value;
        return this;
    }

    /**
     * Gets the value of the sndctdLn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sndctdLn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSndctdLn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SyndicatedLoan2 }
     * 
     * 
     * @return
     *     The value of the sndctdLn property.
     */
    public List<SyndicatedLoan2> getSndctdLn() {
        if (sndctdLn == null) {
            sndctdLn = new ArrayList<>();
        }
        return this.sndctdLn;
    }

    /**
     * Gets the value of the attchmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attchmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGeneralInformation5 }
     * 
     * 
     * @return
     *     The value of the attchmnt property.
     */
    public List<DocumentGeneralInformation5> getAttchmnt() {
        if (attchmnt == null) {
            attchmnt = new ArrayList<>();
        }
        return this.attchmnt;
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
     * Adds a new item to the buyr list.
     * @see #getBuyr()
     * 
     */
    public LoanContract3 addBuyr(TradeParty5 buyr) {
        getBuyr().add(buyr);
        return this;
    }

    /**
     * Adds a new item to the sellr list.
     * @see #getSellr()
     * 
     */
    public LoanContract3 addSellr(TradeParty5 sellr) {
        getSellr().add(sellr);
        return this;
    }

    /**
     * Adds a new item to the trch list.
     * @see #getTrch()
     * 
     */
    public LoanContract3 addTrch(LoanContractTranche1 trch) {
        getTrch().add(trch);
        return this;
    }

    /**
     * Adds a new item to the pmtSchdl list.
     * @see #getPmtSchdl()
     * 
     */
    public LoanContract3 addPmtSchdl(PaymentSchedule1 pmtSchdl) {
        getPmtSchdl().add(pmtSchdl);
        return this;
    }

    /**
     * Adds a new item to the intrstSchdl list.
     * @see #getIntrstSchdl()
     * 
     */
    public LoanContract3 addIntrstSchdl(InterestPaymentSchedule1 intrstSchdl) {
        getIntrstSchdl().add(intrstSchdl);
        return this;
    }

    /**
     * Adds a new item to the sndctdLn list.
     * @see #getSndctdLn()
     * 
     */
    public LoanContract3 addSndctdLn(SyndicatedLoan2 sndctdLn) {
        getSndctdLn().add(sndctdLn);
        return this;
    }

    /**
     * Adds a new item to the attchmnt list.
     * @see #getAttchmnt()
     * 
     */
    public LoanContract3 addAttchmnt(DocumentGeneralInformation5 attchmnt) {
        getAttchmnt().add(attchmnt);
        return this;
    }

}
