
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
 * Defines the securities account position query criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSearchCriteria2", propOrder = {
    "acctOwnr",
    "acctSvcr",
    "sfkpgAcct",
    "finInstrm",
    "ctryOfIsse",
    "subBalTp",
    "rtrZeroPos"
})
public class PositionSearchCriteria2 {

    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification100 acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification100 acctSvcr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount2Choice sfkpgAcct;
    @XmlElement(name = "FinInstrm")
    protected SecurityIdentification19 finInstrm;
    @XmlElement(name = "CtryOfIsse")
    protected String ctryOfIsse;
    @XmlElement(name = "SubBalTp")
    protected SecuritiesBalanceType7Choice subBalTp;
    @XmlElement(name = "RtrZeroPos")
    protected boolean rtrZeroPos;

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PositionSearchCriteria2 setAcctOwnr(PartyIdentification100 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PositionSearchCriteria2 setAcctSvcr(PartyIdentification100 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount2Choice }
     *     
     */
    public SecuritiesAccount2Choice getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount2Choice }
     *     
     */
    public PositionSearchCriteria2 setSfkpgAcct(SecuritiesAccount2Choice value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the finInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrm() {
        return finInstrm;
    }

    /**
     * Sets the value of the finInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public PositionSearchCriteria2 setFinInstrm(SecurityIdentification19 value) {
        this.finInstrm = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfIsse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfIsse() {
        return ctryOfIsse;
    }

    /**
     * Sets the value of the ctryOfIsse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSearchCriteria2 setCtryOfIsse(String value) {
        this.ctryOfIsse = value;
        return this;
    }

    /**
     * Gets the value of the subBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceType7Choice }
     *     
     */
    public SecuritiesBalanceType7Choice getSubBalTp() {
        return subBalTp;
    }

    /**
     * Sets the value of the subBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceType7Choice }
     *     
     */
    public PositionSearchCriteria2 setSubBalTp(SecuritiesBalanceType7Choice value) {
        this.subBalTp = value;
        return this;
    }

    /**
     * Gets the value of the rtrZeroPos property.
     * 
     */
    public boolean isRtrZeroPos() {
        return rtrZeroPos;
    }

    /**
     * Sets the value of the rtrZeroPos property.
     * 
     */
    public PositionSearchCriteria2 setRtrZeroPos(boolean value) {
        this.rtrZeroPos = value;
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
