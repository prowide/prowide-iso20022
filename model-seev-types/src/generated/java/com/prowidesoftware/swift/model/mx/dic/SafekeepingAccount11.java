
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Detailed information about the safekeeping account, its holdings and the sublevel accounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingAccount11", propOrder = {
    "sfkpgAcct",
    "acctSvcr",
    "shrhldgBalOnOwnAcct",
    "shrhldgBalOnClntAcct",
    "ttlShrhldgBal",
    "acctSubLvl"
})
public class SafekeepingAccount11 {

    @XmlElement(name = "SfkpgAcct", required = true)
    protected String sfkpgAcct;
    @XmlElement(name = "AcctSvcr", required = true)
    protected PartyIdentification195Choice acctSvcr;
    @XmlElement(name = "ShrhldgBalOnOwnAcct", required = true)
    protected FinancialInstrumentQuantity18Choice shrhldgBalOnOwnAcct;
    @XmlElement(name = "ShrhldgBalOnClntAcct", required = true)
    protected FinancialInstrumentQuantity18Choice shrhldgBalOnClntAcct;
    @XmlElement(name = "TtlShrhldgBal", required = true)
    protected FinancialInstrumentQuantity18Choice ttlShrhldgBal;
    @XmlElement(name = "AcctSubLvl")
    protected AccountSubLevel22 acctSubLvl;

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SafekeepingAccount11 setSfkpgAcct(String value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification195Choice }
     *     
     */
    public PartyIdentification195Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification195Choice }
     *     
     */
    public SafekeepingAccount11 setAcctSvcr(PartyIdentification195Choice value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the shrhldgBalOnOwnAcct property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getShrhldgBalOnOwnAcct() {
        return shrhldgBalOnOwnAcct;
    }

    /**
     * Sets the value of the shrhldgBalOnOwnAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public SafekeepingAccount11 setShrhldgBalOnOwnAcct(FinancialInstrumentQuantity18Choice value) {
        this.shrhldgBalOnOwnAcct = value;
        return this;
    }

    /**
     * Gets the value of the shrhldgBalOnClntAcct property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getShrhldgBalOnClntAcct() {
        return shrhldgBalOnClntAcct;
    }

    /**
     * Sets the value of the shrhldgBalOnClntAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public SafekeepingAccount11 setShrhldgBalOnClntAcct(FinancialInstrumentQuantity18Choice value) {
        this.shrhldgBalOnClntAcct = value;
        return this;
    }

    /**
     * Gets the value of the ttlShrhldgBal property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getTtlShrhldgBal() {
        return ttlShrhldgBal;
    }

    /**
     * Sets the value of the ttlShrhldgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public SafekeepingAccount11 setTtlShrhldgBal(FinancialInstrumentQuantity18Choice value) {
        this.ttlShrhldgBal = value;
        return this;
    }

    /**
     * Gets the value of the acctSubLvl property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSubLevel22 }
     *     
     */
    public AccountSubLevel22 getAcctSubLvl() {
        return acctSubLvl;
    }

    /**
     * Sets the value of the acctSubLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSubLevel22 }
     *     
     */
    public SafekeepingAccount11 setAcctSubLvl(AccountSubLevel22 value) {
        this.acctSubLvl = value;
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
