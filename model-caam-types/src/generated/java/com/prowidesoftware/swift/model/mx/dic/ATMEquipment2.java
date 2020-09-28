
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
 * Hardware security module information, so called EPP for Encrypted PIN Pad.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMEquipment2", propOrder = {
    "manfctr",
    "mdl",
    "vrsn",
    "srlNb",
    "frmwrPrvdr",
    "frmwrId",
    "frmwrVrsn"
})
public class ATMEquipment2 {

    @XmlElement(name = "Manfctr")
    protected String manfctr;
    @XmlElement(name = "Mdl")
    protected String mdl;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "SrlNb")
    protected String srlNb;
    @XmlElement(name = "FrmwrPrvdr")
    protected String frmwrPrvdr;
    @XmlElement(name = "FrmwrId")
    protected String frmwrId;
    @XmlElement(name = "FrmwrVrsn")
    protected String frmwrVrsn;

    /**
     * Gets the value of the manfctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManfctr() {
        return manfctr;
    }

    /**
     * Sets the value of the manfctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMEquipment2 setManfctr(String value) {
        this.manfctr = value;
        return this;
    }

    /**
     * Gets the value of the mdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdl() {
        return mdl;
    }

    /**
     * Sets the value of the mdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMEquipment2 setMdl(String value) {
        this.mdl = value;
        return this;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMEquipment2 setVrsn(String value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the srlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrlNb() {
        return srlNb;
    }

    /**
     * Sets the value of the srlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMEquipment2 setSrlNb(String value) {
        this.srlNb = value;
        return this;
    }

    /**
     * Gets the value of the frmwrPrvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrmwrPrvdr() {
        return frmwrPrvdr;
    }

    /**
     * Sets the value of the frmwrPrvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMEquipment2 setFrmwrPrvdr(String value) {
        this.frmwrPrvdr = value;
        return this;
    }

    /**
     * Gets the value of the frmwrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrmwrId() {
        return frmwrId;
    }

    /**
     * Sets the value of the frmwrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMEquipment2 setFrmwrId(String value) {
        this.frmwrId = value;
        return this;
    }

    /**
     * Gets the value of the frmwrVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrmwrVrsn() {
        return frmwrVrsn;
    }

    /**
     * Sets the value of the frmwrVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMEquipment2 setFrmwrVrsn(String value) {
        this.frmwrVrsn = value;
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
