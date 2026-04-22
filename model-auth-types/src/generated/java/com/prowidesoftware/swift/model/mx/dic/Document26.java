
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * General information that unambiguously identifies a document, such as identification number and issue date time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document26", propOrder = {
    "lang",
    "orgnlOrTrnsltd",
    "desc",
    "ref",
    "elctrncSealRef"
})
public class Document26 {

    @XmlElement(name = "Lang")
    protected List<String> lang;
    @XmlElement(name = "OrgnlOrTrnsltd")
    @XmlSchemaType(name = "string")
    protected LanguageVersion1Code orgnlOrTrnsltd;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Ref", required = true)
    protected String ref;
    @XmlElement(name = "ElctrncSealRef")
    protected String elctrncSealRef;

    /**
     * Gets the value of the lang property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lang property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLang().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the lang property.
     */
    public List<String> getLang() {
        if (lang == null) {
            lang = new ArrayList<>();
        }
        return this.lang;
    }

    /**
     * Gets the value of the orgnlOrTrnsltd property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageVersion1Code }
     *     
     */
    public LanguageVersion1Code getOrgnlOrTrnsltd() {
        return orgnlOrTrnsltd;
    }

    /**
     * Sets the value of the orgnlOrTrnsltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageVersion1Code }
     *     
     */
    public Document26 setOrgnlOrTrnsltd(LanguageVersion1Code value) {
        this.orgnlOrTrnsltd = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Document26 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Document26 setRef(String value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the elctrncSealRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElctrncSealRef() {
        return elctrncSealRef;
    }

    /**
     * Sets the value of the elctrncSealRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Document26 setElctrncSealRef(String value) {
        this.elctrncSealRef = value;
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
     * Adds a new item to the lang list.
     * @see #getLang()
     * 
     */
    public Document26 addLang(String lang) {
        getLang().add(lang);
        return this;
    }

}
