
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
 * Identification of constituents for a basket of indexes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomBasket1", propOrder = {
    "strr",
    "id",
    "cnsttnts"
})
public class CustomBasket1 {

    @XmlElement(name = "Strr", required = true)
    protected String strr;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Cnsttnts", required = true)
    protected List<BasketConstituents1> cnsttnts;

    /**
     * Gets the value of the strr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrr() {
        return strr;
    }

    /**
     * Sets the value of the strr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomBasket1 setStrr(String value) {
        this.strr = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomBasket1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the cnsttnts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cnsttnts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCnsttnts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasketConstituents1 }
     * 
     * 
     * @return
     *     The value of the cnsttnts property.
     */
    public List<BasketConstituents1> getCnsttnts() {
        if (cnsttnts == null) {
            cnsttnts = new ArrayList<>();
        }
        return this.cnsttnts;
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
     * Adds a new item to the cnsttnts list.
     * @see #getCnsttnts()
     * 
     */
    public CustomBasket1 addCnsttnts(BasketConstituents1 cnsttnts) {
        getCnsttnts().add(cnsttnts);
        return this;
    }

}
