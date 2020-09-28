
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
 * Java class for HSMDetailStatusList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMDetailStatusList", propOrder = {
    "hsmDetailStatus"
})
public class SwHSMDetailStatusList {

    @XmlElement(name = "HSMDetailStatus", required = true)
    protected List<SwHSMDetailStatus> hsmDetailStatus;

    /**
     * Gets the value of the hsmDetailStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hsmDetailStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHSMDetailStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwHSMDetailStatus }
     * 
     * 
     */
    public List<SwHSMDetailStatus> getHSMDetailStatus() {
        if (hsmDetailStatus == null) {
            hsmDetailStatus = new ArrayList<SwHSMDetailStatus>();
        }
        return this.hsmDetailStatus;
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
     * Adds a new item to the hSMDetailStatus list.
     * @see #getHSMDetailStatus()
     * 
     */
    public SwHSMDetailStatusList addHSMDetailStatus(SwHSMDetailStatus hSMDetailStatus) {
        getHSMDetailStatus().add(hSMDetailStatus);
        return this;
    }

}
