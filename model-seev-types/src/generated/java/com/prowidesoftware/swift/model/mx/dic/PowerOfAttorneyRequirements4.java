
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
 * Conditions to get power of attorney.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerOfAttorneyRequirements4", propOrder = {
    "lglRqrmnt",
    "othrDcmnttn",
    "docSubmissnDdln"
})
public class PowerOfAttorneyRequirements4 {

    @XmlElement(name = "LglRqrmnt")
    @XmlSchemaType(name = "string")
    protected List<PowerOfAttorneyLegalisation1Code> lglRqrmnt;
    @XmlElement(name = "OthrDcmnttn")
    protected String othrDcmnttn;
    @XmlElement(name = "DocSubmissnDdln")
    protected DateFormat58Choice docSubmissnDdln;

    /**
     * Gets the value of the lglRqrmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lglRqrmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLglRqrmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerOfAttorneyLegalisation1Code }
     * 
     * 
     * @return
     *     The value of the lglRqrmnt property.
     */
    public List<PowerOfAttorneyLegalisation1Code> getLglRqrmnt() {
        if (lglRqrmnt == null) {
            lglRqrmnt = new ArrayList<>();
        }
        return this.lglRqrmnt;
    }

    /**
     * Gets the value of the othrDcmnttn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrDcmnttn() {
        return othrDcmnttn;
    }

    /**
     * Sets the value of the othrDcmnttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PowerOfAttorneyRequirements4 setOthrDcmnttn(String value) {
        this.othrDcmnttn = value;
        return this;
    }

    /**
     * Gets the value of the docSubmissnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getDocSubmissnDdln() {
        return docSubmissnDdln;
    }

    /**
     * Sets the value of the docSubmissnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public PowerOfAttorneyRequirements4 setDocSubmissnDdln(DateFormat58Choice value) {
        this.docSubmissnDdln = value;
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
     * Adds a new item to the lglRqrmnt list.
     * @see #getLglRqrmnt()
     * 
     */
    public PowerOfAttorneyRequirements4 addLglRqrmnt(PowerOfAttorneyLegalisation1Code lglRqrmnt) {
        getLglRqrmnt().add(lglRqrmnt);
        return this;
    }

}
