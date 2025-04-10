
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
 * Parameters which explicitly state the conditions that must be fulfilled before a particular triparty collateral instruction/transaction  can be confirmed. These parameters are defined by the instructing party in compliance with triparty collateral rules in the market the instruction/transaction will take place.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralParameters13", propOrder = {
    "collInstrTp",
    "xpsrTp",
    "collSd",
    "prty",
    "automtcAllcn",
    "collApprvd",
    "sttlmApprvd",
    "collAmt"
})
public class CollateralParameters13 {

    @XmlElement(name = "CollInstrTp", required = true)
    protected CollateralTransactionType1Choice collInstrTp;
    @XmlElement(name = "XpsrTp", required = true)
    protected ExposureType23Choice xpsrTp;
    @XmlElement(name = "CollSd", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code collSd;
    @XmlElement(name = "Prty")
    protected GenericIdentification30 prty;
    @XmlElement(name = "AutomtcAllcn")
    protected Boolean automtcAllcn;
    @XmlElement(name = "CollApprvd")
    protected Boolean collApprvd;
    @XmlElement(name = "SttlmApprvd")
    protected Boolean sttlmApprvd;
    @XmlElement(name = "CollAmt")
    protected CollateralAmount5 collAmt;

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
    public CollateralParameters13 setCollInstrTp(CollateralTransactionType1Choice value) {
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
    public CollateralParameters13 setXpsrTp(ExposureType23Choice value) {
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
    public CollateralParameters13 setCollSd(CollateralRole1Code value) {
        this.collSd = value;
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
    public CollateralParameters13 setPrty(GenericIdentification30 value) {
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
    public CollateralParameters13 setAutomtcAllcn(Boolean value) {
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
    public CollateralParameters13 setCollApprvd(Boolean value) {
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
    public CollateralParameters13 setSttlmApprvd(Boolean value) {
        this.sttlmApprvd = value;
        return this;
    }

    /**
     * Gets the value of the collAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAmount5 }
     *     
     */
    public CollateralAmount5 getCollAmt() {
        return collAmt;
    }

    /**
     * Sets the value of the collAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAmount5 }
     *     
     */
    public CollateralParameters13 setCollAmt(CollateralAmount5 value) {
        this.collAmt = value;
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
