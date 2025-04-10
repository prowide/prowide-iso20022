
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
 * Double volume cap report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeCapReport1", propOrder = {
    "rptgPrd",
    "tradgVn",
    "instrmRpt"
})
public class VolumeCapReport1 {

    @XmlElement(name = "RptgPrd")
    protected Period4Choice rptgPrd;
    @XmlElement(name = "TradgVn")
    protected String tradgVn;
    @XmlElement(name = "InstrmRpt", required = true)
    protected List<VolumeCapReport2> instrmRpt;

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public VolumeCapReport1 setRptgPrd(Period4Choice value) {
        this.rptgPrd = value;
        return this;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VolumeCapReport1 setTradgVn(String value) {
        this.tradgVn = value;
        return this;
    }

    /**
     * Gets the value of the instrmRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrmRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrmRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VolumeCapReport2 }
     * 
     * 
     * @return
     *     The value of the instrmRpt property.
     */
    public List<VolumeCapReport2> getInstrmRpt() {
        if (instrmRpt == null) {
            instrmRpt = new ArrayList<>();
        }
        return this.instrmRpt;
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
     * Adds a new item to the instrmRpt list.
     * @see #getInstrmRpt()
     * 
     */
    public VolumeCapReport1 addInstrmRpt(VolumeCapReport2 instrmRpt) {
        getInstrmRpt().add(instrmRpt);
        return this;
    }

}
