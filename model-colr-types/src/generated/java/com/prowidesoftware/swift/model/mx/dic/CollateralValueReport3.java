
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
 * Reports either on the collateral value report or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValueReport3", propOrder = {
    "cshAcct",
    "cshAcctOwnr",
    "cshAcctSvcr",
    "sctiesAcctOwnr",
    "sctiesAcctSvcr",
    "collValRpt"
})
public class CollateralValueReport3 {

    @XmlElement(name = "CshAcct", required = true)
    protected CashAccount38 cshAcct;
    @XmlElement(name = "CshAcctOwnr")
    protected SystemPartyIdentification11 cshAcctOwnr;
    @XmlElement(name = "CshAcctSvcr")
    protected BranchAndFinancialInstitutionIdentification6 cshAcctSvcr;
    @XmlElement(name = "SctiesAcctOwnr")
    protected SystemPartyIdentification8 sctiesAcctOwnr;
    @XmlElement(name = "SctiesAcctSvcr")
    protected PartyIdentification136 sctiesAcctSvcr;
    @XmlElement(name = "CollValRpt")
    protected List<CollateralValueReportOrError6Choice> collValRpt;

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public CollateralValueReport3 setCshAcct(CashAccount38 value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification11 }
     *     
     */
    public SystemPartyIdentification11 getCshAcctOwnr() {
        return cshAcctOwnr;
    }

    /**
     * Sets the value of the cshAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification11 }
     *     
     */
    public CollateralValueReport3 setCshAcctOwnr(SystemPartyIdentification11 value) {
        this.cshAcctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCshAcctSvcr() {
        return cshAcctSvcr;
    }

    /**
     * Sets the value of the cshAcctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public CollateralValueReport3 setCshAcctSvcr(BranchAndFinancialInstitutionIdentification6 value) {
        this.cshAcctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the sctiesAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getSctiesAcctOwnr() {
        return sctiesAcctOwnr;
    }

    /**
     * Sets the value of the sctiesAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public CollateralValueReport3 setSctiesAcctOwnr(SystemPartyIdentification8 value) {
        this.sctiesAcctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sctiesAcctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getSctiesAcctSvcr() {
        return sctiesAcctSvcr;
    }

    /**
     * Sets the value of the sctiesAcctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public CollateralValueReport3 setSctiesAcctSvcr(PartyIdentification136 value) {
        this.sctiesAcctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the collValRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collValRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollValRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralValueReportOrError6Choice }
     * 
     * 
     */
    public List<CollateralValueReportOrError6Choice> getCollValRpt() {
        if (collValRpt == null) {
            collValRpt = new ArrayList<CollateralValueReportOrError6Choice>();
        }
        return this.collValRpt;
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
     * Adds a new item to the collValRpt list.
     * @see #getCollValRpt()
     * 
     */
    public CollateralValueReport3 addCollValRpt(CollateralValueReportOrError6Choice collValRpt) {
        getCollValRpt().add(collValRpt);
        return this;
    }

}
