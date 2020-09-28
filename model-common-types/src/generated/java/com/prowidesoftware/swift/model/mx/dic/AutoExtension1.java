
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Automatic extension information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoExtension1", propOrder = {
    "prd",
    "fnlXpryDt",
    "nonXtnsnNtfctn"
})
public class AutoExtension1 {

    @XmlElement(name = "Prd")
    protected AutoExtend1Choice prd;
    @XmlElement(name = "FnlXpryDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fnlXpryDt;
    @XmlElement(name = "NonXtnsnNtfctn")
    protected List<NonExtension1> nonXtnsnNtfctn;

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link AutoExtend1Choice }
     *     
     */
    public AutoExtend1Choice getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoExtend1Choice }
     *     
     */
    public AutoExtension1 setPrd(AutoExtend1Choice value) {
        this.prd = value;
        return this;
    }

    /**
     * Gets the value of the fnlXpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFnlXpryDt() {
        return fnlXpryDt;
    }

    /**
     * Sets the value of the fnlXpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public AutoExtension1 setFnlXpryDt(XMLGregorianCalendar value) {
        this.fnlXpryDt = value;
        return this;
    }

    /**
     * Gets the value of the nonXtnsnNtfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonXtnsnNtfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonXtnsnNtfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonExtension1 }
     * 
     * 
     */
    public List<NonExtension1> getNonXtnsnNtfctn() {
        if (nonXtnsnNtfctn == null) {
            nonXtnsnNtfctn = new ArrayList<NonExtension1>();
        }
        return this.nonXtnsnNtfctn;
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
     * Adds a new item to the nonXtnsnNtfctn list.
     * @see #getNonXtnsnNtfctn()
     * 
     */
    public AutoExtension1 addNonXtnsnNtfctn(NonExtension1 nonXtnsnNtfctn) {
        getNonXtnsnNtfctn().add(nonXtnsnNtfctn);
        return this;
    }

}
