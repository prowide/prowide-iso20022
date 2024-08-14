
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the details of the collateral used in the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralData33", propOrder = {
    "netXpsrCollstnInd",
    "cmpntTp",
    "cshCollCcy",
    "pricCcy",
    "qlty",
    "mtrty",
    "issrJursdctn",
    "tp",
    "tradRpstry",
    "rcncltnFlg",
    "rinvstdCsh"
})
public class CollateralData33 {

    @XmlElement(name = "NetXpsrCollstnInd")
    protected Boolean netXpsrCollstnInd;
    @XmlElement(name = "CmpntTp")
    @XmlSchemaType(name = "string")
    protected CollateralType6Code cmpntTp;
    @XmlElement(name = "CshCollCcy")
    protected String cshCollCcy;
    @XmlElement(name = "PricCcy")
    protected String pricCcy;
    @XmlElement(name = "Qlty")
    @XmlSchemaType(name = "string")
    protected CollateralQualityType1Code qlty;
    @XmlElement(name = "Mtrty")
    protected ContractTerm6Choice mtrty;
    @XmlElement(name = "IssrJursdctn")
    protected IssuerJurisdiction1Choice issrJursdctn;
    @XmlElement(name = "Tp")
    protected SecuritiesLendingType3Choice tp;
    @XmlElement(name = "TradRpstry")
    protected OrganisationIdentification15Choice tradRpstry;
    @XmlElement(name = "RcncltnFlg")
    protected ReconciliationFlag2 rcncltnFlg;
    @XmlElement(name = "RinvstdCsh")
    protected ReinvestedCashTypeAndAmount2 rinvstdCsh;

    /**
     * Gets the value of the netXpsrCollstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetXpsrCollstnInd() {
        return netXpsrCollstnInd;
    }

    /**
     * Sets the value of the netXpsrCollstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralData33 setNetXpsrCollstnInd(Boolean value) {
        this.netXpsrCollstnInd = value;
        return this;
    }

    /**
     * Gets the value of the cmpntTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralType6Code }
     *     
     */
    public CollateralType6Code getCmpntTp() {
        return cmpntTp;
    }

    /**
     * Sets the value of the cmpntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralType6Code }
     *     
     */
    public CollateralData33 setCmpntTp(CollateralType6Code value) {
        this.cmpntTp = value;
        return this;
    }

    /**
     * Gets the value of the cshCollCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshCollCcy() {
        return cshCollCcy;
    }

    /**
     * Sets the value of the cshCollCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralData33 setCshCollCcy(String value) {
        this.cshCollCcy = value;
        return this;
    }

    /**
     * Gets the value of the pricCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricCcy() {
        return pricCcy;
    }

    /**
     * Sets the value of the pricCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralData33 setPricCcy(String value) {
        this.pricCcy = value;
        return this;
    }

    /**
     * Gets the value of the qlty property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralQualityType1Code }
     *     
     */
    public CollateralQualityType1Code getQlty() {
        return qlty;
    }

    /**
     * Sets the value of the qlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralQualityType1Code }
     *     
     */
    public CollateralData33 setQlty(CollateralQualityType1Code value) {
        this.qlty = value;
        return this;
    }

    /**
     * Gets the value of the mtrty property.
     * 
     * @return
     *     possible object is
     *     {@link ContractTerm6Choice }
     *     
     */
    public ContractTerm6Choice getMtrty() {
        return mtrty;
    }

    /**
     * Sets the value of the mtrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractTerm6Choice }
     *     
     */
    public CollateralData33 setMtrty(ContractTerm6Choice value) {
        this.mtrty = value;
        return this;
    }

    /**
     * Gets the value of the issrJursdctn property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerJurisdiction1Choice }
     *     
     */
    public IssuerJurisdiction1Choice getIssrJursdctn() {
        return issrJursdctn;
    }

    /**
     * Sets the value of the issrJursdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerJurisdiction1Choice }
     *     
     */
    public CollateralData33 setIssrJursdctn(IssuerJurisdiction1Choice value) {
        this.issrJursdctn = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesLendingType3Choice }
     *     
     */
    public SecuritiesLendingType3Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesLendingType3Choice }
     *     
     */
    public CollateralData33 setTp(SecuritiesLendingType3Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the tradRpstry property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getTradRpstry() {
        return tradRpstry;
    }

    /**
     * Sets the value of the tradRpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public CollateralData33 setTradRpstry(OrganisationIdentification15Choice value) {
        this.tradRpstry = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationFlag2 }
     *     
     */
    public ReconciliationFlag2 getRcncltnFlg() {
        return rcncltnFlg;
    }

    /**
     * Sets the value of the rcncltnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationFlag2 }
     *     
     */
    public CollateralData33 setRcncltnFlg(ReconciliationFlag2 value) {
        this.rcncltnFlg = value;
        return this;
    }

    /**
     * Gets the value of the rinvstdCsh property.
     * 
     * @return
     *     possible object is
     *     {@link ReinvestedCashTypeAndAmount2 }
     *     
     */
    public ReinvestedCashTypeAndAmount2 getRinvstdCsh() {
        return rinvstdCsh;
    }

    /**
     * Sets the value of the rinvstdCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReinvestedCashTypeAndAmount2 }
     *     
     */
    public CollateralData33 setRinvstdCsh(ReinvestedCashTypeAndAmount2 value) {
        this.rinvstdCsh = value;
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

}
