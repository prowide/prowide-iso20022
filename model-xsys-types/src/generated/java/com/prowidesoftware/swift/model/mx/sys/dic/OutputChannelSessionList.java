
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
 * Java class for OutputChannelSessionList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputChannelSessionList", propOrder = {
    "outptChnlSsnDtls"
})
public class OutputChannelSessionList {

    @XmlElement(name = "OutptChnlSsnDtls", required = true)
    protected List<OutputChannelSessionDetails> outptChnlSsnDtls;

    /**
     * Gets the value of the outptChnlSsnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the outptChnlSsnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutptChnlSsnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputChannelSessionDetails }
     * 
     * 
     * @return
     *     The value of the outptChnlSsnDtls property.
     */
    public List<OutputChannelSessionDetails> getOutptChnlSsnDtls() {
        if (outptChnlSsnDtls == null) {
            outptChnlSsnDtls = new ArrayList<>();
        }
        return this.outptChnlSsnDtls;
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
     * Adds a new item to the outptChnlSsnDtls list.
     * @see #getOutptChnlSsnDtls()
     * 
     */
    public OutputChannelSessionList addOutptChnlSsnDtls(OutputChannelSessionDetails outptChnlSsnDtls) {
        getOutptChnlSsnDtls().add(outptChnlSsnDtls);
        return this;
    }

}
