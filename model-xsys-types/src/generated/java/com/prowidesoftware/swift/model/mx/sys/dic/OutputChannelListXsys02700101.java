
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
 * Java class for OutputChannelList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputChannelList", propOrder = {
    "outptChanlDtls"
})
public class OutputChannelListXsys02700101 {

    @XmlElement(name = "OutptChanlDtls", required = true)
    protected List<OutputChannelDetailsXsys02700101> outptChanlDtls;

    /**
     * Gets the value of the outptChanlDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the outptChanlDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutptChanlDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputChannelDetailsXsys02700101 }
     * 
     * 
     * @return
     *     The value of the outptChanlDtls property.
     */
    public List<OutputChannelDetailsXsys02700101> getOutptChanlDtls() {
        if (outptChanlDtls == null) {
            outptChanlDtls = new ArrayList<>();
        }
        return this.outptChanlDtls;
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
     * Adds a new item to the outptChanlDtls list.
     * @see #getOutptChanlDtls()
     * 
     */
    public OutputChannelListXsys02700101 addOutptChanlDtls(OutputChannelDetailsXsys02700101 outptChanlDtls) {
        getOutptChanlDtls().add(outptChanlDtls);
        return this;
    }

}
