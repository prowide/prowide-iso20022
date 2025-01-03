
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
 * Provides information about the cash account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount17", propOrder = {
    "acctId",
    "pmtCcy",
    "acctOwnrId",
    "crspdtBkId"
})
public class CashAccount17 {

    @XmlElement(name = "AcctId", required = true)
    protected CashAccountIdentification1Choice acctId;
    @XmlElement(name = "PmtCcy", required = true)
    protected String pmtCcy;
    @XmlElement(name = "AcctOwnrId")
    protected PartyIdentification2Choice acctOwnrId;
    @XmlElement(name = "CrspdtBkId", required = true)
    protected String crspdtBkId;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification1Choice }
     *     
     */
    public CashAccountIdentification1Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification1Choice }
     *     
     */
    public CashAccount17 setAcctId(CashAccountIdentification1Choice value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the pmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtCcy() {
        return pmtCcy;
    }

    /**
     * Sets the value of the pmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccount17 setPmtCcy(String value) {
        this.pmtCcy = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAcctOwnrId() {
        return acctOwnrId;
    }

    /**
     * Sets the value of the acctOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public CashAccount17 setAcctOwnrId(PartyIdentification2Choice value) {
        this.acctOwnrId = value;
        return this;
    }

    /**
     * Gets the value of the crspdtBkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrspdtBkId() {
        return crspdtBkId;
    }

    /**
     * Sets the value of the crspdtBkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccount17 setCrspdtBkId(String value) {
        this.crspdtBkId = value;
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
