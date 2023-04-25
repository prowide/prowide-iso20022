
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
 * Presence condition of a message item.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageItemCondition1", propOrder = {
    "itmId",
    "cond",
    "val"
})
public class MessageItemCondition1 {

    @XmlElement(name = "ItmId", required = true)
    protected String itmId;
    @XmlElement(name = "Cond", required = true)
    @XmlSchemaType(name = "string")
    protected MessageItemCondition1Code cond;
    @XmlElement(name = "Val")
    protected List<String> val;

    /**
     * Gets the value of the itmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmId() {
        return itmId;
    }

    /**
     * Sets the value of the itmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MessageItemCondition1 setItmId(String value) {
        this.itmId = value;
        return this;
    }

    /**
     * Gets the value of the cond property.
     * 
     * @return
     *     possible object is
     *     {@link MessageItemCondition1Code }
     *     
     */
    public MessageItemCondition1Code getCond() {
        return cond;
    }

    /**
     * Sets the value of the cond property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageItemCondition1Code }
     *     
     */
    public MessageItemCondition1 setCond(MessageItemCondition1Code value) {
        this.cond = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the val property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the val property.
     */
    public List<String> getVal() {
        if (val == null) {
            val = new ArrayList<>();
        }
        return this.val;
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
     * Adds a new item to the val list.
     * @see #getVal()
     * 
     */
    public MessageItemCondition1 addVal(String val) {
        getVal().add(val);
        return this;
    }

}
