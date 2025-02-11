
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
 * Hardware security module of the ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMSecurityDevice2", propOrder = {
    "dvcPrprty",
    "curCfgtn",
    "spprtdCfgtn",
    "curSts",
    "incdnt",
    "bndgStat"
})
public class ATMSecurityDevice2 {

    @XmlElement(name = "DvcPrprty")
    protected ATMEquipment2 dvcPrprty;
    @XmlElement(name = "CurCfgtn", required = true)
    protected ATMSecurityConfiguration1 curCfgtn;
    @XmlElement(name = "SpprtdCfgtn")
    protected ATMSecurityConfiguration1 spprtdCfgtn;
    @XmlElement(name = "CurSts", required = true)
    @XmlSchemaType(name = "string")
    protected ATMStatus2Code curSts;
    @XmlElement(name = "Incdnt")
    @XmlSchemaType(name = "string")
    protected FailureReason5Code incdnt;
    @XmlElement(name = "BndgStat")
    @XmlSchemaType(name = "string")
    protected TR34Status1Code bndgStat;

    /**
     * Gets the value of the dvcPrprty property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEquipment2 }
     *     
     */
    public ATMEquipment2 getDvcPrprty() {
        return dvcPrprty;
    }

    /**
     * Sets the value of the dvcPrprty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEquipment2 }
     *     
     */
    public ATMSecurityDevice2 setDvcPrprty(ATMEquipment2 value) {
        this.dvcPrprty = value;
        return this;
    }

    /**
     * Gets the value of the curCfgtn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityConfiguration1 }
     *     
     */
    public ATMSecurityConfiguration1 getCurCfgtn() {
        return curCfgtn;
    }

    /**
     * Sets the value of the curCfgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityConfiguration1 }
     *     
     */
    public ATMSecurityDevice2 setCurCfgtn(ATMSecurityConfiguration1 value) {
        this.curCfgtn = value;
        return this;
    }

    /**
     * Gets the value of the spprtdCfgtn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityConfiguration1 }
     *     
     */
    public ATMSecurityConfiguration1 getSpprtdCfgtn() {
        return spprtdCfgtn;
    }

    /**
     * Sets the value of the spprtdCfgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityConfiguration1 }
     *     
     */
    public ATMSecurityDevice2 setSpprtdCfgtn(ATMSecurityConfiguration1 value) {
        this.spprtdCfgtn = value;
        return this;
    }

    /**
     * Gets the value of the curSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMStatus2Code }
     *     
     */
    public ATMStatus2Code getCurSts() {
        return curSts;
    }

    /**
     * Sets the value of the curSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMStatus2Code }
     *     
     */
    public ATMSecurityDevice2 setCurSts(ATMStatus2Code value) {
        this.curSts = value;
        return this;
    }

    /**
     * Gets the value of the incdnt property.
     * 
     * @return
     *     possible object is
     *     {@link FailureReason5Code }
     *     
     */
    public FailureReason5Code getIncdnt() {
        return incdnt;
    }

    /**
     * Sets the value of the incdnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureReason5Code }
     *     
     */
    public ATMSecurityDevice2 setIncdnt(FailureReason5Code value) {
        this.incdnt = value;
        return this;
    }

    /**
     * Gets the value of the bndgStat property.
     * 
     * @return
     *     possible object is
     *     {@link TR34Status1Code }
     *     
     */
    public TR34Status1Code getBndgStat() {
        return bndgStat;
    }

    /**
     * Sets the value of the bndgStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TR34Status1Code }
     *     
     */
    public ATMSecurityDevice2 setBndgStat(TR34Status1Code value) {
        this.bndgStat = value;
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
