
package com.prowidesoftware.swift.model.mx.dic;

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
 * Specifies the loan data details in case of a repurchase trade transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanData37", propOrder = {
    "dlvryByVal",
    "collDlvryMtd",
    "term",
    "intrstRate",
    "prncplAmt"
})
public class LoanData37 {

    @XmlElement(name = "DlvryByVal")
    protected boolean dlvryByVal;
    @XmlElement(name = "CollDlvryMtd", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralDeliveryMethod1Code collDlvryMtd;
    @XmlElement(name = "Term")
    protected List<ContractTerm2Choice> term;
    @XmlElement(name = "IntrstRate", required = true)
    protected InterestRate14Choice intrstRate;
    @XmlElement(name = "PrncplAmt", required = true)
    protected PrincipalAmount1 prncplAmt;

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
    public LoanData37 setDlvryByVal(boolean value) {
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
    public LoanData37 setCollDlvryMtd(CollateralDeliveryMethod1Code value) {
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
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate14Choice }
     *     
     */
    public InterestRate14Choice getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate14Choice }
     *     
     */
    public LoanData37 setIntrstRate(InterestRate14Choice value) {
        this.intrstRate = value;
        return this;
    }

    /**
     * Gets the value of the prncplAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalAmount1 }
     *     
     */
    public PrincipalAmount1 getPrncplAmt() {
        return prncplAmt;
    }

    /**
     * Sets the value of the prncplAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalAmount1 }
     *     
     */
    public LoanData37 setPrncplAmt(PrincipalAmount1 value) {
        this.prncplAmt = value;
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
    public LoanData37 addTerm(ContractTerm2Choice term) {
        getTerm().add(term);
        return this;
    }

}
