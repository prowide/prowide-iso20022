
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
 * Specifies additional parameters to the message or transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalParameters21", propOrder = {
    "prtlSttlm",
    "prvsPrtlConfId",
    "acctOwnrTxId",
    "acctSvcrTxId",
    "poolId",
    "corpActnEvtId",
    "mktInfrstrctrTxId",
    "prcrTxId"
})
public class AdditionalParameters21 {

    @XmlElement(name = "PrtlSttlm")
    @XmlSchemaType(name = "string")
    protected PartialSettlement2Code prtlSttlm;
    @XmlElement(name = "PrvsPrtlConfId")
    protected String prvsPrtlConfId;
    @XmlElement(name = "AcctOwnrTxId")
    protected String acctOwnrTxId;
    @XmlElement(name = "AcctSvcrTxId")
    protected String acctSvcrTxId;
    @XmlElement(name = "PoolId")
    protected String poolId;
    @XmlElement(name = "CorpActnEvtId")
    protected String corpActnEvtId;
    @XmlElement(name = "MktInfrstrctrTxId")
    protected String mktInfrstrctrTxId;
    @XmlElement(name = "PrcrTxId")
    protected String prcrTxId;

    /**
     * Gets the value of the prtlSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link PartialSettlement2Code }
     *     
     */
    public PartialSettlement2Code getPrtlSttlm() {
        return prtlSttlm;
    }

    /**
     * Sets the value of the prtlSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialSettlement2Code }
     *     
     */
    public AdditionalParameters21 setPrtlSttlm(PartialSettlement2Code value) {
        this.prtlSttlm = value;
        return this;
    }

    /**
     * Gets the value of the prvsPrtlConfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvsPrtlConfId() {
        return prvsPrtlConfId;
    }

    /**
     * Sets the value of the prvsPrtlConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalParameters21 setPrvsPrtlConfId(String value) {
        this.prvsPrtlConfId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnrTxId() {
        return acctOwnrTxId;
    }

    /**
     * Sets the value of the acctOwnrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalParameters21 setAcctOwnrTxId(String value) {
        this.acctOwnrTxId = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcrTxId() {
        return acctSvcrTxId;
    }

    /**
     * Sets the value of the acctSvcrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalParameters21 setAcctSvcrTxId(String value) {
        this.acctSvcrTxId = value;
        return this;
    }

    /**
     * Gets the value of the poolId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolId() {
        return poolId;
    }

    /**
     * Sets the value of the poolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalParameters21 setPoolId(String value) {
        this.poolId = value;
        return this;
    }

    /**
     * Gets the value of the corpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpActnEvtId() {
        return corpActnEvtId;
    }

    /**
     * Sets the value of the corpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalParameters21 setCorpActnEvtId(String value) {
        this.corpActnEvtId = value;
        return this;
    }

    /**
     * Gets the value of the mktInfrstrctrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktInfrstrctrTxId() {
        return mktInfrstrctrTxId;
    }

    /**
     * Sets the value of the mktInfrstrctrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalParameters21 setMktInfrstrctrTxId(String value) {
        this.mktInfrstrctrTxId = value;
        return this;
    }

    /**
     * Gets the value of the prcrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcrTxId() {
        return prcrTxId;
    }

    /**
     * Sets the value of the prcrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalParameters21 setPrcrTxId(String value) {
        this.prcrTxId = value;
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
