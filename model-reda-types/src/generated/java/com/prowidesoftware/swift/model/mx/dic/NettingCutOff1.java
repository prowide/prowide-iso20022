
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
 * Provides the details for one to many netting cut off update requests to be actioned by a central system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NettingCutOff1", propOrder = {
    "netgId",
    "newCutOff"
})
public class NettingCutOff1 {

    @XmlElement(name = "NetgId", required = true)
    protected NettingIdentification1Choice netgId;
    @XmlElement(name = "NewCutOff", required = true)
    protected List<CutOff1> newCutOff;

    /**
     * Gets the value of the netgId property.
     * 
     * @return
     *     possible object is
     *     {@link NettingIdentification1Choice }
     *     
     */
    public NettingIdentification1Choice getNetgId() {
        return netgId;
    }

    /**
     * Sets the value of the netgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingIdentification1Choice }
     *     
     */
    public NettingCutOff1 setNetgId(NettingIdentification1Choice value) {
        this.netgId = value;
        return this;
    }

    /**
     * Gets the value of the newCutOff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newCutOff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewCutOff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CutOff1 }
     * 
     * 
     */
    public List<CutOff1> getNewCutOff() {
        if (newCutOff == null) {
            newCutOff = new ArrayList<CutOff1>();
        }
        return this.newCutOff;
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
     * Adds a new item to the newCutOff list.
     * @see #getNewCutOff()
     * 
     */
    public NettingCutOff1 addNewCutOff(CutOff1 newCutOff) {
        getNewCutOff().add(newCutOff);
        return this;
    }

}
