
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identifies the different types of freight charges associated with goods.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charge24", propOrder = {
    "tp",
    "chrgs"
})
public class Charge24 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected FreightCharges1Code tp;
    @XmlElement(name = "Chrgs")
    protected List<ChargesDetails3> chrgs;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCharges1Code }
     *     
     */
    public FreightCharges1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCharges1Code }
     *     
     */
    public Charge24 setTp(FreightCharges1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesDetails3 }
     * 
     * 
     */
    public List<ChargesDetails3> getChrgs() {
        if (chrgs == null) {
            chrgs = new ArrayList<ChargesDetails3>();
        }
        return this.chrgs;
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
     * Adds a new item to the chrgs list.
     * @see #getChrgs()
     * 
     */
    public Charge24 addChrgs(ChargesDetails3 chrgs) {
        getChrgs().add(chrgs);
        return this;
    }

}
