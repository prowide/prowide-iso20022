
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "ChargesPerTransaction5", propOrder = {
    "chrgsId",
    "ttlChrgsPerTx",
    "chrgsAcct",
    "chrgsAcctOwnr",
    "rcrd",
    "addtlInf"
})
public class ChargesPerTransaction5 {

    @XmlElement(name = "ChrgsId")
    protected String chrgsId;
    @XmlElement(name = "TtlChrgsPerTx")
    protected TotalCharges7 ttlChrgsPerTx;
    @XmlElement(name = "ChrgsAcct")
    protected CashAccount40 chrgsAcct;
    @XmlElement(name = "ChrgsAcctOwnr")
    protected BranchAndFinancialInstitutionIdentification8 chrgsAcctOwnr;
    @XmlElement(name = "Rcrd", required = true)
    protected List<ChargesPerTransactionRecord5> rcrd;
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
    public ChargesPerTransaction5 setChrgsId(String value) {
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
    public ChargesPerTransaction5 setTtlChrgsPerTx(TotalCharges7 value) {
        this.ttlChrgsPerTx = value;
        return this;
    }

    /**
     * Gets the value of the chrgsAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getChrgsAcct() {
        return chrgsAcct;
    }

    /**
     * Sets the value of the chrgsAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public ChargesPerTransaction5 setChrgsAcct(CashAccount40 value) {
        this.chrgsAcct = value;
        return this;
    }

    /**
     * Gets the value of the chrgsAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getChrgsAcctOwnr() {
        return chrgsAcctOwnr;
    }

    /**
     * Sets the value of the chrgsAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public ChargesPerTransaction5 setChrgsAcctOwnr(BranchAndFinancialInstitutionIdentification8 value) {
        this.chrgsAcctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the rcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcrd property.
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
     * {@link ChargesPerTransactionRecord5 }
     * 
     * 
     * @return
     *     The value of the rcrd property.
     */
    public List<ChargesPerTransactionRecord5> getRcrd() {
        if (rcrd == null) {
            rcrd = new ArrayList<>();
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
    public ChargesPerTransaction5 setAddtlInf(String value) {
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
    public ChargesPerTransaction5 addRcrd(ChargesPerTransactionRecord5 rcrd) {
        getRcrd().add(rcrd);
        return this;
    }

}
