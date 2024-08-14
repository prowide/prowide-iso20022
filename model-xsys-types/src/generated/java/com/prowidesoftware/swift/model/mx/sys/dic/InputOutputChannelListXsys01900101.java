
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for InputOutputChannelList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputOutputChannelList", propOrder = {
    "inptChnlList",
    "outptChnlList"
})
public class InputOutputChannelListXsys01900101 {

    @XmlElement(name = "InptChnlList")
    protected InputChannelListXsys01900101 inptChnlList;
    @XmlElement(name = "OutptChnlList")
    protected OutputChannelList outptChnlList;

    /**
     * Gets the value of the inptChnlList property.
     * 
     * @return
     *     possible object is
     *     {@link InputChannelListXsys01900101 }
     *     
     */
    public InputChannelListXsys01900101 getInptChnlList() {
        return inptChnlList;
    }

    /**
     * Sets the value of the inptChnlList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputChannelListXsys01900101 }
     *     
     */
    public InputOutputChannelListXsys01900101 setInptChnlList(InputChannelListXsys01900101 value) {
        this.inptChnlList = value;
        return this;
    }

    /**
     * Gets the value of the outptChnlList property.
     * 
     * @return
     *     possible object is
     *     {@link OutputChannelList }
     *     
     */
    public OutputChannelList getOutptChnlList() {
        return outptChnlList;
    }

    /**
     * Sets the value of the outptChnlList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputChannelList }
     *     
     */
    public InputOutputChannelListXsys01900101 setOutptChnlList(OutputChannelList value) {
        this.outptChnlList = value;
        return this;
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

}
