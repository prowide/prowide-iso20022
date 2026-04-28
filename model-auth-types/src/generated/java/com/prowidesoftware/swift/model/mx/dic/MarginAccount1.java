
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
 * Operational construct used to record the set of positions whose margin requirements is calculated on a gross basis.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginAccount1", propOrder = {
    "id",
    "posAcct"
})
public class MarginAccount1 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification118Choice id;
    @XmlElement(name = "PosAcct", required = true)
    protected List<PositionAccount1> posAcct;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public PartyIdentification118Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public MarginAccount1 setId(PartyIdentification118Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the posAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionAccount1 }
     * 
     * 
     */
    public List<PositionAccount1> getPosAcct() {
        if (posAcct == null) {
            posAcct = new ArrayList<PositionAccount1>();
        }
        return this.posAcct;
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
     * Adds a new item to the posAcct list.
     * @see #getPosAcct()
     * 
     */
    public MarginAccount1 addPosAcct(PositionAccount1 posAcct) {
        getPosAcct().add(posAcct);
        return this;
    }

}
