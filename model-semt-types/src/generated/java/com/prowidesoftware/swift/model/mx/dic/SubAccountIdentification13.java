
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
 * Account to or from which a securities entry is made.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubAccountIdentification13", propOrder = {
    "acctOwnr",
    "sfkpgAcct",
    "actvtyInd",
    "balForSubAcct"
})
public class SubAccountIdentification13 {

    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification18Choice acctOwnr;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount16 sfkpgAcct;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;
    @XmlElement(name = "BalForSubAcct")
    protected List<AggregateBalanceInformation11> balForSubAcct;

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification18Choice }
     *     
     */
    public PartyIdentification18Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification18Choice }
     *     
     */
    public SubAccountIdentification13 setAcctOwnr(PartyIdentification18Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount16 }
     *     
     */
    public SecuritiesAccount16 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount16 }
     *     
     */
    public SubAccountIdentification13 setSfkpgAcct(SecuritiesAccount16 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the actvtyInd property.
     * 
     */
    public boolean isActvtyInd() {
        return actvtyInd;
    }

    /**
     * Sets the value of the actvtyInd property.
     * 
     */
    public SubAccountIdentification13 setActvtyInd(boolean value) {
        this.actvtyInd = value;
        return this;
    }

    /**
     * Gets the value of the balForSubAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balForSubAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalForSubAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateBalanceInformation11 }
     * 
     * 
     */
    public List<AggregateBalanceInformation11> getBalForSubAcct() {
        if (balForSubAcct == null) {
            balForSubAcct = new ArrayList<AggregateBalanceInformation11>();
        }
        return this.balForSubAcct;
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
     * Adds a new item to the balForSubAcct list.
     * @see #getBalForSubAcct()
     * 
     */
    public SubAccountIdentification13 addBalForSubAcct(AggregateBalanceInformation11 balForSubAcct) {
        getBalForSubAcct().add(balForSubAcct);
        return this;
    }

}
