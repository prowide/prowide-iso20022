
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
@XmlType(name = "Vehicle5", propOrder = {
    "vhclNb",
    "vhclIdNb",
    "fleetNb",
    "subFleetNb",
    "unitNb",
    "trlrNb",
    "vhclTag",
    "vhclTagNtryMd",
    "rplcmntVhclInd",
    "odmtr",
    "hbmtr",
    "mntncId",
    "onBrdDgnstcs",
    "addtlVhclData"
})
public class Vehicle5 {

    @XmlElement(name = "VhclNb")
    protected String vhclNb;
    @XmlElement(name = "VhclIdNb")
    protected String vhclIdNb;
    @XmlElement(name = "FleetNb")
    protected String fleetNb;
    @XmlElement(name = "SubFleetNb")
    protected String subFleetNb;
    @XmlElement(name = "UnitNb")
    protected String unitNb;
    @XmlElement(name = "TrlrNb")
    protected String trlrNb;
    @XmlElement(name = "VhclTag")
    protected String vhclTag;
    @XmlElement(name = "VhclTagNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading5Code vhclTagNtryMd;
    @XmlElement(name = "RplcmntVhclInd")
    protected Boolean rplcmntVhclInd;
    @XmlElement(name = "Odmtr")
    protected BigDecimal odmtr;
    @XmlElement(name = "Hbmtr")
    protected BigDecimal hbmtr;
    @XmlElement(name = "MntncId")
    protected String mntncId;
    @XmlElement(name = "OnBrdDgnstcs")
    protected OnBoardDiagnostics1 onBrdDgnstcs;
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
    public Vehicle5 setVhclNb(String value) {
        this.vhclNb = value;
        return this;
    }

    /**
     * Gets the value of the vhclIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVhclIdNb() {
        return vhclIdNb;
    }

    /**
     * Sets the value of the vhclIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Vehicle5 setVhclIdNb(String value) {
        this.vhclIdNb = value;
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
    public Vehicle5 setFleetNb(String value) {
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
    public Vehicle5 setSubFleetNb(String value) {
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
    public Vehicle5 setUnitNb(String value) {
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
    public Vehicle5 setTrlrNb(String value) {
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
    public Vehicle5 setVhclTag(String value) {
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
    public Vehicle5 setVhclTagNtryMd(CardDataReading5Code value) {
        this.vhclTagNtryMd = value;
        return this;
    }

    /**
     * Gets the value of the rplcmntVhclInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRplcmntVhclInd() {
        return rplcmntVhclInd;
    }

    /**
     * Sets the value of the rplcmntVhclInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Vehicle5 setRplcmntVhclInd(Boolean value) {
        this.rplcmntVhclInd = value;
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
    public Vehicle5 setOdmtr(BigDecimal value) {
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
    public Vehicle5 setHbmtr(BigDecimal value) {
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
    public Vehicle5 setMntncId(String value) {
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
    public Vehicle5 setOnBrdDgnstcs(OnBoardDiagnostics1 value) {
        this.onBrdDgnstcs = value;
        return this;
    }

    /**
     * Gets the value of the addtlVhclData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlVhclData property.
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
     * @return
     *     The value of the addtlVhclData property.
     */
    public List<Vehicle2> getAddtlVhclData() {
        if (addtlVhclData == null) {
            addtlVhclData = new ArrayList<>();
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
    public Vehicle5 addAddtlVhclData(Vehicle2 addtlVhclData) {
        getAddtlVhclData().add(addtlVhclData);
        return this;
    }

}
