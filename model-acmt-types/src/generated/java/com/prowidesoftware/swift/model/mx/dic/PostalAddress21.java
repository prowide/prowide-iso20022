
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
 * Information that locates and identifies a specific address, as defined by postal services.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress21", propOrder = {
    "adrTp",
    "mlngInd",
    "regnAdrInd",
    "careOf",
    "adrLine",
    "strtNm",
    "bldgNb",
    "bldgNm",
    "pstBx",
    "sdInBldg",
    "flr",
    "suiteId",
    "pstCd",
    "dstrctNm",
    "vllg",
    "twnNm",
    "stat",
    "ctry"
})
public class PostalAddress21 {

    @XmlElement(name = "AdrTp")
    protected AddressType2Choice adrTp;
    @XmlElement(name = "MlngInd")
    protected Boolean mlngInd;
    @XmlElement(name = "RegnAdrInd")
    protected Boolean regnAdrInd;
    @XmlElement(name = "CareOf")
    protected String careOf;
    @XmlElement(name = "AdrLine")
    protected List<String> adrLine;
    @XmlElement(name = "StrtNm")
    protected String strtNm;
    @XmlElement(name = "BldgNb")
    protected String bldgNb;
    @XmlElement(name = "BldgNm")
    protected String bldgNm;
    @XmlElement(name = "PstBx")
    protected String pstBx;
    @XmlElement(name = "SdInBldg")
    protected String sdInBldg;
    @XmlElement(name = "Flr")
    protected String flr;
    @XmlElement(name = "SuiteId")
    protected String suiteId;
    @XmlElement(name = "PstCd")
    protected String pstCd;
    @XmlElement(name = "DstrctNm")
    protected String dstrctNm;
    @XmlElement(name = "Vllg")
    protected String vllg;
    @XmlElement(name = "TwnNm")
    protected String twnNm;
    @XmlElement(name = "Stat")
    protected String stat;
    @XmlElement(name = "Ctry", required = true)
    protected String ctry;

    /**
     * Gets the value of the adrTp property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType2Choice }
     *     
     */
    public AddressType2Choice getAdrTp() {
        return adrTp;
    }

    /**
     * Sets the value of the adrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType2Choice }
     *     
     */
    public PostalAddress21 setAdrTp(AddressType2Choice value) {
        this.adrTp = value;
        return this;
    }

    /**
     * Gets the value of the mlngInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMlngInd() {
        return mlngInd;
    }

    /**
     * Sets the value of the mlngInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PostalAddress21 setMlngInd(Boolean value) {
        this.mlngInd = value;
        return this;
    }

    /**
     * Gets the value of the regnAdrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegnAdrInd() {
        return regnAdrInd;
    }

    /**
     * Sets the value of the regnAdrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PostalAddress21 setRegnAdrInd(Boolean value) {
        this.regnAdrInd = value;
        return this;
    }

    /**
     * Gets the value of the careOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareOf() {
        return careOf;
    }

    /**
     * Sets the value of the careOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostalAddress21 setCareOf(String value) {
        this.careOf = value;
        return this;
    }

    /**
     * Gets the value of the adrLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adrLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdrLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdrLine() {
        if (adrLine == null) {
            adrLine = new ArrayList<String>();
        }
        return this.adrLine;
    }

    /**
     * Gets the value of the strtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtNm() {
        return strtNm;
    }

    /**
     * Sets the value of the strtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostalAddress21 setStrtNm(String value) {
        this.strtNm = value;
        return this;
    }

    /**
     * Gets the value of the bldgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldgNb() {
        return bldgNb;
    }

    /**
     * Sets the value of the bldgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostalAddress21 setBldgNb(String value) {
        this.bldgNb = value;
        return this;
    }

    /**
     * Gets the value of the bldgNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldgNm() {
        return bldgNm;
    }

    /**
     * Sets the value of the bldgNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostalAddress21 setBldgNm(String value) {
        this.bldgNm = value;
        return this;
    }

    /**
     * Gets the value of the pstBx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstBx() {
        return pstBx;
    }

    /**
     * Sets the value of the pstBx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostalAddress21 setPstBx(String value) {
        this.pstBx = value;
        return this;
    }

    /**
     * Gets the value of the sdInBldg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdInBldg() {
        return sdInBldg;
    }

    /**
     * Sets the value of the sdInBldg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostalAddress21 setSdInBldg(String value) {
        this.sdInBldg = value;
        return this;
    }

    /**
     * Gets the value of the flr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlr() {
        return flr;
    }

    /**
     * Sets the value of the flr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostalAddress21 setFlr(String value) {
        this.flr = value;
        return this;
    }

    /**
     * Gets the value of the suiteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuiteId() {
        return suiteId;
    }

    /**
     * Sets the value of the suiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostalAddress21 setSuiteId(String value) {
        this.suiteId = value;
        return this;
    }

    /**
     * Gets the value of the pstCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstCd() {
        return pstCd;
    }

    /**
     * Sets the value of the pstCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostalAddress21 setPstCd(String value) {
        this.pstCd = value;
        return this;
    }

    /**
     * Gets the value of the dstrctNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstrctNm() {
        return dstrctNm;
    }

    /**
     * Sets the value of the dstrctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostalAddress21 setDstrctNm(String value) {
        this.dstrctNm = value;
        return this;
    }

    /**
     * Gets the value of the vllg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVllg() {
        return vllg;
    }

    /**
     * Sets the value of the vllg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostalAddress21 setVllg(String value) {
        this.vllg = value;
        return this;
    }

    /**
     * Gets the value of the twnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwnNm() {
        return twnNm;
    }

    /**
     * Sets the value of the twnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostalAddress21 setTwnNm(String value) {
        this.twnNm = value;
        return this;
    }

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostalAddress21 setStat(String value) {
        this.stat = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostalAddress21 setCtry(String value) {
        this.ctry = value;
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

    /**
     * Adds a new item to the adrLine list.
     * @see #getAdrLine()
     * 
     */
    public PostalAddress21 addAdrLine(String adrLine) {
        getAdrLine().add(adrLine);
        return this;
    }

}
