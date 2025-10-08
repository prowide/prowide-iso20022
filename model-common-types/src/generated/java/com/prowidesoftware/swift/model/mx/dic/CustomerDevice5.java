
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Details of the customer device.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDevice5", propOrder = {
    "manfctr",
    "manfctrMdlId",
    "tp",
    "othrTp",
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
    "othrOprgSysTp",
    "oprgSysVrsn",
    "oprgSysBld",
    "prvdr",
    "addtlData"
})
public class CustomerDevice5 {

    @XmlElement(name = "Manfctr")
    protected String manfctr;
    @XmlElement(name = "ManfctrMdlId")
    protected String manfctrMdlId;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CustomerDeviceType2Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
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
    protected List<DeviceIdentification1> dvcId;
    @XmlElement(name = "OprgSysId")
    protected String oprgSysId;
    @XmlElement(name = "OprgSysTp")
    protected String oprgSysTp;
    @XmlElement(name = "OthrOprgSysTp")
    protected String othrOprgSysTp;
    @XmlElement(name = "OprgSysVrsn")
    protected String oprgSysVrsn;
    @XmlElement(name = "OprgSysBld")
    protected String oprgSysBld;
    @XmlElement(name = "Prvdr")
    protected String prvdr;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

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
    public CustomerDevice5 setManfctr(String value) {
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
    public CustomerDevice5 setManfctrMdlId(String value) {
        this.manfctrMdlId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDeviceType2Code }
     *     
     */
    public CustomerDeviceType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDeviceType2Code }
     *     
     */
    public CustomerDevice5 setTp(CustomerDeviceType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice5 setOthrTp(String value) {
        this.othrTp = value;
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
    public CustomerDevice5 setLang(String value) {
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
    public CustomerDevice5 setPhne(String value) {
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
    public CustomerDevice5 setGeogcLctn(String value) {
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
    public CustomerDevice5 setLctnCtryCd(String value) {
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
    public CustomerDevice5 setIPAdr(String value) {
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
    public CustomerDevice5 setEmail(String value) {
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
    public CustomerDevice5 setDvcNm(String value) {
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
    public CustomerDevice5 setDvcNmNrmlzd(String value) {
        this.dvcNmNrmlzd = value;
        return this;
    }

    /**
     * Gets the value of the dvcId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dvcId property.
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
     * {@link DeviceIdentification1 }
     * 
     * 
     */
    public List<DeviceIdentification1> getDvcId() {
        if (dvcId == null) {
            dvcId = new ArrayList<DeviceIdentification1>();
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
    public CustomerDevice5 setOprgSysId(String value) {
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
    public CustomerDevice5 setOprgSysTp(String value) {
        this.oprgSysTp = value;
        return this;
    }

    /**
     * Gets the value of the othrOprgSysTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrOprgSysTp() {
        return othrOprgSysTp;
    }

    /**
     * Sets the value of the othrOprgSysTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice5 setOthrOprgSysTp(String value) {
        this.othrOprgSysTp = value;
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
    public CustomerDevice5 setOprgSysVrsn(String value) {
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
    public CustomerDevice5 setOprgSysBld(String value) {
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
    public CustomerDevice5 setPrvdr(String value) {
        this.prvdr = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData1>();
        }
        return this.addtlData;
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
    public CustomerDevice5 addDvcId(DeviceIdentification1 dvcId) {
        getDvcId().add(dvcId);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public CustomerDevice5 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
