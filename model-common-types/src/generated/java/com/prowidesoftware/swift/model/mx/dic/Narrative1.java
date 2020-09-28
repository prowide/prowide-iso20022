
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
 * Narrative information for an undertaking.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Narrative1", propOrder = {
    "tp",
    "txt"
})
public class Narrative1 {

    @XmlElement(name = "Tp")
    protected NarrativeType1Choice tp;
    @XmlElement(name = "Txt", required = true)
    protected List<String> txt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link NarrativeType1Choice }
     *     
     */
    public NarrativeType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NarrativeType1Choice }
     *     
     */
    public Narrative1 setTp(NarrativeType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the txt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTxt() {
        if (txt == null) {
            txt = new ArrayList<String>();
        }
        return this.txt;
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
     * Adds a new item to the txt list.
     * @see #getTxt()
     * 
     */
    public Narrative1 addTxt(String txt) {
        getTxt().add(txt);
        return this;
    }

}
