
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
 * Identification of a security and its balance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityPosition13", propOrder = {
    "finInstrmId",
    "pos"
})
public class SecurityPosition13 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "Pos")
    protected List<EligiblePosition10> pos;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityPosition13 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the pos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pos property.
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
     * {@link EligiblePosition10 }
     * 
     * 
     */
    public List<EligiblePosition10> getPos() {
        if (pos == null) {
            pos = new ArrayList<EligiblePosition10>();
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
    public SecurityPosition13 addPos(EligiblePosition10 pos) {
        getPos().add(pos);
        return this;
    }

}
