
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
 * Java class for HSMPartitionList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMPartitionList", propOrder = {
    "hsmPartition"
})
public class SwHSMPartitionList {

    @XmlElement(name = "HSMPartition", required = true)
    protected List<SwHSMPartition> hsmPartition;

    /**
     * Gets the value of the hsmPartition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hsmPartition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHSMPartition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwHSMPartition }
     * 
     * 
     * @return
     *     The value of the hsmPartition property.
     */
    public List<SwHSMPartition> getHSMPartition() {
        if (hsmPartition == null) {
            hsmPartition = new ArrayList<>();
        }
        return this.hsmPartition;
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
     * Adds a new item to the hSMPartition list.
     * @see #getHSMPartition()
     * 
     */
    public SwHSMPartitionList addHSMPartition(SwHSMPartition hSMPartition) {
        getHSMPartition().add(hSMPartition);
        return this;
    }

}
