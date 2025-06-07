
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
 * Movements of cash.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashMovement8", propOrder = {
    "cshMvmnt",
    "cshAmt",
    "cshAcct",
    "collMvmnt",
    "clntCshMvmntId",
    "trptyAgtSvcPrvdrCshMvmntId"
})
public class CashMovement8 {

    @XmlElement(name = "CshMvmnt", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralEntryType1Code cshMvmnt;
    @XmlElement(name = "CshAmt", required = true)
    protected ActiveCurrencyAndAmount cshAmt;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification5Choice cshAcct;
    @XmlElement(name = "CollMvmnt")
    protected boolean collMvmnt;
    @XmlElement(name = "ClntCshMvmntId")
    protected String clntCshMvmntId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCshMvmntId")
    protected String trptyAgtSvcPrvdrCshMvmntId;

    /**
     * Gets the value of the cshMvmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralEntryType1Code }
     *     
     */
    public CollateralEntryType1Code getCshMvmnt() {
        return cshMvmnt;
    }

    /**
     * Sets the value of the cshMvmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralEntryType1Code }
     *     
     */
    public CashMovement8 setCshMvmnt(CollateralEntryType1Code value) {
        this.cshMvmnt = value;
        return this;
    }

    /**
     * Gets the value of the cshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshAmt() {
        return cshAmt;
    }

    /**
     * Sets the value of the cshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CashMovement8 setCshAmt(ActiveCurrencyAndAmount value) {
        this.cshAmt = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashMovement8 setCshAcct(CashAccountIdentification5Choice value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the collMvmnt property.
     * 
     */
    public boolean isCollMvmnt() {
        return collMvmnt;
    }

    /**
     * Sets the value of the collMvmnt property.
     * 
     */
    public CashMovement8 setCollMvmnt(boolean value) {
        this.collMvmnt = value;
        return this;
    }

    /**
     * Gets the value of the clntCshMvmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntCshMvmntId() {
        return clntCshMvmntId;
    }

    /**
     * Sets the value of the clntCshMvmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashMovement8 setClntCshMvmntId(String value) {
        this.clntCshMvmntId = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgtSvcPrvdrCshMvmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCshMvmntId() {
        return trptyAgtSvcPrvdrCshMvmntId;
    }

    /**
     * Sets the value of the trptyAgtSvcPrvdrCshMvmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashMovement8 setTrptyAgtSvcPrvdrCshMvmntId(String value) {
        this.trptyAgtSvcPrvdrCshMvmntId = value;
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
