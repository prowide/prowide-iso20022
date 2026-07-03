
package com.prowidesoftware.swift.model.mx.dic;

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
 * Content of the Display Response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceDisplayResponse2", propOrder = {
    "outptRslt"
})
public class DeviceDisplayResponse2 {

    @XmlElement(name = "OutptRslt", required = true)
    protected List<OutputResult2> outptRslt;

    /**
     * Gets the value of the outptRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outptRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutptRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputResult2 }
     * 
     * 
     */
    public List<OutputResult2> getOutptRslt() {
        if (outptRslt == null) {
            outptRslt = new ArrayList<OutputResult2>();
        }
        return this.outptRslt;
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
     * Adds a new item to the outptRslt list.
     * @see #getOutptRslt()
     * 
     */
    public DeviceDisplayResponse2 addOutptRslt(OutputResult2 outptRslt) {
        getOutptRslt().add(outptRslt);
        return this;
    }

}
