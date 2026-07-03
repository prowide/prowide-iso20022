
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
 * Provides a detailed breakdown of the charges per type of charges.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesPerType5", propOrder = {
    "chrgsId",
    "ttlChrgsPerChrgTp",
    "chrgsAcct",
    "chrgsAcctOwnr",
    "tp",
    "rcrd",
    "addtlInf"
})
public class ChargesPerType5 {

    @XmlElement(name = "ChrgsId")
    protected String chrgsId;
    @XmlElement(name = "TtlChrgsPerChrgTp")
    protected TotalCharges7 ttlChrgsPerChrgTp;
    @XmlElement(name = "ChrgsAcct")
    protected CashAccount40 chrgsAcct;
    @XmlElement(name = "ChrgsAcctOwnr")
    protected BranchAndFinancialInstitutionIdentification8 chrgsAcctOwnr;
    @XmlElement(name = "Tp", required = true)
    protected ChargeType3Choice tp;
    @XmlElement(name = "Rcrd", required = true)
    protected List<ChargesPerTypeRecord5> rcrd;
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
    public ChargesPerType5 setChrgsId(String value) {
        this.chrgsId = value;
        return this;
    }

    /**
     * Gets the value of the ttlChrgsPerChrgTp property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCharges7 }
     *     
     */
    public TotalCharges7 getTtlChrgsPerChrgTp() {
        return ttlChrgsPerChrgTp;
    }

    /**
     * Sets the value of the ttlChrgsPerChrgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCharges7 }
     *     
     */
    public ChargesPerType5 setTtlChrgsPerChrgTp(TotalCharges7 value) {
        this.ttlChrgsPerChrgTp = value;
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
    public ChargesPerType5 setChrgsAcct(CashAccount40 value) {
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
    public ChargesPerType5 setChrgsAcctOwnr(BranchAndFinancialInstitutionIdentification8 value) {
        this.chrgsAcctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType3Choice }
     *     
     */
    public ChargeType3Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType3Choice }
     *     
     */
    public ChargesPerType5 setTp(ChargeType3Choice value) {
        this.tp = value;
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
     * {@link ChargesPerTypeRecord5 }
     * 
     * 
     */
    public List<ChargesPerTypeRecord5> getRcrd() {
        if (rcrd == null) {
            rcrd = new ArrayList<ChargesPerTypeRecord5>();
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
    public ChargesPerType5 setAddtlInf(String value) {
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
    public ChargesPerType5 addRcrd(ChargesPerTypeRecord5 rcrd) {
        getRcrd().add(rcrd);
        return this;
    }

}
