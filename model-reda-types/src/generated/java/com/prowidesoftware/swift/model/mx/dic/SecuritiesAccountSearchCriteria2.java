
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
 * Set of search criteria for querying securities account reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountSearchCriteria2", propOrder = {
    "acctId",
    "acctSvcr",
    "acctOwnr",
    "ptyTp",
    "opngDt",
    "clsgDt",
    "acctTp",
    "endInvstrFlg",
    "pricgSchme"
})
public class SecuritiesAccountSearchCriteria2 {

    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification136 acctSvcr;
    @XmlElement(name = "AcctOwnr")
    protected SystemPartyIdentification8 acctOwnr;
    @XmlElement(name = "PtyTp")
    protected SystemPartyType1Choice ptyTp;
    @XmlElement(name = "OpngDt")
    protected DatePeriodSearch1Choice opngDt;
    @XmlElement(name = "ClsgDt")
    protected DatePeriodSearch1Choice clsgDt;
    @XmlElement(name = "AcctTp")
    protected SystemSecuritiesAccountType1Choice acctTp;
    @XmlElement(name = "EndInvstrFlg")
    protected String endInvstrFlg;
    @XmlElement(name = "PricgSchme")
    protected String pricgSchme;

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
    public SecuritiesAccountSearchCriteria2 setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public SecuritiesAccountSearchCriteria2 setAcctSvcr(PartyIdentification136 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SecuritiesAccountSearchCriteria2 setAcctOwnr(SystemPartyIdentification8 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the ptyTp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyType1Choice }
     *     
     */
    public SystemPartyType1Choice getPtyTp() {
        return ptyTp;
    }

    /**
     * Sets the value of the ptyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyType1Choice }
     *     
     */
    public SecuritiesAccountSearchCriteria2 setPtyTp(SystemPartyType1Choice value) {
        this.ptyTp = value;
        return this;
    }

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public SecuritiesAccountSearchCriteria2 setOpngDt(DatePeriodSearch1Choice value) {
        this.opngDt = value;
        return this;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public SecuritiesAccountSearchCriteria2 setClsgDt(DatePeriodSearch1Choice value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemSecuritiesAccountType1Choice }
     *     
     */
    public SystemSecuritiesAccountType1Choice getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemSecuritiesAccountType1Choice }
     *     
     */
    public SecuritiesAccountSearchCriteria2 setAcctTp(SystemSecuritiesAccountType1Choice value) {
        this.acctTp = value;
        return this;
    }

    /**
     * Gets the value of the endInvstrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndInvstrFlg() {
        return endInvstrFlg;
    }

    /**
     * Sets the value of the endInvstrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesAccountSearchCriteria2 setEndInvstrFlg(String value) {
        this.endInvstrFlg = value;
        return this;
    }

    /**
     * Gets the value of the pricgSchme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricgSchme() {
        return pricgSchme;
    }

    /**
     * Sets the value of the pricgSchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesAccountSearchCriteria2 setPricgSchme(String value) {
        this.pricgSchme = value;
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
