
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
 * Party involved in the settlement chain.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount2", propOrder = {
    "ptyId",
    "acctId",
    "prcgRef",
    "prcgDt"
})
public class PartyIdentificationAndAccount2 {

    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification1Choice ptyId;
    @XmlElement(name = "AcctId")
    protected AccountIdentification1 acctId;
    @XmlElement(name = "PrcgRef")
    protected String prcgRef;
    @XmlElement(name = "PrcgDt")
    protected DateAndDateTimeChoice prcgDt;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1Choice }
     *     
     */
    public PartyIdentification1Choice getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1Choice }
     *     
     */
    public PartyIdentificationAndAccount2 setPtyId(PartyIdentification1Choice value) {
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
    public PartyIdentificationAndAccount2 setAcctId(AccountIdentification1 value) {
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
    public PartyIdentificationAndAccount2 setPrcgRef(String value) {
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
    public PartyIdentificationAndAccount2 setPrcgDt(DateAndDateTimeChoice value) {
        this.prcgDt = value;
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
