
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
 * Content of the Display Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceDisplayRequest2", propOrder = {
    "dispOutpt"
})
public class DeviceDisplayRequest2 {

    @XmlElement(name = "DispOutpt", required = true)
    protected List<ActionMessage7> dispOutpt;

    /**
     * Gets the value of the dispOutpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dispOutpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispOutpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionMessage7 }
     * 
     * 
     * @return
     *     The value of the dispOutpt property.
     */
    public List<ActionMessage7> getDispOutpt() {
        if (dispOutpt == null) {
            dispOutpt = new ArrayList<>();
        }
        return this.dispOutpt;
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
     * Adds a new item to the dispOutpt list.
     * @see #getDispOutpt()
     * 
     */
    public DeviceDisplayRequest2 addDispOutpt(ActionMessage7 dispOutpt) {
        getDispOutpt().add(dispOutpt);
        return this;
    }

}
