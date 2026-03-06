
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
 * Java class for InputChannelList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputChannelList", propOrder = {
    "inptChanlDtls"
})
public class InputChannelListXsys00700101 {

    @XmlElement(name = "InptChanlDtls", required = true)
    protected List<InputChannelDetailsXsys00700101> inptChanlDtls;

    /**
     * Gets the value of the inptChanlDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the inptChanlDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInptChanlDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InputChannelDetailsXsys00700101 }
     * 
     * 
     * @return
     *     The value of the inptChanlDtls property.
     */
    public List<InputChannelDetailsXsys00700101> getInptChanlDtls() {
        if (inptChanlDtls == null) {
            inptChanlDtls = new ArrayList<>();
        }
        return this.inptChanlDtls;
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
     * Adds a new item to the inptChanlDtls list.
     * @see #getInptChanlDtls()
     * 
     */
    public InputChannelListXsys00700101 addInptChanlDtls(InputChannelDetailsXsys00700101 inptChanlDtls) {
        getInptChanlDtls().add(inptChanlDtls);
        return this;
    }

}
