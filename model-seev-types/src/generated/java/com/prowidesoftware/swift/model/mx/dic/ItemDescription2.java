
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
 * Language, title and textual description in the specified language of an item.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemDescription2", propOrder = {
    "lang",
    "titl",
    "desc"
})
public class ItemDescription2 {

    @XmlElement(name = "Lang", required = true)
    protected String lang;
    @XmlElement(name = "Titl")
    protected String titl;
    @XmlElement(name = "Desc")
    protected List<String> desc;

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ItemDescription2 setLang(String value) {
        this.lang = value;
        return this;
    }

    /**
     * Gets the value of the titl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitl() {
        return titl;
    }

    /**
     * Sets the value of the titl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ItemDescription2 setTitl(String value) {
        this.titl = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the desc property.
     */
    public List<String> getDesc() {
        if (desc == null) {
            desc = new ArrayList<>();
        }
        return this.desc;
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
     * Adds a new item to the desc list.
     * @see #getDesc()
     * 
     */
    public ItemDescription2 addDesc(String desc) {
        getDesc().add(desc);
        return this;
    }

}
