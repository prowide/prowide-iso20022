
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Party that provides services relating to financial products to investors, eg, advice on products and placement of orders for the investment fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Intermediary6", propOrder = {
    "id",
    "acct",
    "wvdTrlrComssnInd",
    "role",
    "xtndedRole",
    "pmryComAdr",
    "scndryComAdr",
    "nmAndAdr"
})
public class Intermediary6 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification4Choice id;
    @XmlElement(name = "Acct")
    protected Account2 acct;
    @XmlElement(name = "WvdTrlrComssnInd")
    protected Boolean wvdTrlrComssnInd;
    @XmlElement(name = "Role")
    @XmlSchemaType(name = "string")
    protected InvestmentFundRole1Code role;
    @XmlElement(name = "XtndedRole")
    protected String xtndedRole;
    @XmlElement(name = "PmryComAdr")
    protected CommunicationAddress3 pmryComAdr;
    @XmlElement(name = "ScndryComAdr")
    protected CommunicationAddress3 scndryComAdr;
    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress4 nmAndAdr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification4Choice }
     *     
     */
    public PartyIdentification4Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification4Choice }
     *     
     */
    public Intermediary6 setId(PartyIdentification4Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link Account2 }
     *     
     */
    public Account2 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account2 }
     *     
     */
    public Intermediary6 setAcct(Account2 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the wvdTrlrComssnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWvdTrlrComssnInd() {
        return wvdTrlrComssnInd;
    }

    /**
     * Sets the value of the wvdTrlrComssnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Intermediary6 setWvdTrlrComssnInd(Boolean value) {
        this.wvdTrlrComssnInd = value;
        return this;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundRole1Code }
     *     
     */
    public InvestmentFundRole1Code getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundRole1Code }
     *     
     */
    public Intermediary6 setRole(InvestmentFundRole1Code value) {
        this.role = value;
        return this;
    }

    /**
     * Gets the value of the xtndedRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedRole() {
        return xtndedRole;
    }

    /**
     * Sets the value of the xtndedRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Intermediary6 setXtndedRole(String value) {
        this.xtndedRole = value;
        return this;
    }

    /**
     * Gets the value of the pmryComAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress3 }
     *     
     */
    public CommunicationAddress3 getPmryComAdr() {
        return pmryComAdr;
    }

    /**
     * Sets the value of the pmryComAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress3 }
     *     
     */
    public Intermediary6 setPmryComAdr(CommunicationAddress3 value) {
        this.pmryComAdr = value;
        return this;
    }

    /**
     * Gets the value of the scndryComAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress3 }
     *     
     */
    public CommunicationAddress3 getScndryComAdr() {
        return scndryComAdr;
    }

    /**
     * Sets the value of the scndryComAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress3 }
     *     
     */
    public Intermediary6 setScndryComAdr(CommunicationAddress3 value) {
        this.scndryComAdr = value;
        return this;
    }

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress4 }
     *     
     */
    public NameAndAddress4 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress4 }
     *     
     */
    public Intermediary6 setNmAndAdr(NameAndAddress4 value) {
        this.nmAndAdr = value;
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
