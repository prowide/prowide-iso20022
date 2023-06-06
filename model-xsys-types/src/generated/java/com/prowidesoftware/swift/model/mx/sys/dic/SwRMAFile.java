
package com.prowidesoftware.swift.model.mx.sys.dic;

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
 * Java class for RMAFile complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMAFile", propOrder = {
    "rmaFileHdr",
    "rmaRecrd"
})
public class SwRMAFile {

    @XmlElement(name = "RMAFileHdr", required = true)
    protected SwRMAFileHdr rmaFileHdr;
    @XmlElement(name = "RMARecrd")
    protected List<SwRMARecrd> rmaRecrd;

    /**
     * Gets the value of the rmaFileHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SwRMAFileHdr }
     *     
     */
    public SwRMAFileHdr getRMAFileHdr() {
        return rmaFileHdr;
    }

    /**
     * Sets the value of the rmaFileHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwRMAFileHdr }
     *     
     */
    public SwRMAFile setRMAFileHdr(SwRMAFileHdr value) {
        this.rmaFileHdr = value;
        return this;
    }

    /**
     * Gets the value of the rmaRecrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rmaRecrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRMARecrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwRMARecrd }
     * 
     * 
     * @return
     *     The value of the rmaRecrd property.
     */
    public List<SwRMARecrd> getRMARecrd() {
        if (rmaRecrd == null) {
            rmaRecrd = new ArrayList<>();
        }
        return this.rmaRecrd;
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
     * Adds a new item to the rMARecrd list.
     * @see #getRMARecrd()
     * 
     */
    public SwRMAFile addRMARecrd(SwRMARecrd rMARecrd) {
        getRMARecrd().add(rMARecrd);
        return this;
    }

}
