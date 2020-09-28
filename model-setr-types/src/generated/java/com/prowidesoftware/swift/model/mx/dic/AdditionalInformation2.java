
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
 * Additional information about a request (e.g. financing request).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformation2", propOrder = {
    "ordrWvrRsn",
    "infVal"
})
public class AdditionalInformation2 {

    @XmlElement(name = "OrdrWvrRsn")
    protected List<OrderWaiverReason1Choice> ordrWvrRsn;
    @XmlElement(name = "InfVal")
    protected String infVal;

    /**
     * Gets the value of the ordrWvrRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordrWvrRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrWvrRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderWaiverReason1Choice }
     * 
     * 
     */
    public List<OrderWaiverReason1Choice> getOrdrWvrRsn() {
        if (ordrWvrRsn == null) {
            ordrWvrRsn = new ArrayList<OrderWaiverReason1Choice>();
        }
        return this.ordrWvrRsn;
    }

    /**
     * Gets the value of the infVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfVal() {
        return infVal;
    }

    /**
     * Sets the value of the infVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInformation2 setInfVal(String value) {
        this.infVal = value;
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

    /**
     * Adds a new item to the ordrWvrRsn list.
     * @see #getOrdrWvrRsn()
     * 
     */
    public AdditionalInformation2 addOrdrWvrRsn(OrderWaiverReason1Choice ordrWvrRsn) {
        getOrdrWvrRsn().add(ordrWvrRsn);
        return this;
    }

}
