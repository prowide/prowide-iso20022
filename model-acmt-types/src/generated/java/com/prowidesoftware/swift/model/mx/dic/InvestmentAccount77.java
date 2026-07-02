
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
 * Information about a securities account and its characteristics.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccount77", propOrder = {
    "acctId",
    "acctNm",
    "acctDsgnt",
    "ownrId",
    "acctSvcr"
})
public class InvestmentAccount77 {

    @XmlElement(name = "AcctId", required = true)
    protected String acctId;
    @XmlElement(name = "AcctNm")
    protected String acctNm;
    @XmlElement(name = "AcctDsgnt")
    protected String acctDsgnt;
    @XmlElement(name = "OwnrId")
    protected OwnerIdentification3Choice ownrId;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification125Choice acctSvcr;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount77 setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNm() {
        return acctNm;
    }

    /**
     * Sets the value of the acctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount77 setAcctNm(String value) {
        this.acctNm = value;
        return this;
    }

    /**
     * Gets the value of the acctDsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctDsgnt() {
        return acctDsgnt;
    }

    /**
     * Sets the value of the acctDsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount77 setAcctDsgnt(String value) {
        this.acctDsgnt = value;
        return this;
    }

    /**
     * Gets the value of the ownrId property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerIdentification3Choice }
     *     
     */
    public OwnerIdentification3Choice getOwnrId() {
        return ownrId;
    }

    /**
     * Sets the value of the ownrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerIdentification3Choice }
     *     
     */
    public InvestmentAccount77 setOwnrId(OwnerIdentification3Choice value) {
        this.ownrId = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public InvestmentAccount77 setAcctSvcr(PartyIdentification125Choice value) {
        this.acctSvcr = value;
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
