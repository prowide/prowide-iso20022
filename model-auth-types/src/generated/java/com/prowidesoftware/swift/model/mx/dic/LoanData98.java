
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Specifies the loan data details in case of a securities lending transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanData98", propOrder = {
    "dlvryByVal",
    "collDlvryMtd",
    "term",
    "asstTp",
    "rbtRate",
    "lnVal",
    "lndgFee",
    "unqTradIdr",
    "evtDt",
    "clrSts",
    "tradgVn",
    "mstrAgrmt",
    "exctnDtTm",
    "valDt",
    "termntnDt",
    "gnlColl"
})
public class LoanData98 {

    @XmlElement(name = "DlvryByVal")
    protected boolean dlvryByVal;
    @XmlElement(name = "CollDlvryMtd")
    @XmlSchemaType(name = "string")
    protected CollateralDeliveryMethod1Code collDlvryMtd;
    @XmlElement(name = "Term")
    protected List<ContractTerm3Choice> term;
    @XmlElement(name = "AsstTp", required = true)
    protected SecurityCommodity8 asstTp;
    @XmlElement(name = "RbtRate", required = true)
    protected InterestRate20Choice rbtRate;
    @XmlElement(name = "LnVal", required = true)
    protected ActiveOrHistoricCurrencyAndAmount lnVal;
    @XmlElement(name = "LndgFee")
    protected BigDecimal lndgFee;
    @XmlElement(name = "UnqTradIdr", required = true)
    protected String unqTradIdr;
    @XmlElement(name = "EvtDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate evtDt;
    @XmlElement(name = "ClrSts", required = true)
    protected Cleared10Choice clrSts;
    @XmlElement(name = "TradgVn", required = true)
    protected String tradgVn;
    @XmlElement(name = "MstrAgrmt")
    protected MasterAgreement6 mstrAgrmt;
    @XmlElement(name = "ExctnDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime exctnDtTm;
    @XmlElement(name = "ValDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate valDt;
    @XmlElement(name = "TermntnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate termntnDt;
    @XmlElement(name = "GnlColl")
    @XmlSchemaType(name = "string")
    protected SpecialCollateral1Code gnlColl;

    /**
     * Gets the value of the dlvryByVal property.
     * 
     */
    public boolean isDlvryByVal() {
        return dlvryByVal;
    }

    /**
     * Sets the value of the dlvryByVal property.
     * 
     */
    public LoanData98 setDlvryByVal(boolean value) {
        this.dlvryByVal = value;
        return this;
    }

    /**
     * Gets the value of the collDlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralDeliveryMethod1Code }
     *     
     */
    public CollateralDeliveryMethod1Code getCollDlvryMtd() {
        return collDlvryMtd;
    }

    /**
     * Sets the value of the collDlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralDeliveryMethod1Code }
     *     
     */
    public LoanData98 setCollDlvryMtd(CollateralDeliveryMethod1Code value) {
        this.collDlvryMtd = value;
        return this;
    }

    /**
     * Gets the value of the term property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the term property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractTerm3Choice }
     * 
     * 
     * @return
     *     The value of the term property.
     */
    public List<ContractTerm3Choice> getTerm() {
        if (term == null) {
            term = new ArrayList<>();
        }
        return this.term;
    }

    /**
     * Gets the value of the asstTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCommodity8 }
     *     
     */
    public SecurityCommodity8 getAsstTp() {
        return asstTp;
    }

    /**
     * Sets the value of the asstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCommodity8 }
     *     
     */
    public LoanData98 setAsstTp(SecurityCommodity8 value) {
        this.asstTp = value;
        return this;
    }

    /**
     * Gets the value of the rbtRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate20Choice }
     *     
     */
    public InterestRate20Choice getRbtRate() {
        return rbtRate;
    }

    /**
     * Sets the value of the rbtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate20Choice }
     *     
     */
    public LoanData98 setRbtRate(InterestRate20Choice value) {
        this.rbtRate = value;
        return this;
    }

    /**
     * Gets the value of the lnVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getLnVal() {
        return lnVal;
    }

    /**
     * Sets the value of the lnVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public LoanData98 setLnVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.lnVal = value;
        return this;
    }

    /**
     * Gets the value of the lndgFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLndgFee() {
        return lndgFee;
    }

    /**
     * Sets the value of the lndgFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LoanData98 setLndgFee(BigDecimal value) {
        this.lndgFee = value;
        return this;
    }

    /**
     * Gets the value of the unqTradIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqTradIdr() {
        return unqTradIdr;
    }

    /**
     * Sets the value of the unqTradIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanData98 setUnqTradIdr(String value) {
        this.unqTradIdr = value;
        return this;
    }

    /**
     * Gets the value of the evtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEvtDt() {
        return evtDt;
    }

    /**
     * Sets the value of the evtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanData98 setEvtDt(LocalDate value) {
        this.evtDt = value;
        return this;
    }

    /**
     * Gets the value of the clrSts property.
     * 
     * @return
     *     possible object is
     *     {@link Cleared10Choice }
     *     
     */
    public Cleared10Choice getClrSts() {
        return clrSts;
    }

    /**
     * Sets the value of the clrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cleared10Choice }
     *     
     */
    public LoanData98 setClrSts(Cleared10Choice value) {
        this.clrSts = value;
        return this;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanData98 setTradgVn(String value) {
        this.tradgVn = value;
        return this;
    }

    /**
     * Gets the value of the mstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement6 }
     *     
     */
    public MasterAgreement6 getMstrAgrmt() {
        return mstrAgrmt;
    }

    /**
     * Sets the value of the mstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement6 }
     *     
     */
    public LoanData98 setMstrAgrmt(MasterAgreement6 value) {
        this.mstrAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the exctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getExctnDtTm() {
        return exctnDtTm;
    }

    /**
     * Sets the value of the exctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanData98 setExctnDtTm(OffsetDateTime value) {
        this.exctnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanData98 setValDt(LocalDate value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanData98 setTermntnDt(LocalDate value) {
        this.termntnDt = value;
        return this;
    }

    /**
     * Gets the value of the gnlColl property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialCollateral1Code }
     *     
     */
    public SpecialCollateral1Code getGnlColl() {
        return gnlColl;
    }

    /**
     * Sets the value of the gnlColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialCollateral1Code }
     *     
     */
    public LoanData98 setGnlColl(SpecialCollateral1Code value) {
        this.gnlColl = value;
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
     * Adds a new item to the term list.
     * @see #getTerm()
     * 
     */
    public LoanData98 addTerm(ContractTerm3Choice term) {
        getTerm().add(term);
        return this;
    }

}
