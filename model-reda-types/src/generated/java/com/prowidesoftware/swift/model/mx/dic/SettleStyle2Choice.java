
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
 * Choice of format for settle style.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettleStyle2Choice", propOrder = {
    "cd",
    "prtry"
})
public class SettleStyle2Choice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected List<SettleStyle1Code> cd;
    @XmlElement(name = "Prtry")
    protected GenericIdentification30 prtry;

    /**
     * Gets the value of the cd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettleStyle1Code }
     * 
     * 
     */
    public List<SettleStyle1Code> getCd() {
        if (cd == null) {
            cd = new ArrayList<SettleStyle1Code>();
        }
        return this.cd;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public SettleStyle2Choice setPrtry(GenericIdentification30 value) {
        this.prtry = value;
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
     * Adds a new item to the cd list.
     * @see #getCd()
     * 
     */
    public SettleStyle2Choice addCd(SettleStyle1Code cd) {
        getCd().add(cd);
        return this;
    }

}
