
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the customer device.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDevice6", propOrder = {
    "manfctr",
    "manfctrMdlId",
    "tp",
    "lang",
    "phne",
    "geogcLctn",
    "lctnCtryCd",
    "ipAdr",
    "email",
    "dvcNm",
    "dvcNmNrmlzd",
    "dvcId",
    "oprgSysId",
    "oprgSysTp",
    "oprgSysVrsn",
    "oprgSysBld",
    "prvdr",
    "geogcLctnSrc",
    "dvcTmZone",
    "dvcTmZoneSrc",
    "prvtData",
    "ntlData"
})
public class CustomerDevice6 {

    @XmlElement(name = "Manfctr")
    protected String manfctr;
    @XmlElement(name = "ManfctrMdlId")
    protected String manfctrMdlId;
    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "Phne")
    protected String phne;
    @XmlElement(name = "GeogcLctn")
    protected String geogcLctn;
    @XmlElement(name = "LctnCtryCd")
    protected String lctnCtryCd;
    @XmlElement(name = "IPAdr")
    protected String ipAdr;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "DvcNm")
    protected String dvcNm;
    @XmlElement(name = "DvcNmNrmlzd")
    protected String dvcNmNrmlzd;
    @XmlElement(name = "DvcId")
    protected List<DeviceIdentification2> dvcId;
    @XmlElement(name = "OprgSysId")
    protected String oprgSysId;
    @XmlElement(name = "OprgSysTp")
    protected String oprgSysTp;
    @XmlElement(name = "OprgSysVrsn")
    protected String oprgSysVrsn;
    @XmlElement(name = "OprgSysBld")
    protected String oprgSysBld;
    @XmlElement(name = "Prvdr")
    protected String prvdr;
    @XmlElement(name = "GeogcLctnSrc")
    protected String geogcLctnSrc;
    @XmlElement(name = "DvcTmZone")
    protected String dvcTmZone;
    @XmlElement(name = "DvcTmZoneSrc")
    protected String dvcTmZoneSrc;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

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
    public CustomerDevice6 setManfctr(String value) {
        this.manfctr = value;
        return this;
    }

    /**
     * Gets the value of the manfctrMdlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManfctrMdlId() {
        return manfctrMdlId;
    }

    /**
     * Sets the value of the manfctrMdlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice6 setManfctrMdlId(String value) {
        this.manfctrMdlId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice6 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice6 setLang(String value) {
        this.lang = value;
        return this;
    }

    /**
     * Gets the value of the phne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhne() {
        return phne;
    }

    /**
     * Sets the value of the phne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice6 setPhne(String value) {
        this.phne = value;
        return this;
    }

    /**
     * Gets the value of the geogcLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeogcLctn() {
        return geogcLctn;
    }

    /**
     * Sets the value of the geogcLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice6 setGeogcLctn(String value) {
        this.geogcLctn = value;
        return this;
    }

    /**
     * Gets the value of the lctnCtryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctnCtryCd() {
        return lctnCtryCd;
    }

    /**
     * Sets the value of the lctnCtryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice6 setLctnCtryCd(String value) {
        this.lctnCtryCd = value;
        return this;
    }

    /**
     * Gets the value of the ipAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAdr() {
        return ipAdr;
    }

    /**
     * Sets the value of the ipAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice6 setIPAdr(String value) {
        this.ipAdr = value;
        return this;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice6 setEmail(String value) {
        this.email = value;
        return this;
    }

    /**
     * Gets the value of the dvcNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcNm() {
        return dvcNm;
    }

    /**
     * Sets the value of the dvcNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice6 setDvcNm(String value) {
        this.dvcNm = value;
        return this;
    }

    /**
     * Gets the value of the dvcNmNrmlzd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcNmNrmlzd() {
        return dvcNmNrmlzd;
    }

    /**
     * Sets the value of the dvcNmNrmlzd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice6 setDvcNmNrmlzd(String value) {
        this.dvcNmNrmlzd = value;
        return this;
    }

    /**
     * Gets the value of the dvcId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dvcId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDvcId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceIdentification2 }
     * 
     * 
     * @return
     *     The value of the dvcId property.
     */
    public List<DeviceIdentification2> getDvcId() {
        if (dvcId == null) {
            dvcId = new ArrayList<>();
        }
        return this.dvcId;
    }

    /**
     * Gets the value of the oprgSysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOprgSysId() {
        return oprgSysId;
    }

    /**
     * Sets the value of the oprgSysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice6 setOprgSysId(String value) {
        this.oprgSysId = value;
        return this;
    }

    /**
     * Gets the value of the oprgSysTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOprgSysTp() {
        return oprgSysTp;
    }

    /**
     * Sets the value of the oprgSysTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice6 setOprgSysTp(String value) {
        this.oprgSysTp = value;
        return this;
    }

    /**
     * Gets the value of the oprgSysVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOprgSysVrsn() {
        return oprgSysVrsn;
    }

    /**
     * Sets the value of the oprgSysVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice6 setOprgSysVrsn(String value) {
        this.oprgSysVrsn = value;
        return this;
    }

    /**
     * Gets the value of the oprgSysBld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOprgSysBld() {
        return oprgSysBld;
    }

    /**
     * Sets the value of the oprgSysBld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice6 setOprgSysBld(String value) {
        this.oprgSysBld = value;
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
    public CustomerDevice6 setPrvdr(String value) {
        this.prvdr = value;
        return this;
    }

    /**
     * Gets the value of the geogcLctnSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeogcLctnSrc() {
        return geogcLctnSrc;
    }

    /**
     * Sets the value of the geogcLctnSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice6 setGeogcLctnSrc(String value) {
        this.geogcLctnSrc = value;
        return this;
    }

    /**
     * Gets the value of the dvcTmZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcTmZone() {
        return dvcTmZone;
    }

    /**
     * Sets the value of the dvcTmZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice6 setDvcTmZone(String value) {
        this.dvcTmZone = value;
        return this;
    }

    /**
     * Gets the value of the dvcTmZoneSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcTmZoneSrc() {
        return dvcTmZoneSrc;
    }

    /**
     * Sets the value of the dvcTmZoneSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice6 setDvcTmZoneSrc(String value) {
        this.dvcTmZoneSrc = value;
        return this;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
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

    /**
     * Adds a new item to the dvcId list.
     * @see #getDvcId()
     * 
     */
    public CustomerDevice6 addDvcId(DeviceIdentification2 dvcId) {
        getDvcId().add(dvcId);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public CustomerDevice6 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public CustomerDevice6 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
