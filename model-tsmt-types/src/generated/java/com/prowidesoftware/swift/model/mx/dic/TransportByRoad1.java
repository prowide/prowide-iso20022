
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
 * Information related to the transportation of goods by road.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportByRoad1", propOrder = {
    "plcOfRct",
    "plcOfDlvry"
})
public class TransportByRoad1 {

    @XmlElement(name = "PlcOfRct")
    protected List<String> plcOfRct;
    @XmlElement(name = "PlcOfDlvry", required = true)
    protected List<String> plcOfDlvry;

    /**
     * Gets the value of the plcOfRct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plcOfRct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlcOfRct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPlcOfRct() {
        if (plcOfRct == null) {
            plcOfRct = new ArrayList<String>();
        }
        return this.plcOfRct;
    }

    /**
     * Gets the value of the plcOfDlvry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plcOfDlvry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlcOfDlvry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPlcOfDlvry() {
        if (plcOfDlvry == null) {
            plcOfDlvry = new ArrayList<String>();
        }
        return this.plcOfDlvry;
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
     * Adds a new item to the plcOfRct list.
     * @see #getPlcOfRct()
     * 
     */
    public TransportByRoad1 addPlcOfRct(String plcOfRct) {
        getPlcOfRct().add(plcOfRct);
        return this;
    }

    /**
     * Adds a new item to the plcOfDlvry list.
     * @see #getPlcOfDlvry()
     * 
     */
    public TransportByRoad1 addPlcOfDlvry(String plcOfDlvry) {
        getPlcOfDlvry().add(plcOfDlvry);
        return this;
    }

}
