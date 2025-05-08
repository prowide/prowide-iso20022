
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
 * Applied programme, network, or brand processes the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgrammeMode5", propOrder = {
    "apldId",
    "addtlId"
})
public class ProgrammeMode5 {

    @XmlElement(name = "ApldId", required = true)
    protected String apldId;
    @XmlElement(name = "AddtlId")
    protected List<AdditionalData1> addtlId;

    /**
     * Gets the value of the apldId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApldId() {
        return apldId;
    }

    /**
     * Sets the value of the apldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProgrammeMode5 setApldId(String value) {
        this.apldId = value;
        return this;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlId property.
     */
    public List<AdditionalData1> getAddtlId() {
        if (addtlId == null) {
            addtlId = new ArrayList<>();
        }
        return this.addtlId;
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
     * Adds a new item to the addtlId list.
     * @see #getAddtlId()
     * 
     */
    public ProgrammeMode5 addAddtlId(AdditionalData1 addtlId) {
        getAddtlId().add(addtlId);
        return this;
    }

}
