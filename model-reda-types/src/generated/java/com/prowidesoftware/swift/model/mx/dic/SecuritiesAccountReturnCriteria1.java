
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
 * Return criteria for information to be returned in the report deriving from a query about securities account reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountReturnCriteria1", propOrder = {
    "acctId",
    "ptyId",
    "ptyTp",
    "acctSvcr",
    "acctTp",
    "opngDt",
    "clsgDt",
    "endInvstrFlg",
    "pricgSchme"
})
public class SecuritiesAccountReturnCriteria1 {

    @XmlElement(name = "AcctId")
    protected Boolean acctId;
    @XmlElement(name = "PtyId")
    protected Boolean ptyId;
    @XmlElement(name = "PtyTp")
    protected Boolean ptyTp;
    @XmlElement(name = "AcctSvcr")
    protected Boolean acctSvcr;
    @XmlElement(name = "AcctTp")
    protected Boolean acctTp;
    @XmlElement(name = "OpngDt")
    protected Boolean opngDt;
    @XmlElement(name = "ClsgDt")
    protected Boolean clsgDt;
    @XmlElement(name = "EndInvstrFlg")
    protected Boolean endInvstrFlg;
    @XmlElement(name = "PricgSchme")
    protected Boolean pricgSchme;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesAccountReturnCriteria1 setAcctId(Boolean value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesAccountReturnCriteria1 setPtyId(Boolean value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the ptyTp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPtyTp() {
        return ptyTp;
    }

    /**
     * Sets the value of the ptyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesAccountReturnCriteria1 setPtyTp(Boolean value) {
        this.ptyTp = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesAccountReturnCriteria1 setAcctSvcr(Boolean value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesAccountReturnCriteria1 setAcctTp(Boolean value) {
        this.acctTp = value;
        return this;
    }

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesAccountReturnCriteria1 setOpngDt(Boolean value) {
        this.opngDt = value;
        return this;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesAccountReturnCriteria1 setClsgDt(Boolean value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the endInvstrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndInvstrFlg() {
        return endInvstrFlg;
    }

    /**
     * Sets the value of the endInvstrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesAccountReturnCriteria1 setEndInvstrFlg(Boolean value) {
        this.endInvstrFlg = value;
        return this;
    }

    /**
     * Gets the value of the pricgSchme property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPricgSchme() {
        return pricgSchme;
    }

    /**
     * Sets the value of the pricgSchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesAccountReturnCriteria1 setPricgSchme(Boolean value) {
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
