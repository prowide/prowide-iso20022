
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
 * Java class for GetLastReplicationTimeSnFResponseHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLastReplicationTimeSnFResponseHandle", propOrder = {
    "snFLastReplicationTime"
})
public class SwGetLastReplicationTimeSnFResponseHandle {

    @XmlElement(name = "SnFLastReplicationTime", required = true)
    protected List<String> snFLastReplicationTime;

    /**
     * Gets the value of the snFLastReplicationTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snFLastReplicationTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnFLastReplicationTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSnFLastReplicationTime() {
        if (snFLastReplicationTime == null) {
            snFLastReplicationTime = new ArrayList<String>();
        }
        return this.snFLastReplicationTime;
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
     * Adds a new item to the snFLastReplicationTime list.
     * @see #getSnFLastReplicationTime()
     * 
     */
    public SwGetLastReplicationTimeSnFResponseHandle addSnFLastReplicationTime(String snFLastReplicationTime) {
        getSnFLastReplicationTime().add(snFLastReplicationTime);
        return this;
    }

}
