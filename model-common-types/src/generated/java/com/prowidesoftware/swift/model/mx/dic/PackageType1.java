
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Chunk of a software package.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageType1", propOrder = {
    "packgId",
    "packgLngth",
    "offsetStart",
    "offsetEnd",
    "packgBlck"
})
public class PackageType1 {

    @XmlElement(name = "PackgId")
    protected GenericIdentification176 packgId;
    @XmlElement(name = "PackgLngth")
    protected BigDecimal packgLngth;
    @XmlElement(name = "OffsetStart")
    protected BigDecimal offsetStart;
    @XmlElement(name = "OffsetEnd")
    protected BigDecimal offsetEnd;
    @XmlElement(name = "PackgBlck")
    protected List<ExternallyDefinedData1> packgBlck;

    /**
     * Gets the value of the packgId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getPackgId() {
        return packgId;
    }

    /**
     * Sets the value of the packgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public PackageType1 setPackgId(GenericIdentification176 value) {
        this.packgId = value;
        return this;
    }

    /**
     * Gets the value of the packgLngth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPackgLngth() {
        return packgLngth;
    }

    /**
     * Sets the value of the packgLngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PackageType1 setPackgLngth(BigDecimal value) {
        this.packgLngth = value;
        return this;
    }

    /**
     * Gets the value of the offsetStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffsetStart() {
        return offsetStart;
    }

    /**
     * Sets the value of the offsetStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PackageType1 setOffsetStart(BigDecimal value) {
        this.offsetStart = value;
        return this;
    }

    /**
     * Gets the value of the offsetEnd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffsetEnd() {
        return offsetEnd;
    }

    /**
     * Sets the value of the offsetEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PackageType1 setOffsetEnd(BigDecimal value) {
        this.offsetEnd = value;
        return this;
    }

    /**
     * Gets the value of the packgBlck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the packgBlck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackgBlck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternallyDefinedData1 }
     * 
     * 
     * @return
     *     The value of the packgBlck property.
     */
    public List<ExternallyDefinedData1> getPackgBlck() {
        if (packgBlck == null) {
            packgBlck = new ArrayList<>();
        }
        return this.packgBlck;
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
     * Adds a new item to the packgBlck list.
     * @see #getPackgBlck()
     * 
     */
    public PackageType1 addPackgBlck(ExternallyDefinedData1 packgBlck) {
        getPackgBlck().add(packgBlck);
        return this;
    }

}
