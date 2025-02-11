
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
 * Identifies the securities for which the meeting is organised.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityPosition7", propOrder = {
    "id",
    "pos"
})
public class SecurityPosition7 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification11 id;
    @XmlElement(name = "Pos")
    protected List<EligiblePosition4> pos;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification11 }
     *     
     */
    public SecurityIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification11 }
     *     
     */
    public SecurityPosition7 setId(SecurityIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the pos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EligiblePosition4 }
     * 
     * 
     * @return
     *     The value of the pos property.
     */
    public List<EligiblePosition4> getPos() {
        if (pos == null) {
            pos = new ArrayList<>();
        }
        return this.pos;
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
     * Adds a new item to the pos list.
     * @see #getPos()
     * 
     */
    public SecurityPosition7 addPos(EligiblePosition4 pos) {
        getPos().add(pos);
        return this;
    }

}
