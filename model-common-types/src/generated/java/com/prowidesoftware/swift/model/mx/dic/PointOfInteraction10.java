
package com.prowidesoftware.swift.model.mx.dic;

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
 * Point of interaction (POI) performing the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteraction10", propOrder = {
    "id",
    "sysNm",
    "grpId",
    "cpblties",
    "tmZone",
    "termnlIntgtn",
    "cmpnt"
})
public class PointOfInteraction10 {

    @XmlElement(name = "Id", required = true)
    protected GenericIdentification177 id;
    @XmlElement(name = "SysNm")
    protected String sysNm;
    @XmlElement(name = "GrpId")
    protected String grpId;
    @XmlElement(name = "Cpblties")
    protected PointOfInteractionCapabilities9 cpblties;
    @XmlElement(name = "TmZone")
    protected String tmZone;
    @XmlElement(name = "TermnlIntgtn")
    @XmlSchemaType(name = "string")
    protected LocationCategory3Code termnlIntgtn;
    @XmlElement(name = "Cmpnt")
    protected List<PointOfInteractionComponent10> cmpnt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification177 }
     *     
     */
    public GenericIdentification177 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification177 }
     *     
     */
    public PointOfInteraction10 setId(GenericIdentification177 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the sysNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysNm() {
        return sysNm;
    }

    /**
     * Sets the value of the sysNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfInteraction10 setSysNm(String value) {
        this.sysNm = value;
        return this;
    }

    /**
     * Gets the value of the grpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpId() {
        return grpId;
    }

    /**
     * Sets the value of the grpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfInteraction10 setGrpId(String value) {
        this.grpId = value;
        return this;
    }

    /**
     * Gets the value of the cpblties property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionCapabilities9 }
     *     
     */
    public PointOfInteractionCapabilities9 getCpblties() {
        return cpblties;
    }

    /**
     * Sets the value of the cpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionCapabilities9 }
     *     
     */
    public PointOfInteraction10 setCpblties(PointOfInteractionCapabilities9 value) {
        this.cpblties = value;
        return this;
    }

    /**
     * Gets the value of the tmZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmZone() {
        return tmZone;
    }

    /**
     * Sets the value of the tmZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfInteraction10 setTmZone(String value) {
        this.tmZone = value;
        return this;
    }

    /**
     * Gets the value of the termnlIntgtn property.
     * 
     * @return
     *     possible object is
     *     {@link LocationCategory3Code }
     *     
     */
    public LocationCategory3Code getTermnlIntgtn() {
        return termnlIntgtn;
    }

    /**
     * Sets the value of the termnlIntgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCategory3Code }
     *     
     */
    public PointOfInteraction10 setTermnlIntgtn(LocationCategory3Code value) {
        this.termnlIntgtn = value;
        return this;
    }

    /**
     * Gets the value of the cmpnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmpnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmpnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponent10 }
     * 
     * 
     * @return
     *     The value of the cmpnt property.
     */
    public List<PointOfInteractionComponent10> getCmpnt() {
        if (cmpnt == null) {
            cmpnt = new ArrayList<>();
        }
        return this.cmpnt;
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
     * Adds a new item to the cmpnt list.
     * @see #getCmpnt()
     * 
     */
    public PointOfInteraction10 addCmpnt(PointOfInteractionComponent10 cmpnt) {
        getCmpnt().add(cmpnt);
        return this;
    }

}
