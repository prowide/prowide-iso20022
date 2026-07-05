
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
 * Entity involved in an activity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount6", propOrder = {
    "ptyId",
    "cdtAcct",
    "fincgAcct"
})
public class PartyIdentificationAndAccount6 {

    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification25 ptyId;
    @XmlElement(name = "CdtAcct")
    protected CashAccount7 cdtAcct;
    @XmlElement(name = "FincgAcct")
    protected CashAccount7 fincgAcct;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification25 }
     *     
     */
    public PartyIdentification25 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification25 }
     *     
     */
    public PartyIdentificationAndAccount6 setPtyId(PartyIdentification25 value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the cdtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getCdtAcct() {
        return cdtAcct;
    }

    /**
     * Sets the value of the cdtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public PartyIdentificationAndAccount6 setCdtAcct(CashAccount7 value) {
        this.cdtAcct = value;
        return this;
    }

    /**
     * Gets the value of the fincgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getFincgAcct() {
        return fincgAcct;
    }

    /**
     * Sets the value of the fincgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public PartyIdentificationAndAccount6 setFincgAcct(CashAccount7 value) {
        this.fincgAcct = value;
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
