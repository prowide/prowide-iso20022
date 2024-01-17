
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of identifiers for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingSystemMemberIdentificationChoice", propOrder = {
    "uschu",
    "nzncc",
    "iensc",
    "gbsc",
    "usch",
    "chbc",
    "usfw",
    "ptncc",
    "rucb",
    "itncc",
    "atblz",
    "cacpa",
    "chsic",
    "deblz",
    "esncc",
    "zancc",
    "hkncc",
    "aubsBx",
    "aubsBs"
})
public class ClearingSystemMemberIdentificationChoice {

    @XmlElement(name = "USCHU")
    protected String uschu;
    @XmlElement(name = "NZNCC")
    protected String nzncc;
    @XmlElement(name = "IENSC")
    protected String iensc;
    @XmlElement(name = "GBSC")
    protected String gbsc;
    @XmlElement(name = "USCH")
    protected String usch;
    @XmlElement(name = "CHBC")
    protected String chbc;
    @XmlElement(name = "USFW")
    protected String usfw;
    @XmlElement(name = "PTNCC")
    protected String ptncc;
    @XmlElement(name = "RUCB")
    protected String rucb;
    @XmlElement(name = "ITNCC")
    protected String itncc;
    @XmlElement(name = "ATBLZ")
    protected String atblz;
    @XmlElement(name = "CACPA")
    protected String cacpa;
    @XmlElement(name = "CHSIC")
    protected String chsic;
    @XmlElement(name = "DEBLZ")
    protected String deblz;
    @XmlElement(name = "ESNCC")
    protected String esncc;
    @XmlElement(name = "ZANCC")
    protected String zancc;
    @XmlElement(name = "HKNCC")
    protected String hkncc;
    @XmlElement(name = "AUBSBx")
    protected String aubsBx;
    @XmlElement(name = "AUBSBs")
    protected String aubsBs;

    /**
     * Gets the value of the uschu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSCHU() {
        return uschu;
    }

    /**
     * Sets the value of the uschu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setUSCHU(String value) {
        this.uschu = value;
        return this;
    }

    /**
     * Gets the value of the nzncc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNZNCC() {
        return nzncc;
    }

    /**
     * Sets the value of the nzncc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setNZNCC(String value) {
        this.nzncc = value;
        return this;
    }

    /**
     * Gets the value of the iensc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIENSC() {
        return iensc;
    }

    /**
     * Sets the value of the iensc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setIENSC(String value) {
        this.iensc = value;
        return this;
    }

    /**
     * Gets the value of the gbsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGBSC() {
        return gbsc;
    }

    /**
     * Sets the value of the gbsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setGBSC(String value) {
        this.gbsc = value;
        return this;
    }

    /**
     * Gets the value of the usch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSCH() {
        return usch;
    }

    /**
     * Sets the value of the usch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setUSCH(String value) {
        this.usch = value;
        return this;
    }

    /**
     * Gets the value of the chbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHBC() {
        return chbc;
    }

    /**
     * Sets the value of the chbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setCHBC(String value) {
        this.chbc = value;
        return this;
    }

    /**
     * Gets the value of the usfw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSFW() {
        return usfw;
    }

    /**
     * Sets the value of the usfw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setUSFW(String value) {
        this.usfw = value;
        return this;
    }

    /**
     * Gets the value of the ptncc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTNCC() {
        return ptncc;
    }

    /**
     * Sets the value of the ptncc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setPTNCC(String value) {
        this.ptncc = value;
        return this;
    }

    /**
     * Gets the value of the rucb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUCB() {
        return rucb;
    }

    /**
     * Sets the value of the rucb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setRUCB(String value) {
        this.rucb = value;
        return this;
    }

    /**
     * Gets the value of the itncc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITNCC() {
        return itncc;
    }

    /**
     * Sets the value of the itncc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setITNCC(String value) {
        this.itncc = value;
        return this;
    }

    /**
     * Gets the value of the atblz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATBLZ() {
        return atblz;
    }

    /**
     * Sets the value of the atblz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setATBLZ(String value) {
        this.atblz = value;
        return this;
    }

    /**
     * Gets the value of the cacpa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCACPA() {
        return cacpa;
    }

    /**
     * Sets the value of the cacpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setCACPA(String value) {
        this.cacpa = value;
        return this;
    }

    /**
     * Gets the value of the chsic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHSIC() {
        return chsic;
    }

    /**
     * Sets the value of the chsic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setCHSIC(String value) {
        this.chsic = value;
        return this;
    }

    /**
     * Gets the value of the deblz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBLZ() {
        return deblz;
    }

    /**
     * Sets the value of the deblz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setDEBLZ(String value) {
        this.deblz = value;
        return this;
    }

    /**
     * Gets the value of the esncc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESNCC() {
        return esncc;
    }

    /**
     * Sets the value of the esncc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setESNCC(String value) {
        this.esncc = value;
        return this;
    }

    /**
     * Gets the value of the zancc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZANCC() {
        return zancc;
    }

    /**
     * Sets the value of the zancc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setZANCC(String value) {
        this.zancc = value;
        return this;
    }

    /**
     * Gets the value of the hkncc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHKNCC() {
        return hkncc;
    }

    /**
     * Sets the value of the hkncc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setHKNCC(String value) {
        this.hkncc = value;
        return this;
    }

    /**
     * Gets the value of the aubsBx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUBSBx() {
        return aubsBx;
    }

    /**
     * Sets the value of the aubsBx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setAUBSBx(String value) {
        this.aubsBx = value;
        return this;
    }

    /**
     * Gets the value of the aubsBs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUBSBs() {
        return aubsBs;
    }

    /**
     * Sets the value of the aubsBs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentificationChoice setAUBSBs(String value) {
        this.aubsBs = value;
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
