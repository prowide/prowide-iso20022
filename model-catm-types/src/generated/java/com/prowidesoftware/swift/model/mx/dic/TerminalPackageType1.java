
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
 * Group of software packages related to a group of POIComponent of the POI System.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalPackageType1", propOrder = {
    "poiCmpntId",
    "packg"
})
public class TerminalPackageType1 {

    @XmlElement(name = "POICmpntId")
    protected List<PointOfInteractionComponentIdentification1> poiCmpntId;
    @XmlElement(name = "Packg", required = true)
    protected List<PackageType1> packg;

    /**
     * Gets the value of the poiCmpntId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the poiCmpntId property.
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
     * {@link PointOfInteractionComponentIdentification1 }
     * 
     * 
     * @return
     *     The value of the poiCmpntId property.
     */
    public List<PointOfInteractionComponentIdentification1> getPOICmpntId() {
        if (poiCmpntId == null) {
            poiCmpntId = new ArrayList<>();
        }
        return this.poiCmpntId;
    }

    /**
     * Gets the value of the packg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the packg property.
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
     * {@link PackageType1 }
     * 
     * 
     * @return
     *     The value of the packg property.
     */
    public List<PackageType1> getPackg() {
        if (packg == null) {
            packg = new ArrayList<>();
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
    public TerminalPackageType1 addPOICmpntId(PointOfInteractionComponentIdentification1 pOICmpntId) {
        getPOICmpntId().add(pOICmpntId);
        return this;
    }

    /**
     * Adds a new item to the packg list.
     * @see #getPackg()
     * 
     */
    public TerminalPackageType1 addPackg(PackageType1 packg) {
        getPackg().add(packg);
        return this;
    }

}
