
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
 * Set of search criteria for querying party reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyDataSearchCriteria2", propOrder = {
    "opngDt",
    "clsgDt",
    "tp",
    "rspnsblPtyId",
    "ptyId",
    "rstrctnId",
    "rstrctnIsseDt",
    "resTp",
    "lckSts"
})
public class PartyDataSearchCriteria2 {

    @XmlElement(name = "OpngDt")
    protected DatePeriodSearch1Choice opngDt;
    @XmlElement(name = "ClsgDt")
    protected DatePeriodSearch1Choice clsgDt;
    @XmlElement(name = "Tp")
    protected SystemPartyType1Choice tp;
    @XmlElement(name = "RspnsblPtyId")
    protected PartyIdentification136 rspnsblPtyId;
    @XmlElement(name = "PtyId")
    protected PartyIdentification136 ptyId;
    @XmlElement(name = "RstrctnId")
    protected String rstrctnId;
    @XmlElement(name = "RstrctnIsseDt")
    protected DateAndDateTimeSearch4Choice rstrctnIsseDt;
    @XmlElement(name = "ResTp")
    @XmlSchemaType(name = "string")
    protected ResidenceType1Code resTp;
    @XmlElement(name = "LckSts")
    protected PartyLockStatus1 lckSts;

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public PartyDataSearchCriteria2 setOpngDt(DatePeriodSearch1Choice value) {
        this.opngDt = value;
        return this;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public PartyDataSearchCriteria2 setClsgDt(DatePeriodSearch1Choice value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyType1Choice }
     *     
     */
    public SystemPartyType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyType1Choice }
     *     
     */
    public PartyDataSearchCriteria2 setTp(SystemPartyType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the rspnsblPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getRspnsblPtyId() {
        return rspnsblPtyId;
    }

    /**
     * Sets the value of the rspnsblPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyDataSearchCriteria2 setRspnsblPtyId(PartyIdentification136 value) {
        this.rspnsblPtyId = value;
        return this;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyDataSearchCriteria2 setPtyId(PartyIdentification136 value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the rstrctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstrctnId() {
        return rstrctnId;
    }

    /**
     * Sets the value of the rstrctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyDataSearchCriteria2 setRstrctnId(String value) {
        this.rstrctnId = value;
        return this;
    }

    /**
     * Gets the value of the rstrctnIsseDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch4Choice }
     *     
     */
    public DateAndDateTimeSearch4Choice getRstrctnIsseDt() {
        return rstrctnIsseDt;
    }

    /**
     * Sets the value of the rstrctnIsseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch4Choice }
     *     
     */
    public PartyDataSearchCriteria2 setRstrctnIsseDt(DateAndDateTimeSearch4Choice value) {
        this.rstrctnIsseDt = value;
        return this;
    }

    /**
     * Gets the value of the resTp property.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceType1Code }
     *     
     */
    public ResidenceType1Code getResTp() {
        return resTp;
    }

    /**
     * Sets the value of the resTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceType1Code }
     *     
     */
    public PartyDataSearchCriteria2 setResTp(ResidenceType1Code value) {
        this.resTp = value;
        return this;
    }

    /**
     * Gets the value of the lckSts property.
     * 
     * @return
     *     possible object is
     *     {@link PartyLockStatus1 }
     *     
     */
    public PartyLockStatus1 getLckSts() {
        return lckSts;
    }

    /**
     * Sets the value of the lckSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyLockStatus1 }
     *     
     */
    public PartyDataSearchCriteria2 setLckSts(PartyLockStatus1 value) {
        this.lckSts = value;
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
