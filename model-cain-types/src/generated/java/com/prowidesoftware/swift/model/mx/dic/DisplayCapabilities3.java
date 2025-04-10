
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Capabilities of the display components performing the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayCapabilities3", propOrder = {
    "dstn",
    "avlblFrmt",
    "nbOfLines",
    "lineWidth",
    "avlblLang"
})
public class DisplayCapabilities3 {

    @XmlElement(name = "Dstn", required = true)
    @XmlSchemaType(name = "string")
    protected UserInterface1Code dstn;
    @XmlElement(name = "AvlblFrmt", required = true)
    @XmlSchemaType(name = "string")
    protected List<OutputFormat1Code> avlblFrmt;
    @XmlElement(name = "NbOfLines")
    protected BigDecimal nbOfLines;
    @XmlElement(name = "LineWidth")
    protected BigDecimal lineWidth;
    @XmlElement(name = "AvlblLang")
    protected List<String> avlblLang;

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link UserInterface1Code }
     *     
     */
    public UserInterface1Code getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInterface1Code }
     *     
     */
    public DisplayCapabilities3 setDstn(UserInterface1Code value) {
        this.dstn = value;
        return this;
    }

    /**
     * Gets the value of the avlblFrmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avlblFrmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvlblFrmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputFormat1Code }
     * 
     * 
     */
    public List<OutputFormat1Code> getAvlblFrmt() {
        if (avlblFrmt == null) {
            avlblFrmt = new ArrayList<OutputFormat1Code>();
        }
        return this.avlblFrmt;
    }

    /**
     * Gets the value of the nbOfLines property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfLines() {
        return nbOfLines;
    }

    /**
     * Sets the value of the nbOfLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DisplayCapabilities3 setNbOfLines(BigDecimal value) {
        this.nbOfLines = value;
        return this;
    }

    /**
     * Gets the value of the lineWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineWidth() {
        return lineWidth;
    }

    /**
     * Sets the value of the lineWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DisplayCapabilities3 setLineWidth(BigDecimal value) {
        this.lineWidth = value;
        return this;
    }

    /**
     * Gets the value of the avlblLang property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avlblLang property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvlblLang().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAvlblLang() {
        if (avlblLang == null) {
            avlblLang = new ArrayList<String>();
        }
        return this.avlblLang;
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
     * Adds a new item to the avlblFrmt list.
     * @see #getAvlblFrmt()
     * 
     */
    public DisplayCapabilities3 addAvlblFrmt(OutputFormat1Code avlblFrmt) {
        getAvlblFrmt().add(avlblFrmt);
        return this;
    }

    /**
     * Adds a new item to the avlblLang list.
     * @see #getAvlblLang()
     * 
     */
    public DisplayCapabilities3 addAvlblLang(String avlblLang) {
        getAvlblLang().add(avlblLang);
        return this;
    }

}
