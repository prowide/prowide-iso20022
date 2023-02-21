
package com.prowidesoftware.swift.model.mx.dic;

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
 * Details of one or several keys of the request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDetails4", propOrder = {
    "key",
    "rptData"
})
public class RequestDetails4 {

    @XmlElement(name = "Key", required = true)
    protected String key;
    @XmlElement(name = "RptData")
    protected List<ReportParameter1> rptData;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequestDetails4 setKey(String value) {
        this.key = value;
        return this;
    }

    /**
     * Gets the value of the rptData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rptData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportParameter1 }
     * 
     * 
     */
    public List<ReportParameter1> getRptData() {
        if (rptData == null) {
            rptData = new ArrayList<ReportParameter1>();
        }
        return this.rptData;
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
     * Adds a new item to the rptData list.
     * @see #getRptData()
     * 
     */
    public RequestDetails4 addRptData(ReportParameter1 rptData) {
        getRptData().add(rptData);
        return this;
    }

}
