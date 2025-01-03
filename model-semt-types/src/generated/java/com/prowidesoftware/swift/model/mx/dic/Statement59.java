
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
 * General characteristics related to a statement which reports information for a precise date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement59", propOrder = {
    "sndrBizRole",
    "stmtNb",
    "qryRef",
    "stmtId",
    "stmtDtTm",
    "stmtPrd",
    "frqcy",
    "frqcyGrnlrty",
    "updTp",
    "actvtyInd"
})
public class Statement59 {

    @XmlElement(name = "SndrBizRole", required = true)
    @XmlSchemaType(name = "string")
    protected SenderBusinessRole1Code sndrBizRole;
    @XmlElement(name = "StmtNb")
    protected Number3Choice stmtNb;
    @XmlElement(name = "QryRef")
    protected String qryRef;
    @XmlElement(name = "StmtId", required = true)
    protected String stmtId;
    @XmlElement(name = "StmtDtTm", required = true)
    protected DateAndDateTimeChoice stmtDtTm;
    @XmlElement(name = "StmtPrd", required = true)
    protected DatePeriod1Choice stmtPrd;
    @XmlElement(name = "Frqcy")
    protected Frequency22Choice frqcy;
    @XmlElement(name = "FrqcyGrnlrty")
    @XmlSchemaType(name = "string")
    protected FrequencyGranularityType1Code frqcyGrnlrty;
    @XmlElement(name = "UpdTp")
    protected UpdateType4Choice updTp;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;

    /**
     * Gets the value of the sndrBizRole property.
     * 
     * @return
     *     possible object is
     *     {@link SenderBusinessRole1Code }
     *     
     */
    public SenderBusinessRole1Code getSndrBizRole() {
        return sndrBizRole;
    }

    /**
     * Sets the value of the sndrBizRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderBusinessRole1Code }
     *     
     */
    public Statement59 setSndrBizRole(SenderBusinessRole1Code value) {
        this.sndrBizRole = value;
        return this;
    }

    /**
     * Gets the value of the stmtNb property.
     * 
     * @return
     *     possible object is
     *     {@link Number3Choice }
     *     
     */
    public Number3Choice getStmtNb() {
        return stmtNb;
    }

    /**
     * Sets the value of the stmtNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Number3Choice }
     *     
     */
    public Statement59 setStmtNb(Number3Choice value) {
        this.stmtNb = value;
        return this;
    }

    /**
     * Gets the value of the qryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryRef() {
        return qryRef;
    }

    /**
     * Sets the value of the qryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Statement59 setQryRef(String value) {
        this.qryRef = value;
        return this;
    }

    /**
     * Gets the value of the stmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtId() {
        return stmtId;
    }

    /**
     * Sets the value of the stmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Statement59 setStmtId(String value) {
        this.stmtId = value;
        return this;
    }

    /**
     * Gets the value of the stmtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getStmtDtTm() {
        return stmtDtTm;
    }

    /**
     * Sets the value of the stmtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public Statement59 setStmtDtTm(DateAndDateTimeChoice value) {
        this.stmtDtTm = value;
        return this;
    }

    /**
     * Gets the value of the stmtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod1Choice }
     *     
     */
    public DatePeriod1Choice getStmtPrd() {
        return stmtPrd;
    }

    /**
     * Sets the value of the stmtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod1Choice }
     *     
     */
    public Statement59 setStmtPrd(DatePeriod1Choice value) {
        this.stmtPrd = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency22Choice }
     *     
     */
    public Frequency22Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency22Choice }
     *     
     */
    public Statement59 setFrqcy(Frequency22Choice value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the frqcyGrnlrty property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyGranularityType1Code }
     *     
     */
    public FrequencyGranularityType1Code getFrqcyGrnlrty() {
        return frqcyGrnlrty;
    }

    /**
     * Sets the value of the frqcyGrnlrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyGranularityType1Code }
     *     
     */
    public Statement59 setFrqcyGrnlrty(FrequencyGranularityType1Code value) {
        this.frqcyGrnlrty = value;
        return this;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateType4Choice }
     *     
     */
    public UpdateType4Choice getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateType4Choice }
     *     
     */
    public Statement59 setUpdTp(UpdateType4Choice value) {
        this.updTp = value;
        return this;
    }

    /**
     * Gets the value of the actvtyInd property.
     * 
     */
    public boolean isActvtyInd() {
        return actvtyInd;
    }

    /**
     * Sets the value of the actvtyInd property.
     * 
     */
    public Statement59 setActvtyInd(boolean value) {
        this.actvtyInd = value;
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
