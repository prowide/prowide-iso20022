
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
 * Provides a detailed breakdown of the charges per type of charges.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesPerType6", propOrder = {
    "chrgsId",
    "ttlChrgsPerChrgTp",
    "chrgsAcctAgt",
    "chrgsAcctAgtAcct",
    "tp",
    "rcrd",
    "addtlInf"
})
public class ChargesPerType6 {

    @XmlElement(name = "ChrgsId")
    protected String chrgsId;
    @XmlElement(name = "TtlChrgsPerChrgTp")
    protected TotalCharges7 ttlChrgsPerChrgTp;
    @XmlElement(name = "ChrgsAcctAgt")
    protected BranchAndFinancialInstitutionIdentification8 chrgsAcctAgt;
    @XmlElement(name = "ChrgsAcctAgtAcct")
    protected CashAccount40 chrgsAcctAgtAcct;
    @XmlElement(name = "Tp", required = true)
    protected ChargeType3Choice tp;
    @XmlElement(name = "Rcrd", required = true)
    protected List<ChargesPerTypeRecord6> rcrd;
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
    public ChargesPerType6 setChrgsId(String value) {
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
    public ChargesPerType6 setTtlChrgsPerChrgTp(TotalCharges7 value) {
        this.ttlChrgsPerChrgTp = value;
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
    public ChargesPerType6 setChrgsAcctAgt(BranchAndFinancialInstitutionIdentification8 value) {
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
    public ChargesPerType6 setChrgsAcctAgtAcct(CashAccount40 value) {
        this.chrgsAcctAgtAcct = value;
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
    public ChargesPerType6 setTp(ChargeType3Choice value) {
        this.tp = value;
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
     * {@link ChargesPerTypeRecord6 }
     * 
     * 
     * @return
     *     The value of the rcrd property.
     */
    public List<ChargesPerTypeRecord6> getRcrd() {
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
    public ChargesPerType6 setAddtlInf(String value) {
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
    public ChargesPerType6 addRcrd(ChargesPerTypeRecord6 rcrd) {
        getRcrd().add(rcrd);
        return this;
    }

}
