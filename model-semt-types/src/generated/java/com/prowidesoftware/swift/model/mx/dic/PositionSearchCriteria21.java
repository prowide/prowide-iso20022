
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "PositionSearchCriteria2__1", propOrder = {
    "acctOwnr",
    "acctSvcr",
    "sfkpgAcct",
    "finInstrm",
    "ctryOfIsse",
    "subBalTp",
    "rtrZeroPos"
})
public class PositionSearchCriteria21 {

    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification1001 acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification1001 acctSvcr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount2Choice1 sfkpgAcct;
    @XmlElement(name = "FinInstrm")
    protected SecurityIdentification191 finInstrm;
    @XmlElement(name = "CtryOfIsse")
    protected String ctryOfIsse;
    @XmlElement(name = "SubBalTp")
    protected SecuritiesBalanceType7Choice1 subBalTp;
    @XmlElement(name = "RtrZeroPos")
    protected boolean rtrZeroPos;

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1001 }
     *     
     */
    public PartyIdentification1001 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1001 }
     *     
     */
    public PositionSearchCriteria21 setAcctOwnr(PartyIdentification1001 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1001 }
     *     
     */
    public PartyIdentification1001 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1001 }
     *     
     */
    public PositionSearchCriteria21 setAcctSvcr(PartyIdentification1001 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount2Choice1 }
     *     
     */
    public SecuritiesAccount2Choice1 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount2Choice1 }
     *     
     */
    public PositionSearchCriteria21 setSfkpgAcct(SecuritiesAccount2Choice1 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the finInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification191 }
     *     
     */
    public SecurityIdentification191 getFinInstrm() {
        return finInstrm;
    }

    /**
     * Sets the value of the finInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification191 }
     *     
     */
    public PositionSearchCriteria21 setFinInstrm(SecurityIdentification191 value) {
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
    public PositionSearchCriteria21 setCtryOfIsse(String value) {
        this.ctryOfIsse = value;
        return this;
    }

    /**
     * Gets the value of the subBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceType7Choice1 }
     *     
     */
    public SecuritiesBalanceType7Choice1 getSubBalTp() {
        return subBalTp;
    }

    /**
     * Sets the value of the subBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceType7Choice1 }
     *     
     */
    public PositionSearchCriteria21 setSubBalTp(SecuritiesBalanceType7Choice1 value) {
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
    public PositionSearchCriteria21 setRtrZeroPos(boolean value) {
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
