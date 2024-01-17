
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
 * Java class for RetrievedInputMessageList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievedInputMessageList", propOrder = {
    "rtrvdInptMsg"
})
public class RetrievedInputMessageList {

    @XmlElement(name = "RtrvdInptMsg", required = true)
    protected List<RetrievedInputMessage> rtrvdInptMsg;

    /**
     * Gets the value of the rtrvdInptMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rtrvdInptMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtrvdInptMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetrievedInputMessage }
     * 
     * 
     * @return
     *     The value of the rtrvdInptMsg property.
     */
    public List<RetrievedInputMessage> getRtrvdInptMsg() {
        if (rtrvdInptMsg == null) {
            rtrvdInptMsg = new ArrayList<>();
        }
        return this.rtrvdInptMsg;
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
     * Adds a new item to the rtrvdInptMsg list.
     * @see #getRtrvdInptMsg()
     * 
     */
    public RetrievedInputMessageList addRtrvdInptMsg(RetrievedInputMessage rtrvdInptMsg) {
        getRtrvdInptMsg().add(rtrvdInptMsg);
        return this;
    }

}
