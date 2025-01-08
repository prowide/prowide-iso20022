
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
 * Parameters which explicitly state the conditions that must be fulfilled before a particular triparty collateral instruction/transaction  can be confirmed. These parameters are defined by the instructing party in compliance with triparty collateral rules in the market the instruction/transaction will take place.
 * ***is all the elements required/used in today, should we simplify?***
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralParameters12", propOrder = {
    "collInstrTp",
    "xpsrTp",
    "collSd",
    "sttlmPrc",
    "prty",
    "automtcAllcn",
    "collApprvd",
    "sttlmApprvd"
})
public class CollateralParameters12 {

    @XmlElement(name = "CollInstrTp", required = true)
    protected CollateralTransactionType1Choice collInstrTp;
    @XmlElement(name = "XpsrTp", required = true)
    protected ExposureType23Choice xpsrTp;
    @XmlElement(name = "CollSd", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code collSd;
    @XmlElement(name = "SttlmPrc")
    protected GenericIdentification30 sttlmPrc;
    @XmlElement(name = "Prty")
    protected GenericIdentification30 prty;
    @XmlElement(name = "AutomtcAllcn")
    protected Boolean automtcAllcn;
    @XmlElement(name = "CollApprvd")
    protected Boolean collApprvd;
    @XmlElement(name = "SttlmApprvd")
    protected Boolean sttlmApprvd;

    /**
     * Gets the value of the collInstrTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralTransactionType1Choice }
     *     
     */
    public CollateralTransactionType1Choice getCollInstrTp() {
        return collInstrTp;
    }

    /**
     * Sets the value of the collInstrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralTransactionType1Choice }
     *     
     */
    public CollateralParameters12 setCollInstrTp(CollateralTransactionType1Choice value) {
        this.collInstrTp = value;
        return this;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType23Choice }
     *     
     */
    public ExposureType23Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType23Choice }
     *     
     */
    public CollateralParameters12 setXpsrTp(ExposureType23Choice value) {
        this.xpsrTp = value;
        return this;
    }

    /**
     * Gets the value of the collSd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralRole1Code getCollSd() {
        return collSd;
    }

    /**
     * Sets the value of the collSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralParameters12 setCollSd(CollateralRole1Code value) {
        this.collSd = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPrc property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getSttlmPrc() {
        return sttlmPrc;
    }

    /**
     * Sets the value of the sttlmPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public CollateralParameters12 setSttlmPrc(GenericIdentification30 value) {
        this.sttlmPrc = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public CollateralParameters12 setPrty(GenericIdentification30 value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the automtcAllcn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomtcAllcn() {
        return automtcAllcn;
    }

    /**
     * Sets the value of the automtcAllcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralParameters12 setAutomtcAllcn(Boolean value) {
        this.automtcAllcn = value;
        return this;
    }

    /**
     * Gets the value of the collApprvd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollApprvd() {
        return collApprvd;
    }

    /**
     * Sets the value of the collApprvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralParameters12 setCollApprvd(Boolean value) {
        this.collApprvd = value;
        return this;
    }

    /**
     * Gets the value of the sttlmApprvd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSttlmApprvd() {
        return sttlmApprvd;
    }

    /**
     * Sets the value of the sttlmApprvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralParameters12 setSttlmApprvd(Boolean value) {
        this.sttlmApprvd = value;
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
