
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
 * Java class for QueueStatusList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueStatusList", propOrder = {
    "qSts"
})
public class QueueStatusListXsys00900101 {

    @XmlElement(name = "QSts", required = true)
    protected List<QueueStatus> qSts;

    /**
     * Gets the value of the qSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueueStatus }
     * 
     * 
     */
    public List<QueueStatus> getQSts() {
        if (qSts == null) {
            qSts = new ArrayList<QueueStatus>();
        }
        return this.qSts;
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
     * Adds a new item to the qSts list.
     * @see #getQSts()
     * 
     */
    public QueueStatusListXsys00900101 addQSts(QueueStatus qSts) {
        getQSts().add(qSts);
        return this;
    }

}
