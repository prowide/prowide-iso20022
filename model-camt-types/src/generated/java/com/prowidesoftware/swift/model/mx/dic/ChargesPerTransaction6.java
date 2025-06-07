
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information on the charges related to the payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesPerTransaction6", propOrder = {
    "chrgsId",
    "ttlChrgsPerTx",
    "chrgsAcctAgt",
    "chrgsAcctAgtAcct",
    "rcrd",
    "addtlInf"
})
public class ChargesPerTransaction6 {

    @XmlElement(name = "ChrgsId")
    protected String chrgsId;
    @XmlElement(name = "TtlChrgsPerTx")
    protected TotalCharges7 ttlChrgsPerTx;
    @XmlElement(name = "ChrgsAcctAgt")
    protected BranchAndFinancialInstitutionIdentification8 chrgsAcctAgt;
    @XmlElement(name = "ChrgsAcctAgtAcct")
    protected CashAccount40 chrgsAcctAgtAcct;
    @XmlElement(name = "Rcrd", required = true)
    protected List<ChargesPerTransactionRecord6> rcrd;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the chrgsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrgsId() {
        return chrgsId;
    }

    /**
     * Sets the value of the chrgsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ChargesPerTransaction6 setChrgsId(String value) {
        this.chrgsId = value;
        return this;
    }

    /**
     * Gets the value of the ttlChrgsPerTx property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCharges7 }
     *     
     */
    public TotalCharges7 getTtlChrgsPerTx() {
        return ttlChrgsPerTx;
    }

    /**
     * Sets the value of the ttlChrgsPerTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCharges7 }
     *     
     */
    public ChargesPerTransaction6 setTtlChrgsPerTx(TotalCharges7 value) {
        this.ttlChrgsPerTx = value;
        return this;
    }

    /**
     * Gets the value of the chrgsAcctAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getChrgsAcctAgt() {
        return chrgsAcctAgt;
    }

    /**
     * Sets the value of the chrgsAcctAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public ChargesPerTransaction6 setChrgsAcctAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.chrgsAcctAgt = value;
        return this;
    }

    /**
     * Gets the value of the chrgsAcctAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getChrgsAcctAgtAcct() {
        return chrgsAcctAgtAcct;
    }

    /**
     * Sets the value of the chrgsAcctAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public ChargesPerTransaction6 setChrgsAcctAgtAcct(CashAccount40 value) {
        this.chrgsAcctAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the rcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesPerTransactionRecord6 }
     * 
     * 
     */
    public List<ChargesPerTransactionRecord6> getRcrd() {
        if (rcrd == null) {
            rcrd = new ArrayList<ChargesPerTransactionRecord6>();
        }
        return this.rcrd;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ChargesPerTransaction6 setAddtlInf(String value) {
        this.addtlInf = value;
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
     * Adds a new item to the rcrd list.
     * @see #getRcrd()
     * 
     */
    public ChargesPerTransaction6 addRcrd(ChargesPerTransactionRecord6 rcrd) {
        getRcrd().add(rcrd);
        return this;
    }

}
