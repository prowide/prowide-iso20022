
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Additional information with update description and date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatedURLlnformation5", propOrder = {
    "lang",
    "updDesc",
    "updDt",
    "urlAdr"
})
public class UpdatedURLlnformation5 {

    @XmlElement(name = "Lang", required = true)
    protected String lang;
    @XmlElement(name = "UpdDesc")
    protected String updDesc;
    @XmlElement(name = "UpdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar updDt;
    @XmlElement(name = "URLAdr", required = true)
    protected String urlAdr;

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
    public UpdatedURLlnformation5 setLang(String value) {
        this.lang = value;
        return this;
    }

    /**
     * Gets the value of the updDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdDesc() {
        return updDesc;
    }

    /**
     * Sets the value of the updDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UpdatedURLlnformation5 setUpdDesc(String value) {
        this.updDesc = value;
        return this;
    }

    /**
     * Gets the value of the updDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getUpdDt() {
        return updDt;
    }

    /**
     * Sets the value of the updDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UpdatedURLlnformation5 setUpdDt(Calendar value) {
        this.updDt = value;
        return this;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UpdatedURLlnformation5 setURLAdr(String value) {
        this.urlAdr = value;
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
