
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
 * New order related data report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewOrderReport2", propOrder = {
    "rptId",
    "ordr"
})
public class NewOrderReport2 {

    @XmlElement(name = "RptId", required = true)
    protected String rptId;
    @XmlElement(name = "Ordr", required = true)
    protected List<OrderData3> ordr;

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NewOrderReport2 setRptId(String value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the ordr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderData3 }
     * 
     * 
     */
    public List<OrderData3> getOrdr() {
        if (ordr == null) {
            ordr = new ArrayList<OrderData3>();
        }
        return this.ordr;
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
     * Adds a new item to the ordr list.
     * @see #getOrdr()
     * 
     */
    public NewOrderReport2 addOrdr(OrderData3 ordr) {
        getOrdr().add(ordr);
        return this;
    }

}
