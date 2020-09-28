
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
@XmlType(name = "LoanData39", propOrder = {
    "clrSts",
    "tradgVn",
    "mstrAgrmt",
    "valDt",
    "gnlColl",
    "dlvryByVal",
    "collDlvryMtd",
    "term",
    "asstTp",
    "lnVal",
    "rbtRate",
    "lndgFee",
    "exclsvArrgmnt"
})
public class LoanData39 {

    @XmlElement(name = "ClrSts")
    protected Cleared2Choice clrSts;
    @XmlElement(name = "TradgVn")
    protected String tradgVn;
    @XmlElement(name = "MstrAgrmt")
    protected MasterAgreement1 mstrAgrmt;
    @XmlElement(name = "ValDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "GnlColl")
    @XmlSchemaType(name = "string")
    protected SpecialCollateral1Code gnlColl;
    @XmlElement(name = "DlvryByVal")
    protected Boolean dlvryByVal;
    @XmlElement(name = "CollDlvryMtd")
    @XmlSchemaType(name = "string")
    protected CollateralDeliveryMethod1Code collDlvryMtd;
    @XmlElement(name = "Term")
    protected List<ContractTerm2Choice> term;
    @XmlElement(name = "AsstTp")
    protected SecurityCommodity2Choice asstTp;
    @XmlElement(name = "LnVal")
    protected BigDecimal lnVal;
    @XmlElement(name = "RbtRate")
    protected RebateRate1Choice rbtRate;
    @XmlElement(name = "LndgFee")
    protected BigDecimal lndgFee;
    @XmlElement(name = "ExclsvArrgmnt")
    protected Boolean exclsvArrgmnt;

    /**
     * Gets the value of the clrSts property.
     * 
     * @return
     *     possible object is
     *     {@link Cleared2Choice }
     *     
     */
    public Cleared2Choice getClrSts() {
        return clrSts;
    }

    /**
     * Sets the value of the clrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cleared2Choice }
     *     
     */
    public LoanData39 setClrSts(Cleared2Choice value) {
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
    public LoanData39 setTradgVn(String value) {
        this.tradgVn = value;
        return this;
    }

    /**
     * Gets the value of the mstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement1 }
     *     
     */
    public MasterAgreement1 getMstrAgrmt() {
        return mstrAgrmt;
    }

    /**
     * Sets the value of the mstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement1 }
     *     
     */
    public LoanData39 setMstrAgrmt(MasterAgreement1 value) {
        this.mstrAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public LoanData39 setValDt(XMLGregorianCalendar value) {
        this.valDt = value;
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
    public LoanData39 setGnlColl(SpecialCollateral1Code value) {
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
    public LoanData39 setDlvryByVal(Boolean value) {
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
    public LoanData39 setCollDlvryMtd(CollateralDeliveryMethod1Code value) {
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
     * {@link ContractTerm2Choice }
     * 
     * 
     */
    public List<ContractTerm2Choice> getTerm() {
        if (term == null) {
            term = new ArrayList<ContractTerm2Choice>();
        }
        return this.term;
    }

    /**
     * Gets the value of the asstTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCommodity2Choice }
     *     
     */
    public SecurityCommodity2Choice getAsstTp() {
        return asstTp;
    }

    /**
     * Sets the value of the asstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCommodity2Choice }
     *     
     */
    public LoanData39 setAsstTp(SecurityCommodity2Choice value) {
        this.asstTp = value;
        return this;
    }

    /**
     * Gets the value of the lnVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLnVal() {
        return lnVal;
    }

    /**
     * Sets the value of the lnVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LoanData39 setLnVal(BigDecimal value) {
        this.lnVal = value;
        return this;
    }

    /**
     * Gets the value of the rbtRate property.
     * 
     * @return
     *     possible object is
     *     {@link RebateRate1Choice }
     *     
     */
    public RebateRate1Choice getRbtRate() {
        return rbtRate;
    }

    /**
     * Sets the value of the rbtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RebateRate1Choice }
     *     
     */
    public LoanData39 setRbtRate(RebateRate1Choice value) {
        this.rbtRate = value;
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
    public LoanData39 setLndgFee(BigDecimal value) {
        this.lndgFee = value;
        return this;
    }

    /**
     * Gets the value of the exclsvArrgmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclsvArrgmnt() {
        return exclsvArrgmnt;
    }

    /**
     * Sets the value of the exclsvArrgmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LoanData39 setExclsvArrgmnt(Boolean value) {
        this.exclsvArrgmnt = value;
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
    public LoanData39 addTerm(ContractTerm2Choice term) {
        getTerm().add(term);
        return this;
    }

}
