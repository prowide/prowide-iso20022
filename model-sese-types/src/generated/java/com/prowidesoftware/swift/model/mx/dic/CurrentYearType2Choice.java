
package com.prowidesoftware.swift.model.mx.dic;

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
 * Choice between the selections of individual saving accounts issued during the current fiscal year.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentYearType2Choice", propOrder = {
    "curYrTp",
    "xtndedCurYrTp"
})
public class CurrentYearType2Choice {

    @XmlElement(name = "CurYrTp")
    @XmlSchemaType(name = "string")
    protected ISAType2Code curYrTp;
    @XmlElement(name = "XtndedCurYrTp")
    protected String xtndedCurYrTp;

    /**
     * Gets the value of the curYrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ISAType2Code }
     *     
     */
    public ISAType2Code getCurYrTp() {
        return curYrTp;
    }

    /**
     * Sets the value of the curYrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISAType2Code }
     *     
     */
    public CurrentYearType2Choice setCurYrTp(ISAType2Code value) {
        this.curYrTp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedCurYrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedCurYrTp() {
        return xtndedCurYrTp;
    }

    /**
     * Sets the value of the xtndedCurYrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrentYearType2Choice setXtndedCurYrTp(String value) {
        this.xtndedCurYrTp = value;
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

}
