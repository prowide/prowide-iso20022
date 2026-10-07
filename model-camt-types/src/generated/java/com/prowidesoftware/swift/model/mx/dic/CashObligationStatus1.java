
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
 * Specifies the status of the cash obligation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashObligationStatus1", propOrder = {
    "netPosId",
    "cshAcct",
    "sts",
    "acctSvcrRef"
})
public class CashObligationStatus1 {

    @XmlElement(name = "NetPosId", required = true)
    protected String netPosId;
    @XmlElement(name = "CshAcct")
    protected CashAccount24 cshAcct;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementConditionModificationProcessingStatus1Code sts;
    @XmlElement(name = "AcctSvcrRef")
    protected String acctSvcrRef;

    /**
     * Gets the value of the netPosId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetPosId() {
        return netPosId;
    }

    /**
     * Sets the value of the netPosId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashObligationStatus1 setNetPosId(String value) {
        this.netPosId = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public CashObligationStatus1 setCshAcct(CashAccount24 value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementConditionModificationProcessingStatus1Code }
     *     
     */
    public SettlementConditionModificationProcessingStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementConditionModificationProcessingStatus1Code }
     *     
     */
    public CashObligationStatus1 setSts(SettlementConditionModificationProcessingStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcrRef() {
        return acctSvcrRef;
    }

    /**
     * Sets the value of the acctSvcrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashObligationStatus1 setAcctSvcrRef(String value) {
        this.acctSvcrRef = value;
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
