
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
 * Type of information according to a taxonomy.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationType4", propOrder = {
    "lglFrmwk",
    "infTp"
})
public class ClassificationType4 {

    @XmlElement(name = "LglFrmwk", required = true)
    protected List<String> lglFrmwk;
    @XmlElement(name = "InfTp", required = true)
    protected String infTp;

    /**
     * Gets the value of the lglFrmwk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lglFrmwk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLglFrmwk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the lglFrmwk property.
     */
    public List<String> getLglFrmwk() {
        if (lglFrmwk == null) {
            lglFrmwk = new ArrayList<>();
        }
        return this.lglFrmwk;
    }

    /**
     * Gets the value of the infTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfTp() {
        return infTp;
    }

    /**
     * Sets the value of the infTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClassificationType4 setInfTp(String value) {
        this.infTp = value;
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
     * Adds a new item to the lglFrmwk list.
     * @see #getLglFrmwk()
     * 
     */
    public ClassificationType4 addLglFrmwk(String lglFrmwk) {
        getLglFrmwk().add(lglFrmwk);
        return this;
    }

}
