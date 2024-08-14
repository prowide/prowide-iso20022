
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information about the securities account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccount10", propOrder = {
    "cdtDbtInd",
    "acctOwnrId",
    "acctOwnrNtlty",
    "acctId",
    "balTp",
    "sctyHldgForm"
})
public class SecuritiesAccount10 {

    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "AcctOwnrId")
    protected PartyIdentification2Choice acctOwnrId;
    @XmlElement(name = "AcctOwnrNtlty")
    protected String acctOwnrNtlty;
    @XmlElement(name = "AcctId", required = true)
    protected String acctId;
    @XmlElement(name = "BalTp")
    protected SecuritiesBalanceType9FormatChoice balTp;
    @XmlElement(name = "SctyHldgForm")
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code sctyHldgForm;

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public SecuritiesAccount10 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
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
    public SecuritiesAccount10 setAcctOwnrId(PartyIdentification2Choice value) {
        this.acctOwnrId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnrNtlty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnrNtlty() {
        return acctOwnrNtlty;
    }

    /**
     * Sets the value of the acctOwnrNtlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesAccount10 setAcctOwnrNtlty(String value) {
        this.acctOwnrNtlty = value;
        return this;
    }

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
    public SecuritiesAccount10 setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the balTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceType9FormatChoice }
     *     
     */
    public SecuritiesBalanceType9FormatChoice getBalTp() {
        return balTp;
    }

    /**
     * Sets the value of the balTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceType9FormatChoice }
     *     
     */
    public SecuritiesAccount10 setBalTp(SecuritiesBalanceType9FormatChoice value) {
        this.balTp = value;
        return this;
    }

    /**
     * Gets the value of the sctyHldgForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FormOfSecurity1Code getSctyHldgForm() {
        return sctyHldgForm;
    }

    /**
     * Sets the value of the sctyHldgForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public SecuritiesAccount10 setSctyHldgForm(FormOfSecurity1Code value) {
        this.sctyHldgForm = value;
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
