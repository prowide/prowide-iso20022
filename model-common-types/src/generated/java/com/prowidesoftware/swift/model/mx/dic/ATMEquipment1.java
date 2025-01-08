
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
 * ATM terminal equipment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMEquipment1", propOrder = {
    "manfctr",
    "mdl",
    "srlNb",
    "applPrvdr",
    "applNm",
    "applVrsn",
    "apprvlNb",
    "cfgtnParam"
})
public class ATMEquipment1 {

    @XmlElement(name = "Manfctr")
    protected String manfctr;
    @XmlElement(name = "Mdl")
    protected String mdl;
    @XmlElement(name = "SrlNb")
    protected String srlNb;
    @XmlElement(name = "ApplPrvdr")
    protected String applPrvdr;
    @XmlElement(name = "ApplNm")
    protected String applNm;
    @XmlElement(name = "ApplVrsn")
    protected String applVrsn;
    @XmlElement(name = "ApprvlNb")
    protected String apprvlNb;
    @XmlElement(name = "CfgtnParam")
    protected List<ATMConfigurationParameter1> cfgtnParam;

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
    public ATMEquipment1 setManfctr(String value) {
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
    public ATMEquipment1 setMdl(String value) {
        this.mdl = value;
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
    public ATMEquipment1 setSrlNb(String value) {
        this.srlNb = value;
        return this;
    }

    /**
     * Gets the value of the applPrvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplPrvdr() {
        return applPrvdr;
    }

    /**
     * Sets the value of the applPrvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMEquipment1 setApplPrvdr(String value) {
        this.applPrvdr = value;
        return this;
    }

    /**
     * Gets the value of the applNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplNm() {
        return applNm;
    }

    /**
     * Sets the value of the applNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMEquipment1 setApplNm(String value) {
        this.applNm = value;
        return this;
    }

    /**
     * Gets the value of the applVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplVrsn() {
        return applVrsn;
    }

    /**
     * Sets the value of the applVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMEquipment1 setApplVrsn(String value) {
        this.applVrsn = value;
        return this;
    }

    /**
     * Gets the value of the apprvlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprvlNb() {
        return apprvlNb;
    }

    /**
     * Sets the value of the apprvlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMEquipment1 setApprvlNb(String value) {
        this.apprvlNb = value;
        return this;
    }

    /**
     * Gets the value of the cfgtnParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cfgtnParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCfgtnParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMConfigurationParameter1 }
     * 
     * 
     * @return
     *     The value of the cfgtnParam property.
     */
    public List<ATMConfigurationParameter1> getCfgtnParam() {
        if (cfgtnParam == null) {
            cfgtnParam = new ArrayList<>();
        }
        return this.cfgtnParam;
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
     * Adds a new item to the cfgtnParam list.
     * @see #getCfgtnParam()
     * 
     */
    public ATMEquipment1 addCfgtnParam(ATMConfigurationParameter1 cfgtnParam) {
        getCfgtnParam().add(cfgtnParam);
        return this;
    }

}
