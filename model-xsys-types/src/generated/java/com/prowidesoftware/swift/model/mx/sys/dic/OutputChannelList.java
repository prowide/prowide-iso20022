
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
    "outptChnlDtls"
})
public class OutputChannelList {

    @XmlElement(name = "OutptChnlDtls", required = true)
    protected List<OutputChannelDetails> outptChnlDtls;

    /**
     * Gets the value of the outptChnlDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the outptChnlDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutptChnlDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputChannelDetails }
     * 
     * 
     * @return
     *     The value of the outptChnlDtls property.
     */
    public List<OutputChannelDetails> getOutptChnlDtls() {
        if (outptChnlDtls == null) {
            outptChnlDtls = new ArrayList<>();
        }
        return this.outptChnlDtls;
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
     * Adds a new item to the outptChnlDtls list.
     * @see #getOutptChnlDtls()
     * 
     */
    public OutputChannelList addOutptChnlDtls(OutputChannelDetails outptChnlDtls) {
        getOutptChnlDtls().add(outptChnlDtls);
        return this;
    }

}
