
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the loan data details in case of a repurchase trade transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanData94", propOrder = {
    "unqTradIdr",
    "evtDt",
    "exctnDtTm",
    "clrSts",
    "tradgVn",
    "mstrAgrmt",
    "valDt",
    "minNtcePrd",
    "earlstCallBckDt",
    "gnlColl",
    "dlvryByVal",
    "collDlvryMtd",
    "term",
    "intrstRate",
    "prncplAmt",
    "termntnDt"
})
public class LoanData94 {

    @XmlElement(name = "UnqTradIdr", required = true)
    protected String unqTradIdr;
    @XmlElement(name = "EvtDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evtDt;
    @XmlElement(name = "ExctnDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exctnDtTm;
    @XmlElement(name = "ClrSts")
    protected Cleared10Choice clrSts;
    @XmlElement(name = "TradgVn")
    protected String tradgVn;
    @XmlElement(name = "MstrAgrmt")
    protected MasterAgreement6 mstrAgrmt;
    @XmlElement(name = "ValDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "MinNtcePrd")
    protected BigDecimal minNtcePrd;
    @XmlElement(name = "EarlstCallBckDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earlstCallBckDt;
    @XmlElement(name = "GnlColl")
    @XmlSchemaType(name = "string")
    protected SpecialCollateral1Code gnlColl;
    @XmlElement(name = "DlvryByVal")
    protected Boolean dlvryByVal;
    @XmlElement(name = "CollDlvryMtd")
    @XmlSchemaType(name = "string")
    protected CollateralDeliveryMethod1Code collDlvryMtd;
    @XmlElement(name = "Term")
    protected List<ContractTerm3Choice> term;
    @XmlElement(name = "IntrstRate")
    protected InterestRate20Choice intrstRate;
    @XmlElement(name = "PrncplAmt")
    protected PrincipalAmount2 prncplAmt;
    @XmlElement(name = "TermntnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termntnDt;

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
    public LoanData94 setUnqTradIdr(String value) {
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
    public XMLGregorianCalendar getEvtDt() {
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
    public LoanData94 setEvtDt(XMLGregorianCalendar value) {
        this.evtDt = value;
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
    public XMLGregorianCalendar getExctnDtTm() {
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
    public LoanData94 setExctnDtTm(XMLGregorianCalendar value) {
        this.exctnDtTm = value;
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
    public LoanData94 setClrSts(Cleared10Choice value) {
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
    public LoanData94 setTradgVn(String value) {
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
    public LoanData94 setMstrAgrmt(MasterAgreement6 value) {
        this.mstrAgrmt = value;
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
    public XMLGregorianCalendar getValDt() {
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
    public LoanData94 setValDt(XMLGregorianCalendar value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the minNtcePrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinNtcePrd() {
        return minNtcePrd;
    }

    /**
     * Sets the value of the minNtcePrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LoanData94 setMinNtcePrd(BigDecimal value) {
        this.minNtcePrd = value;
        return this;
    }

    /**
     * Gets the value of the earlstCallBckDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getEarlstCallBckDt() {
        return earlstCallBckDt;
    }

    /**
     * Sets the value of the earlstCallBckDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanData94 setEarlstCallBckDt(XMLGregorianCalendar value) {
        this.earlstCallBckDt = value;
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
    public LoanData94 setGnlColl(SpecialCollateral1Code value) {
        this.gnlColl = value;
        return this;
    }

    /**
     * Gets the value of the dlvryByVal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDlvryByVal() {
        return dlvryByVal;
    }

    /**
     * Sets the value of the dlvryByVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LoanData94 setDlvryByVal(Boolean value) {
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
    public LoanData94 setCollDlvryMtd(CollateralDeliveryMethod1Code value) {
        this.collDlvryMtd = value;
        return this;
    }

    /**
     * Gets the value of the term property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the term property.
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
     */
    public List<ContractTerm3Choice> getTerm() {
        if (term == null) {
            term = new ArrayList<ContractTerm3Choice>();
        }
        return this.term;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate20Choice }
     *     
     */
    public InterestRate20Choice getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate20Choice }
     *     
     */
    public LoanData94 setIntrstRate(InterestRate20Choice value) {
        this.intrstRate = value;
        return this;
    }

    /**
     * Gets the value of the prncplAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalAmount2 }
     *     
     */
    public PrincipalAmount2 getPrncplAmt() {
        return prncplAmt;
    }

    /**
     * Sets the value of the prncplAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalAmount2 }
     *     
     */
    public LoanData94 setPrncplAmt(PrincipalAmount2 value) {
        this.prncplAmt = value;
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
    public XMLGregorianCalendar getTermntnDt() {
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
    public LoanData94 setTermntnDt(XMLGregorianCalendar value) {
        this.termntnDt = value;
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
    public LoanData94 addTerm(ContractTerm3Choice term) {
        getTerm().add(term);
        return this;
    }

}
