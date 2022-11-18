
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
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
@XmlType(name = "ClockSynchronisation3", propOrder = {
    "poiTmZone",
    "synctnSvr",
    "dely"
})
public class ClockSynchronisation3 {

    @XmlElement(name = "POITmZone", required = true)
    protected String poiTmZone;
    @XmlElement(name = "SynctnSvr")
    protected List<NetworkParameters7> synctnSvr;
    @XmlElement(name = "Dely", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar dely;

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
    public ClockSynchronisation3 setPOITmZone(String value) {
        this.poiTmZone = value;
        return this;
    }

    /**
     * Gets the value of the synctnSvr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synctnSvr property.
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
     * {@link NetworkParameters7 }
     * 
     * 
     */
    public List<NetworkParameters7> getSynctnSvr() {
        if (synctnSvr == null) {
            synctnSvr = new ArrayList<NetworkParameters7>();
        }
        return this.synctnSvr;
    }

    /**
     * Gets the value of the dely property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDely() {
        return dely;
    }

    /**
     * Sets the value of the dely property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClockSynchronisation3 setDely(XMLGregorianCalendar value) {
        this.dely = value;
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
     * Adds a new item to the synctnSvr list.
     * @see #getSynctnSvr()
     * 
     */
    public ClockSynchronisation3 addSynctnSvr(NetworkParameters7 synctnSvr) {
        getSynctnSvr().add(synctnSvr);
        return this;
    }

}
