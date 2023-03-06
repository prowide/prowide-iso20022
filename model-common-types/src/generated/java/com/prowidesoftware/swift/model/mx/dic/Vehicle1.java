
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * Information related to a vehicle used during a transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle1", propOrder = {
    "vhclNb",
    "trlrNb",
    "vhclTag",
    "vhclTagNtryMd",
    "unitNb",
    "rplcmntCar",
    "odmtr",
    "hbmtr",
    "trlrHrs",
    "refrHrs",
    "mntncId",
    "drvrOrVhclCard",
    "addtlVhclData"
})
public class Vehicle1 {

    @XmlElement(name = "VhclNb")
    protected String vhclNb;
    @XmlElement(name = "TrlrNb")
    protected String trlrNb;
    @XmlElement(name = "VhclTag")
    protected String vhclTag;
    @XmlElement(name = "VhclTagNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading5Code vhclTagNtryMd;
    @XmlElement(name = "UnitNb")
    protected String unitNb;
    @XmlElement(name = "RplcmntCar")
    protected Boolean rplcmntCar;
    @XmlElement(name = "Odmtr")
    protected BigDecimal odmtr;
    @XmlElement(name = "Hbmtr")
    protected BigDecimal hbmtr;
    @XmlElement(name = "TrlrHrs")
    protected String trlrHrs;
    @XmlElement(name = "RefrHrs")
    protected String refrHrs;
    @XmlElement(name = "MntncId")
    protected String mntncId;
    @XmlElement(name = "DrvrOrVhclCard")
    protected PlainCardData17 drvrOrVhclCard;
    @XmlElement(name = "AddtlVhclData")
    protected List<Vehicle2> addtlVhclData;

    /**
     * Gets the value of the vhclNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVhclNb() {
        return vhclNb;
    }

    /**
     * Sets the value of the vhclNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Vehicle1 setVhclNb(String value) {
        this.vhclNb = value;
        return this;
    }

    /**
     * Gets the value of the trlrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrlrNb() {
        return trlrNb;
    }

    /**
     * Sets the value of the trlrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Vehicle1 setTrlrNb(String value) {
        this.trlrNb = value;
        return this;
    }

    /**
     * Gets the value of the vhclTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVhclTag() {
        return vhclTag;
    }

    /**
     * Sets the value of the vhclTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Vehicle1 setVhclTag(String value) {
        this.vhclTag = value;
        return this;
    }

    /**
     * Gets the value of the vhclTagNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading5Code }
     *     
     */
    public CardDataReading5Code getVhclTagNtryMd() {
        return vhclTagNtryMd;
    }

    /**
     * Sets the value of the vhclTagNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading5Code }
     *     
     */
    public Vehicle1 setVhclTagNtryMd(CardDataReading5Code value) {
        this.vhclTagNtryMd = value;
        return this;
    }

    /**
     * Gets the value of the unitNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitNb() {
        return unitNb;
    }

    /**
     * Sets the value of the unitNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Vehicle1 setUnitNb(String value) {
        this.unitNb = value;
        return this;
    }

    /**
     * Gets the value of the rplcmntCar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRplcmntCar() {
        return rplcmntCar;
    }

    /**
     * Sets the value of the rplcmntCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Vehicle1 setRplcmntCar(Boolean value) {
        this.rplcmntCar = value;
        return this;
    }

    /**
     * Gets the value of the odmtr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOdmtr() {
        return odmtr;
    }

    /**
     * Sets the value of the odmtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Vehicle1 setOdmtr(BigDecimal value) {
        this.odmtr = value;
        return this;
    }

    /**
     * Gets the value of the hbmtr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHbmtr() {
        return hbmtr;
    }

    /**
     * Sets the value of the hbmtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Vehicle1 setHbmtr(BigDecimal value) {
        this.hbmtr = value;
        return this;
    }

    /**
     * Gets the value of the trlrHrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrlrHrs() {
        return trlrHrs;
    }

    /**
     * Sets the value of the trlrHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Vehicle1 setTrlrHrs(String value) {
        this.trlrHrs = value;
        return this;
    }

    /**
     * Gets the value of the refrHrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefrHrs() {
        return refrHrs;
    }

    /**
     * Sets the value of the refrHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Vehicle1 setRefrHrs(String value) {
        this.refrHrs = value;
        return this;
    }

    /**
     * Gets the value of the mntncId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntncId() {
        return mntncId;
    }

    /**
     * Sets the value of the mntncId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Vehicle1 setMntncId(String value) {
        this.mntncId = value;
        return this;
    }

    /**
     * Gets the value of the drvrOrVhclCard property.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData17 }
     *     
     */
    public PlainCardData17 getDrvrOrVhclCard() {
        return drvrOrVhclCard;
    }

    /**
     * Sets the value of the drvrOrVhclCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData17 }
     *     
     */
    public Vehicle1 setDrvrOrVhclCard(PlainCardData17 value) {
        this.drvrOrVhclCard = value;
        return this;
    }

    /**
     * Gets the value of the addtlVhclData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlVhclData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlVhclData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehicle2 }
     * 
     * 
     */
    public List<Vehicle2> getAddtlVhclData() {
        if (addtlVhclData == null) {
            addtlVhclData = new ArrayList<Vehicle2>();
        }
        return this.addtlVhclData;
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
     * Adds a new item to the addtlVhclData list.
     * @see #getAddtlVhclData()
     * 
     */
    public Vehicle1 addAddtlVhclData(Vehicle2 addtlVhclData) {
        getAddtlVhclData().add(addtlVhclData);
        return this;
    }

}
