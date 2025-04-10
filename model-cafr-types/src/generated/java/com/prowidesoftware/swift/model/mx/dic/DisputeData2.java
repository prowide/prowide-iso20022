
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
 * Data to be present in a dispute.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeData2", propOrder = {
    "presntmntCycl",
    "dsptCond",
    "dsptRef"
})
public class DisputeData2 {

    @XmlElement(name = "PresntmntCycl")
    protected String presntmntCycl;
    @XmlElement(name = "DsptCond")
    protected String dsptCond;
    @XmlElement(name = "DsptRef")
    protected List<DisputeReference1> dsptRef;

    /**
     * Gets the value of the presntmntCycl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresntmntCycl() {
        return presntmntCycl;
    }

    /**
     * Sets the value of the presntmntCycl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData2 setPresntmntCycl(String value) {
        this.presntmntCycl = value;
        return this;
    }

    /**
     * Gets the value of the dsptCond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsptCond() {
        return dsptCond;
    }

    /**
     * Sets the value of the dsptCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData2 setDsptCond(String value) {
        this.dsptCond = value;
        return this;
    }

    /**
     * Gets the value of the dsptRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dsptRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsptRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeReference1 }
     * 
     * 
     * @return
     *     The value of the dsptRef property.
     */
    public List<DisputeReference1> getDsptRef() {
        if (dsptRef == null) {
            dsptRef = new ArrayList<>();
        }
        return this.dsptRef;
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
     * Adds a new item to the dsptRef list.
     * @see #getDsptRef()
     * 
     */
    public DisputeData2 addDsptRef(DisputeReference1 dsptRef) {
        getDsptRef().add(dsptRef);
        return this;
    }

}
