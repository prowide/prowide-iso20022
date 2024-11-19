
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
 * Party involved in the settlement chain.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount4", propOrder = {
    "ptyId",
    "acctId",
    "prcgRef",
    "prcgDt",
    "subAcctDtls",
    "ctctPrsn"
})
public class PartyIdentificationAndAccount4 {

    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification2Choice ptyId;
    @XmlElement(name = "AcctId")
    protected AccountIdentification1 acctId;
    @XmlElement(name = "PrcgRef")
    protected String prcgRef;
    @XmlElement(name = "PrcgDt")
    protected DateAndDateTimeChoice prcgDt;
    @XmlElement(name = "SubAcctDtls")
    protected SubAccount1 subAcctDtls;
    @XmlElement(name = "CtctPrsn")
    protected ContactIdentification2 ctctPrsn;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentificationAndAccount4 setPtyId(PartyIdentification2Choice value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification1 }
     *     
     */
    public AccountIdentification1 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification1 }
     *     
     */
    public PartyIdentificationAndAccount4 setAcctId(AccountIdentification1 value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the prcgRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcgRef() {
        return prcgRef;
    }

    /**
     * Sets the value of the prcgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentificationAndAccount4 setPrcgRef(String value) {
        this.prcgRef = value;
        return this;
    }

    /**
     * Gets the value of the prcgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getPrcgDt() {
        return prcgDt;
    }

    /**
     * Sets the value of the prcgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public PartyIdentificationAndAccount4 setPrcgDt(DateAndDateTimeChoice value) {
        this.prcgDt = value;
        return this;
    }

    /**
     * Gets the value of the subAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccount1 }
     *     
     */
    public SubAccount1 getSubAcctDtls() {
        return subAcctDtls;
    }

    /**
     * Sets the value of the subAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccount1 }
     *     
     */
    public PartyIdentificationAndAccount4 setSubAcctDtls(SubAccount1 value) {
        this.subAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the ctctPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link ContactIdentification2 }
     *     
     */
    public ContactIdentification2 getCtctPrsn() {
        return ctctPrsn;
    }

    /**
     * Sets the value of the ctctPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactIdentification2 }
     *     
     */
    public PartyIdentificationAndAccount4 setCtctPrsn(ContactIdentification2 value) {
        this.ctctPrsn = value;
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
