
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
 * Contains the data record in either Binary or text format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataRecord1Choice", propOrder = {
    "binry",
    "txt"
})
public class DataRecord1Choice {

    @XmlElement(name = "Binry")
    protected List<byte[]> binry;
    @XmlElement(name = "Txt")
    protected List<String> txt;

    /**
     * Gets the value of the binry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the binry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     * @return
     *     The value of the binry property.
     */
    public List<byte[]> getBinry() {
        if (binry == null) {
            binry = new ArrayList<>();
        }
        return this.binry;
    }

    /**
     * Gets the value of the txt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the txt property.
     */
    public List<String> getTxt() {
        if (txt == null) {
            txt = new ArrayList<>();
        }
        return this.txt;
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
     * Adds a new item to the binry list.
     * @see #getBinry()
     * 
     */
    public DataRecord1Choice addBinry(byte[] binry) {
        getBinry().add(binry);
        return this;
    }

    /**
     * Adds a new item to the txt list.
     * @see #getTxt()
     * 
     */
    public DataRecord1Choice addTxt(String txt) {
        getTxt().add(txt);
        return this;
    }

}
