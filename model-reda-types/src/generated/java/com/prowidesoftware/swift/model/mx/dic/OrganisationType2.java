
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
 * Specifies a type of identification requested for an organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationType2", propOrder = {
    "anyBIC",
    "lei",
    "emailAdr",
    "othr"
})
public class OrganisationType2 {

    @XmlElement(name = "AnyBIC")
    protected Boolean anyBIC;
    @XmlElement(name = "LEI")
    protected Boolean lei;
    @XmlElement(name = "EmailAdr")
    protected Boolean emailAdr;
    @XmlElement(name = "Othr")
    protected List<GenericOrganisationType1> othr;

    /**
     * Gets the value of the anyBIC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnyBIC() {
        return anyBIC;
    }

    /**
     * Sets the value of the anyBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public OrganisationType2 setAnyBIC(Boolean value) {
        this.anyBIC = value;
        return this;
    }

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public OrganisationType2 setLEI(Boolean value) {
        this.lei = value;
        return this;
    }

    /**
     * Gets the value of the emailAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailAdr() {
        return emailAdr;
    }

    /**
     * Sets the value of the emailAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public OrganisationType2 setEmailAdr(Boolean value) {
        this.emailAdr = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericOrganisationType1 }
     * 
     * 
     */
    public List<GenericOrganisationType1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<GenericOrganisationType1>();
        }
        return this.othr;
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
     * Adds a new item to the othr list.
     * @see #getOthr()
     * 
     */
    public OrganisationType2 addOthr(GenericOrganisationType1 othr) {
        getOthr().add(othr);
        return this;
    }

}
