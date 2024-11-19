
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
 * Parameters to synchronise a real time clock.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClockSynchronisation1", propOrder = {
    "poiTmZone",
    "synctnSvr"
})
public class ClockSynchronisation1 {

    @XmlElement(name = "POITmZone", required = true)
    protected String poiTmZone;
    @XmlElement(name = "SynctnSvr")
    protected List<NetworkParameters2> synctnSvr;

    /**
     * Gets the value of the poiTmZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOITmZone() {
        return poiTmZone;
    }

    /**
     * Sets the value of the poiTmZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClockSynchronisation1 setPOITmZone(String value) {
        this.poiTmZone = value;
        return this;
    }

    /**
     * Gets the value of the synctnSvr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the synctnSvr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynctnSvr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkParameters2 }
     * 
     * 
     * @return
     *     The value of the synctnSvr property.
     */
    public List<NetworkParameters2> getSynctnSvr() {
        if (synctnSvr == null) {
            synctnSvr = new ArrayList<>();
        }
        return this.synctnSvr;
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
     * Adds a new item to the synctnSvr list.
     * @see #getSynctnSvr()
     * 
     */
    public ClockSynchronisation1 addSynctnSvr(NetworkParameters2 synctnSvr) {
        getSynctnSvr().add(synctnSvr);
        return this;
    }

}
