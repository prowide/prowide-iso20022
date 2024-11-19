
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
 * General cryptographic message syntax (CMS) containing authenticated data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentInformationType3", propOrder = {
    "cnttTp",
    "authntcdData"
})
public class ContentInformationType3 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType1Code cnttTp;
    @XmlElement(name = "AuthntcdData")
    protected List<AuthenticatedData1> authntcdData;

    /**
     * Gets the value of the cnttTp property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType1Code }
     *     
     */
    public ContentType1Code getCnttTp() {
        return cnttTp;
    }

    /**
     * Sets the value of the cnttTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType1Code }
     *     
     */
    public ContentInformationType3 setCnttTp(ContentType1Code value) {
        this.cnttTp = value;
        return this;
    }

    /**
     * Gets the value of the authntcdData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authntcdData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthntcdData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthenticatedData1 }
     * 
     * 
     * @return
     *     The value of the authntcdData property.
     */
    public List<AuthenticatedData1> getAuthntcdData() {
        if (authntcdData == null) {
            authntcdData = new ArrayList<>();
        }
        return this.authntcdData;
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
     * Adds a new item to the authntcdData list.
     * @see #getAuthntcdData()
     * 
     */
    public ContentInformationType3 addAuthntcdData(AuthenticatedData1 authntcdData) {
        getAuthntcdData().add(authntcdData);
        return this;
    }

}
