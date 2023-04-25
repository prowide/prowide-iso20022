
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
 * Provides additional information such as the information conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNarrative10", propOrder = {
    "addtlTxt",
    "ptyCtctNrrtv"
})
public class CorporateActionNarrative10 {

    @XmlElement(name = "AddtlTxt")
    protected List<String> addtlTxt;
    @XmlElement(name = "PtyCtctNrrtv")
    protected List<String> ptyCtctNrrtv;

    /**
     * Gets the value of the addtlTxt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlTxt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlTxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlTxt property.
     */
    public List<String> getAddtlTxt() {
        if (addtlTxt == null) {
            addtlTxt = new ArrayList<>();
        }
        return this.addtlTxt;
    }

    /**
     * Gets the value of the ptyCtctNrrtv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ptyCtctNrrtv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtyCtctNrrtv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the ptyCtctNrrtv property.
     */
    public List<String> getPtyCtctNrrtv() {
        if (ptyCtctNrrtv == null) {
            ptyCtctNrrtv = new ArrayList<>();
        }
        return this.ptyCtctNrrtv;
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
     * Adds a new item to the addtlTxt list.
     * @see #getAddtlTxt()
     * 
     */
    public CorporateActionNarrative10 addAddtlTxt(String addtlTxt) {
        getAddtlTxt().add(addtlTxt);
        return this;
    }

    /**
     * Adds a new item to the ptyCtctNrrtv list.
     * @see #getPtyCtctNrrtv()
     * 
     */
    public CorporateActionNarrative10 addPtyCtctNrrtv(String ptyCtctNrrtv) {
        getPtyCtctNrrtv().add(ptyCtctNrrtv);
        return this;
    }

}
