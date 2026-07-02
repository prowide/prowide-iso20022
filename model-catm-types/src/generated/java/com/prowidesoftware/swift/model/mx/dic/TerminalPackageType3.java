
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Group of software packages related to a group of POIComponent of the POI System.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalPackageType3", propOrder = {
    "poiCmpntId",
    "packg"
})
public class TerminalPackageType3 {

    @XmlElement(name = "POICmpntId")
    protected List<PointOfInteractionComponentIdentification2> poiCmpntId;
    @XmlElement(name = "Packg", required = true)
    protected List<PackageType3> packg;

    /**
     * Gets the value of the poiCmpntId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poiCmpntId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOICmpntId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponentIdentification2 }
     * 
     * 
     */
    public List<PointOfInteractionComponentIdentification2> getPOICmpntId() {
        if (poiCmpntId == null) {
            poiCmpntId = new ArrayList<PointOfInteractionComponentIdentification2>();
        }
        return this.poiCmpntId;
    }

    /**
     * Gets the value of the packg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType3 }
     * 
     * 
     */
    public List<PackageType3> getPackg() {
        if (packg == null) {
            packg = new ArrayList<PackageType3>();
        }
        return this.packg;
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
     * Adds a new item to the pOICmpntId list.
     * @see #getPOICmpntId()
     * 
     */
    public TerminalPackageType3 addPOICmpntId(PointOfInteractionComponentIdentification2 pOICmpntId) {
        getPOICmpntId().add(pOICmpntId);
        return this;
    }

    /**
     * Adds a new item to the packg list.
     * @see #getPackg()
     * 
     */
    public TerminalPackageType3 addPackg(PackageType3 packg) {
        getPackg().add(packg);
        return this;
    }

}
