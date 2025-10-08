
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the amendment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amendment6", propOrder = {
    "udrtkgAmdmntMsg",
    "applcntRefNb",
    "addtlInf"
})
public class Amendment6 {

    @XmlElement(name = "UdrtkgAmdmntMsg", required = true)
    protected UndertakingAmendmentMessage1 udrtkgAmdmntMsg;
    @XmlElement(name = "ApplcntRefNb")
    protected String applcntRefNb;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the udrtkgAmdmntMsg property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmendmentMessage1 }
     *     
     */
    public UndertakingAmendmentMessage1 getUdrtkgAmdmntMsg() {
        return udrtkgAmdmntMsg;
    }

    /**
     * Sets the value of the udrtkgAmdmntMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmendmentMessage1 }
     *     
     */
    public Amendment6 setUdrtkgAmdmntMsg(UndertakingAmendmentMessage1 value) {
        this.udrtkgAmdmntMsg = value;
        return this;
    }

    /**
     * Gets the value of the applcntRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplcntRefNb() {
        return applcntRefNb;
    }

    /**
     * Sets the value of the applcntRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Amendment6 setApplcntRefNb(String value) {
        this.applcntRefNb = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<String>();
        }
        return this.addtlInf;
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public Amendment6 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
