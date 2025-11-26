
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
 * Attributes of a fleet vehicle.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle6", propOrder = {
    "nb",
    "idNb",
    "fleetNb",
    "subFleetNb",
    "unitNb",
    "trlrNb",
    "tag",
    "tagNtryMd",
    "rplcmnt",
    "odmtr",
    "hbmtr",
    "mntncId",
    "onBrdDgnstcs",
    "addtlData"
})
public class Vehicle6 {

    @XmlElement(name = "Nb")
    protected String nb;
    @XmlElement(name = "IdNb")
    protected String idNb;
    @XmlElement(name = "FleetNb")
    protected String fleetNb;
    @XmlElement(name = "SubFleetNb")
    protected String subFleetNb;
    @XmlElement(name = "UnitNb")
    protected String unitNb;
    @XmlElement(name = "TrlrNb")
    protected String trlrNb;
    @XmlElement(name = "Tag")
    protected String tag;
    @XmlElement(name = "TagNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading5Code tagNtryMd;
    @XmlElement(name = "Rplcmnt")
    protected Boolean rplcmnt;
    @XmlElement(name = "Odmtr")
    protected BigDecimal odmtr;
    @XmlElement(name = "Hbmtr")
    protected BigDecimal hbmtr;
    @XmlElement(name = "MntncId")
    protected String mntncId;
    @XmlElement(name = "OnBrdDgnstcs")
    protected OnBoardDiagnostics1 onBrdDgnstcs;
    @XmlElement(name = "AddtlData")
    protected List<Vehicle2> addtlData;

    /**
     * Gets the value of the nb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Vehicle6 setNb(String value) {
        this.nb = value;
        return this;
    }

    /**
     * Gets the value of the idNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNb() {
        return idNb;
    }

    /**
     * Sets the value of the idNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Vehicle6 setIdNb(String value) {
        this.idNb = value;
        return this;
    }

    /**
     * Gets the value of the fleetNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleetNb() {
        return fleetNb;
    }

    /**
     * Sets the value of the fleetNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Vehicle6 setFleetNb(String value) {
        this.fleetNb = value;
        return this;
    }

    /**
     * Gets the value of the subFleetNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubFleetNb() {
        return subFleetNb;
    }

    /**
     * Sets the value of the subFleetNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Vehicle6 setSubFleetNb(String value) {
        this.subFleetNb = value;
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
    public Vehicle6 setUnitNb(String value) {
        this.unitNb = value;
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
    public Vehicle6 setTrlrNb(String value) {
        this.trlrNb = value;
        return this;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Vehicle6 setTag(String value) {
        this.tag = value;
        return this;
    }

    /**
     * Gets the value of the tagNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading5Code }
     *     
     */
    public CardDataReading5Code getTagNtryMd() {
        return tagNtryMd;
    }

    /**
     * Sets the value of the tagNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading5Code }
     *     
     */
    public Vehicle6 setTagNtryMd(CardDataReading5Code value) {
        this.tagNtryMd = value;
        return this;
    }

    /**
     * Gets the value of the rplcmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRplcmnt() {
        return rplcmnt;
    }

    /**
     * Sets the value of the rplcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Vehicle6 setRplcmnt(Boolean value) {
        this.rplcmnt = value;
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
    public Vehicle6 setOdmtr(BigDecimal value) {
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
    public Vehicle6 setHbmtr(BigDecimal value) {
        this.hbmtr = value;
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
    public Vehicle6 setMntncId(String value) {
        this.mntncId = value;
        return this;
    }

    /**
     * Gets the value of the onBrdDgnstcs property.
     * 
     * @return
     *     possible object is
     *     {@link OnBoardDiagnostics1 }
     *     
     */
    public OnBoardDiagnostics1 getOnBrdDgnstcs() {
        return onBrdDgnstcs;
    }

    /**
     * Sets the value of the onBrdDgnstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnBoardDiagnostics1 }
     *     
     */
    public Vehicle6 setOnBrdDgnstcs(OnBoardDiagnostics1 value) {
        this.onBrdDgnstcs = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
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
     * {@link Vehicle2 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<Vehicle2> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
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
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Vehicle6 addAddtlData(Vehicle2 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
