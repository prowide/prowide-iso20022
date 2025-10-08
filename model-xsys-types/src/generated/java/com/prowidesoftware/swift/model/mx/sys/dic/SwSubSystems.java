
package com.prowidesoftware.swift.model.mx.sys.dic;

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
 * Java class for SubSystems complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubSystems", propOrder = {
    "overallStatus",
    "subSystemStatus"
})
public class SwSubSystems {

    @XmlElement(name = "OverallStatus", required = true)
    protected String overallStatus;
    @XmlElement(name = "SubSystemStatus", required = true)
    protected List<SwSubSystemStatus> subSystemStatus;

    /**
     * Gets the value of the overallStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverallStatus() {
        return overallStatus;
    }

    /**
     * Sets the value of the overallStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSubSystems setOverallStatus(String value) {
        this.overallStatus = value;
        return this;
    }

    /**
     * Gets the value of the subSystemStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subSystemStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubSystemStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwSubSystemStatus }
     * 
     * 
     */
    public List<SwSubSystemStatus> getSubSystemStatus() {
        if (subSystemStatus == null) {
            subSystemStatus = new ArrayList<SwSubSystemStatus>();
        }
        return this.subSystemStatus;
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
     * Adds a new item to the subSystemStatus list.
     * @see #getSubSystemStatus()
     * 
     */
    public SwSubSystems addSubSystemStatus(SwSubSystemStatus subSystemStatus) {
        getSubSystemStatus().add(subSystemStatus);
        return this;
    }

}
