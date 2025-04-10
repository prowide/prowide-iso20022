
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Identification of the stored value account or the stored value card (Prepaid card).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoredValueAccount2", propOrder = {
    "acctTp",
    "idTp",
    "id",
    "brnd",
    "prvdr",
    "ownrNm",
    "xpryDt",
    "ntryMd",
    "ccy",
    "bal"
})
public class StoredValueAccount2 {

    @XmlElement(name = "AcctTp")
    @XmlSchemaType(name = "string")
    protected StoredValueAccountType1Code acctTp;
    @XmlElement(name = "IdTp")
    @XmlSchemaType(name = "string")
    protected CardIdentificationType1Code idTp;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Brnd")
    protected String brnd;
    @XmlElement(name = "Prvdr")
    protected String prvdr;
    @XmlElement(name = "OwnrNm")
    protected String ownrNm;
    @XmlElement(name = "XpryDt")
    protected String xpryDt;
    @XmlElement(name = "NtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading8Code ntryMd;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Bal")
    protected BigDecimal bal;

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueAccountType1Code }
     *     
     */
    public StoredValueAccountType1Code getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueAccountType1Code }
     *     
     */
    public StoredValueAccount2 setAcctTp(StoredValueAccountType1Code value) {
        this.acctTp = value;
        return this;
    }

    /**
     * Gets the value of the idTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardIdentificationType1Code }
     *     
     */
    public CardIdentificationType1Code getIdTp() {
        return idTp;
    }

    /**
     * Sets the value of the idTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIdentificationType1Code }
     *     
     */
    public StoredValueAccount2 setIdTp(CardIdentificationType1Code value) {
        this.idTp = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StoredValueAccount2 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the brnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnd() {
        return brnd;
    }

    /**
     * Sets the value of the brnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StoredValueAccount2 setBrnd(String value) {
        this.brnd = value;
        return this;
    }

    /**
     * Gets the value of the prvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdr() {
        return prvdr;
    }

    /**
     * Sets the value of the prvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StoredValueAccount2 setPrvdr(String value) {
        this.prvdr = value;
        return this;
    }

    /**
     * Gets the value of the ownrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnrNm() {
        return ownrNm;
    }

    /**
     * Sets the value of the ownrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StoredValueAccount2 setOwnrNm(String value) {
        this.ownrNm = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StoredValueAccount2 setXpryDt(String value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the ntryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading8Code }
     *     
     */
    public CardDataReading8Code getNtryMd() {
        return ntryMd;
    }

    /**
     * Sets the value of the ntryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading8Code }
     *     
     */
    public StoredValueAccount2 setNtryMd(CardDataReading8Code value) {
        this.ntryMd = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StoredValueAccount2 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public StoredValueAccount2 setBal(BigDecimal value) {
        this.bal = value;
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
