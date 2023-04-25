
package com.prowidesoftware.swift.model.mx.sys.dic;

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
 * Java class for SnFDeliveryHistory complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnFDeliveryHistory", propOrder = {
    "snFDeliveryInfo"
})
public class SwSnFDeliveryHistory {

    @XmlElement(name = "SnFDeliveryInfo")
    protected List<SwSnFDeliveryInfo> snFDeliveryInfo;

    /**
     * Gets the value of the snFDeliveryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the snFDeliveryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnFDeliveryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwSnFDeliveryInfo }
     * 
     * 
     * @return
     *     The value of the snFDeliveryInfo property.
     */
    public List<SwSnFDeliveryInfo> getSnFDeliveryInfo() {
        if (snFDeliveryInfo == null) {
            snFDeliveryInfo = new ArrayList<>();
        }
        return this.snFDeliveryInfo;
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
     * Adds a new item to the snFDeliveryInfo list.
     * @see #getSnFDeliveryInfo()
     * 
     */
    public SwSnFDeliveryHistory addSnFDeliveryInfo(SwSnFDeliveryInfo snFDeliveryInfo) {
        getSnFDeliveryInfo().add(snFDeliveryInfo);
        return this;
    }

}
