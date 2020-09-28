
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
 * Context of the ATM for the key download.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMSecurityContext3", propOrder = {
    "curSctySchme",
    "dvcPrprty",
    "curCfgtn"
})
public class ATMSecurityContext3 {

    @XmlElement(name = "CurSctySchme", required = true)
    @XmlSchemaType(name = "string")
    protected ATMSecurityScheme3Code curSctySchme;
    @XmlElement(name = "DvcPrprty")
    protected ATMEquipment3 dvcPrprty;
    @XmlElement(name = "CurCfgtn")
    protected ATMSecurityConfiguration1 curCfgtn;

    /**
     * Gets the value of the curSctySchme property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityScheme3Code }
     *     
     */
    public ATMSecurityScheme3Code getCurSctySchme() {
        return curSctySchme;
    }

    /**
     * Sets the value of the curSctySchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityScheme3Code }
     *     
     */
    public ATMSecurityContext3 setCurSctySchme(ATMSecurityScheme3Code value) {
        this.curSctySchme = value;
        return this;
    }

    /**
     * Gets the value of the dvcPrprty property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEquipment3 }
     *     
     */
    public ATMEquipment3 getDvcPrprty() {
        return dvcPrprty;
    }

    /**
     * Sets the value of the dvcPrprty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEquipment3 }
     *     
     */
    public ATMSecurityContext3 setDvcPrprty(ATMEquipment3 value) {
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
    public ATMSecurityContext3 setCurCfgtn(ATMSecurityConfiguration1 value) {
        this.curCfgtn = value;
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
