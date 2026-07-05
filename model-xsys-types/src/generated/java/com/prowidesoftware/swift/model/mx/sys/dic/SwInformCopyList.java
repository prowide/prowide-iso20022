
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
 * Java class for InformCopyList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformCopyList", propOrder = {
    "informCopy"
})
public class SwInformCopyList {

    @XmlElement(name = "InformCopy", required = true)
    protected List<SwInformCopy> informCopy;

    /**
     * Gets the value of the informCopy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the informCopy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformCopy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwInformCopy }
     * 
     * 
     * @return
     *     The value of the informCopy property.
     */
    public List<SwInformCopy> getInformCopy() {
        if (informCopy == null) {
            informCopy = new ArrayList<>();
        }
        return this.informCopy;
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
     * Adds a new item to the informCopy list.
     * @see #getInformCopy()
     * 
     */
    public SwInformCopyList addInformCopy(SwInformCopy informCopy) {
        getInformCopy().add(informCopy);
        return this;
    }

}
