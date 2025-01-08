
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
 * Java class for HSMBoxList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMBoxList", propOrder = {
    "hsmBox"
})
public class SwHSMBoxList {

    @XmlElement(name = "HSMBox", required = true)
    protected List<SwHSMBox> hsmBox;

    /**
     * Gets the value of the hsmBox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hsmBox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHSMBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwHSMBox }
     * 
     * 
     * @return
     *     The value of the hsmBox property.
     */
    public List<SwHSMBox> getHSMBox() {
        if (hsmBox == null) {
            hsmBox = new ArrayList<>();
        }
        return this.hsmBox;
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
     * Adds a new item to the hSMBox list.
     * @see #getHSMBox()
     * 
     */
    public SwHSMBoxList addHSMBox(SwHSMBox hSMBox) {
        getHSMBox().add(hSMBox);
        return this;
    }

}
