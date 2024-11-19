
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
 * Defines the criteria used to search for an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValueSearchCriteria4", propOrder = {
    "cshAcctId",
    "ccy",
    "cshAcctOwnr",
    "cshAcctSvcr",
    "finInstrmId",
    "sctiesAcctOwnr",
    "sctiesAcctSvcr"
})
public class CollateralValueSearchCriteria4 {

    @XmlElement(name = "CshAcctId")
    protected AccountIdentification4Choice cshAcctId;
    @XmlElement(name = "Ccy")
    protected List<String> ccy;
    @XmlElement(name = "CshAcctOwnr")
    protected SystemPartyIdentification8 cshAcctOwnr;
    @XmlElement(name = "CshAcctSvcr")
    protected BranchAndFinancialInstitutionIdentification8 cshAcctSvcr;
    @XmlElement(name = "FinInstrmId")
    protected List<SecurityIdentification19> finInstrmId;
    @XmlElement(name = "SctiesAcctOwnr")
    protected SystemPartyIdentification8 sctiesAcctOwnr;
    @XmlElement(name = "SctiesAcctSvcr")
    protected PartyIdentification136 sctiesAcctSvcr;

    /**
     * Gets the value of the cshAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getCshAcctId() {
        return cshAcctId;
    }

    /**
     * Sets the value of the cshAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public CollateralValueSearchCriteria4 setCshAcctId(AccountIdentification4Choice value) {
        this.cshAcctId = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ccy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the ccy property.
     */
    public List<String> getCcy() {
        if (ccy == null) {
            ccy = new ArrayList<>();
        }
        return this.ccy;
    }

    /**
     * Gets the value of the cshAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getCshAcctOwnr() {
        return cshAcctOwnr;
    }

    /**
     * Sets the value of the cshAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public CollateralValueSearchCriteria4 setCshAcctOwnr(SystemPartyIdentification8 value) {
        this.cshAcctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getCshAcctSvcr() {
        return cshAcctSvcr;
    }

    /**
     * Sets the value of the cshAcctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public CollateralValueSearchCriteria4 setCshAcctSvcr(BranchAndFinancialInstitutionIdentification8 value) {
        this.cshAcctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification19 }
     * 
     * 
     * @return
     *     The value of the finInstrmId property.
     */
    public List<SecurityIdentification19> getFinInstrmId() {
        if (finInstrmId == null) {
            finInstrmId = new ArrayList<>();
        }
        return this.finInstrmId;
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
    public CollateralValueSearchCriteria4 setSctiesAcctOwnr(SystemPartyIdentification8 value) {
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
    public CollateralValueSearchCriteria4 setSctiesAcctSvcr(PartyIdentification136 value) {
        this.sctiesAcctSvcr = value;
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
     * Adds a new item to the ccy list.
     * @see #getCcy()
     * 
     */
    public CollateralValueSearchCriteria4 addCcy(String ccy) {
        getCcy().add(ccy);
        return this;
    }

    /**
     * Adds a new item to the finInstrmId list.
     * @see #getFinInstrmId()
     * 
     */
    public CollateralValueSearchCriteria4 addFinInstrmId(SecurityIdentification19 finInstrmId) {
        getFinInstrmId().add(finInstrmId);
        return this;
    }

}
