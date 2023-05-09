
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
 * Automatic extension information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoExtension1", propOrder = {
    "prd",
    "fnlXpryDt",
    "nonXtnsnNtfctn"
})
public class AutoExtension1 {

    @XmlElement(name = "Prd")
    protected AutoExtend1Choice prd;
    @XmlElement(name = "FnlXpryDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate fnlXpryDt;
    @XmlElement(name = "NonXtnsnNtfctn")
    protected List<NonExtension1> nonXtnsnNtfctn;

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link AutoExtend1Choice }
     *     
     */
    public AutoExtend1Choice getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoExtend1Choice }
     *     
     */
    public AutoExtension1 setPrd(AutoExtend1Choice value) {
        this.prd = value;
        return this;
    }

    /**
     * Gets the value of the fnlXpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFnlXpryDt() {
        return fnlXpryDt;
    }

    /**
     * Sets the value of the fnlXpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AutoExtension1 setFnlXpryDt(LocalDate value) {
        this.fnlXpryDt = value;
        return this;
    }

    /**
     * Gets the value of the nonXtnsnNtfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nonXtnsnNtfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonXtnsnNtfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonExtension1 }
     * 
     * 
     * @return
     *     The value of the nonXtnsnNtfctn property.
     */
    public List<NonExtension1> getNonXtnsnNtfctn() {
        if (nonXtnsnNtfctn == null) {
            nonXtnsnNtfctn = new ArrayList<>();
        }
        return this.nonXtnsnNtfctn;
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
     * Adds a new item to the nonXtnsnNtfctn list.
     * @see #getNonXtnsnNtfctn()
     * 
     */
    public AutoExtension1 addNonXtnsnNtfctn(NonExtension1 nonXtnsnNtfctn) {
        getNonXtnsnNtfctn().add(nonXtnsnNtfctn);
        return this;
    }

}
