
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
 * Specifies the loan data details in case of a securities lending transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanData41", propOrder = {
    "dlvryByVal",
    "collDlvryMtd",
    "term",
    "asstTp",
    "rbtRate",
    "lnVal",
    "lndgFee",
    "exclsvArrgmnt"
})
public class LoanData41 {

    @XmlElement(name = "DlvryByVal")
    protected boolean dlvryByVal;
    @XmlElement(name = "CollDlvryMtd")
    @XmlSchemaType(name = "string")
    protected CollateralDeliveryMethod1Code collDlvryMtd;
    @XmlElement(name = "Term")
    protected List<ContractTerm2Choice> term;
    @XmlElement(name = "AsstTp", required = true)
    protected SecurityCommodity2Choice asstTp;
    @XmlElement(name = "RbtRate", required = true)
    protected RebateRate1Choice rbtRate;
    @XmlElement(name = "LnVal", required = true)
    protected BigDecimal lnVal;
    @XmlElement(name = "LndgFee", required = true)
    protected BigDecimal lndgFee;
    @XmlElement(name = "ExclsvArrgmnt")
    protected boolean exclsvArrgmnt;

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
    public LoanData41 setDlvryByVal(boolean value) {
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
    public LoanData41 setCollDlvryMtd(CollateralDeliveryMethod1Code value) {
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
    public LoanData41 setAsstTp(SecurityCommodity2Choice value) {
        this.asstTp = value;
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
    public LoanData41 setRbtRate(RebateRate1Choice value) {
        this.rbtRate = value;
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
    public LoanData41 setLnVal(BigDecimal value) {
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
    public LoanData41 setLndgFee(BigDecimal value) {
        this.lndgFee = value;
        return this;
    }

    /**
     * Gets the value of the exclsvArrgmnt property.
     * 
     */
    public boolean isExclsvArrgmnt() {
        return exclsvArrgmnt;
    }

    /**
     * Sets the value of the exclsvArrgmnt property.
     * 
     */
    public LoanData41 setExclsvArrgmnt(boolean value) {
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
    public LoanData41 addTerm(ContractTerm2Choice term) {
        getTerm().add(term);
        return this;
    }

}
