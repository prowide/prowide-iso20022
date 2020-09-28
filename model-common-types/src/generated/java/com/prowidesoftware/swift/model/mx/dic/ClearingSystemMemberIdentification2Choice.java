
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
 * Choice of identifiers for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingSystemMemberIdentification2Choice", propOrder = {
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
    "aubsBs",
    "inifsc",
    "grhebic",
    "plknr",
    "othrClrCdId"
})
public class ClearingSystemMemberIdentification2Choice {

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
    @XmlElement(name = "INIFSC")
    protected String inifsc;
    @XmlElement(name = "GRHEBIC")
    protected String grhebic;
    @XmlElement(name = "PLKNR")
    protected String plknr;
    @XmlElement(name = "OthrClrCdId")
    protected String othrClrCdId;

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
    public ClearingSystemMemberIdentification2Choice setUSCHU(String value) {
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
    public ClearingSystemMemberIdentification2Choice setNZNCC(String value) {
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
    public ClearingSystemMemberIdentification2Choice setIENSC(String value) {
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
    public ClearingSystemMemberIdentification2Choice setGBSC(String value) {
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
    public ClearingSystemMemberIdentification2Choice setUSCH(String value) {
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
    public ClearingSystemMemberIdentification2Choice setCHBC(String value) {
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
    public ClearingSystemMemberIdentification2Choice setUSFW(String value) {
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
    public ClearingSystemMemberIdentification2Choice setPTNCC(String value) {
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
    public ClearingSystemMemberIdentification2Choice setRUCB(String value) {
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
    public ClearingSystemMemberIdentification2Choice setITNCC(String value) {
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
    public ClearingSystemMemberIdentification2Choice setATBLZ(String value) {
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
    public ClearingSystemMemberIdentification2Choice setCACPA(String value) {
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
    public ClearingSystemMemberIdentification2Choice setCHSIC(String value) {
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
    public ClearingSystemMemberIdentification2Choice setDEBLZ(String value) {
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
    public ClearingSystemMemberIdentification2Choice setESNCC(String value) {
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
    public ClearingSystemMemberIdentification2Choice setZANCC(String value) {
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
    public ClearingSystemMemberIdentification2Choice setHKNCC(String value) {
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
    public ClearingSystemMemberIdentification2Choice setAUBSBx(String value) {
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
    public ClearingSystemMemberIdentification2Choice setAUBSBs(String value) {
        this.aubsBs = value;
        return this;
    }

    /**
     * Gets the value of the inifsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINIFSC() {
        return inifsc;
    }

    /**
     * Sets the value of the inifsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentification2Choice setINIFSC(String value) {
        this.inifsc = value;
        return this;
    }

    /**
     * Gets the value of the grhebic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRHEBIC() {
        return grhebic;
    }

    /**
     * Sets the value of the grhebic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentification2Choice setGRHEBIC(String value) {
        this.grhebic = value;
        return this;
    }

    /**
     * Gets the value of the plknr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLKNR() {
        return plknr;
    }

    /**
     * Sets the value of the plknr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentification2Choice setPLKNR(String value) {
        this.plknr = value;
        return this;
    }

    /**
     * Gets the value of the othrClrCdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrClrCdId() {
        return othrClrCdId;
    }

    /**
     * Sets the value of the othrClrCdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingSystemMemberIdentification2Choice setOthrClrCdId(String value) {
        this.othrClrCdId = value;
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
