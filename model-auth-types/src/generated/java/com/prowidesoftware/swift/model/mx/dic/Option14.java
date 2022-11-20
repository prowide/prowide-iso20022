
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
 * Derivative instrument that gives the buyer the right but not the obligation to purchase a set of quantity of a financial instrument at a future date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Option14", propOrder = {
    "xprtnStyle",
    "optnStyle",
    "optnTp",
    "brrrInd",
    "evtTp"
})
public class Option14 {

    @XmlElement(name = "XprtnStyle", required = true)
    @XmlSchemaType(name = "string")
    protected List<OptionStyle5Code> xprtnStyle;
    @XmlElement(name = "OptnStyle")
    @XmlSchemaType(name = "string")
    protected ExoticOptionStyle1Code optnStyle;
    @XmlElement(name = "OptnTp")
    @XmlSchemaType(name = "string")
    protected OptionType1Code optnTp;
    @XmlElement(name = "BrrrInd")
    protected Boolean brrrInd;
    @XmlElement(name = "EvtTp")
    protected OptionEvent2 evtTp;

    /**
     * Gets the value of the xprtnStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xprtnStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXprtnStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionStyle5Code }
     * 
     * 
     */
    public List<OptionStyle5Code> getXprtnStyle() {
        if (xprtnStyle == null) {
            xprtnStyle = new ArrayList<OptionStyle5Code>();
        }
        return this.xprtnStyle;
    }

    /**
     * Gets the value of the optnStyle property.
     * 
     * @return
     *     possible object is
     *     {@link ExoticOptionStyle1Code }
     *     
     */
    public ExoticOptionStyle1Code getOptnStyle() {
        return optnStyle;
    }

    /**
     * Sets the value of the optnStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExoticOptionStyle1Code }
     *     
     */
    public Option14 setOptnStyle(ExoticOptionStyle1Code value) {
        this.optnStyle = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType1Code }
     *     
     */
    public OptionType1Code getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType1Code }
     *     
     */
    public Option14 setOptnTp(OptionType1Code value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the brrrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrrrInd() {
        return brrrInd;
    }

    /**
     * Sets the value of the brrrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Option14 setBrrrInd(Boolean value) {
        this.brrrInd = value;
        return this;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionEvent2 }
     *     
     */
    public OptionEvent2 getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionEvent2 }
     *     
     */
    public Option14 setEvtTp(OptionEvent2 value) {
        this.evtTp = value;
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
     * Adds a new item to the xprtnStyle list.
     * @see #getXprtnStyle()
     * 
     */
    public Option14 addXprtnStyle(OptionStyle5Code xprtnStyle) {
        getXprtnStyle().add(xprtnStyle);
        return this;
    }

}
