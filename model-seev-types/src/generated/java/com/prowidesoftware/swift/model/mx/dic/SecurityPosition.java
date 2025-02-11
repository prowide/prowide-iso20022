
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
 * Net position of a segregated holding, in a single security, within the overall position held in a securities account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityPosition", propOrder = {
    "id",
    "pos"
})
public class SecurityPosition {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification3 id;
    @XmlElement(name = "Pos")
    protected List<EligiblePosition> pos;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification3 }
     *     
     */
    public SecurityIdentification3 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification3 }
     *     
     */
    public SecurityPosition setId(SecurityIdentification3 value) {
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
     * {@link EligiblePosition }
     * 
     * 
     * @return
     *     The value of the pos property.
     */
    public List<EligiblePosition> getPos() {
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
    public SecurityPosition addPos(EligiblePosition pos) {
        getPos().add(pos);
        return this;
    }

}
